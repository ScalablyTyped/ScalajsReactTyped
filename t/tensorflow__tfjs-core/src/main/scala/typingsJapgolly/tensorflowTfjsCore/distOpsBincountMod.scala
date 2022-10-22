package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsBincountMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/bincount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bincount[T /* <: Tensor1D */](x: T | TensorLike, weights: T | TensorLike, size: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bincount")(x.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
}
