package typingsJapgolly.gradientParser.mod

import typingsJapgolly.gradientParser.gradientParserStrings.`position-keyword`
import typingsJapgolly.gradientParser.gradientParserStrings.bottom
import typingsJapgolly.gradientParser.gradientParserStrings.center
import typingsJapgolly.gradientParser.gradientParserStrings.left
import typingsJapgolly.gradientParser.gradientParserStrings.right
import typingsJapgolly.gradientParser.gradientParserStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionKeywordNode extends StObject {
  
  var `type`: `position-keyword`
  
  var value: center | left | top | bottom | right
}
object PositionKeywordNode {
  
  inline def apply(value: center | left | top | bottom | right): PositionKeywordNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("position-keyword")
    __obj.asInstanceOf[PositionKeywordNode]
  }
  
  extension [Self <: PositionKeywordNode](x: Self) {
    
    inline def setType(value: `position-keyword`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: center | left | top | bottom | right): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
