package typingsJapgolly.tensorflowTfjsCore.distBaseMod

import typingsJapgolly.tensorflowTfjsCore.anon.A
import typingsJapgolly.tensorflowTfjsCore.anon.Activation
import typingsJapgolly.tensorflowTfjsCore.anon.Bias
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor4D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fused {
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "fused")
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv2d[T /* <: Tensor3D | Tensor4D */](
    hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeightsLeakyreluAlpha: Activation[T]
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeightsLeakyreluAlpha.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def depthwiseConv2d[T /* <: Tensor3D | Tensor4D */](
    hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeightsLeakyreluAlpha: Bias[T]
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeightsLeakyreluAlpha.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "fused.matMul")
  @js.native
  val matMul: js.Function1[
    /* hasABTransposeATransposeBBiasActivationPreluActivationWeightsLeakyreluAlpha */ A, 
    Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
}
