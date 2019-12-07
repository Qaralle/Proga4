package laba2;

import java.io.PrintStream;

public final class Logger {
    private final static PrintStream stream = System.out;

    public static void MUMI_Record(String text) {
        stream.println("Муми -"+text);
    }
    public static void SimpleRecord(String text){
        stream.println(text);
    }

    public static PrintStream GetStream() {
        return stream;
    }


    public String toString() {
        return this.getClass().getName() + "[stream=" + stream.toString() + "]";
    }
}