package typingsJapgolly.escpos.anon

import typingsJapgolly.escpos.escposStrings.CENTER
import typingsJapgolly.escpos.escposStrings.LEFT
import typingsJapgolly.escpos.escposStrings.RIGHT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Align extends StObject {
  
  var align: LEFT | CENTER | RIGHT
  
  var text: String
  
  var width: Double
}
object Align {
  
  inline def apply(align: LEFT | CENTER | RIGHT, text: String, width: Double): Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
  
  extension [Self <: Align](x: Self) {
    
    inline def setAlign(value: LEFT | CENTER | RIGHT): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
