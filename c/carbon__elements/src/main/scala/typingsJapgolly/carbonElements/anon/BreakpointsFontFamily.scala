package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsDoubles.`1.3`
import typingsJapgolly.carbonElements.carbonElementsInts.`400`
import typingsJapgolly.carbonElements.carbonElementsStrings.`1Dot25rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointsFontFamily extends StObject {
  
  var breakpoints: MdXlg
  
  var fontFamily: /* 'IBM Plex Serif', 'Georgia', Times, serif */ String
  
  var fontSize: `1Dot25rem`
  
  var fontWeight: `400`
  
  var letterSpacing: typingsJapgolly.carbonElements.carbonElementsInts.`0`
  
  var lineHeight: `1.3`
}
object BreakpointsFontFamily {
  
  inline def apply(breakpoints: MdXlg): BreakpointsFontFamily = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], fontFamily = "'IBM Plex Serif', 'Georgia', Times, serif", fontSize = "1.25rem", fontWeight = 400, letterSpacing = 0, lineHeight = 1.3d)
    __obj.asInstanceOf[BreakpointsFontFamily]
  }
  
  extension [Self <: BreakpointsFontFamily](x: Self) {
    
    inline def setBreakpoints(value: MdXlg): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: /* 'IBM Plex Serif', 'Georgia', Times, serif */ String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: `1Dot25rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `400`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typingsJapgolly.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.3`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
