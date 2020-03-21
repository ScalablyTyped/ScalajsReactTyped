package typingsJapgolly.mapboxMapboxSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object datasetsMod {
  /**
    * All GeoJSON types except for FeatureCollection.
    */
  type DataSetsFeature = typingsJapgolly.geojson.mod.Point | typingsJapgolly.geojson.mod.MultiPoint | typingsJapgolly.geojson.mod.LineString | typingsJapgolly.geojson.mod.MultiLineString | typingsJapgolly.geojson.mod.Polygon | typingsJapgolly.geojson.mod.MultiPolygon | typingsJapgolly.geojson.mod.GeometryCollection | (typingsJapgolly.geojson.mod.Feature[
    typingsJapgolly.geojson.mod.Geometry, 
    typingsJapgolly.geojson.mod.GeoJsonProperties
  ])
}
