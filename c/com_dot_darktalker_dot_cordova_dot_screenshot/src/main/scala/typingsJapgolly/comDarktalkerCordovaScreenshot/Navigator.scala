package typingsJapgolly.comDarktalkerCordovaScreenshot

import typingsJapgolly.comDarktalkerCordovaScreenshot.com_.darktalker.cordova.screenshot.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  var screenshot: Plugin
}
object Navigator {
  
  inline def apply(screenshot: Plugin): Navigator = {
    val __obj = js.Dynamic.literal(screenshot = screenshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setScreenshot(value: Plugin): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
  }
}
