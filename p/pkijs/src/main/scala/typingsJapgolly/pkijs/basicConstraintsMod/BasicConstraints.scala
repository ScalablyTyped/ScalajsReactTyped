package typingsJapgolly.pkijs.basicConstraintsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicConstraints extends js.Object {
  var cA: Boolean
  var pathLenConstraint: Double | Integer
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object BasicConstraints {
  @scala.inline
  def apply(
    cA: Boolean,
    fromSchema: js.Any => Callback,
    pathLenConstraint: Double | Integer,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): BasicConstraints = {
    val __obj = js.Dynamic.literal(cA = cA.asInstanceOf[js.Any], pathLenConstraint = pathLenConstraint.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[BasicConstraints]
  }
}

