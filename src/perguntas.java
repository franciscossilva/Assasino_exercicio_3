import java.util.Scanner;
public class perguntas {
public static void main(String[]args){
    Scanner scan= new Scanner(System.in);
    int contador =0;
    System.out.println("Responda 'SIM' ou 'NAO' para os questionamentos a seguir:");
    //Primeira pergunta
    System.out.println("Telefonou para a vítima?");
    String resposta1= scan.next();
    if(resposta1.equalsIgnoreCase(("Sim")){
        contador++;
    }

    //Segunda Pergunta
    System.out.println("Esteve no local do crime?");
    String resposta2= scan.next();
    if(resposta2.equalsIgnoreCase(("Sim"){
        contador++;
    }

    //Terceira pergunta
    System.out.println("Mora perto da vítima?");
    String resposta3= scan.next();
    if(resposta3.equalsIgnoreCase(("Sim"){
        contador++;
    }

    // Quarta pergunta
    System.out.println("Devia para a vítima?");
    String resposta4= scan.next();
    if(resposta4.equalsIgnoreCase(("Sim"){
        contador++;
    }

    //Quinta Pergunta
    System.out.println("Já trabalhou com a vítima?");
    String resposta5= scan.next();
    if(resposta5.equalsIgnoreCase(("Sim")){
        contador++;
    }

    if(contador==2){
        System.out.println("Voce é um Suspeito");}
    else if (contador==3 || contador ==4){
        System.out.println("Voce é um cumplice");}
    else if (contador==5){
        System.out.println("Voce é o assassino");}
    else {
        System.out.println("Voce é Inocente");
    }
    scan.close();

}

    }



    }
}





