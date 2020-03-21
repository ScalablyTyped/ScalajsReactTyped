package typingsJapgolly.pkijs.passwordRecipientinfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordRecipientinfo extends js.Object {
  var encryptedKey: OctetString
  var keyDerivationAlgorithm: js.UndefOr[typingsJapgolly.pkijs.algorithmIdentifierMod.default] = js.undefined
  var keyEncryptionAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  var password: scala.scalajs.js.typedarray.ArrayBuffer
  var version: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PasswordRecipientinfo {
  @scala.inline
  def apply(
    encryptedKey: OctetString,
    fromSchema: js.Any => Callback,
    keyEncryptionAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    password: scala.scalajs.js.typedarray.ArrayBuffer,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    version: Double,
    keyDerivationAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default = null
  ): PasswordRecipientinfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (keyDerivationAlgorithm != null) __obj.updateDynamic("keyDerivationAlgorithm")(keyDerivationAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordRecipientinfo]
  }
}

