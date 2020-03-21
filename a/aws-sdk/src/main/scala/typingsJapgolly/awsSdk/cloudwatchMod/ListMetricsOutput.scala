package typingsJapgolly.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMetricsOutput extends js.Object {
  /**
    * The metrics.
    */
  var Metrics: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.Metrics] = js.native
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.NextToken] = js.native
}

object ListMetricsOutput {
  @scala.inline
  def apply(Metrics: Metrics = null, NextToken: NextToken = null): ListMetricsOutput = {
    val __obj = js.Dynamic.literal()
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMetricsOutput]
  }
}

