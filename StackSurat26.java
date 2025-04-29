public class StackSurat26 {
    
    Surat26[] data;
    int top, jumlah;

    public StackSurat26(int jumlah) {
        this.jumlah = jumlah;
        data = new Surat26[jumlah];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == jumlah - 1;
    }

    public void push(Surat26 surat) {
        if (!isFull()) {
            top++;
            data[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat26 pop() {
        if (!isEmpty()) {
            Surat26 srt = data[top];
            top--;
            return srt;
        } else {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        }
    }

    public Surat26 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan: ");
                data[i].tampil();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat Dengan Nama Tersebut Tidak Ditemukan.");
        }
    }
}
