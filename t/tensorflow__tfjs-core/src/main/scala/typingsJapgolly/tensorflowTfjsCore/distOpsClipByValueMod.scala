package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsClipByValueMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/clip_by_value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clipByValue[T /* <: Tensor[Rank] */](x: T | TensorLike, clipValueMin: Double, clipValueMax: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clipByValue")(x.asInstanceOf[js.Any], clipValueMin.asInstanceOf[js.Any], clipValueMax.asInstanceOf[js.Any])).asInstanceOf[T]
}
