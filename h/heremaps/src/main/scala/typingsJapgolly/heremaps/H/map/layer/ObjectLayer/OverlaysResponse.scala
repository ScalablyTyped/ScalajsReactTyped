package typingsJapgolly.heremaps.H.map.layer.ObjectLayer

import typingsJapgolly.heremaps.H.map.Overlay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response object returned by the H.map.layer.ObjectLayer#requestOverlays function.
  * @property total {number} - The total number of overlays within the requested bounds, inclusive overlays which are not ready loaded yet
  * @property overlays {Array<H.map.Overlay>} - A list all overlays which are ready to render
  */
trait OverlaysResponse extends js.Object {
  var overlays: js.Array[Overlay]
  var total: Double
}

object OverlaysResponse {
  @scala.inline
  def apply(overlays: js.Array[Overlay], total: Double): OverlaysResponse = {
    val __obj = js.Dynamic.literal(overlays = overlays.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OverlaysResponse]
  }
}

