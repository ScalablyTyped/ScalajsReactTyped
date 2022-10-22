package typingsJapgolly.topojson

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.geojson.mod.BBox
import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.FeatureCollection
import typingsJapgolly.geojson.mod.GeoJsonObject
import typingsJapgolly.geojson.mod.GeometryObject
import typingsJapgolly.geojson.mod.Point
import typingsJapgolly.topojson.anon.Counties
import typingsJapgolly.topojson.anon.Countries
import typingsJapgolly.topojsonClient.mod.Transformer
import typingsJapgolly.topojsonSimplify.mod.Filter_
import typingsJapgolly.topojsonSimplify.mod.Ring
import typingsJapgolly.topojsonSimplify.mod.RingWeighter
import typingsJapgolly.topojsonSimplify.mod.Triangle
import typingsJapgolly.topojsonSimplify.mod.TriangleWeighter
import typingsJapgolly.topojsonSpecification.mod.Arc
import typingsJapgolly.topojsonSpecification.mod.GeometryCollection
import typingsJapgolly.topojsonSpecification.mod.LineString
import typingsJapgolly.topojsonSpecification.mod.MultiLineString
import typingsJapgolly.topojsonSpecification.mod.MultiPoint
import typingsJapgolly.topojsonSpecification.mod.MultiPolygon
import typingsJapgolly.topojsonSpecification.mod.Objects
import typingsJapgolly.topojsonSpecification.mod.OrNull
import typingsJapgolly.topojsonSpecification.mod.Polygon
import typingsJapgolly.topojsonSpecification.mod.Properties
import typingsJapgolly.topojsonSpecification.mod.Topology
import typingsJapgolly.topojsonSpecification.mod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("topojson", JSImport.Namespace)
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
  
  inline def filter[K /* <: Objects[js.Object] */](topology: Topology[K], filter: Filter_): Topology[OrNull[K]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(topology.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Topology[OrNull[K]]]
  
  inline def filterAttached(topology: Topology[Objects[Properties]]): Filter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("filterAttached")(topology.asInstanceOf[js.Any]).asInstanceOf[Filter_]
  
  inline def filterAttachedWeight(topology: Topology[Objects[Properties]]): Filter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("filterAttachedWeight")(topology.asInstanceOf[js.Any]).asInstanceOf[Filter_]
  inline def filterAttachedWeight(topology: Topology[Objects[Properties]], minWeight: Double): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterAttachedWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  inline def filterAttachedWeight(topology: Topology[Objects[Properties]], minWeight: Double, weight: RingWeighter): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterAttachedWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  inline def filterAttachedWeight(topology: Topology[Objects[Properties]], minWeight: Unit, weight: RingWeighter): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterAttachedWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  
  inline def filterWeight(topology: Topology[Objects[Properties]]): Filter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("filterWeight")(topology.asInstanceOf[js.Any]).asInstanceOf[Filter_]
  inline def filterWeight(topology: Topology[Objects[Properties]], minWeight: Double): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  inline def filterWeight(topology: Topology[Objects[Properties]], minWeight: Double, weight: RingWeighter): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  inline def filterWeight(topology: Topology[Objects[Properties]], minWeight: Unit, weight: RingWeighter): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  
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
  
  inline def planarRingArea(ring: Ring): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("planarRingArea")(ring.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def planarTriangleArea(triangle: Triangle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("planarTriangleArea")(triangle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def presimplify[T /* <: Objects[js.Object] */](topology: Topology[T]): Topology[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("presimplify")(topology.asInstanceOf[js.Any]).asInstanceOf[Topology[T]]
  inline def presimplify[T /* <: Objects[js.Object] */](topology: Topology[T], weight: TriangleWeighter): Topology[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("presimplify")(topology.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[Topology[T]]
  
  inline def quantile(topology: Topology[Objects[Properties]], p: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("quantile")(topology.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Double): Topology[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantize")(topology.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Topology[T]]
  inline def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Transform): Topology[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantize")(topology.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Topology[T]]
  
  inline def simplify[T /* <: Objects[js.Object] */](topology: Topology[T]): Topology[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("simplify")(topology.asInstanceOf[js.Any]).asInstanceOf[Topology[T]]
  inline def simplify[T /* <: Objects[js.Object] */](topology: Topology[T], minWeight: Double): Topology[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplify")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any])).asInstanceOf[Topology[T]]
  
  inline def sphericalRingArea(ring: Ring, interior: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sphericalRingArea")(ring.asInstanceOf[js.Any], interior.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sphericalTriangleArea(triangle: Triangle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sphericalTriangleArea")(triangle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def topology(objects: StringDictionary[GeoJsonObject]): Topology[Objects[Properties]] = ^.asInstanceOf[js.Dynamic].applyDynamic("topology")(objects.asInstanceOf[js.Any]).asInstanceOf[Topology[Objects[Properties]]]
  inline def topology(objects: StringDictionary[GeoJsonObject], quantization: Double): Topology[Objects[Properties]] = (^.asInstanceOf[js.Dynamic].applyDynamic("topology")(objects.asInstanceOf[js.Any], quantization.asInstanceOf[js.Any])).asInstanceOf[Topology[Objects[Properties]]]
  
  inline def transform(): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")().asInstanceOf[Transformer]
  inline def transform(transform: Transform): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(transform.asInstanceOf[js.Any]).asInstanceOf[Transformer]
  
  inline def untransform(): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("untransform")().asInstanceOf[Transformer]
  inline def untransform(transform: Transform): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("untransform")(transform.asInstanceOf[js.Any]).asInstanceOf[Transformer]
  
  trait UsAtlas
    extends StObject
       with Topology[Objects[Properties]] {
    
    @JSName("bbox")
    var bbox_UsAtlas: js.Tuple4[Double, Double, Double, Double]
    
    @JSName("objects")
    var objects_UsAtlas: Counties
    
    @JSName("transform")
    var transform_UsAtlas: Transform
  }
  object UsAtlas {
    
    inline def apply(
      arcs: js.Array[Arc],
      bbox: js.Tuple4[Double, Double, Double, Double],
      objects: Counties,
      transform: Transform
    ): UsAtlas = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Topology")
      __obj.asInstanceOf[UsAtlas]
    }
    
    extension [Self <: UsAtlas](x: Self) {
      
      inline def setBbox(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setObjects(value: Counties): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorldAtlas
    extends StObject
       with Topology[Objects[Properties]] {
    
    @JSName("bbox")
    var bbox_WorldAtlas: js.Tuple4[Double, Double, Double, Double]
    
    @JSName("objects")
    var objects_WorldAtlas: Countries
    
    @JSName("transform")
    var transform_WorldAtlas: Transform
  }
  object WorldAtlas {
    
    inline def apply(
      arcs: js.Array[Arc],
      bbox: js.Tuple4[Double, Double, Double, Double],
      objects: Countries,
      transform: Transform
    ): WorldAtlas = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Topology")
      __obj.asInstanceOf[WorldAtlas]
    }
    
    extension [Self <: WorldAtlas](x: Self) {
      
      inline def setBbox(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setObjects(value: Countries): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
}
