public class mahasiswa {
	private String nama;
	private int umur;

		public mahasiswa(String a, int b){
			nama = a;
			umur = b;
		}

		public void tampilkanBiodata(){
			System.out.println("===BIODATA===");
			System.out.println("Nama Mahasiswa ="+nama);
			System.out.println("Umur Mahasiswa ="+umur);
		}
		public String getNama(){
			return nama;
		}
		public void setNama(String a){
			this.nama = a;
		}
		public int getUmur(){
			return umur;
		}
		public void setUmur(int b){
			this.umur = b;
		}
}