package typingsJapgolly.pkijs.mod

import typingsJapgolly.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pkijs.mod.KeyTransRecipientInfoJson
  - typingsJapgolly.pkijs.mod.KeyAgreeRecipientInfoJson
  - typingsJapgolly.pkijs.mod.KEKRecipientInfoJson
  - typingsJapgolly.pkijs.mod.PasswordRecipientInfoJson
  - typingsJapgolly.pkijs.mod.OtherRecipientInfoJson
*/
trait RecipientInfoValueJson extends StObject
object RecipientInfoValueJson {
  
  inline def KEKRecipientInfoJson(
    encryptedKey: OctetStringJson,
    kekid: KEKIdentifierJson,
    keyEncryptionAlgorithm: AlgorithmIdentifierJson,
    version: Double
  ): typingsJapgolly.pkijs.mod.KEKRecipientInfoJson = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], kekid = kekid.asInstanceOf[js.Any], keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.pkijs.mod.KEKRecipientInfoJson]
  }
  
  inline def KeyAgreeRecipientInfoJson(
    keyEncryptionAlgorithm: AlgorithmIdentifierJson,
    originator: OriginatorIdentifierOrKeyJson,
    recipientEncryptedKeys: RecipientEncryptedKeysJson,
    version: Double
  ): typingsJapgolly.pkijs.mod.KeyAgreeRecipientInfoJson = {
    val __obj = js.Dynamic.literal(keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], recipientEncryptedKeys = recipientEncryptedKeys.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.pkijs.mod.KeyAgreeRecipientInfoJson]
  }
  
  inline def KeyTransRecipientInfoJson(
    encryptedKey: OctetStringJson,
    keyEncryptionAlgorithm: AlgorithmIdentifierJson,
    rid: RecipientIdentifierMixedJson,
    version: Double
  ): typingsJapgolly.pkijs.mod.KeyTransRecipientInfoJson = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], rid = rid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.pkijs.mod.KeyTransRecipientInfoJson]
  }
  
  inline def OtherRecipientInfoJson(oriType: String): typingsJapgolly.pkijs.mod.OtherRecipientInfoJson = {
    val __obj = js.Dynamic.literal(oriType = oriType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.pkijs.mod.OtherRecipientInfoJson]
  }
  
  inline def PasswordRecipientInfoJson(encryptedKey: OctetStringJson, keyEncryptionAlgorithm: AlgorithmIdentifierJson, version: Double): typingsJapgolly.pkijs.mod.PasswordRecipientInfoJson = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.pkijs.mod.PasswordRecipientInfoJson]
  }
}
