package com.sdf.aso.common;

import android.content.Context;

/**
 * Created by itsdf07 on 2017/3/23 11:35.
 * E-Mail: 923255742@qq.com
 * GitHub: https://github.com/itsdf07
 */

public class MyResource {
    public static int getIdByName(Context context, String className, String resName) {
        String packageName = context.getPackageName();
        int id = 0;
        try {
            Class r = Class.forName(packageName + ".R");
            Class[] classes = r.getClasses();
            Class desireClass = null;
            for (Class cls : classes) {
                if (cls.getName().split("\\$")[1].equals(className)) {
                    desireClass = cls;
                    break;
                }
            }
            if (desireClass != null) {
                id = desireClass.getField(resName).getInt(desireClass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }
}
