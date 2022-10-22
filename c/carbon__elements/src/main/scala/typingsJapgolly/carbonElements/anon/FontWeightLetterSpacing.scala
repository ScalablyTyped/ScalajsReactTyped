package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsDoubles.`1.22`
import typingsJapgolly.carbonElements.carbonElementsInts.`600`
import typingsJapgolly.carbonElements.carbonElementsStrings.`2Dot25rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeightLetterSpacing extends StObject {
  
  var fontSize: `2Dot25rem`
  
  var fontWeight: `600`
  
  var letterSpacing: typingsJapgolly.carbonElements.carbonElementsInts.`0`
  
  var lineHeight: `1.22`
}
object FontWeightLetterSpacing {
  
  inline def apply(): FontWeightLetterSpacing = {
    val __obj = js.Dynamic.literal(fontSize = "2.25rem", fontWeight = 600, letterSpacing = 0, lineHeight = 1.22d)
    __obj.asInstanceOf[FontWeightLetterSpacing]
  }
  
  extension [Self <: FontWeightLetterSpacing](x: Self) {
    
    inline def setFontSize(value: `2Dot25rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `600`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typingsJapgolly.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.22`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
