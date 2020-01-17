import java.util.Scanner;
public class C1EXO15 {
    public static void main (String[] args) {
        double prix[]=new double[2];
        double poids[]=new double[2];
        int i;
        Scanner sc = new Scanner(System.in);
        for(i=1;i<3;i++){
            System.out.println("veuillez sasir le prix de la pizza N°: "+(i));
            prix[i-1]=sc.nextDouble();
            while (prix[i-1]<=0) {
                System.out.println("veuillez re-sasir le prix de la pizza N°: "+(i));
                prix[i-1]=sc.nextDouble();
            }
            System.out.println("veuillez sasir le poids en KG de la pizza N°: "+(i));
            poids[i-1]=sc.nextDouble();
            while (poids[i-1]<=0) {
                System.out.println("veuillez re-sasir le poids en KG de la pizza N°: "+(i));
                poids[i-1]=sc.nextDouble();
            }
        }
        if((prix[0]/poids[0])==(prix[1]/poids[1])) System.out.println("les pizzas sont egaux");
        else if((prix[0]/poids[0])<(prix[1]/poids[1])) System.out.println("le meilleur prix/poids est: "+(prix[0]/poids[0])+" le N° de la pizza est : "+1);
        else System.out.println("le meilleur prix/poids est: "+(prix[1]/poids[1])+" le N° de la pizza est : "+2);
    }

}

