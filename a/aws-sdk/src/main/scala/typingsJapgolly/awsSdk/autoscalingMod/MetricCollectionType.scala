package typingsJapgolly.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricCollectionType extends js.Object {
  /**
    * One of the following metrics:    GroupMinSize     GroupMaxSize     GroupDesiredCapacity     GroupInServiceInstances     GroupPendingInstances     GroupStandbyInstances     GroupTerminatingInstances     GroupTotalInstances   
    */
  var Metric: js.UndefOr[XmlStringMaxLen255] = js.native
}

object MetricCollectionType {
  @scala.inline
  def apply(Metric: XmlStringMaxLen255 = null): MetricCollectionType = {
    val __obj = js.Dynamic.literal()
    if (Metric != null) __obj.updateDynamic("Metric")(Metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricCollectionType]
  }
}

