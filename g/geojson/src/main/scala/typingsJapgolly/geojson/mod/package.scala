package typingsJapgolly.geojson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BBox = (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple6[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double])
  type GeoJSON = typingsJapgolly.geojson.mod.Geometry | (typingsJapgolly.geojson.mod.Feature[
    typingsJapgolly.geojson.mod.Geometry, 
    typingsJapgolly.geojson.mod.GeoJsonProperties
  ]) | (typingsJapgolly.geojson.mod.FeatureCollection[
    typingsJapgolly.geojson.mod.Geometry, 
    typingsJapgolly.geojson.mod.GeoJsonProperties
  ])
  type GeoJsonGeometryTypes = /* import warning: importer.ImportType#apply Failed type conversion: geojson.geojson.Geometry['type'] */ js.Any
  type GeoJsonProperties = org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null
  type GeoJsonTypes = /* import warning: importer.ImportType#apply Failed type conversion: geojson.geojson.GeoJSON['type'] */ js.Any
  type GeometryObject = typingsJapgolly.geojson.mod.Geometry
  type Position = js.Array[scala.Double]
}
