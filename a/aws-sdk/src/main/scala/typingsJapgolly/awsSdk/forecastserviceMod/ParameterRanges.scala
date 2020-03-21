package typingsJapgolly.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterRanges extends js.Object {
  /**
    * Specifies the tunable range for each categorical hyperparameter.
    */
  var CategoricalParameterRanges: js.UndefOr[typingsJapgolly.awsSdk.forecastserviceMod.CategoricalParameterRanges] = js.native
  /**
    * Specifies the tunable range for each continuous hyperparameter.
    */
  var ContinuousParameterRanges: js.UndefOr[typingsJapgolly.awsSdk.forecastserviceMod.ContinuousParameterRanges] = js.native
  /**
    * Specifies the tunable range for each integer hyperparameter.
    */
  var IntegerParameterRanges: js.UndefOr[typingsJapgolly.awsSdk.forecastserviceMod.IntegerParameterRanges] = js.native
}

object ParameterRanges {
  @scala.inline
  def apply(
    CategoricalParameterRanges: CategoricalParameterRanges = null,
    ContinuousParameterRanges: ContinuousParameterRanges = null,
    IntegerParameterRanges: IntegerParameterRanges = null
  ): ParameterRanges = {
    val __obj = js.Dynamic.literal()
    if (CategoricalParameterRanges != null) __obj.updateDynamic("CategoricalParameterRanges")(CategoricalParameterRanges.asInstanceOf[js.Any])
    if (ContinuousParameterRanges != null) __obj.updateDynamic("ContinuousParameterRanges")(ContinuousParameterRanges.asInstanceOf[js.Any])
    if (IntegerParameterRanges != null) __obj.updateDynamic("IntegerParameterRanges")(IntegerParameterRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRanges]
  }
}

