package typingsJapgolly.ssimJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatlabModMod {
  
  @JSImport("ssim.js/dist/matlab/mod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mod(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
}
