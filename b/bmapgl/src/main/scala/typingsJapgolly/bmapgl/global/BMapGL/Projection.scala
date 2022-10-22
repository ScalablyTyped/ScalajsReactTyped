package typingsJapgolly.bmapgl.global.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.Projection")
@js.native
open class Projection ()
  extends StObject
     with typingsJapgolly.bmapgl.BMapGL.Projection {
  
  /* CompleteClass */
  override def lngLatToPoint(lngLat: typingsJapgolly.bmapgl.BMapGL.Point): typingsJapgolly.bmapgl.BMapGL.Pixel = js.native
  
  /* CompleteClass */
  override def pointToLngLat(point: typingsJapgolly.bmapgl.BMapGL.Pixel): typingsJapgolly.bmapgl.BMapGL.Point = js.native
}
object Projection {
  
  @JSGlobal("BMapGL.Projection")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def convertLL2MC(point: typingsJapgolly.bmapgl.BMapGL.Point): typingsJapgolly.bmapgl.BMapGL.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("convertLL2MC")(point.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bmapgl.BMapGL.Point]
  
  /* static member */
  inline def convertMC2LL(point: typingsJapgolly.bmapgl.BMapGL.Point): typingsJapgolly.bmapgl.BMapGL.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("convertMC2LL")(point.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bmapgl.BMapGL.Point]
  
  /* static member */
  inline def proximityConvertMC2LL(point: typingsJapgolly.bmapgl.BMapGL.Point): typingsJapgolly.bmapgl.BMapGL.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("proximityConvertMC2LL")(point.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bmapgl.BMapGL.Point]
}
