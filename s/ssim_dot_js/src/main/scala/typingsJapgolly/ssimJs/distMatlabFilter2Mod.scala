package typingsJapgolly.ssimJs

import typingsJapgolly.ssimJs.distTypesMod.Matrix
import typingsJapgolly.ssimJs.distTypesMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatlabFilter2Mod {
  
  @JSImport("ssim.js/dist/matlab/filter2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filter2(h: Matrix, X: Matrix): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("filter2")(h.asInstanceOf[js.Any], X.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def filter2(h: Matrix, X: Matrix, shape: Shape): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("filter2")(h.asInstanceOf[js.Any], X.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}
