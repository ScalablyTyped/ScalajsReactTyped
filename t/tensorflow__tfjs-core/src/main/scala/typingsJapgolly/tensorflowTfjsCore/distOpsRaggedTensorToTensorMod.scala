package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsRaggedTensorToTensorMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ragged_tensor_to_tensor", "raggedTensorToTensor")
  @js.native
  val raggedTensorToTensor: js.Function5[
    /* shape */ Tensor[Rank] | TensorLike, 
    /* values */ Tensor[Rank] | TensorLike, 
    /* defaultValue */ Tensor[Rank] | TensorLike, 
    /* rowPartitionTensors */ js.Array[Tensor[Rank]], 
    /* rowPartitionTypes */ js.Array[String], 
    Tensor[Rank]
  ] = js.native
}
