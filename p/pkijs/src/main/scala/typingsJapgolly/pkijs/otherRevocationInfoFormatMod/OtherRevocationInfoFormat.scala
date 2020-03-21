package typingsJapgolly.pkijs.otherRevocationInfoFormatMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherRevocationInfoFormat extends js.Object {
  var otherRevInfo: js.Any
  var otherRevInfoFormat: String
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OtherRevocationInfoFormat {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    otherRevInfo: js.Any,
    otherRevInfoFormat: String,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): OtherRevocationInfoFormat = {
    val __obj = js.Dynamic.literal(otherRevInfo = otherRevInfo.asInstanceOf[js.Any], otherRevInfoFormat = otherRevInfoFormat.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[OtherRevocationInfoFormat]
  }
}

