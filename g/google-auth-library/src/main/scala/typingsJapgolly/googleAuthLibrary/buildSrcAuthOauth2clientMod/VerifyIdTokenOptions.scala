package typingsJapgolly.googleAuthLibrary.buildSrcAuthOauth2clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyIdTokenOptions extends StObject {
  
  var audience: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var idToken: String
  
  var maxExpiry: js.UndefOr[Double] = js.undefined
}
object VerifyIdTokenOptions {
  
  inline def apply(idToken: String): VerifyIdTokenOptions = {
    val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyIdTokenOptions]
  }
  
  extension [Self <: VerifyIdTokenOptions](x: Self) {
    
    inline def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value*))
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setMaxExpiry(value: Double): Self = StObject.set(x, "maxExpiry", value.asInstanceOf[js.Any])
    
    inline def setMaxExpiryUndefined: Self = StObject.set(x, "maxExpiry", js.undefined)
  }
}
