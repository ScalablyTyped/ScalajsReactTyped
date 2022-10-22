package typingsJapgolly.openpgp.mod

import typingsJapgolly.openpgp.mod.cleartext.CleartextMessage
import typingsJapgolly.openpgp.mod.key.Key
import typingsJapgolly.openpgp.mod.message.Message
import typingsJapgolly.openpgp.mod.signature.Signature
import typingsJapgolly.openpgp.openpgpBooleans.`false`
import typingsJapgolly.openpgp.openpgpStrings.node
import typingsJapgolly.openpgp.openpgpStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyOptions extends StObject {
  
  /**
    * (optional) use the given date for verification instead of the current time
    */
  var date: js.UndefOr[js.Date] = js.undefined
  
  /**
    * (cleartext) message object with signatures
    */
  var message: CleartextMessage | Message
  
  /**
    * array of publicKeys or single key, to verify signatures
    */
  var publicKeys: Key | js.Array[Any]
  
  /**
    * (optional) detached signature for verification
    */
  var signature: js.UndefOr[Signature] = js.undefined
  
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.undefined
}
object VerifyOptions {
  
  inline def apply(message: CleartextMessage | Message, publicKeys: Key | js.Array[Any]): VerifyOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], publicKeys = publicKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOptions]
  }
  
  extension [Self <: VerifyOptions](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setMessage(value: CleartextMessage | Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPublicKeys(value: Key | js.Array[Any]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
    
    inline def setPublicKeysVarargs(value: Any*): Self = StObject.set(x, "publicKeys", js.Array(value*))
    
    inline def setSignature(value: Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setStreaming(value: web | node | `false`): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
    
    inline def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
  }
}
