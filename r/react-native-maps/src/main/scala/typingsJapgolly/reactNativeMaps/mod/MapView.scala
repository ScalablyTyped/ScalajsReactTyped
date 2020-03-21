package typingsJapgolly.reactNativeMaps.mod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNativeMaps.AnonAnimated
import typingsJapgolly.reactNativeMaps.AnonDuration
import typingsJapgolly.reactNativeMaps.AnonNorthEast
import typingsJapgolly.reactNativeMaps.PartialCamera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapView
  extends Component[MapViewProps, js.Any, js.Any] {
  def animateCamera(camera: PartialCamera): Unit = js.native
  def animateCamera(camera: PartialCamera, opts: AnonDuration): Unit = js.native
  def animateToBearing(bearing: Double): Unit = js.native
  def animateToBearing(bearing: Double, duration: Double): Unit = js.native
  def animateToCoordinate(latLng: LatLng): Unit = js.native
  def animateToCoordinate(latLng: LatLng, duration: Double): Unit = js.native
  def animateToNavigation(location: LatLng, bearing: Double, angle: Double): Unit = js.native
  def animateToNavigation(location: LatLng, bearing: Double, angle: Double, duration: Double): Unit = js.native
  def animateToRegion(region: Region): Unit = js.native
  def animateToRegion(region: Region, duration: Double): Unit = js.native
  def animateToViewingAngle(angle: Double): Unit = js.native
  def animateToViewingAngle(angle: Double, duration: Double): Unit = js.native
  def coordinateForPoint(point: Point): js.Promise[LatLng] = js.native
  def fitToCoordinates(): Unit = js.native
  def fitToCoordinates(coordinates: js.Array[LatLng]): Unit = js.native
  def fitToCoordinates(coordinates: js.Array[LatLng], options: AnonAnimated): Unit = js.native
  def fitToElements(animated: Boolean): Unit = js.native
  def fitToSuppliedMarkers(markers: js.Array[String]): Unit = js.native
  def fitToSuppliedMarkers(markers: js.Array[String], options: AnonAnimated): Unit = js.native
  def getCamera(): js.Promise[Camera] = js.native
  def getMapBoundaries(): js.Promise[AnonNorthEast] = js.native
  def pointForCoordinate(coordinate: LatLng): js.Promise[Point] = js.native
  def setCamera(camera: PartialCamera): Unit = js.native
  def setMapBoundaries(northEast: LatLng, southWest: LatLng): Unit = js.native
  def takeSnapshot(): js.Promise[String] = js.native
  def takeSnapshot(options: SnapshotOptions): js.Promise[String] = js.native
}

