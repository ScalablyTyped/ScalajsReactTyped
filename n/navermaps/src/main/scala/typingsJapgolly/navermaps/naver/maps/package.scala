package typingsJapgolly.navermaps.naver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object maps {
  type ArrayOfBounds = js.Array[
    typingsJapgolly.navermaps.naver.maps.LatLngBounds | typingsJapgolly.navermaps.naver.maps.PointBounds
  ]
  type ArrayOfBoundsLiteral = js.Array[
    typingsJapgolly.navermaps.naver.maps.LatLngBoundsLiteral | typingsJapgolly.navermaps.naver.maps.PointBoundsLiteral
  ]
  type ArrayOfCoords = js.Array[
    typingsJapgolly.navermaps.naver.maps.LatLng | typingsJapgolly.navermaps.naver.maps.Point
  ]
  type ArrayOfCoordsLiteral = js.Array[
    typingsJapgolly.navermaps.naver.maps.LatLngLiteral | typingsJapgolly.navermaps.naver.maps.PointLiteral
  ]
  type BoundsLiteral = typingsJapgolly.navermaps.naver.maps.PointBoundsLiteral | typingsJapgolly.navermaps.naver.maps.LatLngBoundsLiteral
  type CoordLiteral = typingsJapgolly.navermaps.naver.maps.PointLiteral | typingsJapgolly.navermaps.naver.maps.LatLngLiteral
  type DOMEvent = typingsJapgolly.std.Event_
  type GPX = js.Any
  type GeoJSON = js.Any
  type KML = js.Any
  type KVOArrayOfCoords = js.Any
  type LatLngBoundsLiteral = typingsJapgolly.navermaps.naver.maps.PointBoundsLiteral | typingsJapgolly.navermaps.naver.maps.LatLngBoundsObjectLiteral
  type LatLngLiteral = typingsJapgolly.navermaps.naver.maps.PointLiteral | typingsJapgolly.navermaps.naver.maps.LatLngObjectLiteral
  type MapTypeId = java.lang.String
  /**
    * Types
    */
  type PointArrayLiteral = js.Tuple2[scala.Double, scala.Double]
  type PointBoundsArrayLiteral = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  type PointBoundsLiteral = typingsJapgolly.navermaps.naver.maps.PointBoundsArrayLiteral | typingsJapgolly.navermaps.naver.maps.PointBoundsObjectLiteral
  type PointLiteral = typingsJapgolly.navermaps.naver.maps.PointArrayLiteral | typingsJapgolly.navermaps.naver.maps.PointObjectLiteral
  type SizeArrayLiteral = js.Tuple2[scala.Double, scala.Double]
  type SizeLiteral = typingsJapgolly.navermaps.naver.maps.SizeArrayLiteral | typingsJapgolly.navermaps.naver.maps.SizeObjectLiteral
  type StylingFunction = js.Function1[
    /* feature */ typingsJapgolly.navermaps.naver.maps.Feature, 
    typingsJapgolly.navermaps.naver.maps.StyleOptions
  ]
  type SymbolStyle = java.lang.String
  type forEachOverlayCallback = js.Function2[
    /* overlay */ typingsJapgolly.navermaps.naver.maps.Marker | typingsJapgolly.navermaps.naver.maps.Polyline | typingsJapgolly.navermaps.naver.maps.Polygon, 
    /* index */ scala.Double, 
    scala.Unit
  ]
}
