package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsDoubles.`1.11`
import typingsJapgolly.carbonElements.carbonElementsStrings.`-0Dot96px`
import typingsJapgolly.carbonElements.carbonElementsStrings.`5Dot25rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizeLetterSpacing extends StObject {
  
  var fontSize: `5Dot25rem`
  
  var letterSpacing: `-0Dot96px`
  
  var lineHeight: `1.11`
}
object FontSizeLetterSpacing {
  
  inline def apply(): FontSizeLetterSpacing = {
    val __obj = js.Dynamic.literal(fontSize = "5.25rem", letterSpacing = "-0.96px", lineHeight = 1.11d)
    __obj.asInstanceOf[FontSizeLetterSpacing]
  }
  
  extension [Self <: FontSizeLetterSpacing](x: Self) {
    
    inline def setFontSize(value: `5Dot25rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: `-0Dot96px`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.11`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
