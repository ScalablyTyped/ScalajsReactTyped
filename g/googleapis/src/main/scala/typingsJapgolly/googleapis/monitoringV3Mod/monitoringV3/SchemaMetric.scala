package typingsJapgolly.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specific metric, identified by specifying values for all of the labels of
  * a MetricDescriptor.
  */
@js.native
trait SchemaMetric extends js.Object {
  /**
    * The set of label values that uniquely identify this metric. All labels
    * listed in the MetricDescriptor must be assigned values.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * An existing metric type, see google.api.MetricDescriptor. For example,
    * custom.googleapis.com/invoice/paid/amount.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaMetric {
  @scala.inline
  def apply(labels: StringDictionary[String] = null, `type`: String = null): SchemaMetric = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetric]
  }
}

