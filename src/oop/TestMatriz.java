
package oop;

/**
 *
 * @author alfredo
 */
public class TestMatriz {
    
	public static void main(String[] args)
	{
		Matriz objMatriz = new Matriz();
                System.out.println(objMatriz.desplegar());
                System.out.println("::::::::::::::::::::::");
		objMatriz.desplegarForEach();
                
                Matriz objMatriz2 = new Matriz(1);
                System.out.println("::::::::::::::::::::::");
                System.out.println(objMatriz2.desplegar(1));
                System.out.println("::::::::::::::::::::::");
		objMatriz2.desplegarForEach(1);
                
                
	}    
}
