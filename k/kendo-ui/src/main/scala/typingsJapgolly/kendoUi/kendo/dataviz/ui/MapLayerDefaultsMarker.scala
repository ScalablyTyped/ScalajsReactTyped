package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerDefaultsMarker extends js.Object {
  var opacity: js.UndefOr[Double] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[MapLayerDefaultsMarkerTooltip] = js.undefined
}

object MapLayerDefaultsMarker {
  @scala.inline
  def apply(opacity: Int | Double = null, shape: String = null, tooltip: MapLayerDefaultsMarkerTooltip = null): MapLayerDefaultsMarker = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerDefaultsMarker]
  }
}

