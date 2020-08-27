package com.example.localizacion;

import android.os.AsyncTask;
import android.widget.EditText;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class IP extends AsyncTask<String,Void,Void> {

    Socket socket;
    DataOutputStream dataOutputStream;
    PrintWriter printWriter;
    EditText DirIP, Puerto;
    String IP, PU;







    @Override
    protected Void doInBackground(String... strings) {


        try{


            socket = new Socket(PU, IP);

        }catch
        return null;
    }
}
