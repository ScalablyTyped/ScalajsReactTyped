package typingsJapgolly.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlarmsForMetricOutput extends js.Object {
  /**
    * The information for each alarm with the specified metric.
    */
  var MetricAlarms: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.MetricAlarms] = js.native
}

object DescribeAlarmsForMetricOutput {
  @scala.inline
  def apply(MetricAlarms: MetricAlarms = null): DescribeAlarmsForMetricOutput = {
    val __obj = js.Dynamic.literal()
    if (MetricAlarms != null) __obj.updateDynamic("MetricAlarms")(MetricAlarms.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlarmsForMetricOutput]
  }
}

