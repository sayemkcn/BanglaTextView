package com.example.user.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.al.tobangla.processor.ToBN;
import com.al.tobangla.utils.ProcessType;
import com.al.tobangla.utils.TypeFace;
import com.al.tobangla.views.BNTextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BNTextView textView = findViewById(R.id.tvToday);
        textView.setTypeface(TypeFace.Name.SOLAIMANLIPI);

        usingTheConverter();
        byProgrammatically();

    }

    private void usingTheConverter() {

        TextView tvUom = ((TextView) findViewById(R.id.tvUom));

        tvUom.setText(ToBN.getInstance().getWeight("1.97 KG"));
        tvUom.append("\n" + ToBN.getInstance().getDistance(".135 KM"));
    }

    private void byProgrammatically() {

        BNTextView bnTextView = new BNTextView(this);
        bnTextView.setProcessType(ProcessType.ORDINAL_INDICATOR_FOR_DATE);
        bnTextView.setText("1952/02/21");

        bnTextView.setTypeface(TypeFace.Name.SOLAIMANLIPI);

        LinearLayout parentLayout = findViewById(R.id.parent);
        parentLayout.addView(bnTextView);
    }
}
