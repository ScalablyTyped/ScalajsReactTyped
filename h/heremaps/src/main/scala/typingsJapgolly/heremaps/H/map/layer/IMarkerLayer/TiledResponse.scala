package typingsJapgolly.heremaps.H.map.layer.IMarkerLayer

import typingsJapgolly.heremaps.H.map.AbstractMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type represents a response object returned by the H.map.layer.IMarkerLayer#requestMarkers function.
  * @property number {number} - of returned tiles
  * @property requested {number} - number of requested tiles
  * @property objects {Array<H.map.AbstractMarker>} - the marker objects within requested tiled area
  */
trait TiledResponse extends js.Object {
  var number: Double
  var objects: js.Array[AbstractMarker]
  var requested: Double
}

object TiledResponse {
  @scala.inline
  def apply(number: Double, objects: js.Array[AbstractMarker], requested: Double): TiledResponse = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], requested = requested.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TiledResponse]
  }
}

