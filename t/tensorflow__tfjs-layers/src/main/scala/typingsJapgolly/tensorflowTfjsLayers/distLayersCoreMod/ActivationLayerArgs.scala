package typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod

import typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatActivationConfigMod.ActivationIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivationLayerArgs
  extends StObject
     with LayerArgs {
  
  /**
    * Name of the activation function to use.
    */
  var activation: ActivationIdentifier
}
object ActivationLayerArgs {
  
  inline def apply(activation: ActivationIdentifier): ActivationLayerArgs = {
    val __obj = js.Dynamic.literal(activation = activation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivationLayerArgs]
  }
  
  extension [Self <: ActivationLayerArgs](x: Self) {
    
    inline def setActivation(value: ActivationIdentifier): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
  }
}
