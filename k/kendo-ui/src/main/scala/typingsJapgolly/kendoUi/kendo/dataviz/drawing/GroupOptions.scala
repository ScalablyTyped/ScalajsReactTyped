package typingsJapgolly.kendoUi.kendo.dataviz.drawing

import typingsJapgolly.kendoUi.kendo.geometry.Transformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends js.Object {
  var clip: js.UndefOr[typingsJapgolly.kendoUi.kendo.drawing.Path] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var pdf: js.UndefOr[typingsJapgolly.kendoUi.kendo.drawing.PDFOptions] = js.undefined
  var tooltip: js.UndefOr[typingsJapgolly.kendoUi.kendo.drawing.TooltipOptions] = js.undefined
  var transform: js.UndefOr[Transformation] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    clip: typingsJapgolly.kendoUi.kendo.drawing.Path = null,
    cursor: String = null,
    name: String = null,
    opacity: Int | Double = null,
    pdf: typingsJapgolly.kendoUi.kendo.drawing.PDFOptions = null,
    tooltip: typingsJapgolly.kendoUi.kendo.drawing.TooltipOptions = null,
    transform: Transformation = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): GroupOptions = {
    val __obj = js.Dynamic.literal()
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOptions]
  }
}

