package com.medialab.foodtogo;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.medialab.foodtogo.adapter.ListPostsAdapter;

public class ListPostsActivity extends ListActivity {
	
	static final String[] PRODUCTS = new String[] { "Apple", "Avocado", "Banana",
		"Blueberry", "Coconut", "Durian", "Guava", "Kiwifruit" };
	
	static final String[] WEIGHT = new String[] { "23KG", "100KG", "120KG",
		"80KG", "30KG", "20KG", "55KG", "92KG"};
	
	static final String[] FARMERS = new String[] { "Cascina del Nono", "Potato Farm", "Old MacDonald",
		"Tom y Jerry", "HillyBillies", "El granjero", "Gallo Claudio", "Otro" };
	
	static final String[] ADDRESSES = new String[] { "Via de la Hout", "Haarlemerstraat 12, 2312LE Eindhoven", "Haarlemerstraat 12, 2312LE Eindhoven",
		"Haarlemerstraat 12, 2312LE Eindhoven", "Haarlemerstraat 12, 2312LE Eindhoven", "Haarlemerstraat 12, 2312LE Eindhoven", "Haarlemerstraat 12, 2312LE Eindhoven", "Haarlemerstraat 12, 2312LE Eindhoven" };
	
	static final String[] DATES = new String[] { "October 23", "October 23", "October 23",
		"October 23", "October 23", "October 23", "October 23", "October 23"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ListPostsAdapter(this, PRODUCTS, WEIGHT, FARMERS, ADDRESSES, DATES)); 
		
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
 
		//get selected items
		String selectedValue = (String) getListAdapter().getItem(position);
		System.out.println("selectedValue  " + selectedValue);
		Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();
 
	}
}
