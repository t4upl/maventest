package org;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Runnable runnable = () -> System.out.println( "Hello World!" );
        runnable.run();
    }
}
