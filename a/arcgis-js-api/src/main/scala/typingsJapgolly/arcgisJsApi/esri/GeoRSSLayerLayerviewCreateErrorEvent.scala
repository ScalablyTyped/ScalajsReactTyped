package typingsJapgolly.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoRSSLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object GeoRSSLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): GeoRSSLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeoRSSLayerLayerviewCreateErrorEvent]
  }
}

