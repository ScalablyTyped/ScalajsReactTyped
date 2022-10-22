package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  lineHeight :string,   letterSpacing :string,   fontWeight :string | number}> */
trait PartiallineHeightstringle extends StObject {
  
  var fontWeight: js.UndefOr[String | Double] = js.undefined
  
  var letterSpacing: js.UndefOr[String] = js.undefined
  
  var lineHeight: js.UndefOr[String] = js.undefined
}
object PartiallineHeightstringle {
  
  inline def apply(): PartiallineHeightstringle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartiallineHeightstringle]
  }
  
  extension [Self <: PartiallineHeightstringle](x: Self) {
    
    inline def setFontWeight(value: String | Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
  }
}
