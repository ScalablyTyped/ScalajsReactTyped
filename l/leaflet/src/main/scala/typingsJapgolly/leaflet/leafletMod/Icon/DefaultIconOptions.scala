package typingsJapgolly.leaflet.leafletMod.Icon

import typingsJapgolly.leaflet.leafletMod.BaseIconOptions
import typingsJapgolly.leaflet.leafletMod.PointExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultIconOptions extends BaseIconOptions {
  var imagePath: js.UndefOr[String] = js.undefined
}

object DefaultIconOptions {
  @scala.inline
  def apply(
    attribution: String = null,
    className: String = null,
    iconAnchor: PointExpression = null,
    iconRetinaUrl: String = null,
    iconSize: PointExpression = null,
    iconUrl: String = null,
    imagePath: String = null,
    pane: String = null,
    popupAnchor: PointExpression = null,
    shadowAnchor: PointExpression = null,
    shadowRetinaUrl: String = null,
    shadowSize: PointExpression = null,
    shadowUrl: String = null,
    tooltipAnchor: PointExpression = null
  ): DefaultIconOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (iconAnchor != null) __obj.updateDynamic("iconAnchor")(iconAnchor.asInstanceOf[js.Any])
    if (iconRetinaUrl != null) __obj.updateDynamic("iconRetinaUrl")(iconRetinaUrl.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (imagePath != null) __obj.updateDynamic("imagePath")(imagePath.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (popupAnchor != null) __obj.updateDynamic("popupAnchor")(popupAnchor.asInstanceOf[js.Any])
    if (shadowAnchor != null) __obj.updateDynamic("shadowAnchor")(shadowAnchor.asInstanceOf[js.Any])
    if (shadowRetinaUrl != null) __obj.updateDynamic("shadowRetinaUrl")(shadowRetinaUrl.asInstanceOf[js.Any])
    if (shadowSize != null) __obj.updateDynamic("shadowSize")(shadowSize.asInstanceOf[js.Any])
    if (shadowUrl != null) __obj.updateDynamic("shadowUrl")(shadowUrl.asInstanceOf[js.Any])
    if (tooltipAnchor != null) __obj.updateDynamic("tooltipAnchor")(tooltipAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultIconOptions]
  }
}

