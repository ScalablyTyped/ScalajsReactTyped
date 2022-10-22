package typingsJapgolly.jspdf.mod

import typingsJapgolly.jspdf.anon.Format
import typingsJapgolly.jspdf.jspdfInts.`100`
import typingsJapgolly.jspdf.jspdfInts.`200`
import typingsJapgolly.jspdf.jspdfInts.`300`
import typingsJapgolly.jspdf.jspdfInts.`400`
import typingsJapgolly.jspdf.jspdfInts.`500`
import typingsJapgolly.jspdf.jspdfInts.`600`
import typingsJapgolly.jspdf.jspdfInts.`700`
import typingsJapgolly.jspdf.jspdfInts.`800`
import typingsJapgolly.jspdf.jspdfInts.`900`
import typingsJapgolly.jspdf.jspdfStrings.`extra-condensed`
import typingsJapgolly.jspdf.jspdfStrings.`extra-expanded`
import typingsJapgolly.jspdf.jspdfStrings.`semi-condensed`
import typingsJapgolly.jspdf.jspdfStrings.`semi-expanded`
import typingsJapgolly.jspdf.jspdfStrings.`ultra-condensed`
import typingsJapgolly.jspdf.jspdfStrings.`ultra-expanded`
import typingsJapgolly.jspdf.jspdfStrings.bold
import typingsJapgolly.jspdf.jspdfStrings.condensed
import typingsJapgolly.jspdf.jspdfStrings.expanded
import typingsJapgolly.jspdf.jspdfStrings.italic
import typingsJapgolly.jspdf.jspdfStrings.normal
import typingsJapgolly.jspdf.jspdfStrings.oblique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLFontFace extends StObject {
  
  var family: String
  
  var src: js.Array[Format]
  
  var stretch: js.UndefOr[
    `ultra-condensed` | `extra-condensed` | condensed | `semi-condensed` | normal | `semi-expanded` | expanded | `extra-expanded` | `ultra-expanded`
  ] = js.undefined
  
  var style: js.UndefOr[italic | oblique | normal] = js.undefined
  
  var weight: js.UndefOr[
    normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | typingsJapgolly.jspdf.jspdfStrings.`100` | typingsJapgolly.jspdf.jspdfStrings.`200` | typingsJapgolly.jspdf.jspdfStrings.`300` | typingsJapgolly.jspdf.jspdfStrings.`400` | typingsJapgolly.jspdf.jspdfStrings.`500` | typingsJapgolly.jspdf.jspdfStrings.`600` | typingsJapgolly.jspdf.jspdfStrings.`700` | typingsJapgolly.jspdf.jspdfStrings.`800` | typingsJapgolly.jspdf.jspdfStrings.`900`
  ] = js.undefined
}
object HTMLFontFace {
  
  inline def apply(family: String, src: js.Array[Format]): HTMLFontFace = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLFontFace]
  }
  
  extension [Self <: HTMLFontFace](x: Self) {
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: js.Array[Format]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcVarargs(value: Format*): Self = StObject.set(x, "src", js.Array(value*))
    
    inline def setStretch(
      value: `ultra-condensed` | `extra-condensed` | condensed | `semi-condensed` | normal | `semi-expanded` | expanded | `extra-expanded` | `ultra-expanded`
    ): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    
    inline def setStyle(value: italic | oblique | normal): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWeight(
      value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | typingsJapgolly.jspdf.jspdfStrings.`100` | typingsJapgolly.jspdf.jspdfStrings.`200` | typingsJapgolly.jspdf.jspdfStrings.`300` | typingsJapgolly.jspdf.jspdfStrings.`400` | typingsJapgolly.jspdf.jspdfStrings.`500` | typingsJapgolly.jspdf.jspdfStrings.`600` | typingsJapgolly.jspdf.jspdfStrings.`700` | typingsJapgolly.jspdf.jspdfStrings.`800` | typingsJapgolly.jspdf.jspdfStrings.`900`
    ): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
