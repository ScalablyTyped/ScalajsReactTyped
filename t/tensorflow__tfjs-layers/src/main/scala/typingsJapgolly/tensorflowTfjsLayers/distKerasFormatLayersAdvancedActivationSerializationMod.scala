package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatConstraintConfigMod.ConstraintSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatInitializerConfigMod.InitializerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatRegularizerConfigMod.RegularizerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.BaseLayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.LayerConfig
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatLayersAdvancedActivationSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/advanced_activation_serialization", "advancedActivationLayerClassNames")
  @js.native
  val advancedActivationLayerClassNames: js.Array[AdvancedActivationLayerClassName] = js.native
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/advanced_activation_serialization.AdvancedActivationLayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU
  */
  trait AdvancedActivationLayerClassName extends StObject
  object AdvancedActivationLayerClassName {
    
    inline def ELU: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU = "ELU".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU]
    
    inline def LeakyReLU: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU = "LeakyReLU".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU]
    
    inline def PReLU: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU = "PReLU".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU]
    
    inline def ReLU: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU = "ReLU".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU]
    
    inline def Softmax: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax = "Softmax".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax]
    
    inline def ThresholdedReLU: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU = "ThresholdedReLU".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU]
  }
  
  type AdvancedActivationLayerSerialization = ReLULayerSerialization | LeakyReLULayerSerialization | PReLULayerSerialization | ELULayerSerialization | ThresholdedReLULayerSerialization | SoftmaxLayerSerialization
  
  trait ELULayerConfig
    extends StObject
       with LayerConfig {
    
    var alpha: js.UndefOr[Double] = js.undefined
  }
  object ELULayerConfig {
    
    inline def apply(): ELULayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ELULayerConfig]
    }
    
    extension [Self <: ELULayerConfig](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    }
  }
  
  type ELULayerSerialization = BaseLayerSerialization[ELU, ELULayerConfig]
  
  trait LeakyReLULayerConfig
    extends StObject
       with LayerConfig {
    
    var alpha: js.UndefOr[Double] = js.undefined
  }
  object LeakyReLULayerConfig {
    
    inline def apply(): LeakyReLULayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LeakyReLULayerConfig]
    }
    
    extension [Self <: LeakyReLULayerConfig](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    }
  }
  
  type LeakyReLULayerSerialization = BaseLayerSerialization[LeakyReLU, LeakyReLULayerConfig]
  
  trait PReLULayerConfig
    extends StObject
       with LayerConfig {
    
    var alpha_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
    
    var alpha_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var alpha_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var shared_axes: js.UndefOr[Double | js.Array[Double]] = js.undefined
  }
  object PReLULayerConfig {
    
    inline def apply(): PReLULayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PReLULayerConfig]
    }
    
    extension [Self <: PReLULayerConfig](x: Self) {
      
      inline def setAlpha_constraint(value: ConstraintSerialization): Self = StObject.set(x, "alpha_constraint", value.asInstanceOf[js.Any])
      
      inline def setAlpha_constraintUndefined: Self = StObject.set(x, "alpha_constraint", js.undefined)
      
      inline def setAlpha_initializer(value: InitializerSerialization): Self = StObject.set(x, "alpha_initializer", value.asInstanceOf[js.Any])
      
      inline def setAlpha_initializerUndefined: Self = StObject.set(x, "alpha_initializer", js.undefined)
      
      inline def setAlpha_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "alpha_regularizer", value.asInstanceOf[js.Any])
      
      inline def setAlpha_regularizerUndefined: Self = StObject.set(x, "alpha_regularizer", js.undefined)
      
      inline def setShared_axes(value: Double | js.Array[Double]): Self = StObject.set(x, "shared_axes", value.asInstanceOf[js.Any])
      
      inline def setShared_axesUndefined: Self = StObject.set(x, "shared_axes", js.undefined)
      
      inline def setShared_axesVarargs(value: Double*): Self = StObject.set(x, "shared_axes", js.Array(value*))
    }
  }
  
  type PReLULayerSerialization = BaseLayerSerialization[PReLU, PReLULayerConfig]
  
  trait ReLULayerConfig
    extends StObject
       with LayerConfig {
    
    var max_value: js.UndefOr[Double] = js.undefined
  }
  object ReLULayerConfig {
    
    inline def apply(): ReLULayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReLULayerConfig]
    }
    
    extension [Self <: ReLULayerConfig](x: Self) {
      
      inline def setMax_value(value: Double): Self = StObject.set(x, "max_value", value.asInstanceOf[js.Any])
      
      inline def setMax_valueUndefined: Self = StObject.set(x, "max_value", js.undefined)
    }
  }
  
  type ReLULayerSerialization = BaseLayerSerialization[ReLU, ReLULayerConfig]
  
  trait SoftmaxLayerConfig
    extends StObject
       with LayerConfig {
    
    var axis: js.UndefOr[Double] = js.undefined
  }
  object SoftmaxLayerConfig {
    
    inline def apply(): SoftmaxLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SoftmaxLayerConfig]
    }
    
    extension [Self <: SoftmaxLayerConfig](x: Self) {
      
      inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    }
  }
  
  type SoftmaxLayerSerialization = BaseLayerSerialization[Softmax, SoftmaxLayerConfig]
  
  trait ThresholdedReLULayerConfig
    extends StObject
       with LayerConfig {
    
    var theta: js.UndefOr[Double] = js.undefined
  }
  object ThresholdedReLULayerConfig {
    
    inline def apply(): ThresholdedReLULayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThresholdedReLULayerConfig]
    }
    
    extension [Self <: ThresholdedReLULayerConfig](x: Self) {
      
      inline def setTheta(value: Double): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      inline def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
    }
  }
  
  type ThresholdedReLULayerSerialization = BaseLayerSerialization[ThresholdedReLU, ThresholdedReLULayerConfig]
}
