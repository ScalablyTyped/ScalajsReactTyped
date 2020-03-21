package typingsJapgolly.pkijs.distributionPointMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.BitString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionPoint extends js.Object {
  var cRLIssuer: js.UndefOr[js.Array[typingsJapgolly.pkijs.generalNameMod.default]] = js.undefined
  var distributionPoint: js.UndefOr[js.Array[typingsJapgolly.pkijs.generalNameMod.default]] = js.undefined
  var reasons: js.UndefOr[BitString] = js.undefined
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object DistributionPoint {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    cRLIssuer: js.Array[typingsJapgolly.pkijs.generalNameMod.default] = null,
    distributionPoint: js.Array[typingsJapgolly.pkijs.generalNameMod.default] = null,
    reasons: BitString = null
  ): DistributionPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (cRLIssuer != null) __obj.updateDynamic("cRLIssuer")(cRLIssuer.asInstanceOf[js.Any])
    if (distributionPoint != null) __obj.updateDynamic("distributionPoint")(distributionPoint.asInstanceOf[js.Any])
    if (reasons != null) __obj.updateDynamic("reasons")(reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionPoint]
  }
}

