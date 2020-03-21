package typingsJapgolly.pkijs.recipientInfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientInfo extends js.Object {
  var value: js.Any
  var variant: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RecipientInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    value: js.Any,
    variant: Double
  ): RecipientInfo = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[RecipientInfo]
  }
}

