package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsDoubles.`1.25`
import typingsJapgolly.carbonElements.carbonElementsStrings.`2rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointsFontFamilyFontSize extends StObject {
  
  var breakpoints: LgMaxMd
  
  var fontFamily: /* 'IBM Plex Serif', 'Georgia', Times, serif */ String
  
  var fontSize: `2rem`
  
  var fontWeight: typingsJapgolly.carbonElements.carbonElementsInts.`300`
  
  var letterSpacing: typingsJapgolly.carbonElements.carbonElementsInts.`0`
  
  var lineHeight: `1.25`
}
object BreakpointsFontFamilyFontSize {
  
  inline def apply(breakpoints: LgMaxMd): BreakpointsFontFamilyFontSize = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], fontFamily = "'IBM Plex Serif', 'Georgia', Times, serif", fontSize = "2rem", fontWeight = 300, letterSpacing = 0, lineHeight = 1.25d)
    __obj.asInstanceOf[BreakpointsFontFamilyFontSize]
  }
  
  extension [Self <: BreakpointsFontFamilyFontSize](x: Self) {
    
    inline def setBreakpoints(value: LgMaxMd): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: /* 'IBM Plex Serif', 'Georgia', Times, serif */ String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: `2rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: typingsJapgolly.carbonElements.carbonElementsInts.`300`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typingsJapgolly.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.25`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
