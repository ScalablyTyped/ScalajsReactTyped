package typingsJapgolly.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMetricWidgetImageOutput extends js.Object {
  /**
    * The image of the graph, in the output format specified.
    */
  var MetricWidgetImage: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.MetricWidgetImage] = js.native
}

object GetMetricWidgetImageOutput {
  @scala.inline
  def apply(MetricWidgetImage: MetricWidgetImage = null): GetMetricWidgetImageOutput = {
    val __obj = js.Dynamic.literal()
    if (MetricWidgetImage != null) __obj.updateDynamic("MetricWidgetImage")(MetricWidgetImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricWidgetImageOutput]
  }
}

