package typingsJapgolly.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthCreateTokenFromCodeRequest extends StObject {
  
  var code: String
}
object OAuthCreateTokenFromCodeRequest {
  
  inline def apply(code: String): OAuthCreateTokenFromCodeRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthCreateTokenFromCodeRequest]
  }
  
  extension [Self <: OAuthCreateTokenFromCodeRequest](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
