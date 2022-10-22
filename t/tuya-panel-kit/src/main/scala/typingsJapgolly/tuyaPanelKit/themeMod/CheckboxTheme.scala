package typingsJapgolly.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxTheme extends StObject {
  
  var activeColor: String
  
  var disabledColor: String
  
  var fontColor: String
  
  var size: Double
}
object CheckboxTheme {
  
  inline def apply(activeColor: String, disabledColor: String, fontColor: String, size: Double): CheckboxTheme = {
    val __obj = js.Dynamic.literal(activeColor = activeColor.asInstanceOf[js.Any], disabledColor = disabledColor.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxTheme]
  }
  
  extension [Self <: CheckboxTheme](x: Self) {
    
    inline def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
    
    inline def setDisabledColor(value: String): Self = StObject.set(x, "disabledColor", value.asInstanceOf[js.Any])
    
    inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
