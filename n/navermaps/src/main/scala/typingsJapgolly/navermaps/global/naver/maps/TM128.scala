package typingsJapgolly.navermaps.global.naver.maps

import typingsJapgolly.navermaps.naver.maps.Coord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TM128 {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSGlobal("naver.maps.TM128")
  @js.native
  val ^ : js.Any = js.native
  
  // extends TM128Coord
  inline def fromCoordToPoint(latlng: Coord): typingsJapgolly.navermaps.naver.maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordToPoint")(latlng.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.Point]
  
  inline def fromPointToCoord(point: typingsJapgolly.navermaps.naver.maps.Point): typingsJapgolly.navermaps.naver.maps.LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointToCoord")(point.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.navermaps.naver.maps.LatLng]
}
