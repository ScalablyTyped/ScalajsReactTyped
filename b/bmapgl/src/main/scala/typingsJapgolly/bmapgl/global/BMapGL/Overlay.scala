package typingsJapgolly.bmapgl.global.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.Overlay")
@js.native
open class Overlay ()
  extends StObject
     with typingsJapgolly.bmapgl.BMapGL.Overlay
object Overlay {
  
  @JSGlobal("BMapGL.Overlay")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getZIndex(lat: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getZIndex")(lat.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getZIndex(lat: Double, coordTyppe: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getZIndex")(lat.asInstanceOf[js.Any], coordTyppe.asInstanceOf[js.Any])).asInstanceOf[Double]
}
