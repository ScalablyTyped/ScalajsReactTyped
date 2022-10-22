package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsLinalgBandPartMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/linalg/band_part", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bandPart[T /* <: Tensor[Rank] */](a: T | TensorLike, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
}
