package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.detox.anon.RecipeName
import typingsJapgolly.detox.anon.RecipeUUID
import typingsJapgolly.detox.detoxStrings.androidDotgenycloud
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxGenymotionCloudDriverConfig
  extends StObject
     with DetoxSharedAndroidDriverConfig
     with DetoxBuiltInDeviceConfig {
  
  var device: String | RecipeUUID | RecipeName
  
  var `type`: androidDotgenycloud
}
object DetoxGenymotionCloudDriverConfig {
  
  inline def apply(device: String | RecipeUUID | RecipeName): DetoxGenymotionCloudDriverConfig = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("android.genycloud")
    __obj.asInstanceOf[DetoxGenymotionCloudDriverConfig]
  }
  
  extension [Self <: DetoxGenymotionCloudDriverConfig](x: Self) {
    
    inline def setDevice(value: String | RecipeUUID | RecipeName): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setType(value: androidDotgenycloud): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
