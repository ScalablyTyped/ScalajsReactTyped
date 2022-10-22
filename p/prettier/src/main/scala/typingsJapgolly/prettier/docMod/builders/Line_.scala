package typingsJapgolly.prettier.docMod.builders

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Line_
  extends StObject
     with DocCommand {
  
  var hard: js.UndefOr[Boolean] = js.undefined
  
  var literal: js.UndefOr[Boolean] = js.undefined
  
  var soft: js.UndefOr[Boolean] = js.undefined
  
  var `type`: typingsJapgolly.prettier.prettierStrings.line
}
object Line_ {
  
  inline def apply(): Line_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[Line_]
  }
  
  extension [Self <: Line_](x: Self) {
    
    inline def setHard(value: Boolean): Self = StObject.set(x, "hard", value.asInstanceOf[js.Any])
    
    inline def setHardUndefined: Self = StObject.set(x, "hard", js.undefined)
    
    inline def setLiteral(value: Boolean): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
    
    inline def setLiteralUndefined: Self = StObject.set(x, "literal", js.undefined)
    
    inline def setSoft(value: Boolean): Self = StObject.set(x, "soft", value.asInstanceOf[js.Any])
    
    inline def setSoftUndefined: Self = StObject.set(x, "soft", js.undefined)
    
    inline def setType(value: typingsJapgolly.prettier.prettierStrings.line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
