package typingsJapgolly.expoPrebuildConfig.anon

import typingsJapgolly.expoConfigTypes.mod.Android
import typingsJapgolly.expoConfigTypes.mod.Splash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'splash' | 'android'> */
trait PickExpoConfigsplashandro extends StObject {
  
  var android: js.UndefOr[Android] = js.undefined
  
  var splash: js.UndefOr[Splash] = js.undefined
}
object PickExpoConfigsplashandro {
  
  inline def apply(): PickExpoConfigsplashandro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigsplashandro]
  }
  
  extension [Self <: PickExpoConfigsplashandro](x: Self) {
    
    inline def setAndroid(value: Android): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setSplash(value: Splash): Self = StObject.set(x, "splash", value.asInstanceOf[js.Any])
    
    inline def setSplashUndefined: Self = StObject.set(x, "splash", js.undefined)
  }
}
