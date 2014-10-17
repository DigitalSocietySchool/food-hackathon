package com.medialab.foodtogo.adapter;

import com.medialab.foodtogo.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListPostsAdapter extends ArrayAdapter<String> {

	private final Context context;
	private final String[] values;
 
	public ListPostsAdapter(Context context, String[] values) {
		super(context, R.layout.activity_list_posts, values);
		this.context = context;
		this.values = values;
	}
 
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View rowView = inflater.inflate(R.layout.activity_list_posts, parent, false);
		TextView productView = (TextView) rowView.findViewById(R.id.product);
		TextView weightView = (TextView) rowView.findViewById(R.id.product);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.iconProduct);
		productView.setText(values[position]);
		weightView.setText(values[position]);
 
		// Change icon based on name
		String s = values[position];
 
		System.out.println(s);
 
		if (s.equals("Apple")) {
			imageView.setImageResource(R.drawable.apples);
		} else if (s.equals("Avocado")) {
			imageView.setImageResource(R.drawable.carrots);
		} else if (s.equals("Banana")) {
			imageView.setImageResource(R.drawable.mushrooms);
		} else {
			imageView.setImageResource(R.drawable.potatoes);
		}
 
		return rowView;
	}
}
