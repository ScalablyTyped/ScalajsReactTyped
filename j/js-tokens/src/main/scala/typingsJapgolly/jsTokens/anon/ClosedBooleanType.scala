package typingsJapgolly.jsTokens.anon

import typingsJapgolly.jsTokens.jsTokensStrings.RegularExpressionLiteral
import typingsJapgolly.jsTokens.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosedBooleanType
  extends StObject
     with Token {
  
  var closed: Boolean
  
  var `type`: RegularExpressionLiteral
  
  var value: String
}
object ClosedBooleanType {
  
  inline def apply(closed: Boolean, value: String): ClosedBooleanType = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegularExpressionLiteral")
    __obj.asInstanceOf[ClosedBooleanType]
  }
  
  extension [Self <: ClosedBooleanType](x: Self) {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setType(value: RegularExpressionLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
