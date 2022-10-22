package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsReverseMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/reverse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reverse[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def reverse[T /* <: Tensor[Rank] */](x: T | TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def reverse[T /* <: Tensor[Rank] */](x: T | TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
}
