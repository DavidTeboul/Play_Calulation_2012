import java.util.Scanner;



public class Program {

    /**

     * @param args

     */

    public static void main(String[] args) {

        int score=0;
        double nb1=1;
        double nb2=1;
        double nb3=1;
        double nb4=1;
        double nb5=1;
        double nb6=1;
        double nb7=1;
        double nb8=1;
        double nb9=1;
        double nb10=1;
        double nb11=1;
        double nb12=1;
        double nb13=1;
        double nb14=1;
        double nb15=1;
        double nb16=1;
        double nb17=1;
        double nb18=1;
        double nb19=1;
        double nb20=1;
        double nb21=1;
        double nb22=1;
        double nb23=1;
        double nb24=1;
        double nb25=1;
        double nb26=1;
        double nb27=1;
        double nb28=1;
        double nb29=1;
        double nb30=1;
        double nb31=1;
        double nb32=1;


        Scanner prenom = new Scanner(System.in);

        System.out.println("Veuillez saisir votre prénom :");

        String str = prenom.nextLine();

        System.out.println("Bonjour " + str);



        char reponse = 'O';
        char reponse1= 'O';
        char reponse2='O';
        char reponse3='O';

        do{

            System.out.println("Niveau 1 ");

            nb1= Math.floor(Math.random() * 21);

            nb2= Math.floor(Math.random() * 21);

            double resultat = nb1+nb2;

            System.out.println(nb1+ " + " +nb2);

            Scanner resultat1 = new Scanner(System.in);

            double resultatuser = resultat1.nextDouble();

            System.out.println(resultatuser);

            if (resultatuser == resultat)

            {score++;

                System.out.println("Bonne réponse!");}

            else

                System.out.println("Mauvaise réponse!");

            nb3= Math.floor(Math.random() * 11);

            nb4= Math.floor(Math.random() * 11);

            double resultat2 = nb3 * nb4;

            System.out.println(nb3+ " x " +nb4);

            Scanner resultat3 = new Scanner(System.in);

            double resultatuser2 = resultat3.nextDouble();

            System.out.println(resultatuser2);

            if (resultatuser2 == resultat2)

            {score++;

                System.out.println("Bonne réponse!");}

            else

                System.out.println("Mauvaise réponse!");


            nb5= Math.floor(Math.random() * 11);

            nb6= Math.floor(Math.random() * 11);

            double resultat4= nb5*nb6;

            System.out.println(nb5+ " x " +nb6);

            Scanner resultat5 = new Scanner(System.in);

            double resultatuser3 = resultat5.nextDouble();

            System.out.println(resultatuser3);

            if (resultatuser3 == resultat4)

            {score++;

                System.out.println("Bonne réponse!");}

            else

                System.out.println("Mauvaise réponse!");


            nb7= Math.floor(Math.random() * 21);

            nb8= Math.floor(Math.random() * 21);

            double resultat6= nb7 - nb8;

            System.out.println(nb7+ " - " +nb8);

            Scanner resultat7 = new Scanner(System.in);

            double resultatuser4 = resultat7.nextDouble();

            System.out.println(resultatuser4);

            if (resultatuser4 == resultat6)

            {score++;

                System.out.println("Bonne réponse!");}

            else{

                System.out.println("Mauvaise réponse!");}
            if (score<4&& score>=0){

                System.out.println("Vous n'avez pas cumulé assez de points");
                System.out.println("Voulez vous recommencer le niveau 1? O/N");
                Scanner f = new Scanner (System.in);

                reponse = f.nextLine() .charAt (0);
                score=0;
            }
        }
        while (reponse == 'O'&& score!=4);

        if (reponse == 'N')

            System.out.println("Au revoir !");




        do {
            if (score==4) {

                System.out.println("Vous avez marqué " +score + " points.");
                System.out.println("Niveau 2");

                nb9= Math.floor(Math.random() * 51);

                nb10= Math.floor(Math.random() * 51);

                double resultat8 = nb9 + nb10;

                System.out.println(nb9+ "+" +nb10);

                Scanner resultat9 = new Scanner(System.in);

                double resultatuser5 = resultat9.nextDouble();

                System.out.println(resultatuser5);

                if (resultatuser5 == resultat8)

                {score++;

                    System.out.println("Bonne réponse!");}

                else

                    System.out.println("Mauvaise réponse!");


                nb11= Math.floor(Math.random() * 16);

                nb12= Math.floor(Math.random() * 16);

                double resultat10= nb11 * nb12;
                System.out.println(nb11+ "x" +nb12);

                Scanner resultat11 = new Scanner(System.in);

                double resultatuser6 = resultat11.nextDouble();

                System.out.println(resultatuser6);

                if (resultatuser6 == resultat10)

                {score++;

                    System.out.println("Bonne réponse!");}

                else

                    System.out.println("Mauvaise réponse!");



                nb13= Math.floor(Math.random() * 51);


                nb14= Math.floor(Math.random() * 51);

                double resultat12= nb13 - nb14;

                System.out.println(nb13+ "-" +nb14);

                Scanner resultat13 = new Scanner(System.in);

                double resultatuser7 = resultat13.nextDouble();

                System.out.println(resultatuser7);

                if (resultatuser7 == resultat12)

                {score++;

                    System.out.println("Bonne réponse!");}

                else

                    System.out.println("Mauvaise réponse!");




                nb15= Math.floor(Math.random() * 16);

                nb16= Math.floor(Math.random() * 16);

                double resultat14= nb15 * nb16;

                System.out.println(nb15+ "x" +nb16);

                Scanner resultat15 = new Scanner(System.in);

                double resultatuser8 = resultat15.nextDouble();

                System.out.println(resultatuser8);

                if (resultatuser8 == resultat14)

                {score++;

                    System.out.println("Bonne réponse!");
                }

                else

                    System.out.println("Mauvaise réponse!");

                if (score>=4&& score<8){

                    System.out.println("Vous n'avez pas cumulé assez de points");
                    System.out.println("Voulez vous recommencer le niveau 2? O/N");
                    Scanner e = new Scanner (System.in);

                    reponse1 = e.nextLine() .charAt (0);
                    score=4;}
            }}
        while (reponse1 == 'O' && score<8);

        if (reponse1 == 'N')

            System.out.println("Au revoir !");





        do{
            if (score==8) {

                System.out.println("Vous avez marqué " +score + " points.");
                System.out.println("Niveau 3");

                nb17= Math.floor(Math.random() * 21);

                nb18= Math.floor(Math.random() * 21);

                double resultat16 = nb17 * nb18;

                System.out.println(nb17+ "x" +nb18);

                Scanner resultat17 = new Scanner(System.in);

                double resultatuser9 = resultat17.nextDouble();
                System.out.println(resultatuser9);
                if (resultatuser9 == resultat16)

                {score++;

                    System.out.println("Bonne réponse!");}

                else

                    System.out.println("Mauvaise réponse!");



                nb19= Math.floor(Math.random() * 71);

                nb20= Math.floor(Math.random() * 71);

                double resultat18 = nb19 + nb20;

                System.out.println(nb19+ "+" +nb20);

                Scanner resultat19 = new Scanner(System.in);

                double resultatuser10 = resultat19.nextDouble();

                System.out.println(resultatuser10);

                if (resultatuser10 == resultat18)

                {score++;

                    System.out.println("Bonne réponse!");}

                else

                    System.out.println("Mauvaise réponse!");



                nb21= Math.floor(Math.random() * 71);

                nb22= Math.floor(Math.random() * 71);

                double resultat20 = nb21 - nb22;

                System.out.println(nb21+ "-" +nb22);

                Scanner resultat21 = new Scanner(System.in);

                double resultatuser11 = resultat21.nextDouble();

                System.out.println(resultatuser11);

                if (resultatuser11 == resultat20)

                {score++;
                    System.out.println("Bonne réponse!");}

                else

                    System.out.println("Mauvaise réponse!");



                nb23= Math.floor(Math.random() * 21);

                nb24= Math.floor(Math.random() * 21);

                double resultat22 = nb23 * nb24;

                System.out.println(nb23+ "x" +nb24);

                Scanner resultat23 = new Scanner(System.in);

                double resultatuser12 = resultat23.nextDouble();

                System.out.println(resultatuser12);

                if (resultatuser12 == resultat22)

                {score++;

                    System.out.println("Bonne réponse!");}

                else

                    System.out.println("Mauvaise réponse!");

            }


            if (score>=8 && score<12){

                System.out.println("Vous n'avez pas cumulé assez de points");
                System.out.println("Voulez vous recommencer le niveau 3? O/N");
                Scanner b = new Scanner (System.in);

                reponse2 = b.nextLine() .charAt (0);
                score=8;}
        }
        while (reponse2 == 'O' && score<12);

        if (reponse2 == 'N')

            System.out.println("Au revoir !");






        do{

            if(score==12){

                System.out.println("Vous avez marqué " +score + " points.");
                System.out.println("Niveau 4");


                nb25= Math.floor(Math.random() * 21);

                nb26= Math.floor(Math.random() * 21);

                double resultat24 = nb25 * nb26;

                System.out.println(nb25+ "x" +nb26);

                Scanner resultat25 = new Scanner(System.in);

                double resultatuser13 = resultat25.nextDouble();

                System.out.println(resultatuser13);

                if (resultatuser13 == resultat24)

                {score++;

                    System.out.println("Bonne réponse!");}

                else

                    System.out.println("Mauvaise réponse!");



                nb27= Math.floor(Math.random() * 21);

                nb28= Math.floor(Math.random() * 21);

                double resultat26 = nb27 * nb28;

                System.out.println(nb27+ "x" +nb28);

                Scanner resultat27 = new Scanner(System.in);

                double resultatuser14 = resultat27.nextDouble();

                System.out.println(resultatuser14);

                if (resultatuser14 == resultat26)

                {score++;

                    System.out.println("Bonne réponse!");}

                else

                    System.out.println("Mauvaise réponse!");



                nb29= Math.floor(Math.random() * 101);

                nb30= Math.floor(Math.random() * 101);

                double resultat28 = nb29 + nb30;

                System.out.println(nb29+ "+" +nb30);

                Scanner resultat29 = new Scanner(System.in);

                double resultatuser15 = resultat29.nextDouble();

                System.out.println(resultatuser15);

                if (resultatuser15 == resultat28)

                {score++;

                    System.out.println("Bonne réponse!");}

                else

                    System.out.println("Mauvaise réponse!");



                nb31= Math.floor(Math.random() * 101);

                nb32= Math.floor(Math.random() * 101);

                double resultat30 = nb31 - nb32;

                System.out.println(nb31+ "-" +nb32);

                Scanner resultat31 = new Scanner(System.in);

                double resultatuser16 = resultat31.nextDouble();

                System.out.println(resultatuser16);

                if (resultatuser16 == resultat30)

                {score++;

                    System.out.println("Bonne réponse!");}

                else

                    System.out.println("Mauvaise réponse! Vous avez marqué " +score + " points.");
            }
            if (score>=12 && score<16){

                System.out.println("Vous n'avez pas cumulé assez de points");
                System.out.println("Voulez vous recommencer le niveau 4? O/N");
                Scanner k = new Scanner (System.in);

                reponse3 = k.nextLine() .charAt (0);
                score=12;
            }

        }
        while (reponse3 == 'O' && score<16);

        if (reponse3 == 'N')

            System.out.println("Au revoir !");



        if (score==16) {
            System.out.println("Vous avez gagné!!");
        }}}
