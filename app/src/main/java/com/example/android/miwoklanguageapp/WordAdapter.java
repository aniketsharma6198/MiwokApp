package com.example.android.miwoklanguageapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceID;
    private int maudioResourceID;

    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Word}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {

        super(context, 0, words);
        mColorResourceID = colorResourceId;
        //msoundResourceID = soundResourceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentword = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok text view
        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        // Get the miwok word from the current Word object and
        // set this text on the miwok TextView
        miwokTextView.setText(currentword.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default text view
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        // Get the default word from the current Word object and
        // set this text on the default TextView
        defaultTextView.setText(currentword.getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the ID image_view
        ImageView imageView = listItemView.findViewById(R.id.image_view);
        if (currentword.hasImage() == true){
            // Get the resource id from the current Word object and
            // set this text on the image view if the view has an image
            imageView.setImageResource(currentword.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            // if the view does not have an image set visibility to gone
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        textContainer.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
