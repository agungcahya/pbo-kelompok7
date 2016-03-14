
import java.util.ArrayList;

public class PasienInap {
	private Pasien pasien;
	private Dokter dokter;
	private ArrayList<String> diagnosa=new ArrayList<String>();
	
	public PasienInap(Pasien pasien, Dokter dokter, String diagnosa){
		setPasien(pasien);
		setDokter(dokter);
		addDiagnosa(diagnosa);
	}
	
	public void setDokter(Dokter dokter){
		this.dokter=dokter;
	}
	public Dokter getDokter(){
		return dokter;
	}
	public void addDiagnosa(String diagnosa){
		this.diagnosa=diagnosa;
	}
	public String getDiagnosa(int i){
                
		return diagnosa.get(i);
	}
	public void setPasien(Pasien pasien){
		this.pasien=pasien;
	}
	public Pasien getPasien(){
		return pasien;
	}
        public void delDiagnosa(int i){
            diagnosa.remove(i);
        }
}