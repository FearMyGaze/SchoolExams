package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        userService service = new userService();
        service.changePassword("admin","123456789");
    }
}
