package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerDefaultsBubbleStyle extends js.Object {
  var fill: js.UndefOr[MapLayerDefaultsBubbleStyleFill] = js.undefined
  var stroke: js.UndefOr[MapLayerDefaultsBubbleStyleStroke] = js.undefined
}

object MapLayerDefaultsBubbleStyle {
  @scala.inline
  def apply(fill: MapLayerDefaultsBubbleStyleFill = null, stroke: MapLayerDefaultsBubbleStyleStroke = null): MapLayerDefaultsBubbleStyle = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerDefaultsBubbleStyle]
  }
}

