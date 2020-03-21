package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object geoJSONMod {
  type GeoJSONFeature = typingsJapgolly.geojson.mod.Feature[
    typingsJapgolly.geojson.mod.Geometry, 
    typingsJapgolly.geojson.mod.GeoJsonProperties
  ]
  type GeoJSONFeatureCollection = typingsJapgolly.geojson.mod.FeatureCollection[
    typingsJapgolly.geojson.mod.Geometry, 
    typingsJapgolly.geojson.mod.GeoJsonProperties
  ]
  type GeoJSONGeometry = typingsJapgolly.geojson.mod.Geometry
  type GeoJSONGeometryCollection = typingsJapgolly.geojson.mod.GeometryCollection
  type GeoJSONLineString = typingsJapgolly.geojson.mod.LineString
  type GeoJSONMultiLineString = typingsJapgolly.geojson.mod.MultiLineString
  type GeoJSONMultiPoint = typingsJapgolly.geojson.mod.MultiPoint
  type GeoJSONMultiPolygon = typingsJapgolly.geojson.mod.MultiPolygon
  type GeoJSONObject = typingsJapgolly.geojson.mod.GeoJSON
  type GeoJSONPoint = typingsJapgolly.geojson.mod.Point
  type GeoJSONPolygon = typingsJapgolly.geojson.mod.Polygon
}
