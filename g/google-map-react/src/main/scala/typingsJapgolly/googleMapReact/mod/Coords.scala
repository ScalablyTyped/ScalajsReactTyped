package typingsJapgolly.googleMapReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coords extends js.Object {
  var lat: Double
  var lng: Double
}

object Coords {
  @scala.inline
  def apply(lat: Double, lng: Double): Coords = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Coords]
  }
}

