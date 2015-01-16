package org.aaron1011.asmtools;

import org.aaron1011.asmtools.command.InspectCommand;
import org.objectweb.asm.ClassReader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

public class ASMTools {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage: java -jar ASMTools-all.jar <command>");
            return;
        }

        if (args[0].equalsIgnoreCase("inspect")) {
            new InspectCommand(Arrays.asList(args).subList(1, args.length)).run();
        }
    }
}