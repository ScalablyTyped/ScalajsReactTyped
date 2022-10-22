package typingsJapgolly.openpgp.anon

import typingsJapgolly.openpgp.mod.UserID
import typingsJapgolly.openpgp.mod.enums.compression
import typingsJapgolly.openpgp.openpgpBooleans.`false`
import typingsJapgolly.openpgp.openpgpBooleans.`true`
import typingsJapgolly.openpgp.openpgpStrings.node
import typingsJapgolly.openpgp.openpgpStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.EncryptOptions & {  armor :true | undefined,   detached :false | undefined} */
trait EncryptOptionsarmortrueun extends StObject {
  
  /**
    * (optional) if the return values should be ascii armored or the message/signature objects
    */
  var armor: js.UndefOr[Boolean] & js.UndefOr[`true`]
  
  /**
    * (optional) which compression algorithm to compress the message with, defaults to what is specified in config
    */
  var compression: js.UndefOr[typingsJapgolly.openpgp.mod.enums.compression] = js.undefined
  
  /**
    * (optional) override the creation date of the message signature
    */
  var date: js.UndefOr[js.Date] = js.undefined
  
  /**
    * (optional) if the signature should be detached (if true, signature will be added to returned object)
    */
  var detached: js.UndefOr[Boolean] & js.UndefOr[`false`]
  
  /**
    * (optional) array of user IDs to sign with, one per key in `privateKeys`, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
    */
  var fromUserIds: js.UndefOr[js.Array[UserID]] = js.undefined
  
  /**
    * message to be encrypted as created by openpgp.message.fromText or openpgp.message.fromBinary
    */
  var message: typingsJapgolly.openpgp.mod.message.Message
  
  /**
    * (optional) array of passwords or a single password to encrypt the message
    */
  var passwords: js.UndefOr[String | js.Array[Any]] = js.undefined
  
  /**
    * (optional) private keys for signing. If omitted message will not be signed
    */
  var privateKeys: js.UndefOr[typingsJapgolly.openpgp.mod.key.Key | js.Array[Any]] = js.undefined
  
  /**
    * (optional) array of keys or single key, used to encrypt the message
    */
  var publicKeys: js.UndefOr[typingsJapgolly.openpgp.mod.key.Key | js.Array[Any]] = js.undefined
  
  /**
    * (optional) if the unencrypted session key should be added to returned object
    */
  var returnSessionKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (optional) session key in the form: { data:Uint8Array, algorithm:String }
    */
  var sessionKey: js.UndefOr[Algorithm] = js.undefined
  
  /**
    * (optional) a detached signature to add to the encrypted message
    */
  var signature: js.UndefOr[typingsJapgolly.openpgp.mod.signature.Signature] = js.undefined
  
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.undefined
  
  /**
    * (optional) array of user IDs to encrypt for, one per key in `publicKeys`, e.g. [ { name:'Robert Receiver', email:'robert@openpgp.org' }]
    */
  var toUserIds: js.UndefOr[js.Array[UserID]] = js.undefined
  
  /**
    * (optional) use a key ID of 0 instead of the public key IDs
    */
  var wildcard: js.UndefOr[Boolean] = js.undefined
}
object EncryptOptionsarmortrueun {
  
  inline def apply(
    armor: js.UndefOr[Boolean] & js.UndefOr[`true`],
    detached: js.UndefOr[Boolean] & js.UndefOr[`false`],
    message: typingsJapgolly.openpgp.mod.message.Message
  ): EncryptOptionsarmortrueun = {
    val __obj = js.Dynamic.literal(armor = armor.asInstanceOf[js.Any], detached = detached.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptOptionsarmortrueun]
  }
  
  extension [Self <: EncryptOptionsarmortrueun](x: Self) {
    
    inline def setArmor(value: js.UndefOr[Boolean] & js.UndefOr[`true`]): Self = StObject.set(x, "armor", value.asInstanceOf[js.Any])
    
    inline def setCompression(value: compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDetached(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setFromUserIds(value: js.Array[UserID]): Self = StObject.set(x, "fromUserIds", value.asInstanceOf[js.Any])
    
    inline def setFromUserIdsUndefined: Self = StObject.set(x, "fromUserIds", js.undefined)
    
    inline def setFromUserIdsVarargs(value: UserID*): Self = StObject.set(x, "fromUserIds", js.Array(value*))
    
    inline def setMessage(value: typingsJapgolly.openpgp.mod.message.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPasswords(value: String | js.Array[Any]): Self = StObject.set(x, "passwords", value.asInstanceOf[js.Any])
    
    inline def setPasswordsUndefined: Self = StObject.set(x, "passwords", js.undefined)
    
    inline def setPasswordsVarargs(value: Any*): Self = StObject.set(x, "passwords", js.Array(value*))
    
    inline def setPrivateKeys(value: typingsJapgolly.openpgp.mod.key.Key | js.Array[Any]): Self = StObject.set(x, "privateKeys", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeysUndefined: Self = StObject.set(x, "privateKeys", js.undefined)
    
    inline def setPrivateKeysVarargs(value: Any*): Self = StObject.set(x, "privateKeys", js.Array(value*))
    
    inline def setPublicKeys(value: typingsJapgolly.openpgp.mod.key.Key | js.Array[Any]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
    
    inline def setPublicKeysUndefined: Self = StObject.set(x, "publicKeys", js.undefined)
    
    inline def setPublicKeysVarargs(value: Any*): Self = StObject.set(x, "publicKeys", js.Array(value*))
    
    inline def setReturnSessionKey(value: Boolean): Self = StObject.set(x, "returnSessionKey", value.asInstanceOf[js.Any])
    
    inline def setReturnSessionKeyUndefined: Self = StObject.set(x, "returnSessionKey", js.undefined)
    
    inline def setSessionKey(value: Algorithm): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
    
    inline def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
    
    inline def setSignature(value: typingsJapgolly.openpgp.mod.signature.Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setStreaming(value: web | node | `false`): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
    
    inline def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
    
    inline def setToUserIds(value: js.Array[UserID]): Self = StObject.set(x, "toUserIds", value.asInstanceOf[js.Any])
    
    inline def setToUserIdsUndefined: Self = StObject.set(x, "toUserIds", js.undefined)
    
    inline def setToUserIdsVarargs(value: UserID*): Self = StObject.set(x, "toUserIds", js.Array(value*))
    
    inline def setWildcard(value: Boolean): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
    
    inline def setWildcardUndefined: Self = StObject.set(x, "wildcard", js.undefined)
  }
}
