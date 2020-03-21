package typingsJapgolly.pkijs.kekidentifierMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.GeneralizedTime
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KEKIdentifier extends js.Object {
  var date: js.UndefOr[GeneralizedTime] = js.undefined
  var keyIdentifier: OctetString
  var other: js.UndefOr[typingsJapgolly.pkijs.otherKeyAttributeMod.default] = js.undefined
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object KEKIdentifier {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    keyIdentifier: OctetString,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    date: GeneralizedTime = null,
    other: typingsJapgolly.pkijs.otherKeyAttributeMod.default = null
  ): KEKIdentifier = {
    val __obj = js.Dynamic.literal(keyIdentifier = keyIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    __obj.asInstanceOf[KEKIdentifier]
  }
}

