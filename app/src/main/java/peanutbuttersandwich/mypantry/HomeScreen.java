package peanutbuttersandwich.mypantry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action ba
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_home_screen, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                //openSearch();
                return true;
            case R.id.action_settings:
                //openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /** Called when the user clicks the Pantry button */
    public void showPantry(View view) {
        Intent intent = new Intent(this, ShowPantry.class);
        startActivity(intent);
    }

    /** Called when the user clicks the Leftovers button */
    public void showLeftovers(View view) {
        Intent intent = new Intent(this, Leftovers.class);
        startActivity(intent);
    }

    /** Called when the user clicks the Shopping List button */
    public void showShoppingList(View view) {
        Intent intent = new Intent(this, ShoppingList.class);
        startActivity(intent);
    }
}
