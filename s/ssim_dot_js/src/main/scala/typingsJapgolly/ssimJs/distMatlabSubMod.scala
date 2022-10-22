package typingsJapgolly.ssimJs

import typingsJapgolly.ssimJs.distTypesMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatlabSubMod {
  
  @JSImport("ssim.js/dist/matlab/sub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sub(hasRefRefWidth: Matrix, x: Double, height: Double, y: Double, width: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(hasRefRefWidth.asInstanceOf[js.Any], x.asInstanceOf[js.Any], height.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}
