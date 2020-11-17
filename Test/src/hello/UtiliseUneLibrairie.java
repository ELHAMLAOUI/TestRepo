package hello;
public class UtiliseUneLibrairie {
public static void main(String[] arguments) {
    System.out.print("depuis UtiliseUneLibrairie.main() : ");
    System.out.print("appel de : ");
    UneLibrairie.staticvoid();
    System.out.println(" : OK");
	
    System.out.print("depuis UtiliseUneLibrairie.main() : ");
    System.out.print("appel de : ");
    UneLibrairie.publicstaticvoid();
    System.out.println(" : OK");
    
	  
    System.out.print("depuis UtiliseUneLibrairie.main() : ");
    System.out.print("appel IMPOSSIBLE de : UneLibrairie.privatestaticvoid() ");
    UneLibrairie.privatestaticvoid();
    System.out.println(" : NOK");
	  
    System.out.print("depuis UtiliseUneLibrairie.main() : ");
    System.out.println("staticstring == "+UneLibrairie.staticstring);
	  
    System.out.print("depuis UtiliseUneLibrairie.main() : ");
    System.out.println("staticint == "+UneLibrairie.staticint);
    
    System.out.print("depuis UtiliseUneLibrairie.main() : ");
    System.out.println("privatestaticint N'EST PAS ACCESSIBLE");
    
    System.out.println("// Après modification ");
    UneLibrairie.staticstring = "bonjour";
    UneLibrairie.staticint = 4;
    UneLibrairie.privatestaticint = 5;
    
    System.out.print("depuis UtiliseUneLibrairie.main() : staticstring == ");
   System.out.println(UneLibrairie.staticstring);
   System.out.print("depuis UtiliseUneLibrairie.main() : staticint == ");
   System.out.println(UneLibrairie.staticint);
   System.out.print("depuis UtiliseUneLibrairie.main() : privatestaticint N'EST PAS ACCESSIBLE ");
   // System.out.println(UneLibrairie.privatestaticint);
     
  }
  }