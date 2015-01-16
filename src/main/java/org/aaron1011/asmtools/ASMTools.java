package org.aaron1011.asmtools;

import org.objectweb.asm.ClassReader;

import java.io.File;
import java.io.FileInputStream;

public class ASMTools {
    public static void main(String[] args) throws Exception {
        ClassReader reader = new ClassReader(new FileInputStream(new File(args[0])));
        System.out.println("Name: " + reader.getClassName());
    }
}