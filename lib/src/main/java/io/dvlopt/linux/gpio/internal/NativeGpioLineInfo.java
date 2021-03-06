/*
 * Copyright 2018 Adam Helinski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.dvlopt.linux.gpio.internal ;


import com.sun.jna.Structure ;
import java.util.Arrays      ;
import java.util.List        ;




/**
 * This class has be to public for JNA to work as needed, the user should not care about it.
 */
public class NativeGpioLineInfo extends Structure {


    public  int    line     = 0              ;
    public  int    flags    = 0              ;
    public  byte[] name     = new byte[ 32 ] ;
    public  byte[] consumer = new byte[ 32 ] ;


    public static final int OFFSET_LINE     ;
    public static final int OFFSET_FLAGS    ;
    public static final int OFFSET_NAME     ;
    public static final int OFFSET_CONSUMER ;
    public static final int SIZE            ;


    static {
    
        NativeGpioLineInfo nativeStruct = new NativeGpioLineInfo() ;

        OFFSET_LINE     = nativeStruct.fieldOffset( "line"     ) ;
        OFFSET_FLAGS    = nativeStruct.fieldOffset( "flags"    ) ;
        OFFSET_NAME     = nativeStruct.fieldOffset( "name"     ) ;
        OFFSET_CONSUMER = nativeStruct.fieldOffset( "consumer" ) ;
        SIZE            = nativeStruct.size()                    ;
    }




    protected List< String > getFieldOrder() {

        return Arrays.asList( new String[] { "line"     ,
                                             "flags"    ,
                                             "name"     ,
                                             "consumer" } ) ;
    }
}
