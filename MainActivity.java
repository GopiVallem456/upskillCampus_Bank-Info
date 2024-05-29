package com.example.bankinfo;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Retrieve the username passed from LoginActivity
        String username = getIntent().getStringExtra("username");

        // Placeholder bank details (In a real application, you would retrieve this data from a database or API)
        String bankName = "ABC Bank";
        String accountNumber = "1234567890";
        String accountHolderName = username != null ? username : "John Doe";
        String balance = "$1000.00";

        // Find the TextViews in the layout
        TextView bankNameTextView = findViewById(R.id.bankName);
        TextView accountNumberTextView = findViewById(R.id.accountNumber);
        TextView accountHolderNameTextView = findViewById(R.id.accountHolderName);
        TextView balanceTextView = findViewById(R.id.balance);

        // Set the text of the TextViews to display the bank details
        bankNameTextView.setText(bankName);
        accountNumberTextView.setText(accountNumber);
        accountHolderNameTextView.setText(accountHolderName);
        balanceTextView.setText(balance);
    }
}
