package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartValueAxisItemLabels extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[ChartValueAxisItemLabelsBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[Double | ChartValueAxisItemLabelsMargin] = js.undefined
  var mirror: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[Double | ChartValueAxisItemLabelsPadding] = js.undefined
  var rotation: js.UndefOr[String | Double | ChartValueAxisItemLabelsRotation] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartValueAxisItemLabels {
  @scala.inline
  def apply(
    background: String = null,
    border: ChartValueAxisItemLabelsBorder = null,
    color: String = null,
    font: String = null,
    format: String = null,
    margin: Double | ChartValueAxisItemLabelsMargin = null,
    mirror: js.UndefOr[Boolean] = js.undefined,
    padding: Double | ChartValueAxisItemLabelsPadding = null,
    rotation: String | Double | ChartValueAxisItemLabelsRotation = null,
    skip: Int | Double = null,
    step: Int | Double = null,
    template: String | js.Function = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visual: js.Function = null
  ): ChartValueAxisItemLabels = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (visual != null) __obj.updateDynamic("visual")(visual.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartValueAxisItemLabels]
  }
}

