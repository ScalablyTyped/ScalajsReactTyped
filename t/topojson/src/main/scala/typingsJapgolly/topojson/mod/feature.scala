package typingsJapgolly.topojson.mod

import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.FeatureCollection
import typingsJapgolly.geojson.mod.GeometryObject
import typingsJapgolly.topojsonSpecification.mod.GeometryCollection
import typingsJapgolly.topojsonSpecification.mod.LineString
import typingsJapgolly.topojsonSpecification.mod.MultiLineString
import typingsJapgolly.topojsonSpecification.mod.MultiPoint
import typingsJapgolly.topojsonSpecification.mod.MultiPolygon
import typingsJapgolly.topojsonSpecification.mod.Objects
import typingsJapgolly.topojsonSpecification.mod.Point
import typingsJapgolly.topojsonSpecification.mod.Polygon
import typingsJapgolly.topojsonSpecification.mod.Properties
import typingsJapgolly.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "feature")
@js.native
object feature extends js.Object {
  def apply[P](topology: Topology[Objects[Properties]], `object`: GeometryCollection[P]): FeatureCollection[GeometryObject, P] = js.native
  def apply[P](
    topology: Topology[Objects[Properties]],
    `object`: typingsJapgolly.topojsonSpecification.mod.GeometryObject[P]
  ): (Feature[GeometryObject, P]) | (FeatureCollection[GeometryObject, P]) = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: LineString[P]): Feature[typingsJapgolly.geojson.mod.LineString, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: MultiLineString[P]): Feature[typingsJapgolly.geojson.mod.MultiLineString, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: MultiPoint[P]): Feature[typingsJapgolly.geojson.mod.MultiPoint, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: MultiPolygon[P]): Feature[typingsJapgolly.geojson.mod.MultiPolygon, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: Point[P]): Feature[typingsJapgolly.geojson.mod.Point, P] = js.native
  def apply[P](topology: Topology[Objects[Properties]], `object`: Polygon[P]): Feature[typingsJapgolly.geojson.mod.Polygon, P] = js.native
}

