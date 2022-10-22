package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsPadMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/pad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pad[T /* <: Tensor[Rank] */](x: T | TensorLike, paddings: js.Array[js.Tuple2[Double, Double]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(x.asInstanceOf[js.Any], paddings.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def pad[T /* <: Tensor[Rank] */](x: T | TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(x.asInstanceOf[js.Any], paddings.asInstanceOf[js.Any], constantValue.asInstanceOf[js.Any])).asInstanceOf[T]
}
