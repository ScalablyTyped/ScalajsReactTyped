package typingsJapgolly.pkijs.infoAccessMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoAccess extends js.Object {
  var accessDescriptions: js.Array[typingsJapgolly.pkijs.accessDescriptionMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object InfoAccess {
  @scala.inline
  def apply(
    accessDescriptions: js.Array[typingsJapgolly.pkijs.accessDescriptionMod.default],
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): InfoAccess = {
    val __obj = js.Dynamic.literal(accessDescriptions = accessDescriptions.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[InfoAccess]
  }
}

