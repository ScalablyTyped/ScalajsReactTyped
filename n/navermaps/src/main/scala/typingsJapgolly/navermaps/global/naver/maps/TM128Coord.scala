package typingsJapgolly.navermaps.global.naver.maps

import typingsJapgolly.navermaps.naver.maps.Coord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TM128Coord {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSGlobal("naver.maps.TM128Coord")
  @js.native
  val ^ : js.Any = js.native
  
  // extends UTMK
  inline def fromCoordToLatLng(tm128: typingsJapgolly.navermaps.naver.maps.Point): typingsJapgolly.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToLatLng")(tm128.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.LatLng]
  
  inline def fromCoordToPoint(tm128: typingsJapgolly.navermaps.naver.maps.Point): typingsJapgolly.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToPoint")(tm128.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.Point]
  
  inline def fromLatLngToCoord(latlng: Coord): typingsJapgolly.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLngToCoord")(latlng.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.Point]
  
  inline def fromLatLngToTM128(latlng: Coord): typingsJapgolly.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLngToTM128")(latlng.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.Point]
  
  inline def fromPointToCoord(point: typingsJapgolly.navermaps.naver.maps.Point): typingsJapgolly.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointToCoord")(point.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.Point]
  
  inline def fromPointToTM128(point: typingsJapgolly.navermaps.naver.maps.Point): typingsJapgolly.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointToTM128")(point.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.Point]
  
  inline def fromTM128ToLatLng(tm128: typingsJapgolly.navermaps.naver.maps.Point): typingsJapgolly.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTM128ToLatLng")(tm128.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.LatLng]
  
  inline def fromTM128ToPoint(tm128: typingsJapgolly.navermaps.naver.maps.Point): typingsJapgolly.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTM128ToPoint")(tm128.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.Point]
  
  inline def fromTM128ToUTMK(tm128: typingsJapgolly.navermaps.naver.maps.Point): typingsJapgolly.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTM128ToUTMK")(tm128.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.Point]
  
  inline def fromUTMKToTM128(utmk: typingsJapgolly.navermaps.naver.maps.Point): typingsJapgolly.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUTMKToTM128")(utmk.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.Point]
}
