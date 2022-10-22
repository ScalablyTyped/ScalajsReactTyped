package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsBatchToSpaceNdMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/batch_to_space_nd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def batchToSpaceND[T /* <: Tensor[Rank] */](x: T | TensorLike, blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("batchToSpaceND")(x.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any], crops.asInstanceOf[js.Any])).asInstanceOf[T]
}
