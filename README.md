## P01
Hasil Program:

<img width="617" height="194" alt="Screenshot 2026-09-27 100714" src="https://github.com/user-attachments/assets/eed571d0-323a-4e52-9aab-c9baebf0da24" />
<img width="623" height="234" alt="Screenshot 2026-09-27 103459" src="https://github.com/user-attachments/assets/ee2f28b5-958b-4220-9097-15cb8f5b77c5" />
<img width="860" height="113" alt="Screenshot 2026-09-27 104724" src="https://github.com/user-attachments/assets/d17f404d-d961-4404-a922-51ad36713649" />


## P02
Hasil Program:

<img width="928" height="303" alt="Screenshot 2026-10-04 215850" src="https://github.com/user-attachments/assets/aee96670-6df7-4dba-a6c3-e5751c3b5bb1" />

## Jawaban dari eksperimen praktikum 6
1. Muncul pesan error: Koleksi is abstract; cannot be instantiated, karena koleksi dideklarasikan abstract, dan class abstract tidak boleh dibuat objeknya langsung dengan new. Class abstract hanya berfungsi sebagai kerangka untuk diturunkan. Itu masuk akal karena tidak ada koleksi yang "hanya koleksi". Pasti berupa Buku, Majalah, atau Skripsi.
2. Dengan @Override, ada 2 error:
- Buku is not abstract and does not override abstract method hitungDenda(int) in BisaDipinjam 
- method does not override or implement a method from a supertype
Tanpa @Override hanya  1 error:
- Buku is not abstract and does not override abstract method hitungDenda(int) in BisaDipinjam
3. Program berhenti saat dijalankan (kompilasi berhasil)
4. Aturan yang dilanggar adalah encapsulation (enkapsulasi)

## P03
Hasil Program:

<img width="668" height="500" alt="Screenshot 2026-10-04 143614" src="https://github.com/user-attachments/assets/53bea020-a638-4d1b-8b2f-4be0d6070cf8" />
<img width="674" height="499" alt="Screenshot 2026-10-04 143622" src="https://github.com/user-attachments/assets/df52e712-69b6-4f23-849c-8131d990c362" />
<img width="351" height="389" alt="Screenshot 2026-10-04 143712" src="https://github.com/user-attachments/assets/39e88234-7d16-4a4a-a1e0-2c96cfeb0815" />

## Jawaban  
1. Perbedaan jenis container :
 - **Top level container adalah komponen utama yang menjadi wadah paling luar dari aplikasi GUI, contohnya : JFrame
 - **Intermediate container adalah komponen yang digunakan untuk mengelompokkan atau menampung komponen lain di dalam top level container, contohnya: JPanel
 - **Atomic component adalah komponen antarmuka yang menjalankan fungsi tertentu dan biasanya tidak digunakan untuk menampung komponen lain, contohnya: JButton 
2. Karena JRadioButton yang berada dalam ButtonGroup yang sama akan saling eksklusif. 
Artinya, pengguna hanya dapat memilih satu radio button pada satu waktu 
3. Gunakan JComboBox jika terdapat banyak pilihan, gunakan JRadioButton jika hanya 
terdapat sedikit pilihan 
4. initComponents() biasanya dihasilkan secara otomatis oleh NetBeans GUI Builder. Jika 
diedit secara manual, perubahan tersebut dapat ditimpa atau hilang ketika form diedit kembali 
menggunakan GUI Builder. Kode tambahan seperti logika program, event handler, validasi, 
dan proses perhitungan sebaiknya ditulis di luar initComponents(). 
5. FlatLightLaf.setup() digunakan untuk memasang Look and Feel FlatLaf pada aplikasi 
Swing. Pemanggilan ini harus dilakukan sebelum form dibuat agar komponen-komponen 
pada form menggunakan tampilan FlatLaf sejak awal.
