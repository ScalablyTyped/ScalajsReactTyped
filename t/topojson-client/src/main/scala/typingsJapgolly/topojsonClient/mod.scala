package typingsJapgolly.topojsonClient

import typingsJapgolly.geojson.mod.BBox
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
import typingsJapgolly.topojsonSpecification.mod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson-client", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def bbox(topology: Topology[Objects[Properties]]): BBox = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: GeometryCollection[P]): FeatureCollection[GeometryObject, P] = js.native
  def feature[P](
    topology: Topology[Objects[Properties]],
    `object`: typingsJapgolly.topojsonSpecification.mod.GeometryObject[P]
  ): (Feature[GeometryObject, P]) | (FeatureCollection[GeometryObject, P]) = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: LineString[P]): Feature[typingsJapgolly.geojson.mod.LineString, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiLineString[P]): Feature[typingsJapgolly.geojson.mod.MultiLineString, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiPoint[P]): Feature[typingsJapgolly.geojson.mod.MultiPoint, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiPolygon[P]): Feature[typingsJapgolly.geojson.mod.MultiPolygon, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: Point[P]): Feature[typingsJapgolly.geojson.mod.Point, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: Polygon[P]): Feature[typingsJapgolly.geojson.mod.Polygon, P] = js.native
  def merge(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): typingsJapgolly.geojson.mod.MultiPolygon = js.native
  def mergeArcs(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): MultiPolygon[js.Object] = js.native
  def mesh(topology: Topology[Objects[Properties]]): typingsJapgolly.geojson.mod.MultiLineString = js.native
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object]
  ): typingsJapgolly.geojson.mod.MultiLineString = js.native
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): typingsJapgolly.geojson.mod.MultiLineString = js.native
  def meshArcs(topology: Topology[Objects[Properties]]): MultiLineString[js.Object] = js.native
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object]
  ): MultiLineString[js.Object] = js.native
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): MultiLineString[js.Object] = js.native
  def neighbors(objects: js.Array[typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object]]): js.Array[js.Array[Double]] = js.native
  def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Double): Topology[T] = js.native
  def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Transform): Topology[T] = js.native
  def transform(): Transformer = js.native
  def transform(transform: Transform): Transformer = js.native
  def untransform(): Transformer = js.native
  def untransform(transform: Transform): Transformer = js.native
  type Transformer = js.Function2[/* point */ js.Array[Double], /* index */ js.UndefOr[Boolean], js.Array[Double]]
}

