package kr.ac.shinhan.MidtermExam2020A;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout ll2_1;
    TextView textView6, textView7, textView8;
    RadioGroup Rgroup1;
    RadioButton radioButton, radioButton2, radioButton3;
    Button btnVote, btnResult;

    int count1=0;
    int count2=0;
    int count3=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("모바일프로그래밍 중간고사_20171218 이재희");

        ll2_1 = (LinearLayout) findViewById(R.id.ll2_1);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);

        Rgroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);

        btnVote = (Button) findViewById(R.id.btnVote);
        btnResult = (Button) findViewById(R.id.btnResult);

        btnVote.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                switch(Rgroup1.getCheckedRadioButtonId()) {
                    case R.id.radioButton:
                        count1++;
                        Toast.makeText(getApplicationContext(), "배틀그라운드 : " + count1 + "표", Toast.LENGTH_SHORT).show();
                        textView6.setText(count1 + "표");
                        break;
                    case R.id.radioButton2:
                        count2++;
                        Toast.makeText(getApplicationContext(), "리그오브레전드 : " + count2 + "표", Toast.LENGTH_SHORT).show();
                        textView7.setText(count2 + "표");
                        break;
                    case R.id.radioButton3:
                        count3++;
                        Toast.makeText(getApplicationContext(), "오버워치 : " + count3 + "표", Toast.LENGTH_SHORT).show();
                        textView8.setText(count3 + "표");
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "게임을 먼저 선택하세요!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg1) {
                ll2_1.setVisibility(View.VISIBLE);
            }
        });
    }

}
