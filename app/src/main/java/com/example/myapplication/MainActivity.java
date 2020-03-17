package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,remainder,badd,bsub,bmul,bdiv,bdot,back,bequal,reset;
    TextView ans;
    double var1,var2;
    boolean add,sub,mul,div,mremainder,decimal;
    String processor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.btn1);
        b2= (Button) findViewById(R.id.btn2);
        b3= (Button) findViewById(R.id.btn3);
        b4= (Button) findViewById(R.id.btn4);
        b5= (Button) findViewById(R.id.btn5);
        b6= (Button) findViewById(R.id.btn6);
        b7= (Button) findViewById(R.id.btn7);
        b8= (Button) findViewById(R.id.btn8);
        b9= (Button) findViewById(R.id.btn9);
        b0= (Button) findViewById(R.id.btn0);
        b00= (Button) findViewById(R.id.btn00);
        badd= (Button) findViewById(R.id.btnadd);
        bsub= (Button) findViewById(R.id.btnsub);
        bmul= (Button) findViewById(R.id.btnmul);
        bdiv= (Button) findViewById(R.id.btndiv);
        bdot= (Button) findViewById(R.id.btndot);
        remainder= (Button) findViewById(R.id.percent) ;
        bequal = (Button) findViewById(R.id.btnequal);
        reset= (Button) findViewById(R.id.reset);
        back= (Button) findViewById(R.id.back);

        ;

        ans = (TextView) findViewById(R.id.Answer);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"0");
            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"00");

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+".");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 processor = ans.getText().toString();
                if (processor.length()>0) {
                    processor = processor.substring(0, processor.length() - 1);
                    ans.setText(processor);
                }
            }
        });
        remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText().length() != 0) {
                    var1 = Float.parseFloat(ans.getText() + "");
                    mremainder = true;
                    decimal = false;
                    ans.setText(null);
                }
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                add=true;
                decimal = false;
                ans.setText(null);

            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                sub=true;
                decimal = false;

                ans.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                mul=true;
                decimal = false;

                ans.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                div=true;
                decimal = false;
                ans.setText(null);
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 =  Double.parseDouble(ans.getText()+"");
                if(add==true)
                {
                    ans.setText(var1+var2+"");
                    add=false;
                }
                if(sub==true)
                {
                    ans.setText(var1-var2+"");
                    sub=false;
                }
                if(mul==true)
                {
                    ans.setText(var1*var2+"");
                    mul=false;
                }
                if(div==true)
                {
                    ans.setText(var1/var2+"");
                    div=false;
                }
                if (mremainder==true) {
                    ans.setText(var1 % var2 + "");
                    mremainder = false;}
            }
        });

reset.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ans.setText("");

    }
});
    }
}
