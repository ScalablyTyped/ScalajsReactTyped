package typingsJapgolly.leafletMarkercluster.mod

import typingsJapgolly.leaflet.mod.FitBoundsOptions
import typingsJapgolly.leaflet.mod.LatLngBounds_
import typingsJapgolly.leaflet.mod.Marker_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "MarkerCluster")
@js.native
class MarkerCluster ()
  extends Marker_[js.Any] {
  /*
    * Recursively retrieve all child markers of this cluster.
    */
  def getAllChildMarkers(): js.Array[Marker_[_]] = js.native
  /*
    * Returns the cluster bounds.
    */
  def getBounds(): LatLngBounds_ = js.native
  /*
    * Returns the count of how many child markers we have.
    */
  def getChildCount(): Double = js.native
  /*
    * Zoom to the minimum of showing all of the child markers, or the extents of this cluster.
    */
  def zoomToBounds(): Unit = js.native
  def zoomToBounds(options: FitBoundsOptions): Unit = js.native
}

