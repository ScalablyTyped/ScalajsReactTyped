package typingsJapgolly.pkijs.otherRecipientInfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherRecipientInfo extends js.Object {
  var oriType: String
  var oriValue: js.Any
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OtherRecipientInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    oriType: String,
    oriValue: js.Any,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): OtherRecipientInfo = {
    val __obj = js.Dynamic.literal(oriType = oriType.asInstanceOf[js.Any], oriValue = oriValue.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[OtherRecipientInfo]
  }
}

