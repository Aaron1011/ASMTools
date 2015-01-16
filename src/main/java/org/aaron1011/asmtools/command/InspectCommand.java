package org.aaron1011.asmtools.command;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class InspectCommand{

    private ClassNode klass;

    public InspectCommand(List<String> args) throws Exception {
        ClassReader reader = new ClassReader(new FileInputStream(new File(args.get(0))));
        this.klass = new ClassNode();
        reader.accept(klass, ClassReader.EXPAND_FRAMES);
    }

    private List<String> getClassHierarchy(ClassNode classNode) {
        List<String> hierarchy = new ArrayList<String>();
        for (ClassNode clazz = classNode; clazz.name != 'java/lang/Object'; clazz = clazz.getlo
    }

    public void run() {
        System.out.println("Class: " + this.klass.name);
        System.out.println("Signature: " + this.klass.signature);
    }
}
