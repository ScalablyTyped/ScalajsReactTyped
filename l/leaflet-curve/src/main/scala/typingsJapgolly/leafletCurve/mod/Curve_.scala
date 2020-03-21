package typingsJapgolly.leafletCurve.mod

import typingsJapgolly.leaflet.mod.LatLngBounds_
import typingsJapgolly.leaflet.mod.LatLng_
import typingsJapgolly.leaflet.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Curve")
@js.native
class Curve_ () extends Path {
  /*
    * Get bounds
    */
  def getBounds(): LatLngBounds_ = js.native
  /*
    * Get center
    */
  def getCenter(): LatLng_ = js.native
  /*
    * Return path
    */
  def getPath(): js.Array[String | js.Array[js.Array[js.Any]]] = js.native
  /*
    * Set path
    */
  def setPath(): Curve_ = js.native
}

