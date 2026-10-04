/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p02;

/**
* Skripsi hanya dapat dibaca di tempat, sehingga tidak bisa dipinjam.
* Batas hari pinjam 0 dan denda selalu Rp0.
*/
public class Skripsi extends Koleksi {

    private final String penulis;
    private final String programStudi;

    public Skripsi(String kode, String judul, int tahunTerbit, String penulis, String programStudi) {
        super(kode, judul, tahunTerbit);
        this.penulis = penulis;
        this.programStudi = programStudi;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    /** Skripsi tidak boleh dipinjam, sehingga selalu mengembalikan false. */
    @Override
    public boolean pinjam() {
        return false;
    }

    @Override
    public int batasHariPinjam() {
        return 0;
    }

    @Override
    public long hitungDenda(int hariTerlambat) {
        return 0L;
    }

    @Override
    public String keterangan() {
        return "Skripsi karya " + penulis + ", program studi " + programStudi;
    }
}
