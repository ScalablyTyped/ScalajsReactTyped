package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartYAxisItemLabelsRotation extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var angle: js.UndefOr[Double] = js.undefined
}

object ChartYAxisItemLabelsRotation {
  @scala.inline
  def apply(align: String = null, angle: Int | Double = null): ChartYAxisItemLabelsRotation = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartYAxisItemLabelsRotation]
  }
}

