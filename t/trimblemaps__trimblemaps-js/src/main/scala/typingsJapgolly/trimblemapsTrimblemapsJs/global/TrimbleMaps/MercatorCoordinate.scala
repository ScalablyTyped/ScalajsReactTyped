package typingsJapgolly.trimblemapsTrimblemapsJs.global.TrimbleMaps

import typingsJapgolly.trimblemapsTrimblemapsJs.mod.LngLatLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TrimbleMaps.MercatorCoordinate")
@js.native
open class MercatorCoordinate protected ()
  extends typingsJapgolly.trimblemapsTrimblemapsJs.mod.MercatorCoordinate {
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
}
/* static members */
object MercatorCoordinate {
  
  @JSGlobal("TrimbleMaps.MercatorCoordinate")
  @js.native
  val ^ : js.Any = js.native
  
  /** Project a LngLat to a MercatorCoordinate. */
  inline def fromLngLat(lngLatLike: LngLatLike): typingsJapgolly.trimblemapsTrimblemapsJs.mod.MercatorCoordinate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLngLat")(lngLatLike.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.MercatorCoordinate]
  inline def fromLngLat(lngLatLike: LngLatLike, altitude: Double): typingsJapgolly.trimblemapsTrimblemapsJs.mod.MercatorCoordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLngLat")(lngLatLike.asInstanceOf[js.Any], altitude.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.MercatorCoordinate]
}
