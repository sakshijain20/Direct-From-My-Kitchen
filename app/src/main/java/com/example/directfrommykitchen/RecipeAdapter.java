package com.example.directfrommykitchen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.ViewHolder> {

    private ArrayList<Recipe> recipe;
    ItemClicked activity;
    public interface ItemClicked{
        void onItemClicked(int position);
    }

    public RecipeAdapter(Context context, ArrayList<Recipe> list) {
        recipe = list;
        activity=(ItemClicked) context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivMake;
        TextView tvRecipeName,tvIngredients,tvRecipe;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivMake=itemView.findViewById(R.id.ivMake);
            tvRecipeName=itemView.findViewById(R.id.tvRecipeName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    activity.onItemClicked(recipe.indexOf((Recipe)view.getTag()));
                }
            });
        }

    }
        @NonNull
        @Override
        public RecipeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout, viewGroup, false);

            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RecipeAdapter.ViewHolder holder, int position) {

            holder.itemView.setTag(recipe.get(position));
            holder.tvRecipeName.setText(recipe.get(position).getRecipeName());

            if ((recipe.get(position)).getMake().equals("gulabjamun")){
                holder.ivMake.setImageResource(R.drawable.gulabjamun);
            }
            else if(ApplicationClass.recipe.get(position).getMake().equals("idli"))
            {
                holder.ivMake.setImageResource(R.drawable.idli);
            }
            else if(ApplicationClass.recipe.get(position).getMake().equals("gulabjamun")){
               holder. ivMake.setImageResource(R.drawable.gulabjamun);
            }

            else if(ApplicationClass.recipe.get(position).getMake().equals("muffin")){
                holder.ivMake.setImageResource(R.drawable.muffin);
            }
            else if(ApplicationClass.recipe.get(position).getMake().equals("aalu")){
               holder.ivMake.setImageResource(R.drawable.aalu);
            }
            else if(ApplicationClass.recipe.get(position).getMake().equals("bhindi")){
                holder.ivMake.setImageResource(R.drawable.bhindi);
            }
            else if(ApplicationClass.recipe.get(position).getMake().equals("papad"))
            {
                holder.ivMake.setImageResource(R.drawable.papad);
            }
        }


        @Override
        public int getItemCount() {
            return recipe.size();
        }
    }
