package typingsJapgolly.trimblemapsTrimblemapsJs.global.TrimbleMaps

import typingsJapgolly.trimblemapsTrimblemapsJs.mod.LngLatBoundsLike
import typingsJapgolly.trimblemapsTrimblemapsJs.mod.LngLatLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TrimbleMaps.LngLatBounds")
@js.native
open class LngLatBounds ()
  extends typingsJapgolly.trimblemapsTrimblemapsJs.mod.LngLatBounds {
  def this(boundsLike: js.Tuple2[LngLatLike, LngLatLike]) = this()
  def this(boundsLike: js.Tuple4[Double, Double, Double, Double]) = this()
  def this(sw: LngLatLike, ne: LngLatLike) = this()
}
/* static members */
object LngLatBounds {
  
  @JSGlobal("TrimbleMaps.LngLatBounds")
  @js.native
  val ^ : js.Any = js.native
  
  /** Convert an array to a LngLatBounds object, or return an existing LngLatBounds object unchanged. */
  inline def convert(input: LngLatBoundsLike): typingsJapgolly.trimblemapsTrimblemapsJs.mod.LngLatBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.LngLatBounds]
}
