package com.bludee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        int port=9000;
        System.out.println("server ok");
        new DiscardServer(port).run();
    }
}
