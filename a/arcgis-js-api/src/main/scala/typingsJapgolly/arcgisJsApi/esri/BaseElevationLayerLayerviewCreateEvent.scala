package typingsJapgolly.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseElevationLayerLayerviewCreateEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object BaseElevationLayerLayerviewCreateEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): BaseElevationLayerLayerviewCreateEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseElevationLayerLayerviewCreateEvent]
  }
}

