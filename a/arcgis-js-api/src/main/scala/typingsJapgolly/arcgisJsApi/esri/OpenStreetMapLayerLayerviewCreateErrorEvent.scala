package typingsJapgolly.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenStreetMapLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object OpenStreetMapLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): OpenStreetMapLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenStreetMapLayerLayerviewCreateErrorEvent]
  }
}

