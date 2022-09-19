package com.example.affirmations.adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R

import com.example.affirmations.databinding.ItemLayoutBinding
import com.example.affirmations.model.Affirmation



class ItemAdapter(val context: Context, private  val dataset: List<Affirmation> )
    :RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()
{

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object.
    class  ItemViewHolder(private  val view:View): RecyclerView.ViewHolder(view){

        val textView : TextView = view.findViewById(R.id.item_text)
        val imageView : ImageView = view.findViewById(R.id.item_image)

    }


    /**
     * Create new views (invoked by the layout manager)
    This function will make the viewHolder that is used in the RecyclerView
    @param parent: is the ViewGroup to which the ViewHolder will be attatched to.  In
    this case it is the RecylerView
    @param viewType:  This is an Int that is used to differentiate  different types of views
    each viewHolder can only recylce view of the same type
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        // creating the view TextView and then attatching it to the
        // Recycler View
        // create a new view
        val adapterLayout = LayoutInflater.from(context)
            .inflate(R.layout.item_layout, parent, false)

        // now returning the viewHolder
        return ItemViewHolder(adapterLayout)
    }

    /**
     * This is the Function that will Bind the ViewHolder to the recyclerView.
     * This will happen when the view is recycled.  This function is called by the
     * LayoutManager to replace the items in the list item view.
     * Or also to set up the original views.
     * @param holder:  This is the viewHolder that is being passed in.
     * @param position:  This is the position within the dataSet or List of items
     *
     * Replace the contents of a view (invoked by the layout manager)
     * */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // getting the data at the position noted
        // this is a single affirmation in this case
        val item = dataset[position]

        // setting the data on the viewHolder with the text
        // and setting the data for the image
        holder.textView.text =  context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }


    //override fun getItemCount(): Int {
     //
   // }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     *
     * This is the function that will let the adapter now the size
     * of the list of items so that it will no that how many views to
     * work with and when it doesn't need to recycle a view.
     */
    // The function is written in a new way -- they mean the same thing
    override fun getItemCount() = dataset.size
}