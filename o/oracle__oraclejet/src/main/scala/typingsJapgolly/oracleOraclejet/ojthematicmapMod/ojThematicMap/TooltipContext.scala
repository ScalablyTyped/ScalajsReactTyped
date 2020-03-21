package typingsJapgolly.oracleOraclejet.ojthematicmapMod.ojThematicMap

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext[K1, K2, K3, D1, D2, D3] extends js.Object {
  var color: String | Null
  var componentElement: Element
  var data: js.Object | Null
  var id: K1 | K2 | K3
  var itemData: D1 | D2 | D3
  var label: String | Null
  var location: String | Null
  var locationName: String | Null
  var parentElement: Element
  var tooltip: String
  var x: Double
  var y: Double
}

object TooltipContext {
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](
    componentElement: Element,
    id: K1 | K2 | K3,
    itemData: D1 | D2 | D3,
    parentElement: Element,
    tooltip: String,
    x: Double,
    y: Double,
    color: String = null,
    data: js.Object = null,
    label: String = null,
    location: String = null,
    locationName: String = null
  ): TooltipContext[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (locationName != null) __obj.updateDynamic("locationName")(locationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipContext[K1, K2, K3, D1, D2, D3]]
  }
}

