package typingsJapgolly.ssimJs

import typingsJapgolly.ssimJs.distTypesMod.Matrix
import typingsJapgolly.ssimJs.ssimJsStrings.both
import typingsJapgolly.ssimJs.ssimJsStrings.symmetric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatlabPadarrayMod {
  
  @JSImport("ssim.js/dist/matlab/padarray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def padarray(A: Matrix, hasPadHeightPadWidth: js.Tuple2[Double, Double]): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("padarray")(A.asInstanceOf[js.Any], hasPadHeightPadWidth.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def padarray(
    A: Matrix,
    hasPadHeightPadWidth: js.Tuple2[Double, Double],
    _padval: Unit,
    _direction: PaddingDirection
  ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("padarray")(A.asInstanceOf[js.Any], hasPadHeightPadWidth.asInstanceOf[js.Any], _padval.asInstanceOf[js.Any], _direction.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def padarray(A: Matrix, hasPadHeightPadWidth: js.Tuple2[Double, Double], _padval: PaddingValue): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("padarray")(A.asInstanceOf[js.Any], hasPadHeightPadWidth.asInstanceOf[js.Any], _padval.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def padarray(
    A: Matrix,
    hasPadHeightPadWidth: js.Tuple2[Double, Double],
    _padval: PaddingValue,
    _direction: PaddingDirection
  ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("padarray")(A.asInstanceOf[js.Any], hasPadHeightPadWidth.asInstanceOf[js.Any], _padval.asInstanceOf[js.Any], _direction.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  type PaddingDirection = both
  
  type PaddingValue = symmetric
}
