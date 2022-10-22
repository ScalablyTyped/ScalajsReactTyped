package typingsJapgolly.ssimJs

import typingsJapgolly.ssimJs.anon.DataHeight
import typingsJapgolly.ssimJs.anon.Width
import typingsJapgolly.ssimJs.distTypesMod.ImageMatrix
import typingsJapgolly.ssimJs.distTypesMod.MSSIMMatrix
import typingsJapgolly.ssimJs.distTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWeberSsimMod {
  
  @JSImport("ssim.js/dist/weberSsim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def partialSumMatrix1(pixels: ImageMatrix, f: js.Function3[/* v */ Double, /* x */ Double, /* y */ Double, Double]): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("partialSumMatrix1")(pixels.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Width]
  
  inline def partialSumMatrix2(
    pixels1: ImageMatrix,
    pixels2: ImageMatrix,
    f: js.Function4[/* a */ Double, /* b */ Double, /* x */ Double, /* y */ Double, Double]
  ): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("partialSumMatrix2")(pixels1.asInstanceOf[js.Any], pixels2.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Width]
  
  inline def weberSsim(pixels1: ImageMatrix, pixels2: ImageMatrix, options: Options): MSSIMMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("weberSsim")(pixels1.asInstanceOf[js.Any], pixels2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MSSIMMatrix]
  
  inline def windowCovariance(pixels1: ImageMatrix, pixels2: ImageMatrix, sums1: Any, sums2: Any, windowSize: Double): DataHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("windowCovariance")(pixels1.asInstanceOf[js.Any], pixels2.asInstanceOf[js.Any], sums1.asInstanceOf[js.Any], sums2.asInstanceOf[js.Any], windowSize.asInstanceOf[js.Any])).asInstanceOf[DataHeight]
  
  inline def windowMatrix(sumMatrix: Any, windowSize: Double, divisor: Double): DataHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("windowMatrix")(sumMatrix.asInstanceOf[js.Any], windowSize.asInstanceOf[js.Any], divisor.asInstanceOf[js.Any])).asInstanceOf[DataHeight]
  
  inline def windowSums(pixels: ImageMatrix, windowSize: Double): DataHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("windowSums")(pixels.asInstanceOf[js.Any], windowSize.asInstanceOf[js.Any])).asInstanceOf[DataHeight]
  
  inline def windowVariance(pixels: ImageMatrix, sums: Any, windowSize: Double): DataHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("windowVariance")(pixels.asInstanceOf[js.Any], sums.asInstanceOf[js.Any], windowSize.asInstanceOf[js.Any])).asInstanceOf[DataHeight]
}
