package typingsJapgolly.trimblemapsTrimblemapsJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geojsonMod {
  
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
    var type_Feature: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Feature
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
      
      inline def setType(value: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Feature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeatureCollection[G /* <: Geometry | Null */, P]
    extends StObject
       with GeoJsonObject {
    
    var features: js.Array[Feature[G, P]]
    
    @JSName("type")
    var type_FeatureCollection: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.FeatureCollection
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
      
      inline def setType(value: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.FeatureCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GeoJSON = Geometry | (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties])
  
  /* Inlined @trimblemaps/trimblemaps-js.@trimblemaps/trimblemaps-js/geojson.Geometry['type'] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPolygon
    - typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.GeometryCollection
    - typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiLineString
    - typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.LineString
    - typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Point
    - typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Polygon
    - typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPoint
  */
  trait GeoJsonGeometryTypes extends StObject
  object GeoJsonGeometryTypes {
    
    inline def GeometryCollection: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.GeometryCollection = "GeometryCollection".asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.GeometryCollection]
    
    inline def LineString: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.LineString = "LineString".asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.LineString]
    
    inline def MultiLineString: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiLineString = "MultiLineString".asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiLineString]
    
    inline def MultiPoint: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPoint = "MultiPoint".asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPoint]
    
    inline def MultiPolygon: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPolygon = "MultiPolygon".asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPolygon]
    
    inline def Point: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Point = "Point".asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Point]
    
    inline def Polygon: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Polygon = "Polygon".asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Polygon]
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
  
  /* Inlined @trimblemaps/trimblemaps-js.@trimblemaps/trimblemaps-js/geojson.GeoJSON['type'] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPolygon
    - typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.GeometryCollection
    - typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiLineString
    - typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.LineString
    - typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Point
    - typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.FeatureCollection
    - typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Polygon
    - typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPoint
    - typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Feature
  */
  trait GeoJsonTypes extends StObject
  object GeoJsonTypes {
    
    inline def Feature: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Feature = "Feature".asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Feature]
    
    inline def FeatureCollection: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.FeatureCollection = "FeatureCollection".asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.FeatureCollection]
    
    inline def GeometryCollection: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.GeometryCollection = "GeometryCollection".asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.GeometryCollection]
    
    inline def LineString: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.LineString = "LineString".asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.LineString]
    
    inline def MultiLineString: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiLineString = "MultiLineString".asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiLineString]
    
    inline def MultiPoint: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPoint = "MultiPoint".asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPoint]
    
    inline def MultiPolygon: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPolygon = "MultiPolygon".asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPolygon]
    
    inline def Point: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Point = "Point".asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Point]
    
    inline def Polygon: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Polygon = "Polygon".asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Polygon]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.Point
    - typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.MultiPoint
    - typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.LineString
    - typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.MultiLineString
    - typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.Polygon
    - typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.MultiPolygon
    - typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.GeometryCollection
  */
  trait Geometry extends StObject
  object Geometry {
    
    inline def GeometryCollection(geometries: js.Array[Geometry]): typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.GeometryCollection = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GeometryCollection")
      __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.GeometryCollection]
    }
    
    inline def LineString(coordinates: js.Array[Position]): typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.LineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LineString")
      __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.LineString]
    }
    
    inline def MultiLineString(coordinates: js.Array[js.Array[Position]]): typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.MultiLineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiLineString")
      __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.MultiLineString]
    }
    
    inline def MultiPoint(coordinates: js.Array[Position]): typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.MultiPoint = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPoint")
      __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.MultiPoint]
    }
    
    inline def MultiPolygon(coordinates: js.Array[js.Array[js.Array[Position]]]): typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.MultiPolygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPolygon")
      __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.MultiPolygon]
    }
    
    inline def Point(coordinates: Position): typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.Point = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
      __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.Point]
    }
    
    inline def Polygon(coordinates: js.Array[js.Array[Position]]): typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.Polygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Polygon")
      __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.geojsonMod.Polygon]
    }
  }
  
  trait GeometryCollection
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var geometries: js.Array[Geometry]
    
    @JSName("type")
    var type_GeometryCollection: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.GeometryCollection
  }
  object GeometryCollection {
    
    inline def apply(geometries: js.Array[Geometry]): GeometryCollection = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GeometryCollection")
      __obj.asInstanceOf[GeometryCollection]
    }
    
    extension [Self <: GeometryCollection](x: Self) {
      
      inline def setGeometries(value: js.Array[Geometry]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      inline def setGeometriesVarargs(value: Geometry*): Self = StObject.set(x, "geometries", js.Array(value*))
      
      inline def setType(value: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.GeometryCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GeometryObject = Geometry
  
  trait LineString
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[Position]
    
    @JSName("type")
    var type_LineString: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.LineString
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
      
      inline def setType(value: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.LineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiLineString
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[js.Array[Position]]
    
    @JSName("type")
    var type_MultiLineString: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiLineString
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
      
      inline def setType(value: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiLineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiPoint
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[Position]
    
    @JSName("type")
    var type_MultiPoint: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPoint
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
      
      inline def setType(value: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPoint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiPolygon
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[js.Array[js.Array[Position]]]
    
    @JSName("type")
    var type_MultiPolygon: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPolygon
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
      
      inline def setType(value: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.MultiPolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: Position
    
    @JSName("type")
    var type_Point: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Point
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
      
      inline def setType(value: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Polygon
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[js.Array[Position]]
    
    @JSName("type")
    var type_Polygon: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Polygon
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
      
      inline def setType(value: typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Position = js.Array[Double]
}
