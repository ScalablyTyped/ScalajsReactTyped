package typingsJapgolly.exceljs.anon

import typingsJapgolly.exceljs.mod.BorderStyle
import typingsJapgolly.exceljs.mod.Color
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Border> */
trait PartialBorderColor extends StObject {
  
  var color: js.UndefOr[Partial[Color]] = js.undefined
  
  var style: js.UndefOr[BorderStyle] = js.undefined
}
object PartialBorderColor {
  
  inline def apply(): PartialBorderColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBorderColor]
  }
  
  extension [Self <: PartialBorderColor](x: Self) {
    
    inline def setColor(value: Partial[Color]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setStyle(value: BorderStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
