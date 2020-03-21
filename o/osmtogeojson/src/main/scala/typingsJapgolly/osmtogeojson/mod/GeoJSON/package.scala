package typingsJapgolly.osmtogeojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GeoJSON {
  type Coordinate = typingsJapgolly.osmtogeojson.mod.GeoJSON.Coordinate2d | typingsJapgolly.osmtogeojson.mod.GeoJSON.Coordinate3d
  type Coordinate2d = js.Tuple2[scala.Double, scala.Double]
  type Coordinate3d = js.Tuple3[scala.Double, scala.Double, scala.Double]
}
