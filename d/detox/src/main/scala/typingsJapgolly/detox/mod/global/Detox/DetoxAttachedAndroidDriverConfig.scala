package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.detox.anon.AdbName
import typingsJapgolly.detox.detoxStrings.androidDotattached
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxAttachedAndroidDriverConfig
  extends StObject
     with DetoxSharedAndroidDriverConfig
     with DetoxBuiltInDeviceConfig {
  
  var device: String | AdbName
  
  var `type`: androidDotattached
}
object DetoxAttachedAndroidDriverConfig {
  
  inline def apply(device: String | AdbName): DetoxAttachedAndroidDriverConfig = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("android.attached")
    __obj.asInstanceOf[DetoxAttachedAndroidDriverConfig]
  }
  
  extension [Self <: DetoxAttachedAndroidDriverConfig](x: Self) {
    
    inline def setDevice(value: String | AdbName): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setType(value: androidDotattached): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
