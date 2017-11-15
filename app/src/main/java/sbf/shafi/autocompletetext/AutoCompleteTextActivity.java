package sbf.shafi.autocompletetext;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class AutoCompleteTextActivity extends AppCompatActivity {

    String[] language ={"DHAKA","BANDARBAN","BOGRA","BAGERHAT",
            "FARIDPUR","BRAHMANBARIA","CHAPAINABABGANJ","CHUADANGA",
            "GAZIPUR","CHANDPUR","JOYPURHAT","JHENAIDAH","GOPALGANJ",
            "CHITTAGONG","PABNA","JESSORE","JAMALPUR","COMILLA","NAOGAON",
            "KHULNA","KISHOREGONJ","COXS BAZAR","NATORE","KUSHTIA","MADARIPUR",
            "FENI","RAJSHAHI","MAGURA","MANIKGANJ","KHAGRACHHARI","SIRAJGANJ",
            "MEHERPUR","MUNSHIGANJ","LAKSHMIPUR","NARAIL","MYMENSINGH","NOAKHALI",
            "SATKHIRA","NARAYANGANJ","RANGAMATI","DINAJPUR",
            "NETRAKONA","GAIBANDHA","NARSINGDI",
            "KURIGRAM","HABIGANJ","RAJBARI","BARGUNA","LALMONIRHAT",
            "MAULVIBAZAR","SHARIATPUR","BARISAL","NILPHAMARI","SUNAMGANJ",
            "SHERPUR","BHOLA","PANCHAGARH","SYLHET","TANGAIL","JHALOKATI",
            "RANGPUR","PATUAKHALI","THAKURGAON","PIROJPUR"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,language);

        AutoCompleteTextView actv= (AutoCompleteTextView)findViewById(R.id.autocmptx);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv.getDropDownAnchor();
        actv.getListSelection();
        actv.setTextColor(Color.BLUE);
    }
}
