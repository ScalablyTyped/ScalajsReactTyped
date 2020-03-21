package typingsJapgolly.leafletPolylinedecorator.mod.Symbol

import typingsJapgolly.geojson.mod.LineString
import typingsJapgolly.geojson.mod.MultiLineString
import typingsJapgolly.leaflet.mod.LatLng_
import typingsJapgolly.leaflet.mod.Map_
import typingsJapgolly.leaflet.mod.Point_
import typingsJapgolly.leaflet.mod.Polygon_
import typingsJapgolly.leaflet.mod.Polyline_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Symbol.ArrowHead")
@js.native
class ArrowHead_ () extends js.Object {
  def this(options: ArrowHeadOptions) = this()
  def buildSymbol(dirPoint: Point_, latLngs: js.Array[LatLng_], map: Map_, index: Double, total: Double): Polygon_[_] | (Polyline_[LineString | MultiLineString, _]) = js.native
  def initialize(): Unit = js.native
  def initialize(options: ArrowHeadOptions): Unit = js.native
}

