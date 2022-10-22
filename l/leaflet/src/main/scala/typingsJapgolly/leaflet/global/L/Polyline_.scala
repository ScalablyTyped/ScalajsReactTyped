package typingsJapgolly.leaflet.global.L

import typingsJapgolly.geojson.mod.GeometryObject
import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leaflet.mod.PolylineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("L.Polyline")
@js.native
open class Polyline_[T /* <: GeometryObject */, P] protected ()
  extends typingsJapgolly.leaflet.mod.Polyline_[T, P] {
  def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]) = this()
  def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions) = this()
}
