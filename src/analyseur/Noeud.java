package analyseur;

/*
* Copyright (C) 2013, Anthony Rey and Patricio Saraiva
*
* This program is free software; you can redistribute it and/or
* modify it under the terms of the GNU General Public License
* as published by the Free Software Foundation; either version 2
* of the License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, write to the Free Software
* Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/

/**
* Gestion des noeuds d'un arbre
* @author Patricio Saraiva
* @author Anthony Rey <anthony.rey@etu.univ-savoie.fr>
*/
public class Noeud {
	
	private String racine;
	private Noeud filsDroit;
	private Noeud filsGauche;
	
	/**
	 * Construit un nouveau noeud
	 * @param racine La valeur du noeud
	 * @param filsGauche Le fils gauche de ce noeud s'il existe
	 * @param filsDroit Le fils droit de ce noeud s'il existe
	 */
	public Noeud(String racine, Noeud filsGauche, Noeud filsDroit){
		this.racine = racine;
		this.filsDroit = filsDroit;
		this.filsGauche = filsGauche;
	}
	
	/**
	 * Construit une feuille sous forme de noeud sans fils
	 * @param racine La valeur de la feuille
	 */
	public Noeud(String racine){
		this.racine = racine;
		this.filsDroit = null;
		this.filsGauche = null;
	}

	public Noeud getFilsDroit() {
		return filsDroit;
	}

	public void setFilsDroit(Noeud filsDroit) {
		this.filsDroit = filsDroit;
	}

	public Noeud getFilsGauche() {
		return filsGauche;
	}

	public void setFilsGauche(Noeud filsGauche) {
		this.filsGauche = filsGauche;
	}

	public String getRacine() {
		return racine;
	}
	
	/**
	 * Récupère l'arbre sous forme textuelle
	 */
	public String toString(){

		if(this.filsDroit != null && this.filsGauche != null){
			return "(" + this.racine + " " + this.filsGauche.toString() + " " +  this.filsDroit.toString()+")";
		}
		else if(this.filsDroit != null){
			return "(" + this.racine + " " +this.filsDroit.toString()+")";
		}
		else if(this.filsGauche != null){
			return "(" + this.racine + " " + this.filsGauche.toString()+")";
		}
		else{
			return this.racine;
		}
	}
	
	public String parcoursGauche(){
		String elem = "";
		if(this.filsGauche != null){
			elem += this.filsGauche.parcoursGauche();
		}
		if(this.filsDroit != null){
			elem += this.filsDroit.parcoursGauche();
		}
		return elem + " -> " + this.racine;
	}
	
	/**
	 * Affiche l'arbre sous forme textuelle
	 */
	public void show(){
		System.out.println(this.toString());
	}

	public void showParcoursGauche(){
		System.out.println(this.parcoursGauche());
	}
}
