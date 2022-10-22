package typingsJapgolly.obeliskJs.mod

import org.scalajs.dom.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("obelisk.js", "CanvasTool")
@js.native
open class CanvasTool () extends StObject
/* static members */
object CanvasTool {
  
  @JSImport("obelisk.js", "CanvasTool")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPixel(imageData: ImageData, x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPixel")(imageData.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
}
