/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Progra2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        Scanner entrada2=new Scanner(System.in);
    int x, op1,op2,suma, resta, mul, if1,W,F,n,n1,n2, n3;
    String nomb,r;
    double div;
    boolean v, salir=true;
    do{
        System.out.println("SELECCIONE UNA OPCION:"+"\n1.IDE\n2.VARIABLES/OPERADORES\n3.CONDICIONALES\n4.CICLOS\n"
                                    +"5.FUNCIONES\n6.PROCEDIMIENTOS\n7.SALIR");
        x=entrada.nextInt();
    switch(x)
    {
            case 1:
                System.out.println("¿QUE ES IDE?");
                System.out.println("Un entorno de desarrollo integrado o entorno de desarrollo interactivo, \nen inglés Integrated Development Environment (IDE), es una aplicación informática que \nproporciona servicios integrales para facilitarle al desarrollador o programador el desarrollo de software.\n" +
"\n\n" +
"Normalmente, un IDE consiste de un editor de código fuente, herramientas de construcción automáticas y un depurador. \nLa mayoría de los IDE tienen auto-completado inteligente de código (IntelliSense). Algunos IDE contienen un compilador, \nun intérprete, o ambos, tales como NetBeans y Eclipse; otros no, tales como SharpDevelop y Lazarus.\n" +
"\n\n" +
"El límite entre un IDE y otras partes del entorno de desarrollo de software más amplio no está bien definido. \nMuchas veces, a los efectos de simplificar la construcción de la interfaz gráfica de usuario \n(GUI, por sus siglas en inglés) se integran un sistema controlador de versión y varias herramientas. \nMuchos IDE modernos también cuentan con un navegador de clases, un buscador de objetos y un diagrama de jerarquía de clases, \npara su uso con el desarrollo de software orientado a objetos.");
            break;
            case 2:
                System.out.println("VARIABLES");
                System.out.println("Existen diversos tipos de variables las cuales pueden ser utilizadas para una\ngran cantidad de operaciones aritmeticas y asi mismo para guardar texto, tambien para retorno de valores ya sea verdadero o falso"
                        + "\nentre dichos tispos estan:\n"+"1.Numericas\nson aquellos tipos de variables que manejan unicamente valores numericos entre ellas\n int (solo valores enteros) \nfloat,double,long (para valores con decimales)\n "
                        + "2.Cadenas \nString (cadenas de caracteres)\n char(solo un caracter)\n3.Valores boleanos\n boolean(para mostrar valores falsos o verdaderos)\n"
                        + "EJEMPLOS DE DECLARACION\n int x,y=0; \nString cadena={''Hola''}\nchar caracter={'p'}\nboolean valor=true\n"
                        + "NOTA: LAS DECLARACIONES NUMERICAS SON TODAS SIMILARES POR LO CUAL SE MOSTRO EJEMPLO UNICAMENTE DE LOS ENTEROS");
                System.out.println("OPERADORES");
                System.out.println("INGRESE VALOR 1:");
                op1=entrada.nextInt();
                System.out.println("INGRESE VALOR 2:");
                op2=entrada.nextInt();
                suma=op1+op2;
                resta=op1-op2;
                mul=op1*op2;
                div=op1/op2;
                if(resta<=0)
                {
                v=true;
                }
                else
                {
                v=false;    
                }
                System.out.println("SUMA: "+suma);
                System.out.println("RESTA: "+resta);
                System.out.println("MULTIPLICACION: "+mul);
                System.out.println("DIVISION: "+div);
                System.out.println("BOOLEAN: "+v);
            break;
            case 3:
                System.out.println("CONDICIONALES");
                System.out.println("Son estructuras que nos ayudan a determinar si una opcion se cumple o no,\nque realice una funcion si se cumple y que realice una distinta sino se cumple\n"
                        + "y que pueden ser anidados (uno dentro de otro), y hacer que se determine su accion por un valor en el caso de swtch");
                System.out.println("EJEMPLOS");
                System.out.println("A continuacion ingresara un entero, si es mayor a 100 sucedera una cosa y sino otra contraria");
                System.out.println("INGRESE NUMERO: ");
                if1=entrada.nextInt();
                if(if1>100)
                {
                    System.out.println("Su numero es mayor a 100");    
                }else
                {
                    System.out.println("Su numero es menor a 100");
                }
                if(if1==100)
                {
                    System.out.println("Su numero es 100"); 
                }
            break;
            case 4:
                System.out.println("CICLOS");
                System.out.println("Un ciclo repite un proceso las veces que sean necesarias hasta cumplir una condicion"
                        + "\nen el caso del for, se repite hasta que 'i' valga un numero determinado, y en el caso del while mientras una condicion de cumpla");
                System.out.println("EJEMPLOS");
                System.out.println("FOR");
                System.out.println("contara con un ciclo FOR hasta el numero que usted indique: ");
                System.out.println("INGRESE NUMERO: ");
                F=entrada.nextInt();
                for(int i=0;i<F;i++)
                {
                    System.out.println("numero: "+(i+1));    
                }
                System.out.println("WHILE");
                System.out.println("contara con un ciclo WHILE hasta el numero que usted indique: ");
                System.out.println("INGRESE NUMERO: ");
                W=entrada.nextInt();
                n=0;
                while(n!=W)
                {
                 n++;   
                 System.out.println("numero: "+(n));   
                }
            break;
            case 5:
                System.out.println("FUNCIONES O METODOS");
                System.out.println("son pequeños extractos de un programa que realizan cierta operacion y que pueden ser utilizadas"
                        + "\nen algun otro unicamente cumpliendo los parametros que el metodo o funcion solicite.");
                System.out.println("EJEMPLO");
                System.out.println("LA FUNCION SUMARA LOS SIGUIENTES NUMEROS QUE INGRESE");
                System.out.println("INGRESE PRIMER NUMERO: ");
                n1=entrada.nextInt();
                System.out.println("INGRESE SEGUNDO NUMERO: ");
                n2=entrada.nextInt();
                n3=suma(n1,n2);
                System.out.println("RESULTADO: "+n3);
                System.out.println("NOMBRE: ");
                nomb=entrada2.nextLine();
                r=saludo(nomb);
                System.out.println(""+r);
            break;
            case 6:
                System.out.println("ARREGLOS");
                insercion();
            break;
            case 7:
                salir=false;
                break;
            default: System.out.println("OPCION NO VALIDA");
            break;
    }
    }while(salir==true);
    }
    public static int suma (int a, int b)
    {
        int c;
        c=a+b;
    return c;    
    }
    public static String saludo(String n)
    {
    String saludo = "Adios "+n;
    return saludo;
    }
     public static void insercion()
    {
long inicio,fin,tiempo;         
Random Aleatorio=new Random();
inicio=System.nanoTime();
   int[] n=new int[10];
   int numero,aux,posicion;
   for(int i=0;i<10;i++)
   {
   numero=100+Aleatorio.nextInt(10);
   n[i]=numero;
   }
for(int i=0;i<10;i++)
{
posicion=i;    
aux=n[i];
while((posicion>0)&&(n[posicion-1]>aux))
{
n[posicion]=n[posicion-1];  
posicion--;
}
n[posicion]=aux;
}
 for(int i=0;i<10;i++)
   {
       System.out.println(n[i]);  
   }
fin=System.nanoTime();
tiempo=fin-inicio;
System.out.println("Tiempo de ejecucion: "+tiempo/1e6+" ms");     
    }
}