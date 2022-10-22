package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsDoubles.`1.16`
import typingsJapgolly.carbonElements.carbonElementsStrings.`-0Dot64px`
import typingsJapgolly.carbonElements.carbonElementsStrings.`3Dot75rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LetterSpacing extends StObject {
  
  var fontSize: `3Dot75rem`
  
  var letterSpacing: `-0Dot64px`
  
  var lineHeight: `1.16`
}
object LetterSpacing {
  
  inline def apply(): LetterSpacing = {
    val __obj = js.Dynamic.literal(fontSize = "3.75rem", letterSpacing = "-0.64px", lineHeight = 1.16d)
    __obj.asInstanceOf[LetterSpacing]
  }
  
  extension [Self <: LetterSpacing](x: Self) {
    
    inline def setFontSize(value: `3Dot75rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: `-0Dot64px`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.16`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
