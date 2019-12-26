package com.example.directfrommykitchen;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<Recipe> recipe;

    @Override
    public void onCreate() {
        super.onCreate();
        recipe=new ArrayList<Recipe>();
        recipe.add(new Recipe("1.Take required quantity of sugar and water in a deep pan. Stir and bring to boil on high flame for sugar to dissolve.Homemade Gulab Jamun\n" +
                "2.Now add milk and cardamom seeds to the sugar water. Boil further and strain.Homemade Gulab Jamun\n" +
                "3.Then add saffron and cardamom powder and bring the mixture to rolling boil for about 5-6 minutes until it becomes little sticky.Homemade Gulab Jamun\n" +
                "Prepare Gulab Jamun Balls:\n" +
                "1.Take the grated Khoya in a medium size deep bowl.Homemade Gulab Jamun\n" +
                "2.Add baking soda and maida. Combine them thoroughly but gently using a spoon.Homemade Gulab Jamun\n" +
                "3.Add a teaspoon of milk to it and knead all of them together to make a smooth and soft dough. Add another teaspoon of milk if required.Homemade Gulab Jamun\n" +
                "4.Make sure that the dough is a bit softer to avoid cracking of ball while deep frying.\n" +
                "5.Divide the dough into equal parts and make smooth surfaced balls out of it.Homemade Gulab Jamun\n" +
                "6.Now heat ghee in a pan over medium flame and add the Jamun balls to deep-fry them. Cook evenly until it becomes golden brown.Homemade Gulab Jamun\n" +
                "7.Make sure that you do not cook on high flame otherwise the balls will burn.\n" +
                "8.Now drain and let them cool for few minutes.\n" +
                "9.Then immerse the gulab jamuns in the warm sugar syrup for at least 30 minutes. It increases in size when it soaks the sugar syrup.Homemade Gulab Jamun\n" +
                "10.Hot and tasty sweet dish is ready to serve.","Gulab Jamun","gulabjamun","For Sugar Syrup:\n" +
                        "2 cups Sugar\n" +
                        "5 cups Water\n" +
                        "1 tsp Milk\n" +
                        "1/4 tsp Cardamom Seeds\n" +
                        "1/2 tsp Saffron\n" +
                        "1/2 tsp Cardamom Powder\n" +
                        "For Gulab Jamun Balls:\n" +
                        "1 1/2 cups Khoya, grated\n" +
                        "1/2 tsp Baking Soda\n" +
                        "1/2 cup Maida\n" +
                        "1 tsp Milk"));


        recipe.add(new Recipe("Step 1\n" +
                "To prepare this popular South Indian recipe, wash rice and urad dal separately until the water runs clean and add fenugreek seeds to the rice. Soak it in water for 4-6 hours. Soak the urad dal too for the same amount of time. Drain all the water from the urad dal and grind it to a fine paste. Add water accordingly.\n" +
                "\n" +
                "Step 2\n" +
                "Grind the rice to a coarse paste (add water as needed) and then mix both the pastes together in a large bowl and whisk them well. Make sure that the consistency is thick.\n" +
                "\n" +
                "Step 3\n" +
                "Now, the idli batter needs to be well-fermented. This step is very important to get soft and fluffy idlis. Keep the batter in a warm place to ferment. Once the batter has risen, add salt to it and whisk to mix it well.\n" +
                "\n" +
                "Step 4\n" +
                "Grease the idli stand with oil and take a ladleful of batter and fill the idli mould. Add ½ cup of water in the idli steamer and let it boil. Put the idli stand inside and close the lid. Let the steam build for 8-10 minutes before switching off the gas.\n" +
                "\n" +
                "Step 5\n" +
                "If you are using a cooker, use it without a vent and steam it for 10 minutes and then switch the gas off. In both cases, wait till the steam is released before you take the idli stand out. Wait for another 5 minutes and then use a sharp knife to scoop the idlis out. Serve warm with coconut chutney.","Idli","idli","2 1/2 cup basmati rice\n" +
                "1/2 tablespoon fenugreek seeds\n" +
                "5 tablespoon sesame oil\n" +
                "1 1/2 cup urad dal\n" +
                "1 1/2 teaspoon salt\n" +
                "water as required"));

        recipe.add((new Recipe("heat the oven to 400°F (200°C). Lightly grease a 9 x 13-inch (22 x 33cm) baking dish with nonstick spray.\n" +
                "Melt the butter in a large saucepan over medium heat. Add the onion and sauté until softened and very fragrant, about 5 minutes. Stir in the garlic, flour, Italian seasoning, and salt and cook for another minute, until thickened.\n" +
                "Slowly pour in the chicken broth and milk and stir to combine. Bring to a simmer, stirring constantly. Once the mixture has thickened, 10–12 minutes, stir in the peas, carrots, and tuna.\n" +
                "Spread the cooked egg noodles in the prepared baking dish.\n" +
                "Pour the sauce over pasta in the pan and stir to combine. Add 2 cups of cheddar cheese and stir to incorporate. Spread the casserole in an even layer, then sprinkle the remaining cup of cheese on top.\n" +
                "In a small bowl, use a fork to mix together the cracker crumbs, Parmesan, and olive oil. Sprinkle over the casserole.\n" +
                "Bake the casserole for 15–20 minutes, or until the top is lightly browned and bubbling.","Chessy Tuna Casserole","casserole","1 nonstick cooking spray, for greasing\n" +
                "3 tablespoons unsalted butter\n" +
                "1 small yellow onion, diced\n" +
                "6 cloves garlic, minced\n" +
                "3 tablespoons all purpose flour\n" +
                "2 teaspoons italian seasoning\n" +
                "2 teaspoons kosher salt\n" +
                "2 cups chicken broth (480 mL)\n" +
                "1 cup whole milk (240 mL)\n" +
                "2 cups peas (300 g), canned, drained\n" +
                "1 cup carrot (120 g), drained\n" +
                "4 cans tuna, packed in water, drained\n" +
                "12 oz egg noodles (340 g), cooked according to package instructions and drained\n" +
                "3 cups shredded cheddar cheese (300 g), divided\n" +
                "1 cup butter crackers (85 g), crumbled\n" +
                "¼ cup grated parmesan cheese (25 g)\n" +
                "1 tablespoon olive oil")));

        recipe.add(new Recipe("Pat dry the ladyfingers. Discard the heads and chop the ladyfingers.\n" +
                "Step 2\n" +
                "Heat oil in a non-stick pan, Add cumin seeds and let them change colour.\n" +
                "Step 3\n" +
                "Chop green chillies and add along with turmeric powder. Saute for 1 minute.\n" +
                "Step 4\n" +
                "Add onions and saute till translucent\n." +
                "Add ladyfingers, salt, coriander powder and dry mango powder. Mix well and cook on low heat till ladyfingers are tender","Bhindi ki Sabzi","bhindi","Ladyfingers (bhindi) washed 500 grams\n" +
                "Onions finely chopped 2 medium\n" +
                "Green chillies 2\n" +
                "Oil 1 tablespoon\n" +
                "Coriander powder 1 tablespoon\n" +
                "Turmeric powder 1/4 teaspoon\n" +
                "Cumin seeds 1 teaspoon\n" +
                "Dry mango powder (amchur) 1 teaspoon\n" +
                "Salt to taste"));

        recipe.add(new Recipe("heat oven to 350˚F (180˚C).\n" +
                "Mash bananas in a large bowl. Add eggs and combine thoroughly. Then mix together remaining wet ingredients: Greek yogurt, milk, maple syrup, and vanilla.\n" +
                "Next, add in dry ingredients and mix until fully incorporated. Fold chocolate chips into the mixture.\n" +
                "Pour mixture into a greased muffin tin, filling each up about ⅔ full.\n" +
                "Bake for 30-35 minutes, or until a toothpick comes out clean from the center of the muffin. Allow to cool for 10 minutes.","Dark Chocolate Banana Bread Muffins","muffin","3 bananas\n" +
                "2 eggs\n" +
                "½ cup greek yogurt (125 g)\n" +
                "½ cup milk (120 mL), we used almond milk\n" +
                "½ cup maple syrup (170 g)\n" +
                "1 teaspoon vanilla\n" +
                "1 cup whole wheat flour (130 g)\n" +
                "½ cup dark cocoa powder (60 g)\n" +
                "1 teaspoon baking soda\n" +
                "½ teaspoon salt\n" +
                "½ cup dark chocolate chips (90 g)"));

        recipe.add(new Recipe("Firstly, in a pressure cooker or cooking vessel, add oil and heat it.\n" +
                "Add sliced onions and slit green chillies into it and saute for few minutes, cook until onions get soft(not brown).\n" +
                "Add salt, red chilli powder, turmeric powder, ginger garlic paste, mix and saute for few seconds.\n" +
                "Add diced potatoes, mix and cook for about two minutes.\n" +
                "Add about a cup of water, add chopped coriander leaves and methi leaves into it and mix well.\n" +
                "Cook until aloo is cooked well or pressure cook for about 3 whistles.\n" +
                "Reduce the steam and check if aloo is done.\n" +
                "If there is any water content remaining, cook for about a minute by keeping the lid uncovered","Aaloo ki Sabzi","aalu","4-5 medium size potatoes diced\n" +
                "1 tbsp oil\n" +
                "3 medium size onions finely sliced\n" +
                "3-4 slit green chillies\n" +
                "salt - to taste\n" +
                "1 tsp red chilli powder\n" +
                "1/4 tsp turmeric powder\n" +
                "1 tsp ginger garlic paste\n" +
                "1 tbsp freshly chopped coriander leaves\n" +
                "1 tbsp fresh fenugreek leaves methi leaves"));

        recipe.add(new Recipe("Add all the masalas except oil to the urad flour. Mix well.\n" +
                "Bind together to form a very hard dough by adding water.\n" +
                "Cover and keep aside for 2 hours at least.\n" +
                "Apply little oil, knead the dough by hammering with a heavy pestle to make the dough softer.\n" +
                "Make equal number of balls.\n" +
                "Roll out each ball on a rolling board with the help of rolling pins in a circular movement.\n" +
                "Apply oil if papad tends to stick on rolling board. Repeat with the remaining balls.\n" +
                "Dry the papad in direct sunlight.\n" +
                "Remove.","Papad","papad","1/2 kg - udad flour\n" +
                "For Masala:\n" +
                "½ tsp - Cumin seeds\n" +
                "1/2 tsp - ajwain seeds\n" +
                "1/4 tsp - papad khar\n" +
                "salt to taste\n" +
                "oil"));
    }
}
