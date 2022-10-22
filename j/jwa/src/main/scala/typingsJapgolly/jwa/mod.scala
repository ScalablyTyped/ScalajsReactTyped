package typingsJapgolly.jwa

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(algorithm: Algorithm): JWA = ^.asInstanceOf[js.Dynamic].apply(algorithm.asInstanceOf[js.Any]).asInstanceOf[JWA]
  
  @JSImport("jwa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jwa.jwaStrings.HS256
    - typingsJapgolly.jwa.jwaStrings.HS384
    - typingsJapgolly.jwa.jwaStrings.HS512
    - typingsJapgolly.jwa.jwaStrings.RS256
    - typingsJapgolly.jwa.jwaStrings.RS384
    - typingsJapgolly.jwa.jwaStrings.RS512
    - typingsJapgolly.jwa.jwaStrings.PS256
    - typingsJapgolly.jwa.jwaStrings.PS384
    - typingsJapgolly.jwa.jwaStrings.PS512
    - typingsJapgolly.jwa.jwaStrings.ES256
    - typingsJapgolly.jwa.jwaStrings.ES384
    - typingsJapgolly.jwa.jwaStrings.ES512
    - typingsJapgolly.jwa.jwaStrings.none
  */
  trait Algorithm extends StObject
  object Algorithm {
    
    inline def ES256: typingsJapgolly.jwa.jwaStrings.ES256 = "ES256".asInstanceOf[typingsJapgolly.jwa.jwaStrings.ES256]
    
    inline def ES384: typingsJapgolly.jwa.jwaStrings.ES384 = "ES384".asInstanceOf[typingsJapgolly.jwa.jwaStrings.ES384]
    
    inline def ES512: typingsJapgolly.jwa.jwaStrings.ES512 = "ES512".asInstanceOf[typingsJapgolly.jwa.jwaStrings.ES512]
    
    inline def HS256: typingsJapgolly.jwa.jwaStrings.HS256 = "HS256".asInstanceOf[typingsJapgolly.jwa.jwaStrings.HS256]
    
    inline def HS384: typingsJapgolly.jwa.jwaStrings.HS384 = "HS384".asInstanceOf[typingsJapgolly.jwa.jwaStrings.HS384]
    
    inline def HS512: typingsJapgolly.jwa.jwaStrings.HS512 = "HS512".asInstanceOf[typingsJapgolly.jwa.jwaStrings.HS512]
    
    inline def PS256: typingsJapgolly.jwa.jwaStrings.PS256 = "PS256".asInstanceOf[typingsJapgolly.jwa.jwaStrings.PS256]
    
    inline def PS384: typingsJapgolly.jwa.jwaStrings.PS384 = "PS384".asInstanceOf[typingsJapgolly.jwa.jwaStrings.PS384]
    
    inline def PS512: typingsJapgolly.jwa.jwaStrings.PS512 = "PS512".asInstanceOf[typingsJapgolly.jwa.jwaStrings.PS512]
    
    inline def RS256: typingsJapgolly.jwa.jwaStrings.RS256 = "RS256".asInstanceOf[typingsJapgolly.jwa.jwaStrings.RS256]
    
    inline def RS384: typingsJapgolly.jwa.jwaStrings.RS384 = "RS384".asInstanceOf[typingsJapgolly.jwa.jwaStrings.RS384]
    
    inline def RS512: typingsJapgolly.jwa.jwaStrings.RS512 = "RS512".asInstanceOf[typingsJapgolly.jwa.jwaStrings.RS512]
    
    inline def none: typingsJapgolly.jwa.jwaStrings.none = "none".asInstanceOf[typingsJapgolly.jwa.jwaStrings.none]
  }
  
  trait JWA extends StObject {
    
    def sign(input: String, secretOrPrivateKey: String): String
    
    def verify(input: String, signature: String, secretOrPublicKey: String): Boolean
  }
  object JWA {
    
    inline def apply(sign: (String, String) => String, verify: (String, String, String) => Boolean): JWA = {
      val __obj = js.Dynamic.literal(sign = js.Any.fromFunction2(sign), verify = js.Any.fromFunction3(verify))
      __obj.asInstanceOf[JWA]
    }
    
    extension [Self <: JWA](x: Self) {
      
      inline def setSign(value: (String, String) => String): Self = StObject.set(x, "sign", js.Any.fromFunction2(value))
      
      inline def setVerify(value: (String, String, String) => Boolean): Self = StObject.set(x, "verify", js.Any.fromFunction3(value))
    }
  }
}
