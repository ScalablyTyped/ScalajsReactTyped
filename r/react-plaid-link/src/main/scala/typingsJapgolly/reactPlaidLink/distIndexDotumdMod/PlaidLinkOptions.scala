package typingsJapgolly.reactPlaidLink.distIndexDotumdMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Either the publicKey or the token field must be configured. The publicKey
// is deprecated so prefer to initialize Link with a Link Token instead.
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactPlaidLink.distIndexDotumdMod.PlaidLinkOptionsWithPublicKey
  - typingsJapgolly.reactPlaidLink.distIndexDotumdMod.PlaidLinkOptionsWithLinkToken
*/
trait PlaidLinkOptions extends StObject
object PlaidLinkOptions {
  
  inline def PlaidLinkOptionsWithLinkToken(onSuccess: (/* public_token */ String, /* metadata */ PlaidLinkOnSuccessMetadata) => Callback): typingsJapgolly.reactPlaidLink.distIndexDotumdMod.PlaidLinkOptionsWithLinkToken = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction2((t0: /* public_token */ String, t1: /* metadata */ PlaidLinkOnSuccessMetadata) => (onSuccess(t0, t1)).runNow()), token = null)
    __obj.asInstanceOf[typingsJapgolly.reactPlaidLink.distIndexDotumdMod.PlaidLinkOptionsWithLinkToken]
  }
  
  inline def PlaidLinkOptionsWithPublicKey(
    clientName: String,
    env: String,
    onSuccess: (/* public_token */ String, /* metadata */ PlaidLinkOnSuccessMetadata) => Callback,
    product: js.Array[String],
    publicKey: String
  ): typingsJapgolly.reactPlaidLink.distIndexDotumdMod.PlaidLinkOptionsWithPublicKey = {
    val __obj = js.Dynamic.literal(clientName = clientName.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], onSuccess = js.Any.fromFunction2((t0: /* public_token */ String, t1: /* metadata */ PlaidLinkOnSuccessMetadata) => (onSuccess(t0, t1)).runNow()), product = product.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactPlaidLink.distIndexDotumdMod.PlaidLinkOptionsWithPublicKey]
  }
}
