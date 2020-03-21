package typingsJapgolly.leafletImageoverlayRotated.mod

import typingsJapgolly.leaflet.mod.LatLngExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "ImageOverlay")
@js.native
object ImageOverlay_ extends js.Object {
  @js.native
  trait Rotated
    extends typingsJapgolly.leaflet.mod.ImageOverlay_ {
    def reposition(topleft: LatLngExpression, topright: LatLngExpression, bottomleft: LatLngExpression): Unit = js.native
  }
  
}

