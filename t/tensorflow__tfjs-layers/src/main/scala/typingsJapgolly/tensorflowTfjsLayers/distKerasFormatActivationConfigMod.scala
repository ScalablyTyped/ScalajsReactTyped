package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.elu_
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hard_sigmoid
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mish
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu_
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softmax_
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.swish
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatActivationConfigMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/activation_config", "activationOptions")
  @js.native
  val activationOptions: js.Array[
    linear | relu_ | elu_ | relu6 | sigmoid | hard_sigmoid | selu | softmax_ | softplus | softsign | tanh | swish | mish
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.elu_
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hardSigmoid
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu_
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softmax_
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.swish
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mish
  */
  trait ActivationIdentifier extends StObject
  object ActivationIdentifier {
    
    inline def elu: elu_ = "elu".asInstanceOf[elu_]
    
    inline def hardSigmoid: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hardSigmoid = "hardSigmoid".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hardSigmoid]
    
    inline def linear: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear = "linear".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear]
    
    inline def mish: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mish = "mish".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mish]
    
    inline def relu: relu_ = "relu".asInstanceOf[relu_]
    
    inline def relu6: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6 = "relu6".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6]
    
    inline def selu: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu = "selu".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu]
    
    inline def sigmoid: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid = "sigmoid".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid]
    
    inline def softmax: softmax_ = "softmax".asInstanceOf[softmax_]
    
    inline def softplus: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus = "softplus".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus]
    
    inline def softsign: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign = "softsign".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign]
    
    inline def swish: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.swish = "swish".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.swish]
    
    inline def tanh: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh = "tanh".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh]
  }
  
  type ActivationSerialization = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<'linear' | 'relu' | 'elu' | 'relu6' | 'sigmoid' | 'hard_sigmoid' | 'selu' | 'softmax' | 'softplus' | 'softsign' | 'tanh' | 'swish' | 'mish'>[number] */ js.Any
}
