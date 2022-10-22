package typingsJapgolly.exceljs.anon

import typingsJapgolly.exceljs.mod.BorderStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Border> */
trait PartialBorder extends StObject {
  
  var color: js.UndefOr[PartialColor] = js.undefined
  
  var style: js.UndefOr[BorderStyle] = js.undefined
}
object PartialBorder {
  
  inline def apply(): PartialBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBorder]
  }
  
  extension [Self <: PartialBorder](x: Self) {
    
    inline def setColor(value: PartialColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setStyle(value: BorderStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
