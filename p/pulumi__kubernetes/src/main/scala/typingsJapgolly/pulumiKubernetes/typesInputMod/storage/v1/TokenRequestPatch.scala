package typingsJapgolly.pulumiKubernetes.typesInputMod.storage.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TokenRequest contains parameters of a service account token.
  */
trait TokenRequestPatch extends StObject {
  
  /**
    * Audience is the intended audience of the token in "TokenRequestSpec". It will default to the audiences of kube apiserver.
    */
  var audience: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec". It has the same default value of "ExpirationSeconds" in "TokenRequestSpec".
    */
  var expirationSeconds: js.UndefOr[Input[Double]] = js.undefined
}
object TokenRequestPatch {
  
  inline def apply(): TokenRequestPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenRequestPatch]
  }
  
  extension [Self <: TokenRequestPatch](x: Self) {
    
    inline def setAudience(value: Input[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setExpirationSeconds(value: Input[Double]): Self = StObject.set(x, "expirationSeconds", value.asInstanceOf[js.Any])
    
    inline def setExpirationSecondsUndefined: Self = StObject.set(x, "expirationSeconds", js.undefined)
  }
}
