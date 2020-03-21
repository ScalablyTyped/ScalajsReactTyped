package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionUpdate extends js.Object {
  /** The count of the number of elements present in the distribution. */
  var count: js.UndefOr[SplitInt64] = js.undefined
  /** (Optional) Histogram of value counts for the distribution. */
  var histogram: js.UndefOr[Histogram] = js.undefined
  /** The maximum value present in the distribution. */
  var max: js.UndefOr[SplitInt64] = js.undefined
  /** The minimum value present in the distribution. */
  var min: js.UndefOr[SplitInt64] = js.undefined
  /**
    * Use an int64 since we'd prefer the added precision. If overflow is a common
    * problem we can detect it and use an additional int64 or a double.
    */
  var sum: js.UndefOr[SplitInt64] = js.undefined
  /** Use a double since the sum of squares is likely to overflow int64. */
  var sumOfSquares: js.UndefOr[Double] = js.undefined
}

object DistributionUpdate {
  @scala.inline
  def apply(
    count: SplitInt64 = null,
    histogram: Histogram = null,
    max: SplitInt64 = null,
    min: SplitInt64 = null,
    sum: SplitInt64 = null,
    sumOfSquares: Int | Double = null
  ): DistributionUpdate = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (histogram != null) __obj.updateDynamic("histogram")(histogram.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(sum.asInstanceOf[js.Any])
    if (sumOfSquares != null) __obj.updateDynamic("sumOfSquares")(sumOfSquares.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionUpdate]
  }
}

