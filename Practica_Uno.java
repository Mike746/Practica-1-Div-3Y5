import java.util.*;

public class Practica_Uno {
    public static void main(String args[]) {
      int divisorA = 3;
      int divisorB = 5;
      int moduloA;
      int moduloB;
      
      
      //Llenando los conjuntos
      Set<Integer> ConjuntoA = new HashSet<Integer> ();
      Set<Integer> ConjuntoB = new HashSet<Integer> ();
      Set<Integer> ConjuntoAuB = new HashSet<Integer> ();
      Set<Integer> ConjuntoAnB = new HashSet<Integer>();
      
      for(int i=0; i<=1000; i++){
          moduloA = i%divisorA;
          moduloB = i%divisorB;
          
          if(moduloA == 0){
              ConjuntoA.add(i);
          } 
          if(moduloB == 0){
              ConjuntoB.add(i);
          } 
          if(moduloA == 0 || moduloB == 0){
              ConjuntoAuB.add(i);
          }
          if(moduloA == 0 && moduloB == 0){
              ConjuntoAnB.add(i);
          }
      }
      
      
      //Imprimir los conjuntos en pantalla
      Iterator<Integer> itA = ConjuntoA.iterator();
      Iterator<Integer> itB = ConjuntoB.iterator();
      Iterator<Integer> itAuB = ConjuntoAuB.iterator();
      Iterator<Integer> itAnB = ConjuntoAnB.iterator();
      
      System.out.print("A = {");
      while(itA.hasNext()){
          System.out.print(" " + itA.next() + " ");
      }
      System.out.println("}");
      System.out.println("");
      
      System.out.print("B = {");
      while(itB.hasNext()){
          System.out.print(" " + itB.next() + " ");
      }
      System.out.println("}");
      System.out.println("");
      
      System.out.print("AuB = {");
      while(itAuB.hasNext()){
          System.out.print(" " + itAuB.next() + " ");
      }
      System.out.println("}");
      System.out.println("");
      
      System.out.print("AnB = {");
      while(itAnB.hasNext()){
          System.out.print(" " + itAnB.next() + " ");
      }
      System.out.println("}");
      System.out.println("");
      
      
      //El tamaño de los conjuntos
      System.out.println("n(A) = " + ConjuntoA.size());
      System.out.println("n(B) = " + ConjuntoB.size());
      System.out.println("n(AuB) = " + ConjuntoAuB.size());
      System.out.println("n(AnB) = " + ConjuntoAnB.size());
      
    }
}