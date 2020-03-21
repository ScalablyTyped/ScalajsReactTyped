package typingsJapgolly.kendoUi.kendo.dataviz.drawing

import typingsJapgolly.kendoUi.kendo.geometry.Transformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextOptions extends js.Object {
  var clip: js.UndefOr[typingsJapgolly.kendoUi.kendo.drawing.Path] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var fill: js.UndefOr[typingsJapgolly.kendoUi.kendo.drawing.FillOptions] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[typingsJapgolly.kendoUi.kendo.drawing.StrokeOptions] = js.undefined
  var tooltip: js.UndefOr[typingsJapgolly.kendoUi.kendo.drawing.TooltipOptions] = js.undefined
  var transform: js.UndefOr[Transformation] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object TextOptions {
  @scala.inline
  def apply(
    clip: typingsJapgolly.kendoUi.kendo.drawing.Path = null,
    cursor: String = null,
    fill: typingsJapgolly.kendoUi.kendo.drawing.FillOptions = null,
    font: String = null,
    name: String = null,
    opacity: Int | Double = null,
    stroke: typingsJapgolly.kendoUi.kendo.drawing.StrokeOptions = null,
    tooltip: typingsJapgolly.kendoUi.kendo.drawing.TooltipOptions = null,
    transform: Transformation = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): TextOptions = {
    val __obj = js.Dynamic.literal()
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextOptions]
  }
}

