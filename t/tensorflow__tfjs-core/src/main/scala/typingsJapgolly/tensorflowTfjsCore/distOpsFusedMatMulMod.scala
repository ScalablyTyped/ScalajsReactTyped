package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.anon.A
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsFusedMatMulMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fused/mat_mul", "matMul")
  @js.native
  val matMul: js.Function1[
    /* hasABTransposeATransposeBBiasActivationPreluActivationWeightsLeakyreluAlpha */ A, 
    Tensor[Rank]
  ] = js.native
}
