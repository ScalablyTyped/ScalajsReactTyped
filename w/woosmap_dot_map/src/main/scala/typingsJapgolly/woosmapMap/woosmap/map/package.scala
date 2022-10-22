package typingsJapgolly.woosmapMap.woosmap.map

import typingsJapgolly.woosmapMap.woosmap.map.data.Feature
import typingsJapgolly.woosmapMap.woosmapMapStrings.LineString
import typingsJapgolly.woosmapMap.woosmapMapStrings.MultiLineString
import typingsJapgolly.woosmapMap.woosmapMapStrings.MultiPoint
import typingsJapgolly.woosmapMap.woosmapMapStrings.MultiPolygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BasePolygon = BaseGeometry

type Coordinates = js.Tuple2[Double, Double]

type GeoJSONGeometry = GeoJSONPoint | GeoJSONMultiPoint | GeoJSONLineString | GeoJSONMultiLineString | GeoJSONPolygon | GeoJSONMultiPolygon | GeoJSONGeometryCollection

type GeoJSONLineString = GeoJSONRawGeometry[LineString, js.Array[GeoJSONPosition]]

type GeoJSONMultiLineString = GeoJSONRawGeometry[MultiLineString, js.Array[js.Array[GeoJSONPosition]]]

type GeoJSONMultiPoint = GeoJSONRawGeometry[MultiPoint, js.Array[GeoJSONPosition]]

type GeoJSONMultiPolygon = GeoJSONRawGeometry[MultiPolygon, js.Array[js.Array[js.Array[GeoJSONPosition]]]]

type GeoJSONPoint = GeoJSONRawGeometry[typingsJapgolly.woosmapMap.woosmapMapStrings.Point, GeoJSONPosition]

type GeoJSONPolygon = GeoJSONRawGeometry[
typingsJapgolly.woosmapMap.woosmapMapStrings.Polygon, 
js.Array[js.Array[GeoJSONPosition]]]

type GeoJSONPosition = js.Tuple2[Double, Double]

type GeometryArray = js.Array[GeometryCollectionElement]

type StyleFunction = js.Function1[/* feature */ Feature, StyleOptions]
