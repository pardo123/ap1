package com.juangabrielgomila.counter;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by JuanGabriel on 6/11/17.
 */

public class SomeClass {

    int day;


    public void aMethod(){

        final String stringNice = "S";

        class AnonymousClass{
            int holaQueAse;

            public AnonymousClass(){

            }

            private void sayHello(){
                Log.i("HOLA", "sayHello: "+stringNice+holaQueAse+day);

            }

        }



    }




    public class InnerClass{
        int age;
        String name;

        public InnerClass(){

        }

        public int addOne(){
            return age+1;
        }

        public void innerMethod(){
            day = day+1;
        }
    }


}



/*public class OtherClass{

}*/