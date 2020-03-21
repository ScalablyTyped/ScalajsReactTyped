package typingsJapgolly.pkijs.recipientKeyIdentifierMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.GeneralizedTime
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientKeyIdentifier extends js.Object {
  var date: js.UndefOr[GeneralizedTime] = js.undefined
  var other: js.UndefOr[typingsJapgolly.pkijs.otherKeyAttributeMod.default] = js.undefined
  var subjectKeyIdentifier: OctetString
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RecipientKeyIdentifier {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    subjectKeyIdentifier: OctetString,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    date: GeneralizedTime = null,
    other: typingsJapgolly.pkijs.otherKeyAttributeMod.default = null
  ): RecipientKeyIdentifier = {
    val __obj = js.Dynamic.literal(subjectKeyIdentifier = subjectKeyIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientKeyIdentifier]
  }
}

