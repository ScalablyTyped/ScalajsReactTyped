package typingsJapgolly.pkijs.generalNamesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralNames extends js.Object {
  var names: js.Array[typingsJapgolly.pkijs.generalNameMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object GeneralNames {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    names: js.Array[typingsJapgolly.pkijs.generalNameMod.default],
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): GeneralNames = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[GeneralNames]
  }
}

