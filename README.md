<img width="668" height="500" alt="Screenshot 2026-10-04 143614" src="https://github.com/user-attachments/assets/53bea020-a638-4d1b-8b2f-4be0d6070cf8" />
<img width="674" height="499" alt="Screenshot 2026-10-04 143622" src="https://github.com/user-attachments/assets/df52e712-69b6-4f23-849c-8131d990c362" />
<img width="351" height="389" alt="Screenshot 2026-10-04 143712" src="https://github.com/user-attachments/assets/39e88234-7d16-4a4a-a1e0-2c96cfeb0815" />
Jawaban : 
1. - Top level container adalah komponen utama yang menjadi wadah paling luar dari aplikasi  
GUI, contohnya : JFrame - Intermediate container adalah komponen yang digunakan untuk mengelompokkan atau 
menampung komponen lain di dalam top-level container, contohnya: JPanel - Atomic component adalah komponen antarmuka yang menjalankan fungsi tertentu dan 
biasanya tidak digunakan untuk menampung komponen lain, contohnya: JButton 
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
