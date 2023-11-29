public class Member {
    
    protected Integer poin = 0;
    String nomorFaktur;
    String namePelanggan;
    String no_hp;
    String namaBarang;
    int hargaBarang;
    int jumlahBarang;
    Double totalBayar;

    public Integer getPoin(){
        return poin;
    }

    protected Integer getBonusPoin (Integer totalBayar){
        Integer poin = (int) (totalBayar/10000);
        return poin;
    }
}
