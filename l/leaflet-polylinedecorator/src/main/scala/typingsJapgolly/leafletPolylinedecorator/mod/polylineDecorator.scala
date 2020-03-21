package typingsJapgolly.leafletPolylinedecorator.mod

import typingsJapgolly.geojson.mod.LineString
import typingsJapgolly.geojson.mod.MultiLineString
import typingsJapgolly.leaflet.mod.Polyline_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "polylineDecorator")
@js.native
object polylineDecorator extends js.Object {
  def apply(
    paths: (Polyline_[LineString | MultiLineString, _]) | (js.Array[Polyline_[LineString | MultiLineString, _]])
  ): PolylineDecorator_ = js.native
  def apply(
    paths: (Polyline_[LineString | MultiLineString, _]) | (js.Array[Polyline_[LineString | MultiLineString, _]]),
    options: PolylineDecoratorOptions
  ): PolylineDecorator_ = js.native
}

