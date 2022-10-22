package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsJapgolly.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsSparseSparseReshapeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/sparse/sparse_reshape", "sparseReshape")
  @js.native
  val sparseReshape: js.Function3[
    /* inputIndices */ Tensor2D | TensorLike, 
    /* inputShape */ Tensor1D | TensorLike, 
    /* newShape */ Tensor1D | TensorLike, 
    NamedTensorMap
  ] = js.native
}
