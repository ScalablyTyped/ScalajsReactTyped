package typingsJapgolly.pkijs.recipientEncryptedKeysMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientEncryptedKeys extends js.Object {
  var encryptedKeys: js.Array[typingsJapgolly.pkijs.recipientEncryptedKeyMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RecipientEncryptedKeys {
  @scala.inline
  def apply(
    encryptedKeys: js.Array[typingsJapgolly.pkijs.recipientEncryptedKeyMod.default],
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): RecipientEncryptedKeys = {
    val __obj = js.Dynamic.literal(encryptedKeys = encryptedKeys.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[RecipientEncryptedKeys]
  }
}

