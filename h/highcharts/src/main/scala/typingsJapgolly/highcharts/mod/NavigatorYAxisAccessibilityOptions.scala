package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorYAxisAccessibilityOptions extends js.Object {
  /**
    * (Highstock, Gantt) Description for an axis to expose to screen reader
    * users.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Highstock, Gantt) Enable axis accessibility features, including axis
    * information in the screen reader information region. If this is disabled
    * on the xAxis, the x values are not exposed to screen readers for the
    * individual data points by default.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock, Gantt) Range description for an axis. Overrides the default
    * range description. Set to empty to disable range description for this
    * axis.
    */
  var rangeDescription: js.UndefOr[String] = js.undefined
}

object NavigatorYAxisAccessibilityOptions {
  @scala.inline
  def apply(
    description: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    rangeDescription: String = null
  ): NavigatorYAxisAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (rangeDescription != null) __obj.updateDynamic("rangeDescription")(rangeDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorYAxisAccessibilityOptions]
  }
}

