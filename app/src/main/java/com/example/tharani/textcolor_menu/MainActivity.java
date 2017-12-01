package com.example.tharani.textcolor_menu;
/*import is libraries imported for writing the code
* AppCompatActivity is base class for activities
* Bundle handles the orientation of the activity
*/

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*onCreate is the first method in the life cycle of an activity
  savedInstance passes data to super class,data is pull to store state of application
  * setContentView is used to set layout for the activity
  *R is a resource and it is auto generate file
   * activity_main assign an integer value*/
    // declaring variables
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initializing Text view object
        textView = findViewById(R.id.textView);

    }

    /**
     * Creating onCreateOptionsMenu method().
     * In this method, you can inflate your menu resource into the Menu provided in the callback.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater() method will Inflate a menu hierarchy from the specified XML resource.
        getMenuInflater().inflate(R.menu.sub_menu, menu);
        return true;
    }

    /**
     * Creating onOptionsItemSelected() method.
     * This method passes the MenuItem selected.
     * You can identify the item by calling getItemId() method,
     which returns the unique ID for the menu item .
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem color) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (color.getItemId()) { // Creating Switch Case for item selection from the menu

            case R.id.red:
                textView.setTextColor(Color.RED); //Sets color to red
                return true;
            case R.id.green:
                textView.setTextColor(Color.GREEN); //Sets color to green
                return true;
            case R.id.blue:
                textView.setTextColor(Color.BLUE); // Set color to blue
                return true;
            default:
                return true;
        }
    }
}
