package typingsJapgolly.navermaps.global.naver.maps

import typingsJapgolly.navermaps.naver.maps.Coord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EPSG3857 {
  
  // Projection
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSGlobal("naver.maps.EPSG3857")
  @js.native
  val ^ : js.Any = js.native
  
  // implements Projection
  inline def fromCoordToPoint(coord: Coord): typingsJapgolly.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToPoint")(coord.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.Point]
  
  inline def fromLatLngToPoint(latlng: typingsJapgolly.navermaps.naver.maps.LatLng): typingsJapgolly.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLngToPoint")(latlng.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.Point]
  
  inline def fromPointToCoord(point: typingsJapgolly.navermaps.naver.maps.Point): typingsJapgolly.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointToCoord")(point.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.LatLng]
  
  inline def fromPointToLatLng(point: typingsJapgolly.navermaps.naver.maps.Point): typingsJapgolly.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointToLatLng")(point.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.LatLng]
  
  inline def getDestinationCoord(fromLatLng: typingsJapgolly.navermaps.naver.maps.LatLng, angle: Double, meter: Double): typingsJapgolly.navermaps.naver.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("getDestinationCoord")(fromLatLng.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], meter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.navermaps.naver.maps.LatLng]
  
  inline def getDistance(
    latlng1: typingsJapgolly.navermaps.naver.maps.LatLng,
    latlng2: typingsJapgolly.navermaps.naver.maps.LatLng
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistance")(latlng1.asInstanceOf[js.Any], latlng2.asInstanceOf[js.Any])).asInstanceOf[Double]
}
