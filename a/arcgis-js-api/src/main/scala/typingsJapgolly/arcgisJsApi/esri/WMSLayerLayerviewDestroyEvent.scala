package typingsJapgolly.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMSLayerLayerviewDestroyEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object WMSLayerLayerviewDestroyEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): WMSLayerLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WMSLayerLayerviewDestroyEvent]
  }
}

