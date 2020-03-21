package typingsJapgolly.pkijs.keyTransRecipientInfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyTransRecipientInfo extends js.Object {
  var encryptedKey: OctetString
  var keyEncryptionAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  /**
    * For some reasons we need to store recipient's certificate here
    * 
    * @type {Certificate}
    * @memberOf KeyTransRecipientInfo
    */
  var recipientCertificate: typingsJapgolly.pkijs.certificateMod.default
  var rid: typingsJapgolly.pkijs.recipientIdentifierMod.default
  var version: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object KeyTransRecipientInfo {
  @scala.inline
  def apply(
    encryptedKey: OctetString,
    fromSchema: js.Any => Callback,
    keyEncryptionAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    recipientCertificate: typingsJapgolly.pkijs.certificateMod.default,
    rid: typingsJapgolly.pkijs.recipientIdentifierMod.default,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    version: Double
  ): KeyTransRecipientInfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], recipientCertificate = recipientCertificate.asInstanceOf[js.Any], rid = rid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[KeyTransRecipientInfo]
  }
}

