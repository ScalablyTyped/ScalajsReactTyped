package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsDoubles.`1.33333`
import typingsJapgolly.carbonElements.carbonElementsInts.`400`
import typingsJapgolly.carbonElements.carbonElementsStrings.`0Dot32px`
import typingsJapgolly.carbonElements.carbonElementsStrings.`0Dot75rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamilyFontSize extends StObject {
  
  var fontFamily: /* 'IBM Plex Mono', 'Menlo', 'DejaVu Sans Mono', 'Bitstream Vera Sans Mono', Courier, monospace */ String
  
  var fontSize: `0Dot75rem`
  
  var fontWeight: `400`
  
  var letterSpacing: `0Dot32px`
  
  var lineHeight: `1.33333`
}
object FontFamilyFontSize {
  
  inline def apply(): FontFamilyFontSize = {
    val __obj = js.Dynamic.literal(fontFamily = "'IBM Plex Mono', 'Menlo', 'DejaVu Sans Mono', 'Bitstream Vera Sans Mono', Courier, monospace", fontSize = "0.75rem", fontWeight = 400, letterSpacing = "0.32px", lineHeight = 1.33333d)
    __obj.asInstanceOf[FontFamilyFontSize]
  }
  
  extension [Self <: FontFamilyFontSize](x: Self) {
    
    inline def setFontFamily(
      value: /* 'IBM Plex Mono', 'Menlo', 'DejaVu Sans Mono', 'Bitstream Vera Sans Mono', Courier, monospace */ String
    ): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: `0Dot75rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `400`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: `0Dot32px`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.33333`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
