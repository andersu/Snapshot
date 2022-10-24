package technology.anders.snapshot.ui

import app.cash.paparazzi.DeviceConfig

enum class BaseDeviceConfig(
    val deviceConfig: DeviceConfig,
    ) {
        NEXUS_5(DeviceConfig.NEXUS_5),
        //PIXEL_5(DeviceConfig.PIXEL_5),
        //PIXEL_C(DeviceConfig.PIXEL_C),
    }