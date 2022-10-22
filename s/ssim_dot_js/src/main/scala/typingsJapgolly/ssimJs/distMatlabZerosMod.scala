package typingsJapgolly.ssimJs

import typingsJapgolly.ssimJs.distTypesMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatlabZerosMod {
  
  @JSImport("ssim.js/dist/matlab/zeros", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zeros(height: Double): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(height.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  inline def zeros(height: Double, width: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}
