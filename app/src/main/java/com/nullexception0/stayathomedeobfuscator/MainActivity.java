package com.nullexception0.stayathomedeobfuscator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;

import static android.content.ClipDescription.MIMETYPE_TEXT_PLAIN;

public class MainActivity extends AppCompatActivity {

    private String e, d, g;
    EditText ed1;
    TextView tv1;

    private static final String TAG = "Main2Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.ed1);
        tv1 = findViewById(R.id.tv1);

        //cerberus deobfuscator & decryption key

        //stayathome didazb.zzfkkagaqqzxl.sjalofqempuglocpj
        e = "keauzpdmxxlu";
        d = "grlnlciddvwj";


        //faixrsobkxahh.ejikbxiafxpwmhrcwnhwgjt.ssnwdiykoiexagzdgyryadgmbma
        //d = "yqdxjviheekr";
        //e = "senhtxcqweip";

        //iacwbhsjeilmwqpkwlupjwgh.pqbfwodsumdmomlophymwhtr.anmfsglmi
        //d = "grlnlciddvwj";
        //e = "keauzpdmxxlu";

        //linsxobdgkiizpisy.gzmbxztaaaejxf.oyipejwfhczlhkpcgqsj
        //d = "grlnlciddvwj";
        //e = "keauzpdmxxlu";


    }

    //button action

    public void DeObfuscateMe(View v) {

        String e12 = String.valueOf(ed1.getText());
        String result = b(e12);
        tv1.append(result + "\n\n");
        Log.i(TAG, "DeObfuscateMe: " + result);
    }

    public void DeObfuscateMeD(View v) {

        String e12 = String.valueOf(ed1.getText());
        String result = dkey(e12);
        tv1.append(result + "\n\n");
        Log.i(TAG, "DeObfuscateMeD: " + result);
    }

    public void PasteMe(View v) {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        String pasteData = "";

        // If it does contain data, decide if you can handle the data.
        if (!(clipboard.hasPrimaryClip())) {

        } else if (!(clipboard.getPrimaryClipDescription().hasMimeType(MIMETYPE_TEXT_PLAIN))) {

            // since the clipboard has data but it is not plain text

        } else {

            //since the clipboard contains plain text.
            ClipData.Item item = clipboard.getPrimaryClip().getItemAt(0);

            // Gets the clipboard as text.
            pasteData = item.getText().toString();

            ed1.setText(pasteData);
        }


    }

    public void ClearMe(View v) {
        tv1.setText("");
        ed1.setText("");
    }

    //calculation

    public String b(String str) {

        String a = "";
        try {
            return new String(new a(this.e.getBytes()).a(c(new String(Base64.decode(str, 0), "UTF-8"))));
        } catch (Exception unused) {
            return "";
        }
    }

    public byte[] c(String str) {
        int lenght = str.length();
        byte[] bArr = new byte[(lenght / 2)];
        for (int i2 = 0; i2 < lenght; i2 += 2) {
            bArr[i2 / 2] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    public String a(String str) {
        try {
            return new String(Base64.decode(str, 0), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }


    //other key D
    public String dkey(String str) {

        String a = "";
        try {
            return new String(new a(this.d.getBytes()).a(c(new String(Base64.decode(str, 0), "UTF-8"))));
        } catch (Exception unused) {
            return "";
        }
    }

}