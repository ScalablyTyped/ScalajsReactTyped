package typingsJapgolly.reactGoogleMapsLoader

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.googlemaps.google.maps.Data.Feature
import typingsJapgolly.googlemaps.google.maps.Data.Geometry
import typingsJapgolly.googlemaps.google.maps.Data.GeometryCollection
import typingsJapgolly.googlemaps.google.maps.Data.LineString
import typingsJapgolly.googlemaps.google.maps.Data.LinearRing
import typingsJapgolly.googlemaps.google.maps.Data.MultiLineString
import typingsJapgolly.googlemaps.google.maps.Data.MultiPoint
import typingsJapgolly.googlemaps.google.maps.Data.MultiPolygon
import typingsJapgolly.googlemaps.google.maps.Data.Point
import typingsJapgolly.googlemaps.google.maps.Data.Polygon
import typingsJapgolly.googlemaps.google.maps.LatLng
import typingsJapgolly.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofData extends js.Object {
  var Feature: Instantiable0[typingsJapgolly.googlemaps.google.maps.Data.Feature]
  var Geometry: Instantiable0[typingsJapgolly.googlemaps.google.maps.Data.Geometry]
  var GeometryCollection: Instantiable1[
    /* elements */ js.Array[(js.Array[Geometry | LatLng]) | LatLngLiteral], 
    typingsJapgolly.googlemaps.google.maps.Data.GeometryCollection
  ]
  var LineString: Instantiable1[
    /* elements */ js.Array[LatLng | LatLngLiteral], 
    typingsJapgolly.googlemaps.google.maps.Data.LineString
  ]
  var LinearRing: Instantiable1[
    /* elements */ js.Array[LatLng | LatLngLiteral], 
    typingsJapgolly.googlemaps.google.maps.Data.LinearRing
  ]
  var MultiLineString: Instantiable1[
    /* elements */ js.Array[LineString | (js.Array[LatLng | LatLngLiteral])], 
    typingsJapgolly.googlemaps.google.maps.Data.MultiLineString
  ]
  var MultiPoint: Instantiable1[
    /* elements */ js.Array[LatLng | LatLngLiteral], 
    typingsJapgolly.googlemaps.google.maps.Data.MultiPoint
  ]
  var MultiPolygon: Instantiable1[
    /* elements */ js.Array[Polygon | (js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])])], 
    typingsJapgolly.googlemaps.google.maps.Data.MultiPolygon
  ]
  var Point: Instantiable1[/* latLng */ LatLng, typingsJapgolly.googlemaps.google.maps.Data.Point]
  var Polygon: Instantiable1[
    /* elements */ js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])], 
    typingsJapgolly.googlemaps.google.maps.Data.Polygon
  ]
}

object TypeofData {
  @scala.inline
  def apply(
    Feature: Instantiable0[Feature],
    Geometry: Instantiable0[Geometry],
    GeometryCollection: Instantiable1[
      /* elements */ js.Array[(js.Array[Geometry | LatLng]) | LatLngLiteral], 
      GeometryCollection
    ],
    LineString: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], LineString],
    LinearRing: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], LinearRing],
    MultiLineString: Instantiable1[
      /* elements */ js.Array[LineString | (js.Array[LatLng | LatLngLiteral])], 
      MultiLineString
    ],
    MultiPoint: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], MultiPoint],
    MultiPolygon: Instantiable1[
      /* elements */ js.Array[Polygon | (js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])])], 
      MultiPolygon
    ],
    Point: Instantiable1[/* latLng */ LatLng, Point],
    Polygon: Instantiable1[/* elements */ js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])], Polygon]
  ): TypeofData = {
    val __obj = js.Dynamic.literal(Feature = Feature.asInstanceOf[js.Any], Geometry = Geometry.asInstanceOf[js.Any], GeometryCollection = GeometryCollection.asInstanceOf[js.Any], LineString = LineString.asInstanceOf[js.Any], LinearRing = LinearRing.asInstanceOf[js.Any], MultiLineString = MultiLineString.asInstanceOf[js.Any], MultiPoint = MultiPoint.asInstanceOf[js.Any], MultiPolygon = MultiPolygon.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofData]
  }
}

