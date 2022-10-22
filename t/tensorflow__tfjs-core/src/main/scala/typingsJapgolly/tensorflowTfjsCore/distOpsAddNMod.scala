package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsAddNMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/add_n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addN[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("addN")(tensors.asInstanceOf[js.Any]).asInstanceOf[T]
}
