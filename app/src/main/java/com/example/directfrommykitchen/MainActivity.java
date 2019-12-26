package com.example.directfrommykitchen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements RecipeAdapter.ItemClicked {

    Button btn_ingredients,btn_recipe;
    TextView tvRecipe,tvRecipeName,tvIngredients;
    ImageView ivMake;
    FragmentManager fragmentManager;
    Fragment ListFrag,ButtonFrag,IngredientsFrag,RecipeFrag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ingredients=(Button) findViewById(R.id.btn_ingredients);
        btn_recipe=(Button) findViewById(R.id.btn_recipe);
        tvRecipe=(TextView)findViewById(R.id.tvRecipe);
        tvRecipeName=(TextView)findViewById(R.id.tvRecipeName);
        ivMake=(ImageView)findViewById(R.id.ivMake);
        tvIngredients=(TextView)findViewById(R.id.tvIngredients);

        fragmentManager=getSupportFragmentManager();
       ListFrag=fragmentManager.findFragmentById(R.id.listFrag);
        ButtonFrag=fragmentManager.findFragmentById(R.id.ButtonFrag);
        IngredientsFrag=fragmentManager.findFragmentById(R.id.IngredientsFrag);
       RecipeFrag=fragmentManager.findFragmentById(R.id.RecipeFrag);

       fragmentManager.beginTransaction()
               .show(ButtonFrag)
               .show(ListFrag)
               .show(IngredientsFrag)
               .hide(RecipeFrag)
               .commit();

        btn_ingredients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .show(IngredientsFrag)
                        .hide(RecipeFrag)
                        .commit();

            }
        });

        btn_recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .hide(IngredientsFrag)
                        .show(RecipeFrag)
                        .commit();


            }
        });
        onItemClicked(0);
    }

    @Override
    public void onItemClicked(int position) {
            tvRecipe.setText(ApplicationClass.recipe.get(position).getRecipe());
            tvRecipeName.setText(ApplicationClass.recipe.get(position).getRecipeName());
            tvIngredients.setText(ApplicationClass.recipe.get(position).getIngredients());

            if(ApplicationClass.recipe.get(position).getMake().equals("casserole"))
            {
                ivMake.setImageResource(R.drawable.casserole);
            }
            else if(ApplicationClass.recipe.get(position).getMake().equals("idli"))
            {
                ivMake.setImageResource(R.drawable.idli);
            }
            else if(ApplicationClass.recipe.get(position).getMake().equals("gulabjamun")){
                ivMake.setImageResource(R.drawable.gulabjamun);
            }

            else if(ApplicationClass.recipe.get(position).getMake().equals("muffin")){
                ivMake.setImageResource(R.drawable.muffin);
            }
            else if(ApplicationClass.recipe.get(position).getMake().equals("aalu")){
                ivMake.setImageResource(R.drawable.aalu);
            }
            else if(ApplicationClass.recipe.get(position).getMake().equals("bhindi")){
                ivMake.setImageResource(R.drawable.bhindi);
            }
            else if(ApplicationClass.recipe.get(position).getMake().equals("papad")){
                ivMake.setImageResource(R.drawable.papad);
            }
    }


}
