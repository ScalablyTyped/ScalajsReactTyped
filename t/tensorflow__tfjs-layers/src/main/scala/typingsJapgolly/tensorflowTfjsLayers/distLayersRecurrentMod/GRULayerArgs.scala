package typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod

import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatActivationConfigMod.ActivationIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GRULayerArgs
  extends StObject
     with SimpleRNNLayerArgs {
  
  /**
    * Implementation mode, either 1 or 2.
    *
    * Mode 1 will structure its operations as a larger number of
    * smaller dot products and additions.
    *
    * Mode 2 will batch them into fewer, larger operations. These modes will
    * have different performance profiles on different hardware and
    * for different applications.
    *
    * Note: For superior performance, TensorFlow.js always uses implementation
    * 2, regardless of the actual value of this configuration field.
    */
  var implementation: js.UndefOr[Double] = js.undefined
  
  /**
    * Activation function to use for the recurrent step.
    *
    * Defaults to hard sigmoid (`hardSigmoid`).
    *
    * If `null`, no activation is applied.
    */
  var recurrentActivation: js.UndefOr[ActivationIdentifier] = js.undefined
}
object GRULayerArgs {
  
  inline def apply(units: Double): GRULayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[GRULayerArgs]
  }
  
  extension [Self <: GRULayerArgs](x: Self) {
    
    inline def setImplementation(value: Double): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    inline def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
    
    inline def setRecurrentActivation(value: ActivationIdentifier): Self = StObject.set(x, "recurrentActivation", value.asInstanceOf[js.Any])
    
    inline def setRecurrentActivationUndefined: Self = StObject.set(x, "recurrentActivation", js.undefined)
  }
}
