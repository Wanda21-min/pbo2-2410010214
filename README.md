## P01
### Hasil Program:

<img width="617" height="194" alt="Screenshot 2026-09-27 100714" src="https://github.com/user-attachments/assets/eed571d0-323a-4e52-9aab-c9baebf0da24" />
<img width="623" height="234" alt="Screenshot 2026-09-27 103459" src="https://github.com/user-attachments/assets/ee2f28b5-958b-4220-9097-15cb8f5b77c5" />
<img width="860" height="113" alt="Screenshot 2026-09-27 104724" src="https://github.com/user-attachments/assets/d17f404d-d961-4404-a922-51ad36713649" />


## P02
### Kode dibantu AI
### Hasil Program:

<img width="928" height="303" alt="Screenshot 2026-10-04 215850" src="https://github.com/user-attachments/assets/aee96670-6df7-4dba-a6c3-e5751c3b5bb1" />

### Jawaban dari eksperimen praktikum 6
1. Muncul pesan error: Koleksi is abstract; cannot be instantiated, karena koleksi dideklarasikan abstract, dan class abstract tidak boleh dibuat objeknya langsung dengan new. Class abstract hanya berfungsi sebagai kerangka untuk diturunkan. Itu masuk akal karena tidak ada koleksi yang "hanya koleksi". Pasti berupa Buku, Majalah, atau Skripsi.
2. Dengan @Override, ada 2 error:
- Buku is not abstract and does not override abstract method hitungDenda(int) in BisaDipinjam 
- method does not override or implement a method from a supertype
Tanpa @Override hanya  1 error:
- Buku is not abstract and does not override abstract method hitungDenda(int) in BisaDipinjam
3. Program berhenti saat dijalankan (kompilasi berhasil)
4. Aturan yang dilanggar adalah encapsulation (enkapsulasi)

## P03
### Hasil Program:

<img width="668" height="500" alt="Screenshot 2026-10-04 143614" src="https://github.com/user-attachments/assets/53bea020-a638-4d1b-8b2f-4be0d6070cf8" />
<img width="674" height="499" alt="Screenshot 2026-10-04 143622" src="https://github.com/user-attachments/assets/df52e712-69b6-4f23-849c-8131d990c362" />
<img width="351" height="389" alt="Screenshot 2026-10-04 143712" src="https://github.com/user-attachments/assets/39e88234-7d16-4a4a-a1e0-2c96cfeb0815" />

### Jawaban Refleksi  
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

## P04
### Foto Sketsa :

<img width="963" height="1280" alt="Foto Sketsa" src="https://github.com/user-attachments/assets/11e778e7-31c1-45b4-a0a7-a1d3b6d8ccd4" />


### Tabel Rancangan: Form Anggota Perpustakaan

| Bagian | Panel | Layout |
|---|---|---|
| Jendela | JFrame | BorderLayout |
| Header | headerPanel (North) | BoxLayout, Y Axis |
| Isi form | isiPanel (Center) | BorderLayout |
| Isi form | formPanel (North di isiPanel) | GridBagLayout |
| Isi form | jenisPanel (di dalam formPanel) | FlowLayout, Left |
| Tombol | tombolPanel (South) | FlowLayout, Right |

### Tangkapan layar FormAnggotaPerpustakaan ukuran awal :

<img width="266" height="407" alt="Screenshot 2026-10-18 132229" src="https://github.com/user-attachments/assets/11a90441-8076-4f90-8ded-ea1b841910ce" />

### Tangkapan layar FormAnggotaPerpustakaan ukuran saat dilebarkan :

<img width="593" height="417" alt="Screenshot 2026-10-18 132248" src="https://github.com/user-attachments/assets/ef9d7fc6-c132-4cf6-8130-411af1cef6e0" />

### Tangkapan layar susunan panel dan layout :

<img width="225" height="241" alt="Screenshot 2026-10-18 132746" src="https://github.com/user-attachments/assets/069795ba-9995-4e99-97d4-7ead02c62d9c" />

