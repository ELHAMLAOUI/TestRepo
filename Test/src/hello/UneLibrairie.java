package hello;
public class UneLibrairie {
  static String staticstring = "variable globale" ;
  static int staticint = 0 ;
  private static int privatestaticint = 0;

  static void staticvoid(){
        System.out.print("staticvoid()");
        staticstring = staticstring + 1 ;
        staticint = staticint + 1 ;
  }
  public static void publicstaticvoid(){
        System.out.print("publicstaticvoid()");
        staticstring = staticstring + 1 ;
        staticint = staticint + 1 ;
  }
  private static void privatestaticvoid(){
        System.out.print("privatestaticvoid()");
        staticstring = staticstring + 1 ;
        staticint = staticint + 1 ;
  }

  public static void main(String[] arguments) {
    System.out.print("depuis UneLibrairie.main() : ");
    System.out.print("appel de : ");
    staticvoid();
    System.out.println(" : OK");
	
    System.out.print("depuis UneLibrairie.main() : ");
    System.out.print("appel de : ");
    publicstaticvoid();
    System.out.println(" : OK");
    
	  
    System.out.print("depuis UneLibrairie.main() : ");
    System.out.print("appel de : ");
    privatestaticvoid();
    System.out.println(" : OK");
	  
    System.out.print("depuis UneLibrairie.main() : ");
    System.out.println("staticstring == "+staticstring);
	  
    System.out.print("depuis UneLibrairie.main() : ");
    System.out.println("staticint == "+staticint);
    
    System.out.println("// Après modification ");
    staticstring = "bonjour";
    staticint = 4;
    privatestaticint = 5;
    
    System.out.print("depuis UneLibrairie.main() : staticstring == ");
   System.out.println(staticstring);
   System.out.print("depuis UneLibrairie.main() : staticint == ");
   System.out.println(staticint);
   System.out.print("depuis UneLibrairie.main() : privatestaticint == ");
   System.out.println(privatestaticint);
     
  }
}