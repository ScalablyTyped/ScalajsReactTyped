package typingsJapgolly.navermaps.global.naver.maps

import typingsJapgolly.navermaps.naver.maps.Coord
import typingsJapgolly.navermaps.naver.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.LatLngBounds")
@js.native
open class LatLngBounds protected ()
  extends StObject
     with typingsJapgolly.navermaps.naver.maps.LatLngBounds {
  def this(sw: typingsJapgolly.navermaps.naver.maps.LatLng, ne: typingsJapgolly.navermaps.naver.maps.LatLng) = this()
}
object LatLngBounds {
  
  @JSGlobal("naver.maps.LatLngBounds")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def bounds(latlng: Coord, latlngN: Coord): typingsJapgolly.navermaps.naver.maps.LatLngBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(latlng.asInstanceOf[js.Any], latlngN.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.navermaps.naver.maps.LatLngBounds]
  inline def bounds(latlng: Coord, latlngN: LatLngLiteral): typingsJapgolly.navermaps.naver.maps.LatLngBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(latlng.asInstanceOf[js.Any], latlngN.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.navermaps.naver.maps.LatLngBounds]
  inline def bounds(latlng: LatLngLiteral, latlngN: Coord): typingsJapgolly.navermaps.naver.maps.LatLngBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(latlng.asInstanceOf[js.Any], latlngN.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.navermaps.naver.maps.LatLngBounds]
  inline def bounds(latlng: LatLngLiteral, latlngN: LatLngLiteral): typingsJapgolly.navermaps.naver.maps.LatLngBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(latlng.asInstanceOf[js.Any], latlngN.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.navermaps.naver.maps.LatLngBounds]
}
