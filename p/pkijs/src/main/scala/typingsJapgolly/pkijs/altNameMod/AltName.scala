package typingsJapgolly.pkijs.altNameMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AltName extends js.Object {
  var altNames: js.Array[typingsJapgolly.pkijs.generalNameMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object AltName {
  @scala.inline
  def apply(
    altNames: js.Array[typingsJapgolly.pkijs.generalNameMod.default],
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): AltName = {
    val __obj = js.Dynamic.literal(altNames = altNames.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[AltName]
  }
}

