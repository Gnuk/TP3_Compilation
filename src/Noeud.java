
public class Noeud {
	
	private String racine;
	private Noeud fd;
	private Noeud fg;
	
	public Noeud(String racine, Noeud fg, Noeud fd){
		this.racine = racine;
		this.fd = fd;
		this.fg = fg;
	}
	
	public Noeud(String racine){
		this.racine = racine;
		this.fd = null;
		this.fg = null;
	}

	public Noeud getFd() {
		return fd;
	}

	public void setFd(Noeud fd) {
		this.fd = fd;
	}

	public Noeud getFg() {
		return fg;
	}

	public void setFg(Noeud fg) {
		this.fg = fg;
	}

	public String getRacine() {
		return racine;
	}
	
	public String show(){

		if(this.fd != null && this.fg != null){
			return this.racine + "(" + this.fd.show() + " " +  this.fg.show()+")";
		}
		else if(this.fd != null){
			return this.racine + this.fd.show();
		}
		else if(this.fg != null){
			return this.racine + this.fg.show();
		}
		else{
			return this.racine;
		}
	}

}
