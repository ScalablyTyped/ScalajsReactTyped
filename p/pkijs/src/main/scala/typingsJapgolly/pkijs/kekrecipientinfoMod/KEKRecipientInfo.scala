package typingsJapgolly.pkijs.kekrecipientinfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KEKRecipientInfo extends js.Object {
  var encryptedKey: OctetString
  var kekid: typingsJapgolly.pkijs.kekidentifierMod.default
  var keyEncryptionAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  var preDefinedKEK: scala.scalajs.js.typedarray.ArrayBuffer
  var version: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object KEKRecipientInfo {
  @scala.inline
  def apply(
    encryptedKey: OctetString,
    fromSchema: js.Any => Callback,
    kekid: typingsJapgolly.pkijs.kekidentifierMod.default,
    keyEncryptionAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    preDefinedKEK: scala.scalajs.js.typedarray.ArrayBuffer,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    version: Double
  ): KEKRecipientInfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], kekid = kekid.asInstanceOf[js.Any], keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], preDefinedKEK = preDefinedKEK.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[KEKRecipientInfo]
  }
}

