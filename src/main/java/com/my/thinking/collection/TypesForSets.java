package com.my.thinking.collection;

class SetType{
	int i;
	public SetType(int n){
		i = n;
	}
	public boolean equals(Object o){
		return o instanceof SetType && (i == ((SetType)o).i);
	}
	//public String 
}
public class TypesForSets {

}
