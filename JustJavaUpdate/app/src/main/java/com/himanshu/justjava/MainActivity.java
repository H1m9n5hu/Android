package com.himanshu.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int quantity = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increament(View view) {
        if ( quantity == 100 ) {
            Toast.makeText(this,"You can not have more than 100 coffees", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        display(quantity);
    }

    public void decreament(View view) {
        if ( quantity == 1 ) {
            Toast.makeText(this, "You can not have less than 1 coffee", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity - 1;
        display( quantity );
    }

    public void submitOrder(View view) {
        int price = 7;
        int whipped = 2, chocolate = 4;
        CheckBox hasWhippedCream = ( CheckBox ) findViewById(R.id.checkBox);
        CheckBox addChocolate = ( CheckBox ) findViewById(R.id.checkBox1);
        boolean hasWhipped = hasWhippedCream.isChecked();
        boolean add = addChocolate.isChecked();
        EditText addName = ( EditText ) findViewById(R.id.edit);
        String name = addName.getText().toString();
        if ( hasWhipped )
            price += 2;
        if ( add )
            price += 4;
        price = priceCalculate(price);


        String priceMessage = orderSumary( price, hasWhipped, add, name );

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Just Java order for " + name );
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    private int priceCalculate(int price) {
        return quantity*price;
    }

    private String orderSumary( int price, boolean hasWhipped, boolean add, String name ) {
        String priceMessage = getString(R.string.order_summary_name, name );
        priceMessage += "\n" + getString(R.string.add_whipped) + " " + hasWhipped + "\n" + getString(R.string.add_chocolate) + " " + add;
        priceMessage += "\n" + getString(R.string.order_summary_quantity) + " " + quantity;
        priceMessage += "\nTotal: $" + price;
        priceMessage += "\n" + getString(R.string.thank_you);
        return priceMessage;
    }

    /**
     * This method displays the given quantity value on the screen.
     */

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textView2);
        quantityTextView.setText("" + number);
    }

}
