package controller;

public class sapinho extends Thread{
	private int distancia =0;
	private int distanciatotal;
	private int pulo = 0;
	private int pulos = 0;
	private String nome;
	private static int colocacao = 0;
	private final static int maxpulo=10;
	
	public sapinho(String nome, int distanciatotal) {
		super(nome);
		this.nome=nome;
		this.distanciatotal=distanciatotal;
		
	}
	public void sapomostra() {
		System.out.println(""+nome+"pulou" +pulo+ "com a distancia em cm: "+distancia);
		
	}
	public void sapula() {
		pulos++;
		pulo = (int) (Math.random()*maxpulo);
		distancia+=pulo;
	if(distancia>distanciatotal) {
		distancia = distanciatotal;
	}
	}
	
	public void dormesapo() {
		yield();
		
	}
	public void posisapo() {
colocacao++;
System.out.println("\n"+nome+ "foi"+colocacao+ "tendo pulos" +pulos);;
	}
	public void run() {
		while(distancia<distanciatotal) {
			sapula();
			sapomostra();
			dormesapo();
			try {
				sleep(200);
				
			}catch(InterruptedException e) {}
		}
		try {
			sleep(2000);
		}catch (InterruptedException e) {}
		sapomostra();
		}
	}
	
	
	
	

