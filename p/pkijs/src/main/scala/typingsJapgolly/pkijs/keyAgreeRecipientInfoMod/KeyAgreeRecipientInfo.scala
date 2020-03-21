package typingsJapgolly.pkijs.keyAgreeRecipientInfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyAgreeRecipientInfo extends js.Object {
  var keyEncryptionAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  var originator: typingsJapgolly.pkijs.originatorIdentifierOrKeyMod.default
  var recipientCertificate: typingsJapgolly.pkijs.certificateMod.default
  var recipientEncryptedKeys: typingsJapgolly.pkijs.recipientEncryptedKeysMod.default
  var ukm: js.UndefOr[OctetString] = js.undefined
  var version: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object KeyAgreeRecipientInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    keyEncryptionAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    originator: typingsJapgolly.pkijs.originatorIdentifierOrKeyMod.default,
    recipientCertificate: typingsJapgolly.pkijs.certificateMod.default,
    recipientEncryptedKeys: typingsJapgolly.pkijs.recipientEncryptedKeysMod.default,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    version: Double,
    ukm: OctetString = null
  ): KeyAgreeRecipientInfo = {
    val __obj = js.Dynamic.literal(keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], recipientCertificate = recipientCertificate.asInstanceOf[js.Any], recipientEncryptedKeys = recipientEncryptedKeys.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (ukm != null) __obj.updateDynamic("ukm")(ukm.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyAgreeRecipientInfo]
  }
}

