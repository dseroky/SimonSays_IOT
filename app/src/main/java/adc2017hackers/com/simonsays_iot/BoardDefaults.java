/*
 * Copyright 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package adc2017hackers.com.simonsays_iot;

import android.os.Build;

@SuppressWarnings("WeakerAccess")
public final class BoardDefaults {
    private static final String DEVICE_RPI3 = "rpi3";
    private static final String DEVICE_IMX7 = "imx7d_pico";

    public static String getI2cBus() {
        switch (Build.DEVICE) {
            case DEVICE_RPI3:
                return "I2C1";
            case DEVICE_IMX7:
                return "I2C1";
            default:
                throw new IllegalArgumentException("Unsupported device: " + Build.DEVICE);
        }
    }

    public static String getSpiBus() {
        switch (Build.DEVICE) {
            case DEVICE_RPI3:
                return "SPI0.0";
            case DEVICE_IMX7:
                return "SPI3.1";
            default:
                throw new IllegalArgumentException("Unsupported device: " + Build.DEVICE);
        }
    }
}
