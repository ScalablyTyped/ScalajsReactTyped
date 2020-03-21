package typingsJapgolly.amapJsApi.AMap.LabelsLayer

import typingsJapgolly.amapJsApi.AMap.LngLat
import typingsJapgolly.amapJsApi.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelsLayerEvent[I] extends js.Object {
  var data: EventData
  var lnglat: LngLat
  var pixel: Pixel
  var target: I
}

object LabelsLayerEvent {
  @scala.inline
  def apply[I](data: EventData, lnglat: LngLat, pixel: Pixel, target: I): LabelsLayerEvent[I] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lnglat = lnglat.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LabelsLayerEvent[I]]
  }
}

