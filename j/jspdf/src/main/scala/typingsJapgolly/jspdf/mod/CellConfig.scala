package typingsJapgolly.jspdf.mod

import typingsJapgolly.jspdf.jspdfStrings.center
import typingsJapgolly.jspdf.jspdfStrings.left
import typingsJapgolly.jspdf.jspdfStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellConfig extends StObject {
  
  var align: left | center | right
  
  var name: String
  
  var padding: Double
  
  var prompt: String
  
  var width: Double
}
object CellConfig {
  
  inline def apply(align: left | center | right, name: String, padding: Double, prompt: String, width: Double): CellConfig = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellConfig]
  }
  
  extension [Self <: CellConfig](x: Self) {
    
    inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
