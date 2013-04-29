package analyseur;
import java_cup.runtime.Symbol;
import java.io.*;

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
* Lancement du programme
* @author Patricio Saraiva
* @author Anthony Rey <anthony.rey@etu.univ-savoie.fr>
*/
public class Main 
{
	
	public static void main(String[] args) throws Exception {
		AnalyseurLexical yy ;
		if (args.length > 0)
			yy = new AnalyseurLexical(new FileInputStream(args[0]));
		else
			yy = new AnalyseurLexical(System.in) ;
			parser p = new parser(yy);
			Symbol result = p.parse( );
			Noeud tree = (Noeud)(result.value);
			tree.show();
	}
}