### Jawaban praktikum 2:
1. yang berubah:
- Saat jendela lebar, ketujuh tombol (Baru sampai Keluar) berada di tengah panel, tidak lagi menempel di kiri.
- Saat jendela dikecilkan, tombol yang tidak muat pindah ke baris berikutnya. Setiap baris tetap diposisikan di tengah, bukan rata kiri.
- Baris di initComponents() yang berubah: baris pengaturan layout flowPanel
2. Hasilnya 5 baris. Dari 9 tombol dan 2 kolom, baris yang terbentuk adalah 9 : 2 = 4,5, dibulatkan ke atas jadi 5. Baris terakhir hanya berisi tombol 9 di kolom kiri, sedangkan sel kanannya kosong
3. Sebelum diubah:
- BoxLayout memakai ukuran asli tiap tombol. Lebar tombol berbeda-beda sesuai teksnya, misalnya “Dashboard” lebih pendek daripada “Data Mahasiswa”, dan semuanya menempel di kiri.
Setelah maximumSize diisi (lebar 32767, tinggi sama dengan tinggi tombol):
- Lebar keempat tombol melebar memenuhi lebar panel, jadi semuanya sama lebar. Saat jendela dilebarkan atau dikecilkan, lebar tombol ikut berubah.
- Tinggi tetap, karena tingginya dibatasi sama dengan tinggi tombol. Kalau tinggi dibiarkan tak terbatas, tombol ikut memanjang ke bawah.
Setelah Vertical Strut ditambahkan dari Palette (kategori Swing Fillers) di antara tombol:
- Muncul jarak kosong dengan tinggi tetap di antara tombol. Isi tinggi lewat properti strut, misalnya 8 piksel.
- Jaraknya tidak berubah walau jendela diubah ukurannya, karena strut berukuran tetap.
- Perlu 3 strut untuk 4 tombol, yaitu satu di setiap sela.
- Di kode, strut muncul sebagai objek Box.Filler di initComponents().

### Jawaban praktikum 4 :
1. ketika Weight X pada namaField menjadi 0.0, yang terjadi pada isian tetap ikut melebar
2. formPanel diberi seluruh sisa tinggi. Karena semua baris form ber-Weight Y 0, baris-baris itu tidak ikut merenggang. GridBagLayout justru menaruh seluruh blok form di tengah secara vertikal, sehingga muncul ruang kosong di atas dan di bawahnya. Judul “Data Diri” ikut turun menjauhi header.
3. headerPanel (North) dan tombolPanel (South) mempertahankan tingginya, sedangkan isiPanel di Center yang diperas. Akibatnya bagian bawah form terpotong lebih dulu, mulai dari baris Alamat.

### Saling Menilai (Tahap 4)

Form yang dinilai: FormAnggotaPerpustakaan
| No | Pemeriksaan | Ya atau Belum |
|---|---|---|
| 1 | Label singkat, jelas, dan sejajar | Ya |
| 2 | Isian dikelompokkan dengan judul bagian |Ya |
| 3 | Placeholder dipakai untuk isian yang punya format |Ya |
| 4 | Komponen sesuai jenis data |Ya |
| 5 | Tombol utama menonjol dan berada di kanan bawah |Ya |
| 6 | Jarak antar komponen konsisten |Ya |
| 7 | Form tetap rapi saat jendela dilebarkan dan ditinggikan |Ya |
| 8 | Tampilan dibuat dengan JFrame Form dan layout manager, bukan Null Layout atau Absolute Layout |Ya |

Saran perbaikan dari teman:
Tambahkan placeholder di NPM

### Jawaban refleksi :
1. Tampilan tidak menyesuaikan ukuran jendela. Saat jendela dilebarkan, komponen tetap di tempatnya dan muncul ruang kosong. Saat dikecilkan, komponen terpotong.
2. - FlowLayout menyusun komponen berderet dengan ukuran aslinya. Saat jendela dilebarkan, ukuran komponen tidak berubah. Komponen hanya berpindah posisi: yang tadinya turun ke baris berikutnya bisa naik ke baris pertama karena muat. Sisa lebar menjadi ruang kosong sesuai Alignment.
   - GridLayout membagi ruang menjadi sel-sel sama besar. Saat jendela dilebarkan, setiap sel dan komponennya ikut melebar dan semuanya tetap sama besar. Jumlah baris dan kolomnya tidak berubah.
3. - Weight X menentukan pembagian sisa lebar ke kolom saat panel lebih lebar daripada isinya. Kolom ber-Weight X 0.0 tetap selebar isinya, sedangkan kolom ber-Weight X 1.0 menyerap sisa lebar. Pada form, label diberi 0.0 dan isian 1.0, sehingga isianlah yang melebar.
   - Fill menentukan apakah komponen memenuhi selnya. Fill Horizontal membuat komponen melebar mengikuti lebar sel, sedangkan None membuatnya tetap berukuran asli.
4. Wilayah Center pada BorderLayout menerima seluruh sisa ruang. Kalau formPanel langsung di Center, ia diberi seluruh tinggi yang tersisa, sedangkan GridBagLayout menaruh blok baris-barisnya di tengah secara vertikal. Saat jendela ditinggikan, form melayang ke tengah dan menjauh dari header.
5. Prinsip 1 : Keselarasan
  - label dan isian membentuk garis lurus sehingga mudah dibaca dari atas ke bawah.

   Prinsip 2 : Kedekatan
  - isian yang berkaitan dikelompokkan dan diberi judul bagian.

Bukti prinsip yang digunakan :

<img width="371" height="131" alt="Screenshot 2026-10-18 145501" src="https://github.com/user-attachments/assets/4330a2ad-892d-4316-ae8e-06d51ef37de8" />
