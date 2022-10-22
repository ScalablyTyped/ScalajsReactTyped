package typingsJapgolly.pulumiKubernetes.typesInputMod.storage.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TokenRequest contains parameters of a service account token.
  */
trait TokenRequest extends StObject {
  
  /**
    * Audience is the intended audience of the token in "TokenRequestSpec". It will default to the audiences of kube apiserver.
    */
  var audience: Input[String]
  
  /**
    * ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec". It has the same default value of "ExpirationSeconds" in "TokenRequestSpec".
    */
  var expirationSeconds: js.UndefOr[Input[Double]] = js.undefined
}
object TokenRequest {
  
  inline def apply(audience: Input[String]): TokenRequest = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenRequest]
  }
  
  extension [Self <: TokenRequest](x: Self) {
    
    inline def setAudience(value: Input[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setExpirationSeconds(value: Input[Double]): Self = StObject.set(x, "expirationSeconds", value.asInstanceOf[js.Any])
    
    inline def setExpirationSecondsUndefined: Self = StObject.set(x, "expirationSeconds", js.undefined)
  }
}
