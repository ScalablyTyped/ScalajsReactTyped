package typingsJapgolly.pkijs.policyMappingsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyMappings extends js.Object {
  var mappings: js.Array[typingsJapgolly.pkijs.policyMappingMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PolicyMappings {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    mappings: js.Array[typingsJapgolly.pkijs.policyMappingMod.default],
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): PolicyMappings = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[PolicyMappings]
  }
}

