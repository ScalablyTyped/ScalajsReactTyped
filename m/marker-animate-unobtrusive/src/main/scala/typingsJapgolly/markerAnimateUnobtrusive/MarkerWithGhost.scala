package typingsJapgolly.markerAnimateUnobtrusive

import typingsJapgolly.googlemaps.google.maps.LatLng
import typingsJapgolly.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MarkerWithGhost")
@js.native
class MarkerWithGhost () extends SlidingMarker {
  def getGhostAnimationPosition(): LatLng = js.native
  def getGhostPosition(): LatLng = js.native
  def setGhostPosition(ghostPosition: LatLng): Unit = js.native
  def setGhostPosition(ghostPosition: LatLngLiteral): Unit = js.native
}

