package typingsJapgolly.navermaps.global.naver.maps

import typingsJapgolly.navermaps.naver.maps.Coord
import typingsJapgolly.navermaps.naver.maps.PointLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("naver.maps.PointBounds")
@js.native
open class PointBounds protected ()
  extends StObject
     with typingsJapgolly.navermaps.naver.maps.PointBounds {
  def this(
    minPoint: typingsJapgolly.navermaps.naver.maps.Point,
    maxPoint: typingsJapgolly.navermaps.naver.maps.Point
  ) = this()
}
object PointBounds {
  
  @JSGlobal("naver.maps.PointBounds")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def bounds(point: Coord, pointN: Coord): typingsJapgolly.navermaps.naver.maps.PointBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(point.asInstanceOf[js.Any], pointN.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.navermaps.naver.maps.PointBounds]
  inline def bounds(point: Coord, pointN: PointLiteral): typingsJapgolly.navermaps.naver.maps.PointBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(point.asInstanceOf[js.Any], pointN.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.navermaps.naver.maps.PointBounds]
  inline def bounds(point: PointLiteral, pointN: Coord): typingsJapgolly.navermaps.naver.maps.PointBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(point.asInstanceOf[js.Any], pointN.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.navermaps.naver.maps.PointBounds]
  inline def bounds(point: PointLiteral, pointN: PointLiteral): typingsJapgolly.navermaps.naver.maps.PointBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(point.asInstanceOf[js.Any], pointN.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.navermaps.naver.maps.PointBounds]
}
