package typingsJapgolly.wellknown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GeoJSONGeometry = typingsJapgolly.wellknown.mod.GeoJSONPoint | typingsJapgolly.wellknown.mod.GeoJSONMultiPoint | typingsJapgolly.wellknown.mod.GeoJSONLineString | typingsJapgolly.wellknown.mod.GeoJSONMultiLineString | typingsJapgolly.wellknown.mod.GeoJSONPolygon | typingsJapgolly.wellknown.mod.GeoJSONMultiPolygon | scala.Null
  type GeoJSONLineString = typingsJapgolly.wellknown.mod.Geometry[
    typingsJapgolly.wellknown.wellknownStrings.LineString, 
    js.Array[typingsJapgolly.wellknown.mod.GeoJSONPosition]
  ]
  type GeoJSONMultiLineString = typingsJapgolly.wellknown.mod.Geometry[
    typingsJapgolly.wellknown.wellknownStrings.MultiLineString, 
    js.Array[js.Array[typingsJapgolly.wellknown.mod.GeoJSONPosition]]
  ]
  type GeoJSONMultiPoint = typingsJapgolly.wellknown.mod.Geometry[
    typingsJapgolly.wellknown.wellknownStrings.MultiPoint, 
    js.Array[typingsJapgolly.wellknown.mod.GeoJSONPosition]
  ]
  type GeoJSONMultiPolygon = typingsJapgolly.wellknown.mod.Geometry[
    typingsJapgolly.wellknown.wellknownStrings.MultiPolygon, 
    js.Array[js.Array[js.Array[typingsJapgolly.wellknown.mod.GeoJSONPosition]]]
  ]
  type GeoJSONPoint = typingsJapgolly.wellknown.mod.Geometry[
    typingsJapgolly.wellknown.wellknownStrings.Point, 
    typingsJapgolly.wellknown.mod.GeoJSONPosition
  ]
  type GeoJSONPolygon = typingsJapgolly.wellknown.mod.Geometry[
    typingsJapgolly.wellknown.wellknownStrings.Polygon, 
    js.Array[js.Array[typingsJapgolly.wellknown.mod.GeoJSONPosition]]
  ]
  type GeoJSONPosition = (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double])
}
