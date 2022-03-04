import java.util.LinkedList;

public class App
{
  public static void main(String[] args)
 {
  LinkedList<String>nama_mahasiswa = new LinkedList<String>();
  LinkedList <String> no_bp = new LinkedList<String>();
  LinkedList <String> alamat = new LinkedList<String>();

        nama_mahasiswa.add("Mhd.Faiz Yunus");
        no_bp.add("2111523010");
        alamat.add("Jln.Sumatra Perum GIB Blok E.12");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Menambahkan Data Mahasiswa : ");
        //menambahkan nama mahasiswa
        nama_mahasiswa.addFirst("Al - Amin");
        nama_mahasiswa.add("Revi Putra Hernel");
        nama_mahasiswa.add("Arif Wahyudi");
        nama_mahasiswa.addLast("Irfan Wahendra");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        //menambahkan nomor induk mahasiswa
        no_bp.addFirst("2111521017");
        no_bp.add("2111523022");
        no_bp.add("2111523018");
        no_bp.addLast("2111527001");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);

        //menambahkan alamat mahasiswa
        alamat.addFirst("Jln. Kakak Tua");
        alamat.add("Jln. Cempaka Putih");
        alamat.add("Jln. Limau Manis No.20");
        alamat.addLast("Jln. Limau Manis No.35");
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Menghapus Data Mahasiswa : ");
        //menghapus nama mahasiswa
        nama_mahasiswa.removeFirst();
        nama_mahasiswa.remove();
        nama_mahasiswa.removeLast();
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        //menghapus nomor induk mahasiswa
        no_bp.removeFirst();
        no_bp.remove();
        no_bp.removeLast();
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);

        //menghapus alamat mahasiswa
        alamat.removeFirst();
        alamat.remove();
        alamat.removeLast();
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Menyisipkan Data Mahasiswa : ");
        //menyisipkan nama mahasiswa
        nama_mahasiswa.set(0,"Muhammad Satria Gemilang Lubis");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        //menyisipkan nomor induk mahasiswa
        no_bp.set(0,"2111522008");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        
        //menyisipkan alamat mahasiswa
        alamat.set(0,"Jln. Limau Manis No.14");
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Mencari Data Mahasiswa : ");
        //mencari nama mahasiswa
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.getFirst());
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.getLast());
        System.out.println("");

        //mencari nomor induk mahasiswa
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.getFirst());
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.getLast());
        System.out.println("");

        //mencari alamat mahasiswa
        System.out.println("Alamat Mahasiswa : " +alamat.getFirst());
        System.out.println("Alamat Mahasiswa : " +alamat.getLast());
        System.out.println("");
 }   

}