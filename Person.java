package no.hvl.dat100;

public class Person{
	public String etternavn;
	public String fornavn;
	public long	fodselsnr;
	public String kjonn;
	
	/*public Person(){
		this (0,0,0,0);
	}
	public Person(String etternavn){
		this (etternavn,0,0,0);
	}
	public Person(String etternavn, String fornavn){
		this (etternavn,fornavn,0,0);
	}
	public Person(String etternavn, String fornavn, int fodselsar){
		this (etternavn,fornavn,fodselsar,0);
	}
	public Person(String etternavn, String fornavn, int fodselsar, String kjonn){
		this (etternavn,fornavn,fodselsar,kjonn);
	}*/
	
	
	public Person() {
		this.fodselsnr=fodselsnr;
		this.fornavn=fornavn;
		this.etternavn=etternavn;
		//throw new RuntimeException("Person constructor not implemented");
	}
public String getEtternavn() {
		return etternavn;
	}
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	public String getFornavn() {
		return fornavn;
	}
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	public long getFodselsNr() {
		return fodselsnr;
	}
	public void setFodselsNr(long fodselsnummer) {
		this.fodselsnr = fodselsnummer;
	}
	public String getKjonn() {
		return kjonn;
	}
	public void setKjonn(String kjonn) {
		this.kjonn = kjonn;
	}public boolean erLik(Person person) {
		boolean erLikedan=false;
		if(person!=null && this.fodselsnr==person.getFodselsNr()) {
			erLikedan=true;
		}else {
			erLikedan=false;
		}
		return erLikedan;
		//throw new RuntimeException("erLik not implemented");
	}

	public boolean erKvinne() {
		boolean erKvinne=false;
		String fodselsnrTxt=Long.toString(this.fodselsnr);
		String tredjeSisteNrTxt=fodselsnrTxt.substring(8, 9);
		int tredjeSisteNr=Integer.parseInt(tredjeSisteNrTxt);
		if(tredjeSisteNr%2==0) {
			erKvinne=true;
		}else {
			erKvinne=false;
		}
		return erKvinne;
		//throw new RuntimeException("erKvinne not implemented");
	}

	public boolean erMann() {
		boolean erMann=false;
		String fodselsnrTxt=Long.toString(this.fodselsnr);
		String tredjeSisteNrTxt=fodselsnrTxt.substring(8, 9);
		int tredjeSisteNr=Integer.parseInt(tredjeSisteNrTxt);
		if(tredjeSisteNr%2==0) {
			erMann=false;
		}else {
			erMann=true;
		}
		return erMann;
		//throw new RuntimeException("erMann not implemented");
	}

	@Override
	public String toString() {
		String personTxt= this.fodselsnr + "\n" + this.etternavn+ "\n" + this.fornavn + "\n";
		return personTxt;
		//throw new RuntimeException("toString not implemented");
	}
	
	
	public class Student extends Person {
		private int studentnr;
		private String klasse;

		public Student() {
			super();
		}

		public Student(String etternavn, String fornavn, long fodselsNr, int studentNr, String klasse) {
			setEtternavn(etternavn);
			setFornavn(fornavn);
			setFodselsNr(fodselsNr);
			studentnr=studentNr;
			this.klasse=klasse;
			//throw new RuntimeException("Student constructor not implemented");
		}
		public int getStudNr() {
			return studentnr;
		}
		public void setStudNr(int studNr) {
			this.studentnr = studNr;
		}
		public String getKlasse() {
			return klasse;
		}
		public void setKlasse(String klasse) {
			this.klasse = klasse;
		}
		
		
	}
public class Laerer extends Person{
	public Laerer(String etternavn, String fornavn, long fodselsnummer, int mLonn, int kontonummer) {
		super();
		this.mLonn=mLonn;
		kontorNr=kontonummer;
		//throw new RuntimeException("Laerer constructor not implemented");
	}
	private int mLonn;
	private int kontorNr;
	

	public int getmLonn() {
		return mLonn;
	}
	public void setmLonn(int mLonn) {
		this.mLonn = mLonn;
	}
	public int getKontorNr() {
		return kontorNr;
	}
	public void setKontorNr(int kontorNr) {
		this.kontorNr = kontorNr;
	}

	@Override
	public String toString() {
		String teacherTxt="LAERER" + "\n" + super.toString() + this.mLonn + "\n" + this.kontorNr + "\n";
		return teacherTxt;
		//throw new RuntimeException("toString() not implemented");

	}
}
	



}


