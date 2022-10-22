package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsDoubles.`1.07`
import typingsJapgolly.carbonElements.carbonElementsStrings.`-0Dot64px`
import typingsJapgolly.carbonElements.carbonElementsStrings.`7Dot625rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizeLetterSpacingLineHeight extends StObject {
  
  var fontSize: `7Dot625rem`
  
  var letterSpacing: `-0Dot64px`
  
  var lineHeight: `1.07`
}
object FontSizeLetterSpacingLineHeight {
  
  inline def apply(): FontSizeLetterSpacingLineHeight = {
    val __obj = js.Dynamic.literal(fontSize = "7.625rem", letterSpacing = "-0.64px", lineHeight = 1.07d)
    __obj.asInstanceOf[FontSizeLetterSpacingLineHeight]
  }
  
  extension [Self <: FontSizeLetterSpacingLineHeight](x: Self) {
    
    inline def setFontSize(value: `7Dot625rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: `-0Dot64px`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.07`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
