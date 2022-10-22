package typingsJapgolly.openpgp.anon

import typingsJapgolly.openpgp.mod.UserID
import typingsJapgolly.openpgp.mod.cleartext.CleartextMessage
import typingsJapgolly.openpgp.openpgpBooleans.`false`
import typingsJapgolly.openpgp.openpgpStrings.node
import typingsJapgolly.openpgp.openpgpStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.SignOptions & {  armor :false,   detached :false | undefined} */
trait SignOptionsarmorfalsedeta extends StObject {
  
  /**
    * (optional) if the return value should be ascii armored or the message object
    */
  var armor: js.UndefOr[Boolean] & `false`
  
  /**
    * (optional) override the creation date of the signature
    */
  var date: js.UndefOr[js.Date] = js.undefined
  
  /**
    * (optional) if the return value should contain a detached signature
    */
  var detached: js.UndefOr[Boolean] & js.UndefOr[`false`]
  
  /**
    *  (optional) array of user IDs to sign with, one per key in `privateKeys`, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
    */
  var fromUserIds: js.UndefOr[js.Array[UserID]] = js.undefined
  
  /**
    * (cleartext) message to be signed
    */
  var message: CleartextMessage | typingsJapgolly.openpgp.mod.message.Message
  
  /**
    * array of keys or single key with decrypted secret key data to sign cleartext
    */
  var privateKeys: typingsJapgolly.openpgp.mod.key.Key | js.Array[Any]
  
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.undefined
}
object SignOptionsarmorfalsedeta {
  
  inline def apply(
    armor: js.UndefOr[Boolean] & `false`,
    detached: js.UndefOr[Boolean] & js.UndefOr[`false`],
    message: CleartextMessage | typingsJapgolly.openpgp.mod.message.Message,
    privateKeys: typingsJapgolly.openpgp.mod.key.Key | js.Array[Any]
  ): SignOptionsarmorfalsedeta = {
    val __obj = js.Dynamic.literal(armor = armor.asInstanceOf[js.Any], detached = detached.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], privateKeys = privateKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOptionsarmorfalsedeta]
  }
  
  extension [Self <: SignOptionsarmorfalsedeta](x: Self) {
    
    inline def setArmor(value: js.UndefOr[Boolean] & `false`): Self = StObject.set(x, "armor", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDetached(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setFromUserIds(value: js.Array[UserID]): Self = StObject.set(x, "fromUserIds", value.asInstanceOf[js.Any])
    
    inline def setFromUserIdsUndefined: Self = StObject.set(x, "fromUserIds", js.undefined)
    
    inline def setFromUserIdsVarargs(value: UserID*): Self = StObject.set(x, "fromUserIds", js.Array(value*))
    
    inline def setMessage(value: CleartextMessage | typingsJapgolly.openpgp.mod.message.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeys(value: typingsJapgolly.openpgp.mod.key.Key | js.Array[Any]): Self = StObject.set(x, "privateKeys", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeysVarargs(value: Any*): Self = StObject.set(x, "privateKeys", js.Array(value*))
    
    inline def setStreaming(value: web | node | `false`): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
    
    inline def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
  }
}
