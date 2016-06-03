package fang.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.logging.SimpleFormatter;

public class MainActivity extends AppCompatActivity {
    private EditText et_temp_input;
    private RadioButton celsiusButton, fahrenheitButton;
    private Button calcuButton;
    private TextView tv_result_label,tv_result_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_temp_input = (EditText) findViewById(R.id.temp_inputValue);
        celsiusButton = (RadioButton) findViewById(R.id.radio_to_cel);
        fahrenheitButton = (RadioButton) findViewById(R.id.radio_to_fah);
        calcuButton = (Button) findViewById(R.id.button_calc);
        tv_result_label = (TextView) findViewById(R.id.tv_result_label);
        tv_result_label.setVisibility(View.INVISIBLE);
        tv_result_value = (TextView) findViewById(R.id.tv_result_value);
        tv_result_value.setVisibility(View.INVISIBLE);

        calcuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(et_temp_input.getText().length() == 0){
                   Toast.makeText(getApplication(), "Please enter a valid number",
                           Toast.LENGTH_LONG).show();
                   return;
               }

                float temp_value = Float.parseFloat(et_temp_input.getText().toString());

                float result_f = 0.0f;

                if(celsiusButton.isChecked()){
                    result_f = TempConverter.convertFahrenheitToCelsius(temp_value);

                }else if(fahrenheitButton.isChecked()){
                    result_f = TempConverter.convertCelsiusToFahrenheit(temp_value);
                }

                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMaximumFractionDigits(2);
                String str_temp_value = nf.format(result_f);

                tv_result_value.setText(str_temp_value);
                tv_result_label.setVisibility(View.VISIBLE);
                tv_result_value.setVisibility(View.VISIBLE);

            }
        });
    }
}
