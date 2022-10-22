package typingsJapgolly.expoConfigPlugins.anon

import typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.automatic_
import typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.dark_
import typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.light_
import typingsJapgolly.expoConfigTypes.mod.Android
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'android' | 'userInterfaceStyle'> */
trait PickExpoConfigandroiduser extends StObject {
  
  var android: js.UndefOr[Android] = js.undefined
  
  var userInterfaceStyle: js.UndefOr[light_ | dark_ | automatic_] = js.undefined
}
object PickExpoConfigandroiduser {
  
  inline def apply(): PickExpoConfigandroiduser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigandroiduser]
  }
  
  extension [Self <: PickExpoConfigandroiduser](x: Self) {
    
    inline def setAndroid(value: Android): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setUserInterfaceStyle(value: light_ | dark_ | automatic_): Self = StObject.set(x, "userInterfaceStyle", value.asInstanceOf[js.Any])
    
    inline def setUserInterfaceStyleUndefined: Self = StObject.set(x, "userInterfaceStyle", js.undefined)
  }
}
