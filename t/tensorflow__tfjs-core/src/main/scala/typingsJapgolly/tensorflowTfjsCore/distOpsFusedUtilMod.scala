package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsFusedUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fused_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyActivation(x: Tensor[Rank], activation: Activation): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyActivation")(x.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def applyActivation(x: Tensor[Rank], activation: Activation, preluActivationWeights: Unit, leakyreluAlpha: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyActivation")(x.asInstanceOf[js.Any], activation.asInstanceOf[js.Any], preluActivationWeights.asInstanceOf[js.Any], leakyreluAlpha.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def applyActivation(x: Tensor[Rank], activation: Activation, preluActivationWeights: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyActivation")(x.asInstanceOf[js.Any], activation.asInstanceOf[js.Any], preluActivationWeights.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def applyActivation(
    x: Tensor[Rank],
    activation: Activation,
    preluActivationWeights: Tensor[Rank],
    leakyreluAlpha: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyActivation")(x.asInstanceOf[js.Any], activation.asInstanceOf[js.Any], preluActivationWeights.asInstanceOf[js.Any], leakyreluAlpha.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def getFusedBiasGradient(bias: Tensor[Rank], dyActivation: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFusedBiasGradient")(bias.asInstanceOf[js.Any], dyActivation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def getFusedDyActivation(dy: Tensor[Rank], y: Tensor[Rank], activation: Activation): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFusedDyActivation")(dy.asInstanceOf[js.Any], y.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def shouldFuse(gradientDepth: Double, activation: Activation): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldFuse")(gradientDepth.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
