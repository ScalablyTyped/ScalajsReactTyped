package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsDoubles.`1.19`
import typingsJapgolly.carbonElements.carbonElementsStrings.`2Dot625rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointsXlg extends StObject {
  
  var breakpoints: Xlg
  
  var fontSize: `2Dot625rem`
  
  var fontWeight: typingsJapgolly.carbonElements.carbonElementsInts.`300`
  
  var letterSpacing: typingsJapgolly.carbonElements.carbonElementsInts.`0`
  
  var lineHeight: `1.19`
}
object BreakpointsXlg {
  
  inline def apply(breakpoints: Xlg): BreakpointsXlg = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], fontSize = "2.625rem", fontWeight = 300, letterSpacing = 0, lineHeight = 1.19d)
    __obj.asInstanceOf[BreakpointsXlg]
  }
  
  extension [Self <: BreakpointsXlg](x: Self) {
    
    inline def setBreakpoints(value: Xlg): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: `2Dot625rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: typingsJapgolly.carbonElements.carbonElementsInts.`300`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typingsJapgolly.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.19`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
