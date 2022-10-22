package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsDoubles.`1.334`
import typingsJapgolly.carbonElements.carbonElementsStrings.`1Dot5rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointsFontSizeFontWeightLetterSpacingLineHeight extends StObject {
  
  var breakpoints: Lg14
  
  var fontSize: `1Dot5rem`
  
  var fontWeight: typingsJapgolly.carbonElements.carbonElementsInts.`300`
  
  var letterSpacing: typingsJapgolly.carbonElements.carbonElementsInts.`0`
  
  var lineHeight: `1.334`
}
object BreakpointsFontSizeFontWeightLetterSpacingLineHeight {
  
  inline def apply(breakpoints: Lg14): BreakpointsFontSizeFontWeightLetterSpacingLineHeight = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], fontSize = "1.5rem", fontWeight = 300, letterSpacing = 0, lineHeight = 1.334d)
    __obj.asInstanceOf[BreakpointsFontSizeFontWeightLetterSpacingLineHeight]
  }
  
  extension [Self <: BreakpointsFontSizeFontWeightLetterSpacingLineHeight](x: Self) {
    
    inline def setBreakpoints(value: Lg14): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: `1Dot5rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: typingsJapgolly.carbonElements.carbonElementsInts.`300`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typingsJapgolly.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.334`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
