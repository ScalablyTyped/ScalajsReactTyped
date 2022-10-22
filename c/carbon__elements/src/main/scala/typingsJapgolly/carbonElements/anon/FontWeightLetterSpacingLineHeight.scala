package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsDoubles.`1.17`
import typingsJapgolly.carbonElements.carbonElementsInts.`600`
import typingsJapgolly.carbonElements.carbonElementsStrings.`3rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeightLetterSpacingLineHeight extends StObject {
  
  var fontSize: `3rem`
  
  var fontWeight: `600`
  
  var letterSpacing: typingsJapgolly.carbonElements.carbonElementsInts.`0`
  
  var lineHeight: `1.17`
}
object FontWeightLetterSpacingLineHeight {
  
  inline def apply(): FontWeightLetterSpacingLineHeight = {
    val __obj = js.Dynamic.literal(fontSize = "3rem", fontWeight = 600, letterSpacing = 0, lineHeight = 1.17d)
    __obj.asInstanceOf[FontWeightLetterSpacingLineHeight]
  }
  
  extension [Self <: FontWeightLetterSpacingLineHeight](x: Self) {
    
    inline def setFontSize(value: `3rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `600`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typingsJapgolly.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.17`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
