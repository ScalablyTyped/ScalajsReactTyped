package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsDoubles.`1.42857`
import typingsJapgolly.carbonElements.carbonElementsInts.`600`
import typingsJapgolly.carbonElements.carbonElementsStrings.`0Dot16px`
import typingsJapgolly.carbonElements.carbonElementsStrings.`0Dot875rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  var fontSize: `0Dot875rem`
  
  var fontWeight: `600`
  
  var letterSpacing: `0Dot16px`
  
  var lineHeight: `1.42857`
}
object `24` {
  
  inline def apply(): `24` = {
    val __obj = js.Dynamic.literal(fontSize = "0.875rem", fontWeight = 600, letterSpacing = "0.16px", lineHeight = 1.42857d)
    __obj.asInstanceOf[`24`]
  }
  
  extension [Self <: `24`](x: Self) {
    
    inline def setFontSize(value: `0Dot875rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `600`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: `0Dot16px`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.42857`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
