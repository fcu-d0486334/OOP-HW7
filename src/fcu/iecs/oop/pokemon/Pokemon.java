package fcu.iecs.oop.pokemon;

public abstract class Pokemon {
	private  final String name;
	private final PokemonType type;
	private int cp;
	
	public Pokemon(String name,PokemonType type,int cp){
		this.name=name;
		this.type=type;
		cp=this.cp;
	}
	public abstract void attack();
	public String getName(){
		return name;
	}
	public PokemonType getType(){
		return type;
	}
	public int getCp(){
		return cp;
	}
	public void setCp(){
		cp=cp+10;
	}
}
