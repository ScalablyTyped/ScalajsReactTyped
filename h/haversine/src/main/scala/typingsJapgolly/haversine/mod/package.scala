package typingsJapgolly.haversine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.haversine.mod.CoordinateLongitudeLatitude
    - typingsJapgolly.haversine.mod.CoordinateLonLat
    - typingsJapgolly.haversine.mod.CoordinateLatLng
    - typingsJapgolly.haversine.mod.LatLonTuple
    - typingsJapgolly.haversine.mod.GeoJSON
  */
  type Coordinate = typingsJapgolly.haversine.mod._Coordinate | typingsJapgolly.haversine.mod.LatLonTuple
  type LatLonTuple = js.Tuple2[scala.Double, scala.Double]
  // The input & output types of haversine() both depend on the Options object.
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.haversine.mod.Coordinate
    - typingsJapgolly.haversine.mod.GeoJSON
    - typingsJapgolly.haversine.mod.CoordinateLatLng
    - typingsJapgolly.haversine.mod.CoordinateLonLat
    - js.Tuple2[scala.Double, scala.Double]
    - typingsJapgolly.haversine.mod.CoordinateLongitudeLatitude
  */
  type ParamType[T /* <: js.UndefOr[typingsJapgolly.haversine.mod.Options] */] = typingsJapgolly.haversine.mod._ParamType[T] | (js.Tuple2[scala.Double, scala.Double]) | typingsJapgolly.haversine.mod.LatLonTuple
  type Return[T /* <: js.UndefOr[typingsJapgolly.haversine.mod.Options] */] = scala.Double | scala.Boolean
}
