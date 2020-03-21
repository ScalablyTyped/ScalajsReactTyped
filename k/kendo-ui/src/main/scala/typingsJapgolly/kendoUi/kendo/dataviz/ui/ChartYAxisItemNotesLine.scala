package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartYAxisItemNotesLine extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var dashType: js.UndefOr[String] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ChartYAxisItemNotesLine {
  @scala.inline
  def apply(
    color: String = null,
    dashType: String = null,
    length: Int | Double = null,
    width: Int | Double = null
  ): ChartYAxisItemNotesLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashType != null) __obj.updateDynamic("dashType")(dashType.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartYAxisItemNotesLine]
  }
}

