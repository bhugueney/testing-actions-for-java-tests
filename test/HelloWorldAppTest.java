//package test;

//import static org.junit.Assert.*;

//import org.junit.Test;

public class HelloWorldAppTest {

    //	@Test
    public final void testGreetings() {
	String res= HelloWorldApp.greetings("World");
	String expected= "Hello World !";
	if(! res.equals("Hello World !")){
	    System.err.println("HelloWorldApp.greetings(\"World\") was \""
			       +res+"\", expected \""+ expected +"\"");
	    System.exit(1);
	}
    }
    public static void main(String [] args){
	HelloWorldAppTest tests= new HelloWorldAppTest();
	tests.testGreetings();
    }
}
