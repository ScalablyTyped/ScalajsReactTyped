package typingsJapgolly.awsSdkClientXrayNode.typesSamplingStatisticSummaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplingStatisticSummary extends js.Object {
  /**
    * <p>The number of requests recorded with borrowed reservoir quota.</p>
    */
  var BorrowCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>The number of requests that matched the rule.</p>
    */
  var RequestCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>The name of the sampling rule.</p>
    */
  var RuleName: js.UndefOr[String] = js.undefined
  /**
    * <p>The number of requests recorded.</p>
    */
  var SampledCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>The start time of the reporting window.</p>
    */
  var Timestamp: js.UndefOr[js.Date | String | Double] = js.undefined
}

object SamplingStatisticSummary {
  @scala.inline
  def apply(
    BorrowCount: Int | Double = null,
    RequestCount: Int | Double = null,
    RuleName: String = null,
    SampledCount: Int | Double = null,
    Timestamp: js.Date | String | Double = null
  ): SamplingStatisticSummary = {
    val __obj = js.Dynamic.literal()
    if (BorrowCount != null) __obj.updateDynamic("BorrowCount")(BorrowCount.asInstanceOf[js.Any])
    if (RequestCount != null) __obj.updateDynamic("RequestCount")(RequestCount.asInstanceOf[js.Any])
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName.asInstanceOf[js.Any])
    if (SampledCount != null) __obj.updateDynamic("SampledCount")(SampledCount.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingStatisticSummary]
  }
}

