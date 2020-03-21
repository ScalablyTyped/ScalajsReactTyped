package typingsJapgolly.pkijs.crldistributionpointsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CRLDistributionPoints extends js.Object {
  var distributionPoints: js.Array[typingsJapgolly.pkijs.distributionPointMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object CRLDistributionPoints {
  @scala.inline
  def apply(
    distributionPoints: js.Array[typingsJapgolly.pkijs.distributionPointMod.default],
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): CRLDistributionPoints = {
    val __obj = js.Dynamic.literal(distributionPoints = distributionPoints.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[CRLDistributionPoints]
  }
}

