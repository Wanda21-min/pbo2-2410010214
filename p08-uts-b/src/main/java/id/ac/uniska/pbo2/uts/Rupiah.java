// Nama : Muhammad Ruwanda
// NPM  : 2410010214

package id.ac.uniska.pbo2.uts;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * Format nilai uang sebagai rupiah, misalnya 125000 menjadi Rp125.000.
 */
public final class Rupiah {

    private Rupiah() {
        // kelas utilitas, tidak perlu dibuat object-nya
    }

    public static String format(long nilai) {
        DecimalFormatSymbols simbol = new DecimalFormatSymbols();
        simbol.setGroupingSeparator('.');
        return "Rp" + new DecimalFormat("#,##0", simbol).format(nilai);
    }
}
