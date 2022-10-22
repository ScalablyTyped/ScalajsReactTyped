package typingsJapgolly.geojson

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type BBox = (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple6[Double, Double, Double, Double, Double, Double])
  
  trait Feature[G /* <: Geometry | Null */, P]
    extends StObject
       with GeoJsonObject {
    
    /**
      * The feature's geometry
      */
    var geometry: G
    
    /**
      * A value that uniquely identifies this feature in a
      * https://tools.ietf.org/html/rfc7946#section-3.2.
      */
    var id: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Properties associated with this feature.
      */
    var properties: P
    
    @JSName("type")
    var type_Feature: typingsJapgolly.geojson.geojsonStrings.Feature
  }
  object Feature {
    
    inline def apply[G /* <: Geometry | Null */, P](geometry: G, properties: P): Feature[G, P] = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Feature")
      __obj.asInstanceOf[Feature[G, P]]
    }
    
    extension [Self <: Feature[?, ?], G /* <: Geometry | Null */, P](x: Self & (Feature[G, P])) {
      
      inline def setGeometry(value: G): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setProperties(value: P): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setType(value: typingsJapgolly.geojson.geojsonStrings.Feature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeatureCollection[G /* <: Geometry | Null */, P]
    extends StObject
       with GeoJsonObject {
    
    var features: js.Array[Feature[G, P]]
    
    @JSName("type")
    var type_FeatureCollection: typingsJapgolly.geojson.geojsonStrings.FeatureCollection
  }
  object FeatureCollection {
    
    inline def apply[G /* <: Geometry | Null */, P](features: js.Array[Feature[G, P]]): FeatureCollection[G, P] = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FeatureCollection")
      __obj.asInstanceOf[FeatureCollection[G, P]]
    }
    
    extension [Self <: FeatureCollection[?, ?], G /* <: Geometry | Null */, P](x: Self & (FeatureCollection[G, P])) {
      
      inline def setFeatures(value: js.Array[Feature[G, P]]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesVarargs(value: (Feature[G, P])*): Self = StObject.set(x, "features", js.Array(value*))
      
      inline def setType(value: typingsJapgolly.geojson.geojsonStrings.FeatureCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GeoJSON = Geometry | (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties])
  
  /* Inlined geojson.geojson.Geometry['type'] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.geojson.geojsonStrings.MultiPolygon
    - typingsJapgolly.geojson.geojsonStrings.GeometryCollection
    - typingsJapgolly.geojson.geojsonStrings.MultiLineString
    - typingsJapgolly.geojson.geojsonStrings.LineString
    - typingsJapgolly.geojson.geojsonStrings.Point
    - typingsJapgolly.geojson.geojsonStrings.Polygon
    - typingsJapgolly.geojson.geojsonStrings.MultiPoint
  */
  trait GeoJsonGeometryTypes extends StObject
  object GeoJsonGeometryTypes {
    
    inline def GeometryCollection: typingsJapgolly.geojson.geojsonStrings.GeometryCollection = "GeometryCollection".asInstanceOf[typingsJapgolly.geojson.geojsonStrings.GeometryCollection]
    
    inline def LineString: typingsJapgolly.geojson.geojsonStrings.LineString = "LineString".asInstanceOf[typingsJapgolly.geojson.geojsonStrings.LineString]
    
    inline def MultiLineString: typingsJapgolly.geojson.geojsonStrings.MultiLineString = "MultiLineString".asInstanceOf[typingsJapgolly.geojson.geojsonStrings.MultiLineString]
    
    inline def MultiPoint: typingsJapgolly.geojson.geojsonStrings.MultiPoint = "MultiPoint".asInstanceOf[typingsJapgolly.geojson.geojsonStrings.MultiPoint]
    
    inline def MultiPolygon: typingsJapgolly.geojson.geojsonStrings.MultiPolygon = "MultiPolygon".asInstanceOf[typingsJapgolly.geojson.geojsonStrings.MultiPolygon]
    
    inline def Point: typingsJapgolly.geojson.geojsonStrings.Point = "Point".asInstanceOf[typingsJapgolly.geojson.geojsonStrings.Point]
    
    inline def Polygon: typingsJapgolly.geojson.geojsonStrings.Polygon = "Polygon".asInstanceOf[typingsJapgolly.geojson.geojsonStrings.Polygon]
  }
  
  trait GeoJsonObject extends StObject {
    
    /**
      * Bounding box of the coordinate range of the object's Geometries, Features, or Feature Collections.
      * The value of the bbox member is an array of length 2*n where n is the number of dimensions
      * represented in the contained geometries, with all axes of the most southwesterly point
      * followed by all axes of the more northeasterly point.
      * The axes order of a bbox follows the axes order of geometries.
      * https://tools.ietf.org/html/rfc7946#section-5
      */
    var bbox: js.UndefOr[BBox] = js.undefined
    
    // Don't include foreign members directly into this type def.
    // in order to preserve type safety.
    // [key: string]: any;
    /**
      * Specifies the type of GeoJSON object.
      */
    var `type`: GeoJsonTypes
  }
  object GeoJsonObject {
    
    inline def apply(`type`: GeoJsonTypes): GeoJsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoJsonObject]
    }
    
    extension [Self <: GeoJsonObject](x: Self) {
      
      inline def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      inline def setType(value: GeoJsonTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GeoJsonProperties = StringDictionary[Any] | Null
  
  /* Inlined geojson.geojson.GeoJSON['type'] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.geojson.geojsonStrings.MultiPolygon
    - typingsJapgolly.geojson.geojsonStrings.GeometryCollection
    - typingsJapgolly.geojson.geojsonStrings.MultiLineString
    - typingsJapgolly.geojson.geojsonStrings.LineString
    - typingsJapgolly.geojson.geojsonStrings.Point
    - typingsJapgolly.geojson.geojsonStrings.FeatureCollection
    - typingsJapgolly.geojson.geojsonStrings.Polygon
    - typingsJapgolly.geojson.geojsonStrings.MultiPoint
    - typingsJapgolly.geojson.geojsonStrings.Feature
  */
  trait GeoJsonTypes extends StObject
  object GeoJsonTypes {
    
    inline def Feature: typingsJapgolly.geojson.geojsonStrings.Feature = "Feature".asInstanceOf[typingsJapgolly.geojson.geojsonStrings.Feature]
    
    inline def FeatureCollection: typingsJapgolly.geojson.geojsonStrings.FeatureCollection = "FeatureCollection".asInstanceOf[typingsJapgolly.geojson.geojsonStrings.FeatureCollection]
    
    inline def GeometryCollection: typingsJapgolly.geojson.geojsonStrings.GeometryCollection = "GeometryCollection".asInstanceOf[typingsJapgolly.geojson.geojsonStrings.GeometryCollection]
    
    inline def LineString: typingsJapgolly.geojson.geojsonStrings.LineString = "LineString".asInstanceOf[typingsJapgolly.geojson.geojsonStrings.LineString]
    
    inline def MultiLineString: typingsJapgolly.geojson.geojsonStrings.MultiLineString = "MultiLineString".asInstanceOf[typingsJapgolly.geojson.geojsonStrings.MultiLineString]
    
    inline def MultiPoint: typingsJapgolly.geojson.geojsonStrings.MultiPoint = "MultiPoint".asInstanceOf[typingsJapgolly.geojson.geojsonStrings.MultiPoint]
    
    inline def MultiPolygon: typingsJapgolly.geojson.geojsonStrings.MultiPolygon = "MultiPolygon".asInstanceOf[typingsJapgolly.geojson.geojsonStrings.MultiPolygon]
    
    inline def Point: typingsJapgolly.geojson.geojsonStrings.Point = "Point".asInstanceOf[typingsJapgolly.geojson.geojsonStrings.Point]
    
    inline def Polygon: typingsJapgolly.geojson.geojsonStrings.Polygon = "Polygon".asInstanceOf[typingsJapgolly.geojson.geojsonStrings.Polygon]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.geojson.mod.Point
    - typingsJapgolly.geojson.mod.MultiPoint
    - typingsJapgolly.geojson.mod.LineString
    - typingsJapgolly.geojson.mod.MultiLineString
    - typingsJapgolly.geojson.mod.Polygon
    - typingsJapgolly.geojson.mod.MultiPolygon
    - typingsJapgolly.geojson.mod.GeometryCollection[scala.Any]
  */
  type Geometry = _Geometry | GeometryCollection[Any]
  
  trait GeometryCollection[G /* <: Geometry */]
    extends StObject
       with GeoJsonObject {
    
    var geometries: js.Array[G]
    
    @JSName("type")
    var type_GeometryCollection: typingsJapgolly.geojson.geojsonStrings.GeometryCollection
  }
  object GeometryCollection {
    
    inline def apply[G /* <: Geometry */](geometries: js.Array[G]): GeometryCollection[G] = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GeometryCollection")
      __obj.asInstanceOf[GeometryCollection[G]]
    }
    
    extension [Self <: GeometryCollection[?], G /* <: Geometry */](x: Self & GeometryCollection[G]) {
      
      inline def setGeometries(value: js.Array[G]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      inline def setGeometriesVarargs(value: G*): Self = StObject.set(x, "geometries", js.Array(value*))
      
      inline def setType(value: typingsJapgolly.geojson.geojsonStrings.GeometryCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped geojson.geojson.Point | geojson.geojson.MultiPoint | geojson.geojson.LineString | geojson.geojson.MultiLineString | geojson.geojson.Polygon | geojson.geojson.MultiPolygon | geojson.geojson.GeometryCollection<any> */ trait GeometryObject extends StObject
  
  trait LineString
    extends StObject
       with GeoJsonObject
       with _Geometry {
    
    var coordinates: js.Array[Position]
    
    @JSName("type")
    var type_LineString: typingsJapgolly.geojson.geojsonStrings.LineString
  }
  object LineString {
    
    inline def apply(coordinates: js.Array[Position]): LineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LineString")
      __obj.asInstanceOf[LineString]
    }
    
    extension [Self <: LineString](x: Self) {
      
      inline def setCoordinates(value: js.Array[Position]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: Position*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: typingsJapgolly.geojson.geojsonStrings.LineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiLineString
    extends StObject
       with GeoJsonObject
       with _Geometry {
    
    var coordinates: js.Array[js.Array[Position]]
    
    @JSName("type")
    var type_MultiLineString: typingsJapgolly.geojson.geojsonStrings.MultiLineString
  }
  object MultiLineString {
    
    inline def apply(coordinates: js.Array[js.Array[Position]]): MultiLineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiLineString")
      __obj.asInstanceOf[MultiLineString]
    }
    
    extension [Self <: MultiLineString](x: Self) {
      
      inline def setCoordinates(value: js.Array[js.Array[Position]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: js.Array[Position]*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: typingsJapgolly.geojson.geojsonStrings.MultiLineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiPoint
    extends StObject
       with GeoJsonObject
       with _Geometry {
    
    var coordinates: js.Array[Position]
    
    @JSName("type")
    var type_MultiPoint: typingsJapgolly.geojson.geojsonStrings.MultiPoint
  }
  object MultiPoint {
    
    inline def apply(coordinates: js.Array[Position]): MultiPoint = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPoint")
      __obj.asInstanceOf[MultiPoint]
    }
    
    extension [Self <: MultiPoint](x: Self) {
      
      inline def setCoordinates(value: js.Array[Position]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: Position*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: typingsJapgolly.geojson.geojsonStrings.MultiPoint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiPolygon
    extends StObject
       with GeoJsonObject
       with _Geometry {
    
    var coordinates: js.Array[js.Array[js.Array[Position]]]
    
    @JSName("type")
    var type_MultiPolygon: typingsJapgolly.geojson.geojsonStrings.MultiPolygon
  }
  object MultiPolygon {
    
    inline def apply(coordinates: js.Array[js.Array[js.Array[Position]]]): MultiPolygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPolygon")
      __obj.asInstanceOf[MultiPolygon]
    }
    
    extension [Self <: MultiPolygon](x: Self) {
      
      inline def setCoordinates(value: js.Array[js.Array[js.Array[Position]]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: js.Array[js.Array[Position]]*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: typingsJapgolly.geojson.geojsonStrings.MultiPolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point
    extends StObject
       with GeoJsonObject
       with _Geometry {
    
    var coordinates: Position
    
    @JSName("type")
    var type_Point: typingsJapgolly.geojson.geojsonStrings.Point
  }
  object Point {
    
    inline def apply(coordinates: Position): Point = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setCoordinates(value: Position): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: typingsJapgolly.geojson.geojsonStrings.Point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Polygon
    extends StObject
       with GeoJsonObject
       with _Geometry {
    
    var coordinates: js.Array[js.Array[Position]]
    
    @JSName("type")
    var type_Polygon: typingsJapgolly.geojson.geojsonStrings.Polygon
  }
  object Polygon {
    
    inline def apply(coordinates: js.Array[js.Array[Position]]): Polygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Polygon")
      __obj.asInstanceOf[Polygon]
    }
    
    extension [Self <: Polygon](x: Self) {
      
      inline def setCoordinates(value: js.Array[js.Array[Position]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: js.Array[Position]*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: typingsJapgolly.geojson.geojsonStrings.Polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Position = js.Array[Double]
  
  trait _Geometry extends StObject
  object _Geometry {
    
    inline def LineString(coordinates: js.Array[Position]): typingsJapgolly.geojson.mod.LineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LineString")
      __obj.asInstanceOf[typingsJapgolly.geojson.mod.LineString]
    }
    
    inline def MultiLineString(coordinates: js.Array[js.Array[Position]]): typingsJapgolly.geojson.mod.MultiLineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiLineString")
      __obj.asInstanceOf[typingsJapgolly.geojson.mod.MultiLineString]
    }
    
    inline def MultiPoint(coordinates: js.Array[Position]): typingsJapgolly.geojson.mod.MultiPoint = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPoint")
      __obj.asInstanceOf[typingsJapgolly.geojson.mod.MultiPoint]
    }
    
    inline def MultiPolygon(coordinates: js.Array[js.Array[js.Array[Position]]]): typingsJapgolly.geojson.mod.MultiPolygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPolygon")
      __obj.asInstanceOf[typingsJapgolly.geojson.mod.MultiPolygon]
    }
    
    inline def Point(coordinates: Position): typingsJapgolly.geojson.mod.Point = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
      __obj.asInstanceOf[typingsJapgolly.geojson.mod.Point]
    }
    
    inline def Polygon(coordinates: js.Array[js.Array[Position]]): typingsJapgolly.geojson.mod.Polygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Polygon")
      __obj.asInstanceOf[typingsJapgolly.geojson.mod.Polygon]
    }
  }
}
