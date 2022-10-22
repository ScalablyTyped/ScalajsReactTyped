package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.detox.anon.AvdName
import typingsJapgolly.detox.detoxStrings.androidDotemulator
import typingsJapgolly.detox.detoxStrings.angle_indirect
import typingsJapgolly.detox.detoxStrings.auto
import typingsJapgolly.detox.detoxStrings.guest
import typingsJapgolly.detox.detoxStrings.host
import typingsJapgolly.detox.detoxStrings.swiftshader_indirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxAndroidEmulatorDriverConfig
  extends StObject
     with DetoxSharedAndroidDriverConfig
     with DetoxBuiltInDeviceConfig {
  
  var bootArgs: js.UndefOr[String] = js.undefined
  
  var device: String | AvdName
  
  var gpuMode: js.UndefOr[auto | host | swiftshader_indirect | angle_indirect | guest] = js.undefined
  
  var headless: js.UndefOr[Boolean] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var `type`: androidDotemulator
}
object DetoxAndroidEmulatorDriverConfig {
  
  inline def apply(device: String | AvdName): DetoxAndroidEmulatorDriverConfig = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("android.emulator")
    __obj.asInstanceOf[DetoxAndroidEmulatorDriverConfig]
  }
  
  extension [Self <: DetoxAndroidEmulatorDriverConfig](x: Self) {
    
    inline def setBootArgs(value: String): Self = StObject.set(x, "bootArgs", value.asInstanceOf[js.Any])
    
    inline def setBootArgsUndefined: Self = StObject.set(x, "bootArgs", js.undefined)
    
    inline def setDevice(value: String | AvdName): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setGpuMode(value: auto | host | swiftshader_indirect | angle_indirect | guest): Self = StObject.set(x, "gpuMode", value.asInstanceOf[js.Any])
    
    inline def setGpuModeUndefined: Self = StObject.set(x, "gpuMode", js.undefined)
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setType(value: androidDotemulator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
