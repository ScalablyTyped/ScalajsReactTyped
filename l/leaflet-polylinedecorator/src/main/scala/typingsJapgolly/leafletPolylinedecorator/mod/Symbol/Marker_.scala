package typingsJapgolly.leafletPolylinedecorator.mod.Symbol

import typingsJapgolly.leaflet.mod.LatLng_
import typingsJapgolly.leaflet.mod.Map_
import typingsJapgolly.leaflet.mod.Point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Symbol.Marker")
@js.native
class Marker_ () extends js.Object {
  def this(options: MarkerOptions) = this()
  def buildSymbol(dirPoint: Point_, latLngs: js.Array[LatLng_], map: Map_, index: Double, total: Double): Marker_ = js.native
  def initialize(): Unit = js.native
  def initialize(options: MarkerOptions): Unit = js.native
}

