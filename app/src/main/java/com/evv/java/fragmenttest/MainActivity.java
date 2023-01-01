package com.evv.java.fragmenttest;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

  TextView tvOut;
  Button f1, f2, cl;

  Frag1 frag1;
  Frag2 frag2;

  FragmentManager fragmentManager;
  FragmentTransaction fragmentTransaction;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    tvOut = findViewById(R.id.tvOut);

    f1 = findViewById(R.id.b1);
    f2 = findViewById(R.id.b2);
    cl = findViewById(R.id.b3);

    f1.setOnClickListener(this);
    f2.setOnClickListener(this);
    cl.setOnClickListener(this);

    frag1 = new Frag1();
    frag2 = new Frag2();
    fragmentManager = getSupportFragmentManager();
  }

  @Override
  public void onClick(View v) {
    fragmentTransaction = fragmentManager.beginTransaction();

    switch (v.getId()){
      case R.id.b1:
        fragmentTransaction.replace(R.id.place, frag1).setReorderingAllowed(true);
        break;
      case R.id.b2:
        fragmentTransaction.replace(R.id.place, frag2).setReorderingAllowed(true);
        break;
      case R.id.b3:
        fragmentTransaction.replace(R.id.place, frag1).setReorderingAllowed(true);
        fragmentTransaction.remove(frag1);
        break;
    }

    fragmentTransaction.commit();
  }
}