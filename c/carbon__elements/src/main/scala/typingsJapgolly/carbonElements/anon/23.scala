package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsDoubles.`1.5`
import typingsJapgolly.carbonElements.carbonElementsInts.`400`
import typingsJapgolly.carbonElements.carbonElementsStrings.`1rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var fontSize: `1rem`
  
  var fontWeight: `400`
  
  var letterSpacing: typingsJapgolly.carbonElements.carbonElementsInts.`0`
  
  var lineHeight: `1.5`
}
object `23` {
  
  inline def apply(): `23` = {
    val __obj = js.Dynamic.literal(fontSize = "1rem", fontWeight = 400, letterSpacing = 0, lineHeight = 1.5d)
    __obj.asInstanceOf[`23`]
  }
  
  extension [Self <: `23`](x: Self) {
    
    inline def setFontSize(value: `1rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `400`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typingsJapgolly.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.5`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
