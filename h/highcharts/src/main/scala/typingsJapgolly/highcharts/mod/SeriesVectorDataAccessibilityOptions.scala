package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesVectorDataAccessibilityOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Provide a description of the data point,
    * announced to screen readers.
    */
  var description: js.UndefOr[String] = js.undefined
}

object SeriesVectorDataAccessibilityOptions {
  @scala.inline
  def apply(description: String = null): SeriesVectorDataAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesVectorDataAccessibilityOptions]
  }
}

