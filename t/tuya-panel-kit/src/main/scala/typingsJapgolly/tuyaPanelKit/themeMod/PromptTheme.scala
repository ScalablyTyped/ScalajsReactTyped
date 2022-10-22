package typingsJapgolly.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptTheme extends StObject {
  
  var bg: String
  
  var padding: String
  
  var placeholder: String
  
  var radius: Double
}
object PromptTheme {
  
  inline def apply(bg: String, padding: String, placeholder: String, radius: Double): PromptTheme = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptTheme]
  }
  
  extension [Self <: PromptTheme](x: Self) {
    
    inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}
