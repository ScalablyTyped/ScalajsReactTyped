package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsDoubles.`1.28572`
import typingsJapgolly.carbonElements.carbonElementsStrings.`0Dot16px`
import typingsJapgolly.carbonElements.carbonElementsStrings.`0Dot875rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  var fontSize: `0Dot875rem`
  
  var letterSpacing: `0Dot16px`
  
  var lineHeight: `1.28572`
}
object `19` {
  
  inline def apply(): `19` = {
    val __obj = js.Dynamic.literal(fontSize = "0.875rem", letterSpacing = "0.16px", lineHeight = 1.28572d)
    __obj.asInstanceOf[`19`]
  }
  
  extension [Self <: `19`](x: Self) {
    
    inline def setFontSize(value: `0Dot875rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: `0Dot16px`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.28572`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
