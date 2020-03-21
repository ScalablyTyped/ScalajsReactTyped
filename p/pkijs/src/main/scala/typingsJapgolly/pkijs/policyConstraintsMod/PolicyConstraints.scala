package typingsJapgolly.pkijs.policyConstraintsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyConstraints extends js.Object {
  var inhibitPolicyMapping: js.UndefOr[Double] = js.undefined
  var requireExplicitPolicy: js.UndefOr[Double] = js.undefined
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PolicyConstraints {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    inhibitPolicyMapping: Int | Double = null,
    requireExplicitPolicy: Int | Double = null
  ): PolicyConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (inhibitPolicyMapping != null) __obj.updateDynamic("inhibitPolicyMapping")(inhibitPolicyMapping.asInstanceOf[js.Any])
    if (requireExplicitPolicy != null) __obj.updateDynamic("requireExplicitPolicy")(requireExplicitPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyConstraints]
  }
}

