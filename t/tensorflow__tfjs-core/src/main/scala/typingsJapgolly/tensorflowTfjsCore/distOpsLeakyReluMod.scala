package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsLeakyReluMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/leaky_relu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def leakyRelu[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("leakyRelu")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def leakyRelu[T /* <: Tensor[Rank] */](x: T | TensorLike, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("leakyRelu")(x.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
}
