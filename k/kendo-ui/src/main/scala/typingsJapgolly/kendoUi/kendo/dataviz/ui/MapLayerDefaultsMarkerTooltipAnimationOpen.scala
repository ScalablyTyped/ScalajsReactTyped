package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerDefaultsMarkerTooltipAnimationOpen extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var effects: js.UndefOr[String] = js.undefined
}

object MapLayerDefaultsMarkerTooltipAnimationOpen {
  @scala.inline
  def apply(duration: Int | Double = null, effects: String = null): MapLayerDefaultsMarkerTooltipAnimationOpen = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (effects != null) __obj.updateDynamic("effects")(effects.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerDefaultsMarkerTooltipAnimationOpen]
  }
}

