package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.anon.A
import typingsJapgolly.tensorflowTfjsCore.anon.Activation
import typingsJapgolly.tensorflowTfjsCore.anon.Bias
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsFusedOpsMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fused_ops", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv2d[T /* <: Tensor3D | Tensor4D */](
    hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeightsLeakyreluAlpha: Activation[T]
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeightsLeakyreluAlpha.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def depthwiseConv2d[T /* <: Tensor3D | Tensor4D */](
    hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeightsLeakyreluAlpha: Bias[T]
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeightsLeakyreluAlpha.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fused_ops", "matMul")
  @js.native
  val matMul: js.Function1[
    /* hasABTransposeATransposeBBiasActivationPreluActivationWeightsLeakyreluAlpha */ A, 
    Tensor[Rank]
  ] = js.native
}
