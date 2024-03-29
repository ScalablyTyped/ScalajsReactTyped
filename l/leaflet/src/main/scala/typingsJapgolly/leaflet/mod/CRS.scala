package typingsJapgolly.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CRS extends StObject {
  
  var code: js.UndefOr[String] = js.native
  
  def distance(latlng1: LatLngExpression, latlng2: LatLngExpression): Double = js.native
  
  def getProjectedBounds(zoom: Double): Bounds_ = js.native
  
  var infinite: Boolean = js.native
  
  def latLngToPoint(latlng: LatLngExpression, zoom: Double): Point_ = js.native
  
  def pointToLatLng(point: PointExpression, zoom: Double): LatLng_ = js.native
  
  def project(latlng: LatLngLiteral): Point_ = js.native
  def project(latlng: LatLng_): Point_ = js.native
  
  def scale(zoom: Double): Double = js.native
  
  def unproject(point: PointExpression): LatLng_ = js.native
  
  var wrapLat: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  def wrapLatLng(latlng: LatLngLiteral): LatLng_ = js.native
  def wrapLatLng(latlng: LatLng_): LatLng_ = js.native
  
  var wrapLng: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  def zoom(scale: Double): Double = js.native
}
object CRS {
  
  @JSImport("leaflet", "CRS.EPSG3395")
  @js.native
  val EPSG3395: CRS = js.native
  
  @JSImport("leaflet", "CRS.EPSG3857")
  @js.native
  val EPSG3857: CRS = js.native
  
  @JSImport("leaflet", "CRS.EPSG4326")
  @js.native
  val EPSG4326: CRS = js.native
  
  @JSImport("leaflet", "CRS.EPSG900913")
  @js.native
  val EPSG900913: CRS = js.native
  
  @JSImport("leaflet", "CRS.Earth")
  @js.native
  val Earth: CRS = js.native
  
  @JSImport("leaflet", "CRS.Simple")
  @js.native
  val Simple: CRS = js.native
}
