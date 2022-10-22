package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Scalar
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsJapgolly.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.ScalarLike
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsSparseSparseFillEmptyRowsMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/sparse/sparse_fill_empty_rows", "sparseFillEmptyRows")
  @js.native
  val sparseFillEmptyRows: js.Function4[
    /* indices */ Tensor2D | TensorLike, 
    /* values */ Tensor1D | TensorLike, 
    /* denseShape */ Tensor1D | TensorLike, 
    /* defaultValue */ Scalar | ScalarLike, 
    NamedTensorMap
  ] = js.native
}
