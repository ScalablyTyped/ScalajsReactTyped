package typingsJapgolly.pkijs.generalSubtreeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralSubtree extends js.Object {
  var base: typingsJapgolly.pkijs.generalNameMod.default
  var maximum: js.UndefOr[Double | Integer] = js.undefined
  var minimum: Double | Integer
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object GeneralSubtree {
  @scala.inline
  def apply(
    base: typingsJapgolly.pkijs.generalNameMod.default,
    fromSchema: js.Any => Callback,
    minimum: Double | Integer,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    maximum: Double | Integer = null
  ): GeneralSubtree = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralSubtree]
  }
}

