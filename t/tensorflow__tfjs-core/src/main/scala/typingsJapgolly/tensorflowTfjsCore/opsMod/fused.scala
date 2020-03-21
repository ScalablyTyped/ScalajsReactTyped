package typingsJapgolly.tensorflowTfjsCore.opsMod

import typingsJapgolly.tensorflowTfjsCore.AnonA
import typingsJapgolly.tensorflowTfjsCore.AnonActivation
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor3D
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "fused")
@js.native
object fused extends js.Object {
  @js.native
  object conv2d extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](
      hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: AnonActivation[T]
    ): T = js.native
  }
  
  @js.native
  object depthwiseConv2d extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](
      hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: AnonActivation[T]
    ): T = js.native
  }
  
  @js.native
  object matMul extends js.Object {
    def apply[T /* <: Tensor[Rank] */](hasABTransposeATransposeBBiasActivationPreluActivationWeights: AnonA[T]): T = js.native
  }
  
}

