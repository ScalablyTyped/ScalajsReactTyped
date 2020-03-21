package typingsJapgolly.proj4leaflet.mod.leafletAugmentingMod.Proj

import typingsJapgolly.leaflet.mod.Bounds_
import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leaflet.mod.LatLngLiteral
import typingsJapgolly.leaflet.mod.LatLng_
import typingsJapgolly.leaflet.mod.PointExpression
import typingsJapgolly.leaflet.mod.Point_
import typingsJapgolly.leaflet.mod.Projection
import typingsJapgolly.leaflet.mod.Transformation
import typingsJapgolly.proj4.mod.InterfaceProjection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Proj.CRS")
@js.native
class CRS protected () extends js.Object {
  def this(projection: InterfaceProjection) = this()
  def this(code: String, proj4def: String) = this()
  def this(projection: InterfaceProjection, options: ProjCRSOptions) = this()
  def this(code: String, proj4def: String, options: ProjCRSOptions) = this()
  var code: js.UndefOr[String] = js.native
  var infinite: Boolean = js.native
  var projection: Projection = js.native
  var transformation: Transformation = js.native
  var wrapLat: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var wrapLng: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  def distance(latlng1: LatLngExpression, latlng2: LatLngExpression): Double = js.native
  def getProjectedBounds(zoom: Double): Bounds_ = js.native
  def latLngToPoint(latlng: LatLngExpression, zoom: Double): Point_ = js.native
  def pointToLatLng(point: PointExpression, zoom: Double): LatLng_ = js.native
  def project(latlng: LatLngLiteral): Point_ = js.native
  def project(latlng: LatLng_): Point_ = js.native
  def scale(zoom: Double): Double = js.native
  def unproject(point: PointExpression): LatLng_ = js.native
  def wrapLatLng(latlng: LatLngLiteral): LatLng_ = js.native
  def wrapLatLng(latlng: LatLng_): LatLng_ = js.native
  def zoom(scale: Double): Double = js.native
}

