package typingsJapgolly.expoPrebuildConfig.anon

import typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.contain
import typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.cover
import typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.native
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/getAndroidSplashConfig.SplashScreenConfig, 'resizeMode'> */
trait PickSplashScreenConfigres extends StObject {
  
  var resizeMode: contain | cover | native
}
object PickSplashScreenConfigres {
  
  inline def apply(resizeMode: contain | cover | native): PickSplashScreenConfigres = {
    val __obj = js.Dynamic.literal(resizeMode = resizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSplashScreenConfigres]
  }
  
  extension [Self <: PickSplashScreenConfigres](x: Self) {
    
    inline def setResizeMode(value: contain | cover | native): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
  }
}
