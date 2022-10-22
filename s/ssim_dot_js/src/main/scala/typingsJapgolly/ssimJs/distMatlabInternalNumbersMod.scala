package typingsJapgolly.ssimJs

import typingsJapgolly.ssimJs.distTypesMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatlabInternalNumbersMod {
  
  @JSImport("ssim.js/dist/matlab/internal/numbers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def numbers(height: Double, width: Double, num: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("numbers")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}
