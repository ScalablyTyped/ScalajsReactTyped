package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsDoubles.`1.25`
import typingsJapgolly.carbonElements.carbonElementsInts.`600`
import typingsJapgolly.carbonElements.carbonElementsStrings.`2rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointsFontSizeFontWeightLetterSpacing extends StObject {
  
  var breakpoints: MaxMd
  
  var fontSize: `2rem`
  
  var fontWeight: `600`
  
  var letterSpacing: typingsJapgolly.carbonElements.carbonElementsInts.`0`
  
  var lineHeight: `1.25`
}
object BreakpointsFontSizeFontWeightLetterSpacing {
  
  inline def apply(breakpoints: MaxMd): BreakpointsFontSizeFontWeightLetterSpacing = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], fontSize = "2rem", fontWeight = 600, letterSpacing = 0, lineHeight = 1.25d)
    __obj.asInstanceOf[BreakpointsFontSizeFontWeightLetterSpacing]
  }
  
  extension [Self <: BreakpointsFontSizeFontWeightLetterSpacing](x: Self) {
    
    inline def setBreakpoints(value: MaxMd): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: `2rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `600`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typingsJapgolly.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.25`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
