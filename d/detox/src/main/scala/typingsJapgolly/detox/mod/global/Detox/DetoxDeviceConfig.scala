package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.detox.anon.AdbName
import typingsJapgolly.detox.anon.AvdName
import typingsJapgolly.detox.anon.PartialIosSimulatorQuery
import typingsJapgolly.detox.anon.RecipeName
import typingsJapgolly.detox.anon.RecipeUUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.detox.mod.global.Detox.DetoxBuiltInDeviceConfig
  - typingsJapgolly.detox.mod.global.Detox.DetoxCustomDriverConfig
*/
trait DetoxDeviceConfig extends StObject
object DetoxDeviceConfig {
  
  inline def DetoxAndroidEmulatorDriverConfig(device: String | AvdName): typingsJapgolly.detox.mod.global.Detox.DetoxAndroidEmulatorDriverConfig = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("android.emulator")
    __obj.asInstanceOf[typingsJapgolly.detox.mod.global.Detox.DetoxAndroidEmulatorDriverConfig]
  }
  
  inline def DetoxAttachedAndroidDriverConfig(device: String | AdbName): typingsJapgolly.detox.mod.global.Detox.DetoxAttachedAndroidDriverConfig = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("android.attached")
    __obj.asInstanceOf[typingsJapgolly.detox.mod.global.Detox.DetoxAttachedAndroidDriverConfig]
  }
  
  inline def DetoxCustomDriverConfig(`type`: String): typingsJapgolly.detox.mod.global.Detox.DetoxCustomDriverConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.detox.mod.global.Detox.DetoxCustomDriverConfig]
  }
  
  inline def DetoxGenymotionCloudDriverConfig(device: String | RecipeUUID | RecipeName): typingsJapgolly.detox.mod.global.Detox.DetoxGenymotionCloudDriverConfig = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("android.genycloud")
    __obj.asInstanceOf[typingsJapgolly.detox.mod.global.Detox.DetoxGenymotionCloudDriverConfig]
  }
  
  inline def DetoxIosNoneDriverConfig(): typingsJapgolly.detox.mod.global.Detox.DetoxIosNoneDriverConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ios.none")
    __obj.asInstanceOf[typingsJapgolly.detox.mod.global.Detox.DetoxIosNoneDriverConfig]
  }
  
  inline def DetoxIosSimulatorDriverConfig(device: String | PartialIosSimulatorQuery): typingsJapgolly.detox.mod.global.Detox.DetoxIosSimulatorDriverConfig = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ios.simulator")
    __obj.asInstanceOf[typingsJapgolly.detox.mod.global.Detox.DetoxIosSimulatorDriverConfig]
  }
}
