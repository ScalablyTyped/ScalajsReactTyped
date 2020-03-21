package typingsJapgolly.pkijs.recipientEncryptedKeyMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientEncryptedKey extends js.Object {
  var encryptedKey: OctetString
  var rid: typingsJapgolly.pkijs.keyAgreeRecipientIdentifierMod.default
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RecipientEncryptedKey {
  @scala.inline
  def apply(
    encryptedKey: OctetString,
    fromSchema: js.Any => Callback,
    rid: typingsJapgolly.pkijs.keyAgreeRecipientIdentifierMod.default,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): RecipientEncryptedKey = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], rid = rid.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[RecipientEncryptedKey]
  }
}

