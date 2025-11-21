import java.util.Scanner;
public class Tugas22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rata2NR, rata2NP, rata2;
        int totalNR, totalNP, total = 0, nilaiJawabans[][] = new int[10][6];

  
        for (int i = 0; i < nilaiJawabans.length; i++) {
            System.out.println("Masukkan nilai jawaban Responden ke-" + (i + 1));
            totalNR = 0;
            for (int j = 0; j < nilaiJawabans[i].length; j++) {
                System.out.print("Nilai Soal ke-" + (j + 1) + " (1 - 5): ");
                nilaiJawabans[i][j] = sc.nextInt();
                totalNR += nilaiJawabans[i][j];
            }

            rata2NR = (double) totalNR / nilaiJawabans[i].length;
            System.out.println("-".repeat(50));
            System.out.printf("%s%d%s %.2f\n","Rata-rata nilai responden ke-" , (i + 1) , ": " , rata2NR);
            System.out.println("-".repeat(50));
        }

        for (int i = 0; i < nilaiJawabans[0].length; i++) {
            totalNP = 0;
            for (int j = 0; j < nilaiJawabans.length; j++) {
                totalNP += nilaiJawabans[j][i];
                total += nilaiJawabans[j][i];
            }

            rata2NP = (double) totalNP / nilaiJawabans.length;
            System.out.print("rata2 nilai pertanyaan ke-" + (i + 1) + ": " + rata2NP);
            System.out.println();
        }

        rata2 = (double) total / (nilaiJawabans.length * nilaiJawabans[0].length);
        System.out.printf("total rata rata: %.2f", rata2);
        sc.close();
    }
}