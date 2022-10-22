package typingsJapgolly.expoConfig.buildConfigDottypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expoConfig.buildEvalConfigMod._RawDynamicConfig
import typingsJapgolly.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppJSONConfig
  extends StObject
     with /* key */ StringDictionary[Any]
     with _RawDynamicConfig {
  
  var expo: ExpoConfig
}
object AppJSONConfig {
  
  inline def apply(expo: ExpoConfig): AppJSONConfig = {
    val __obj = js.Dynamic.literal(expo = expo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppJSONConfig]
  }
  
  extension [Self <: AppJSONConfig](x: Self) {
    
    inline def setExpo(value: ExpoConfig): Self = StObject.set(x, "expo", value.asInstanceOf[js.Any])
  }
}
