package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait PublicKeyCredential
  extends StObject
     with Credential {
  
  /* standard dom */
  def getClientExtensionResults(): AuthenticationExtensionsClientOutputs
  
  /* standard dom */
  val rawId: js.typedarray.ArrayBuffer
  
  /* standard dom */
  val response: AuthenticatorResponse
}
object PublicKeyCredential {
  
  inline def apply(
    getClientExtensionResults: CallbackTo[AuthenticationExtensionsClientOutputs],
    id: java.lang.String,
    rawId: js.typedarray.ArrayBuffer,
    response: AuthenticatorResponse,
    `type`: java.lang.String
  ): PublicKeyCredential = {
    val __obj = js.Dynamic.literal(getClientExtensionResults = getClientExtensionResults.toJsFn, id = id.asInstanceOf[js.Any], rawId = rawId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredential]
  }
  
  extension [Self <: PublicKeyCredential](x: Self) {
    
    inline def setGetClientExtensionResults(value: CallbackTo[AuthenticationExtensionsClientOutputs]): Self = StObject.set(x, "getClientExtensionResults", value.toJsFn)
    
    inline def setRawId(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "rawId", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: AuthenticatorResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
