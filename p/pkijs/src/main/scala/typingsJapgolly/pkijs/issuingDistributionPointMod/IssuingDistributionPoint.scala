package typingsJapgolly.pkijs.issuingDistributionPointMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuingDistributionPoint extends js.Object {
  var distributionPoint: js.UndefOr[
    js.Array[typingsJapgolly.pkijs.generalNameMod.default] | typingsJapgolly.pkijs.relativeDistinguishedNamesMod.default
  ] = js.undefined
  var indirectCRL: Boolean
  var onlyContainsAttributeCerts: Boolean
  var onlyContainsUserCerts: Boolean
  var onlySomeReasons: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object IssuingDistributionPoint {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    indirectCRL: Boolean,
    onlyContainsAttributeCerts: Boolean,
    onlyContainsUserCerts: Boolean,
    onlySomeReasons: Double,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    distributionPoint: js.Array[typingsJapgolly.pkijs.generalNameMod.default] | typingsJapgolly.pkijs.relativeDistinguishedNamesMod.default = null
  ): IssuingDistributionPoint = {
    val __obj = js.Dynamic.literal(indirectCRL = indirectCRL.asInstanceOf[js.Any], onlyContainsAttributeCerts = onlyContainsAttributeCerts.asInstanceOf[js.Any], onlyContainsUserCerts = onlyContainsUserCerts.asInstanceOf[js.Any], onlySomeReasons = onlySomeReasons.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (distributionPoint != null) __obj.updateDynamic("distributionPoint")(distributionPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuingDistributionPoint]
  }
}

