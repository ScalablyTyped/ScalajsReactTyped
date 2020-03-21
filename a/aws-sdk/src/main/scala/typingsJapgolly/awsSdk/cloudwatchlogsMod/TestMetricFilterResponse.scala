package typingsJapgolly.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestMetricFilterResponse extends js.Object {
  /**
    * The matched events.
    */
  var matches: js.UndefOr[MetricFilterMatches] = js.native
}

object TestMetricFilterResponse {
  @scala.inline
  def apply(matches: MetricFilterMatches = null): TestMetricFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMetricFilterResponse]
  }
}

