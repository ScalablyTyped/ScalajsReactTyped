package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsImagMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/imag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def imag[T /* <: Tensor[Rank] */](input: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("imag")(input.asInstanceOf[js.Any]).asInstanceOf[T]
}
