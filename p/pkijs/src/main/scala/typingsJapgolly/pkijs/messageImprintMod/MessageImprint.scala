package typingsJapgolly.pkijs.messageImprintMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageImprint extends js.Object {
  var hashAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  var hashedMessage: OctetString
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object MessageImprint {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    hashAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    hashedMessage: OctetString,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): MessageImprint = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], hashedMessage = hashedMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[MessageImprint]
  }
}

