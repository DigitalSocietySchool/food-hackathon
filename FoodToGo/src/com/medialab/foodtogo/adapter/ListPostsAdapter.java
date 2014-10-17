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
	private final String[] weights;
	private final String[] farmers;
	private final String[] addresses;
	private final String[] dates;

	public ListPostsAdapter(Context context, String[] values, String[] weights,
			String[] farmers, String[] addresses, String[] dates) {
		super(context, R.layout.activity_list_posts, values);
		this.context = context;
		this.values = values;
		this.weights = weights;
		this.farmers = farmers;
		this.addresses = addresses;
		this.dates = dates;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View rowView = inflater.inflate(R.layout.activity_list_posts, parent,
				false);
		TextView productView = (TextView) rowView.findViewById(R.id.product);
		TextView weightView = (TextView) rowView.findViewById(R.id.weight);
		TextView datesView = (TextView) rowView.findViewById(R.id.date);
		TextView farmersView = (TextView) rowView.findViewById(R.id.farmer);
		TextView addressView = (TextView) rowView.findViewById(R.id.address);
		
		ImageView imageView = (ImageView) rowView
				.findViewById(R.id.iconProduct);
		productView.setText(values[position]);
		weightView.setText(weights[position]);
		farmersView.setText(farmers[position]);
		addressView.setText(addresses[position]);
		datesView.setText(dates[position]);

		// Change icon based on name
		String s = values[position];

		System.out.println(s);

		String w = weights[position];

		System.out.println(w);

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
