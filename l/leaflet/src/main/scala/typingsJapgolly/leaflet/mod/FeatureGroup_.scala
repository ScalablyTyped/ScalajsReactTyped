package typingsJapgolly.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "FeatureGroup")
@js.native
class FeatureGroup_[P] () extends LayerGroup_[P] {
  /**
    * Brings the layer group to the top [sic] of all other layers
    */
  def bringToBack(): this.type = js.native
  /**
    * Brings the layer group to the top of all other layers
    */
  def bringToFront(): this.type = js.native
  /**
    * Returns the LatLngBounds of the Feature Group (created from
    * bounds and coordinates of its children).
    */
  def getBounds(): LatLngBounds_ = js.native
  /**
    * Sets the given path options to each layer of the group that has a setStyle method.
    */
  def setStyle(style: PathOptions): this.type = js.native
}

