import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  String nama,matkul,npm;
  int in1,in2,in3,in4;
  double uts,uas,tugas,absen,nilaiakhir;

  System.out.print("Masukkan nama Mahasiswa : ");
  nama = scanner.nextLine();
  System.out.print("Masukkan NPM            : ");
  npm = scanner.nextLine();
  System.out.print("Masukkan Mata Kuliah    : ");
  matkul = scanner.nextLine();
  System.out.print("Nilai UTS   : ");
  in1 = scanner.nextInt();
  System.out.print("Nilai UAS   : ");
  in2 = scanner.nextInt();
  System.out.print("Nilai Tugas : ");
  in3 = scanner.nextInt();
  System.out.print("Nilai Absen : ");
  in4 = scanner.nextInt();

  uts=in1*0.20;
  uas=in2*0.30;
  tugas=in3*0.30;
  absen=in4*0.20;
  nilaiakhir=uts+uas+tugas+absen;
  System.out.println("-----------------------------");
  System.out.println("Nama Mahasiswa : "+nama);
  System.out.println("NPM            : "+npm);
  System.out.println("Mata Kuliah    : "+matkul);
  System.out.println("-----------------------------");
  System.out.println("Nilai yang diperoleh");
  System.out.println("Nilai UTS   : "+(int)uts);
  System.out.println("Nilai UAS   : "+(int)uas);
  System.out.println("Nilai Tugas : "+(int)tugas);
  System.out.println("Nilai Absen : "+(int)absen);
  System.out.println("Nilai Akhir yang diperoleh : "+(int)nilaiakhir);
 }
}