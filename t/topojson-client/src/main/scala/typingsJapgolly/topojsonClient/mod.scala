package typingsJapgolly.topojsonClient

import typingsJapgolly.geojson.mod.BBox
import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.FeatureCollection
import typingsJapgolly.geojson.mod.GeometryObject
import typingsJapgolly.geojson.mod.Point
import typingsJapgolly.topojsonSpecification.mod.GeometryCollection
import typingsJapgolly.topojsonSpecification.mod.LineString
import typingsJapgolly.topojsonSpecification.mod.MultiLineString
import typingsJapgolly.topojsonSpecification.mod.MultiPoint
import typingsJapgolly.topojsonSpecification.mod.MultiPolygon
import typingsJapgolly.topojsonSpecification.mod.Objects
import typingsJapgolly.topojsonSpecification.mod.Polygon
import typingsJapgolly.topojsonSpecification.mod.Properties
import typingsJapgolly.topojsonSpecification.mod.Topology
import typingsJapgolly.topojsonSpecification.mod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("topojson-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bbox(topology: Topology[Objects[Properties]]): BBox = ^.asInstanceOf[js.Dynamic].applyDynamic("bbox")(topology.asInstanceOf[js.Any]).asInstanceOf[BBox]
  
  inline def feature[P /* <: Properties */](topology: Topology[Objects[Properties]], `object`: String): Feature[Point, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Feature[Point, P]]
  inline def feature[P /* <: Properties */](topology: Topology[Objects[Properties]], `object`: GeometryCollection[P]): FeatureCollection[GeometryObject, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[FeatureCollection[GeometryObject, P]]
  inline def feature[P /* <: Properties */](
    topology: Topology[Objects[Properties]],
    `object`: typingsJapgolly.topojsonSpecification.mod.GeometryObject[P]
  ): (Feature[GeometryObject, P]) | (FeatureCollection[GeometryObject, P]) = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[(Feature[GeometryObject, P]) | (FeatureCollection[GeometryObject, P])]
  inline def feature[P /* <: Properties */](topology: Topology[Objects[Properties]], `object`: LineString[P]): Feature[typingsJapgolly.geojson.mod.LineString, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Feature[typingsJapgolly.geojson.mod.LineString, P]]
  inline def feature[P /* <: Properties */](topology: Topology[Objects[Properties]], `object`: MultiLineString[P]): Feature[typingsJapgolly.geojson.mod.MultiLineString, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Feature[typingsJapgolly.geojson.mod.MultiLineString, P]]
  inline def feature[P /* <: Properties */](topology: Topology[Objects[Properties]], `object`: MultiPoint[P]): Feature[typingsJapgolly.geojson.mod.MultiPoint, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Feature[typingsJapgolly.geojson.mod.MultiPoint, P]]
  inline def feature[P /* <: Properties */](topology: Topology[Objects[Properties]], `object`: MultiPolygon[P]): Feature[typingsJapgolly.geojson.mod.MultiPolygon, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Feature[typingsJapgolly.geojson.mod.MultiPolygon, P]]
  inline def feature[P /* <: Properties */](
    topology: Topology[Objects[Properties]],
    `object`: typingsJapgolly.topojsonSpecification.mod.Point[P]
  ): Feature[Point, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Feature[Point, P]]
  inline def feature[P /* <: Properties */](topology: Topology[Objects[Properties]], `object`: Polygon[P]): Feature[typingsJapgolly.geojson.mod.Polygon, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Feature[typingsJapgolly.geojson.mod.Polygon, P]]
  
  inline def feature_P_FeatureCollection[P /* <: Properties */](topology: Topology[Objects[Properties]], `object`: String): FeatureCollection[GeometryObject, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[FeatureCollection[GeometryObject, P]]
  
  inline def feature_P_Union[P /* <: Properties */](topology: Topology[Objects[Properties]], `object`: String): (Feature[GeometryObject, P]) | (FeatureCollection[GeometryObject, P]) = (^.asInstanceOf[js.Dynamic].applyDynamic("feature")(topology.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[(Feature[GeometryObject, P]) | (FeatureCollection[GeometryObject, P])]
  
  inline def merge(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): typingsJapgolly.geojson.mod.MultiPolygon = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(topology.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.geojson.mod.MultiPolygon]
  
  inline def mergeArcs(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): MultiPolygon[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeArcs")(topology.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[MultiPolygon[js.Object]]
  
  inline def mesh(topology: Topology[Objects[Properties]]): typingsJapgolly.geojson.mod.MultiLineString = ^.asInstanceOf[js.Dynamic].applyDynamic("mesh")(topology.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.geojson.mod.MultiLineString]
  inline def mesh(
    topology: Topology[Objects[Properties]],
    obj: Unit,
    filter: js.Function2[
      /* a */ typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): typingsJapgolly.geojson.mod.MultiLineString = (^.asInstanceOf[js.Dynamic].applyDynamic("mesh")(topology.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.geojson.mod.MultiLineString]
  inline def mesh(
    topology: Topology[Objects[Properties]],
    obj: typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object]
  ): typingsJapgolly.geojson.mod.MultiLineString = (^.asInstanceOf[js.Dynamic].applyDynamic("mesh")(topology.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.geojson.mod.MultiLineString]
  inline def mesh(
    topology: Topology[Objects[Properties]],
    obj: typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): typingsJapgolly.geojson.mod.MultiLineString = (^.asInstanceOf[js.Dynamic].applyDynamic("mesh")(topology.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.geojson.mod.MultiLineString]
  
  inline def meshArcs(topology: Topology[Objects[Properties]]): MultiLineString[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("meshArcs")(topology.asInstanceOf[js.Any]).asInstanceOf[MultiLineString[js.Object]]
  inline def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: Unit,
    filter: js.Function2[
      /* a */ typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): MultiLineString[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshArcs")(topology.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[MultiLineString[js.Object]]
  inline def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object]
  ): MultiLineString[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshArcs")(topology.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[MultiLineString[js.Object]]
  inline def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object], 
      /* b */ typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object], 
      Boolean
    ]
  ): MultiLineString[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshArcs")(topology.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[MultiLineString[js.Object]]
  
  inline def neighbors(objects: js.Array[typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object]]): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("neighbors")(objects.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
  
  inline def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Double): Topology[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantize")(topology.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Topology[T]]
  inline def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Transform): Topology[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantize")(topology.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Topology[T]]
  
  inline def transform(): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")().asInstanceOf[Transformer]
  inline def transform(transform: Transform): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(transform.asInstanceOf[js.Any]).asInstanceOf[Transformer]
  
  inline def untransform(): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("untransform")().asInstanceOf[Transformer]
  inline def untransform(transform: Transform): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("untransform")(transform.asInstanceOf[js.Any]).asInstanceOf[Transformer]
  
  type Transformer = js.Function2[/* point */ js.Array[Double], /* index */ js.UndefOr[Boolean], js.Array[Double]]
}
