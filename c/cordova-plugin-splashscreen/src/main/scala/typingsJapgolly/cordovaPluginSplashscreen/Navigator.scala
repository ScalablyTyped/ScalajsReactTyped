package typingsJapgolly.cordovaPluginSplashscreen

import typingsJapgolly.cordovaPluginSplashscreen.anon.Hide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  /** This plugin displays and hides a splash screen during application launch. */
  var splashscreen: Hide
}
object Navigator {
  
  inline def apply(splashscreen: Hide): Navigator = {
    val __obj = js.Dynamic.literal(splashscreen = splashscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setSplashscreen(value: Hide): Self = StObject.set(x, "splashscreen", value.asInstanceOf[js.Any])
  }
}
