package typingsJapgolly.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token extends StObject {
  
  var aud: String
  
  var jti: String
}
object Token {
  
  inline def apply(aud: String, jti: String): Token = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], jti = jti.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  extension [Self <: Token](x: Self) {
    
    inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
  }
}
