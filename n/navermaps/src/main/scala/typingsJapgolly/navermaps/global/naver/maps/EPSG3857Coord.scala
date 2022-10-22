package typingsJapgolly.navermaps.global.naver.maps

import typingsJapgolly.navermaps.naver.maps.Coord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EPSG3857Coord {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSGlobal("naver.maps.EPSG3857Coord")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCoordToLatLng(coord: typingsJapgolly.navermaps.naver.maps.Point): typingsJapgolly.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToLatLng")(coord.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.LatLng]
  
  inline def fromCoordToPoint(coord: typingsJapgolly.navermaps.naver.maps.Point): typingsJapgolly.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToPoint")(coord.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.Point]
  
  inline def fromEPSG3857ToLatLng(coord: typingsJapgolly.navermaps.naver.maps.Point): typingsJapgolly.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEPSG3857ToLatLng")(coord.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.LatLng]
  
  inline def fromEPSG3857ToPoint(coord: typingsJapgolly.navermaps.naver.maps.Point): typingsJapgolly.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEPSG3857ToPoint")(coord.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.Point]
  
  inline def fromLatLngToCoord(coord: Coord): typingsJapgolly.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLngToCoord")(coord.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.Point]
  
  inline def fromLatLngToEPSG3857(coord: Coord): typingsJapgolly.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLngToEPSG3857")(coord.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.Point]
  
  inline def fromPointToCoord(point: typingsJapgolly.navermaps.naver.maps.Point): typingsJapgolly.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointToCoord")(point.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.Point]
  
  inline def fromPointToEPSG3857(point: typingsJapgolly.navermaps.naver.maps.Point): typingsJapgolly.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointToEPSG3857")(point.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.Point]
}
