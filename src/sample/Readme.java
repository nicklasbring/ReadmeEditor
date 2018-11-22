package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Readme {

    public static void main(String[] args) {

        String filensIndhold;
        filensIndhold = readFile();
        System.out.println("README INDEHOLDER: \n" + filensIndhold);

        }

    public static String readFile() {
        String readmeTxt = " ";

        System.out.println("Readme editor");

        File readme = new File("README.md");

        if (readme.exists()) {
            System.out.println("Readme findes - der oprettes derfor ikke en ny. ");
        } else {
            System.out.println("Readme findes ikke - der oprettes en ny ");
        }


        try {
            PrintWriter filSkriver = new PrintWriter(readme);
            filSkriver.println("Hest pølse");
            filSkriver.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



            System.out.println("nu indlæses readme");
            Scanner in = new Scanner(readFile());

            while (in.hasNext()) {
                String newLine = in.nextLine();
                System.out.println(newLine);
                readmeTxt = readmeTxt + newLine + "\n";
            }


        

        return readmeTxt;
        }


        public static void writeFile(String indhold){



        }
            }

