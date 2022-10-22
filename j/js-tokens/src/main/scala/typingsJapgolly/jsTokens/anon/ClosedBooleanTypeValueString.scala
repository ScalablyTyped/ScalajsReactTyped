package typingsJapgolly.jsTokens.anon

import typingsJapgolly.jsTokens.jsTokensStrings.MultiLineComment
import typingsJapgolly.jsTokens.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosedBooleanTypeValueString
  extends StObject
     with Token {
  
  var closed: Boolean
  
  var `type`: MultiLineComment
  
  var value: String
}
object ClosedBooleanTypeValueString {
  
  inline def apply(closed: Boolean, value: String): ClosedBooleanTypeValueString = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MultiLineComment")
    __obj.asInstanceOf[ClosedBooleanTypeValueString]
  }
  
  extension [Self <: ClosedBooleanTypeValueString](x: Self) {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setType(value: MultiLineComment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
