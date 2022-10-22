package typingsJapgolly.topojsonSpecification

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.geojson.mod.BBox
import typingsJapgolly.geojson.mod.GeoJsonGeometryTypes
import typingsJapgolly.geojson.mod.GeoJsonProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type Arc = js.Array[Positions]
  
  type ArcIndexes = js.Array[Double]
  
  trait GeometryCollection[P /* <: Properties */]
    extends StObject
       with GeometryObjectA[P]
       with GeometryObject[P] {
    
    var geometries: js.Array[GeometryObject[P]]
    
    @JSName("type")
    var type_GeometryCollection: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection
  }
  object GeometryCollection {
    
    inline def apply[P /* <: Properties */](geometries: js.Array[GeometryObject[P]]): GeometryCollection[P] = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GeometryCollection")
      __obj.asInstanceOf[GeometryCollection[P]]
    }
    
    extension [Self <: GeometryCollection[?], P /* <: Properties */](x: Self & GeometryCollection[P]) {
      
      inline def setGeometries(value: js.Array[GeometryObject[P]]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      inline def setGeometriesVarargs(value: GeometryObject[P]*): Self = StObject.set(x, "geometries", js.Array(value*))
      
      inline def setType(value: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.topojsonSpecification.mod.Point[P]
    - typingsJapgolly.topojsonSpecification.mod.MultiPoint[P]
    - typingsJapgolly.topojsonSpecification.mod.LineString[P]
    - typingsJapgolly.topojsonSpecification.mod.MultiLineString[P]
    - typingsJapgolly.topojsonSpecification.mod.Polygon[P]
    - typingsJapgolly.topojsonSpecification.mod.MultiPolygon[P]
    - typingsJapgolly.topojsonSpecification.mod.GeometryCollection[P]
    - typingsJapgolly.topojsonSpecification.mod.NullObject
  */
  trait GeometryObject[P /* <: Properties */] extends StObject
  object GeometryObject {
    
    inline def GeometryCollection[P /* <: Properties */](geometries: js.Array[GeometryObject[P]]): typingsJapgolly.topojsonSpecification.mod.GeometryCollection[P] = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GeometryCollection")
      __obj.asInstanceOf[typingsJapgolly.topojsonSpecification.mod.GeometryCollection[P]]
    }
    
    inline def LineString[P /* <: Properties */](arcs: ArcIndexes): typingsJapgolly.topojsonSpecification.mod.LineString[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LineString")
      __obj.asInstanceOf[typingsJapgolly.topojsonSpecification.mod.LineString[P]]
    }
    
    inline def MultiLineString[P /* <: Properties */](arcs: js.Array[ArcIndexes]): typingsJapgolly.topojsonSpecification.mod.MultiLineString[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiLineString")
      __obj.asInstanceOf[typingsJapgolly.topojsonSpecification.mod.MultiLineString[P]]
    }
    
    inline def MultiPoint[P /* <: Properties */](coordinates: js.Array[Positions]): typingsJapgolly.topojsonSpecification.mod.MultiPoint[P] = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPoint")
      __obj.asInstanceOf[typingsJapgolly.topojsonSpecification.mod.MultiPoint[P]]
    }
    
    inline def MultiPolygon[P /* <: Properties */](arcs: js.Array[js.Array[ArcIndexes]]): typingsJapgolly.topojsonSpecification.mod.MultiPolygon[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPolygon")
      __obj.asInstanceOf[typingsJapgolly.topojsonSpecification.mod.MultiPolygon[P]]
    }
    
    inline def NullObject(`type`: Null): typingsJapgolly.topojsonSpecification.mod.NullObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.topojsonSpecification.mod.NullObject]
    }
    
    inline def Point[P /* <: Properties */](coordinates: Positions): typingsJapgolly.topojsonSpecification.mod.Point[P] = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
      __obj.asInstanceOf[typingsJapgolly.topojsonSpecification.mod.Point[P]]
    }
    
    inline def Polygon[P /* <: Properties */](arcs: js.Array[ArcIndexes]): typingsJapgolly.topojsonSpecification.mod.Polygon[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Polygon")
      __obj.asInstanceOf[typingsJapgolly.topojsonSpecification.mod.Polygon[P]]
    }
  }
  
  trait GeometryObjectA[P /* <: Properties */]
    extends StObject
       with TopoJSON {
    
    var id: js.UndefOr[Double | String] = js.undefined
    
    var properties: js.UndefOr[P] = js.undefined
    
    @JSName("type")
    var type_GeometryObjectA: GeoJsonGeometryTypes | Null
  }
  object GeometryObjectA {
    
    inline def apply[P /* <: Properties */](): GeometryObjectA[P] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(null)
      __obj.asInstanceOf[GeometryObjectA[P]]
    }
    
    extension [Self <: GeometryObjectA[?], P /* <: Properties */](x: Self & GeometryObjectA[P]) {
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setProperties(value: P): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setType(value: GeoJsonGeometryTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
    }
  }
  
  trait LineString[P /* <: Properties */]
    extends StObject
       with GeometryObjectA[P]
       with GeometryObject[P] {
    
    var arcs: ArcIndexes
    
    @JSName("type")
    var type_LineString: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.LineString
  }
  object LineString {
    
    inline def apply[P /* <: Properties */](arcs: ArcIndexes): LineString[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LineString")
      __obj.asInstanceOf[LineString[P]]
    }
    
    extension [Self <: LineString[?], P /* <: Properties */](x: Self & LineString[P]) {
      
      inline def setArcs(value: ArcIndexes): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
      
      inline def setArcsVarargs(value: Double*): Self = StObject.set(x, "arcs", js.Array(value*))
      
      inline def setType(value: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.LineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiLineString[P /* <: Properties */]
    extends StObject
       with GeometryObjectA[P]
       with GeometryObject[P] {
    
    var arcs: js.Array[ArcIndexes]
    
    @JSName("type")
    var type_MultiLineString: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.MultiLineString
  }
  object MultiLineString {
    
    inline def apply[P /* <: Properties */](arcs: js.Array[ArcIndexes]): MultiLineString[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiLineString")
      __obj.asInstanceOf[MultiLineString[P]]
    }
    
    extension [Self <: MultiLineString[?], P /* <: Properties */](x: Self & MultiLineString[P]) {
      
      inline def setArcs(value: js.Array[ArcIndexes]): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
      
      inline def setArcsVarargs(value: ArcIndexes*): Self = StObject.set(x, "arcs", js.Array(value*))
      
      inline def setType(value: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.MultiLineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiPoint[P /* <: Properties */]
    extends StObject
       with GeometryObjectA[P]
       with GeometryObject[P] {
    
    var coordinates: js.Array[Positions]
    
    @JSName("type")
    var type_MultiPoint: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.MultiPoint
  }
  object MultiPoint {
    
    inline def apply[P /* <: Properties */](coordinates: js.Array[Positions]): MultiPoint[P] = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPoint")
      __obj.asInstanceOf[MultiPoint[P]]
    }
    
    extension [Self <: MultiPoint[?], P /* <: Properties */](x: Self & MultiPoint[P]) {
      
      inline def setCoordinates(value: js.Array[Positions]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: Positions*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.MultiPoint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiPolygon[P /* <: Properties */]
    extends StObject
       with GeometryObjectA[P]
       with GeometryObject[P] {
    
    var arcs: js.Array[js.Array[ArcIndexes]]
    
    @JSName("type")
    var type_MultiPolygon: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon
  }
  object MultiPolygon {
    
    inline def apply[P /* <: Properties */](arcs: js.Array[js.Array[ArcIndexes]]): MultiPolygon[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPolygon")
      __obj.asInstanceOf[MultiPolygon[P]]
    }
    
    extension [Self <: MultiPolygon[?], P /* <: Properties */](x: Self & MultiPolygon[P]) {
      
      inline def setArcs(value: js.Array[js.Array[ArcIndexes]]): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
      
      inline def setArcsVarargs(value: js.Array[ArcIndexes]*): Self = StObject.set(x, "arcs", js.Array(value*))
      
      inline def setType(value: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NullObject
    extends StObject
       with GeometryObjectA[js.Object]
       with GeometryObject[Any] {
    
    @JSName("type")
    var type_NullObject: Null
  }
  object NullObject {
    
    inline def apply(`type`: Null): NullObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NullObject]
    }
    
    extension [Self <: NullObject](x: Self) {
      
      inline def setType(value: Null): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Objects[P /* <: Properties */] = StringDictionary[GeometryObject[P]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: T[P] | topojson-specification.topojson-specification.NullObject}
    }}}
    */
  @js.native
  trait OrNull[T /* <: Objects[js.Object] */] extends StObject
  
  trait Point[P /* <: Properties */]
    extends StObject
       with GeometryObjectA[P]
       with GeometryObject[P] {
    
    var coordinates: Positions
    
    @JSName("type")
    var type_Point: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.Point
  }
  object Point {
    
    inline def apply[P /* <: Properties */](coordinates: Positions): Point[P] = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
      __obj.asInstanceOf[Point[P]]
    }
    
    extension [Self <: Point[?], P /* <: Properties */](x: Self & Point[P]) {
      
      inline def setCoordinates(value: Positions): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.Point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Polygon[P /* <: Properties */]
    extends StObject
       with GeometryObjectA[P]
       with GeometryObject[P] {
    
    var arcs: js.Array[ArcIndexes]
    
    @JSName("type")
    var type_Polygon: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.Polygon
  }
  object Polygon {
    
    inline def apply[P /* <: Properties */](arcs: js.Array[ArcIndexes]): Polygon[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Polygon")
      __obj.asInstanceOf[Polygon[P]]
    }
    
    extension [Self <: Polygon[?], P /* <: Properties */](x: Self & Polygon[P]) {
      
      inline def setArcs(value: js.Array[ArcIndexes]): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
      
      inline def setArcsVarargs(value: ArcIndexes*): Self = StObject.set(x, "arcs", js.Array(value*))
      
      inline def setType(value: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.Polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Positions = js.Array[Double]
  
  type Properties = GeoJsonProperties
  
  trait TopoJSON extends StObject {
    
    var bbox: js.UndefOr[BBox] = js.undefined
    
    var `type`: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.Topology | GeoJsonGeometryTypes | Null
  }
  object TopoJSON {
    
    inline def apply(): TopoJSON = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(null)
      __obj.asInstanceOf[TopoJSON]
    }
    
    extension [Self <: TopoJSON](x: Self) {
      
      inline def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      inline def setType(
        value: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.Topology | GeoJsonGeometryTypes
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
    }
  }
  
  trait Topology[T /* <: Objects[Properties] */]
    extends StObject
       with TopoJSON {
    
    var arcs: js.Array[Arc]
    
    var objects: T
    
    var transform: js.UndefOr[Transform] = js.undefined
    
    @JSName("type")
    var type_Topology: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.Topology
  }
  object Topology {
    
    inline def apply[T /* <: Objects[Properties] */](arcs: js.Array[Arc], objects: T): Topology[T] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Topology")
      __obj.asInstanceOf[Topology[T]]
    }
    
    extension [Self <: Topology[?], T /* <: Objects[Properties] */](x: Self & Topology[T]) {
      
      inline def setArcs(value: js.Array[Arc]): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
      
      inline def setArcsVarargs(value: Arc*): Self = StObject.set(x, "arcs", js.Array(value*))
      
      inline def setObjects(value: T): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setType(value: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.Topology): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transform extends StObject {
    
    var scale: js.Tuple2[Double, Double]
    
    var translate: js.Tuple2[Double, Double]
  }
  object Transform {
    
    inline def apply(scale: js.Tuple2[Double, Double], translate: js.Tuple2[Double, Double]): Transform = {
      val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transform]
    }
    
    extension [Self <: Transform](x: Self) {
      
      inline def setScale(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setTranslate(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    }
  }
}
