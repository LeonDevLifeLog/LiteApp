/**
 *
 * Copyright 2018 iQIYI.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.iqiyi.halberd.liteapp.export;

import androidx.annotation.Keep;

import java.util.HashMap;

/**
 * Created by breakerror on 2017/6/6.
 *
 */
@SuppressWarnings("unused")
@Keep
public class JsNativeHashMap extends HashMap<String, Object> {
    public void set(String k, double val) {
        if (null != k) {
            super.put(k, val);
        }
    }

    public void set(String k, String val) {
        if (null != k && null != val) {
            super.put(k, val);
        }
    }

    public void set(String k, boolean val) {
        if (null != k) {
            super.put(k, val);
        }
    }

    public void set(String k, Object val) {
        if (null != k && null != val) {
            super.put(k, val);
        }
    }
}
