package typingsJapgolly.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalText extends StObject {
  
  var dark: String
  
  var light: String
}
object GlobalText {
  
  inline def apply(dark: String, light: String): GlobalText = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalText]
  }
  
  extension [Self <: GlobalText](x: Self) {
    
    inline def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
