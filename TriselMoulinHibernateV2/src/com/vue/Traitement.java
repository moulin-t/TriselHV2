package com.vue;
import java.util.*;

import com.metier.*;
import com.persistance.*;

public class Traitement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Habitation> h = AccesData.getLesHabitations();
		if(h==null) System.out.println("KO"); 
		else System.out.println("OK");
	}

}
