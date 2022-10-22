package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatActivationConfigMod.ActivationSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatConstraintConfigMod.ConstraintSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatInitializerConfigMod.InitializerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatRegularizerConfigMod.RegularizerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.BaseLayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.LayerConfig
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatLayersCoreSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/core_serialization", "coreLayerClassNames")
  @js.native
  val coreLayerClassNames: js.Array[CoreLayerClassName] = js.native
  
  trait ActivationLayerConfig
    extends StObject
       with LayerConfig {
    
    var activation: ActivationSerialization
  }
  object ActivationLayerConfig {
    
    inline def apply(activation: ActivationSerialization): ActivationLayerConfig = {
      val __obj = js.Dynamic.literal(activation = activation.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActivationLayerConfig]
    }
    
    extension [Self <: ActivationLayerConfig](x: Self) {
      
      inline def setActivation(value: ActivationSerialization): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
    }
  }
  
  type ActivationLayerSerialization = BaseLayerSerialization[Activation, ActivationLayerConfig]
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/core_serialization.CoreLayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense
  */
  trait CoreLayerClassName extends StObject
  object CoreLayerClassName {
    
    inline def Activation: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation = "Activation".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation]
    
    inline def Dense: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense = "Dense".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense]
    
    inline def Dropout: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout = "Dropout".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout]
    
    inline def Flatten: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten = "Flatten".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten]
    
    inline def Masking: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking = "Masking".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking]
    
    inline def Permute: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute = "Permute".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute]
    
    inline def RepeatVector: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector = "RepeatVector".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector]
    
    inline def Reshape: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape = "Reshape".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape]
  }
  
  type CoreLayerSerialization = DropoutLayerSerialization | DenseLayerSerialization | FlattenLayerSerialization | ActivationLayerSerialization | RepeatVectorLayerSerialization | ReshapeLayerSerialization | PermuteLayerSerialization | MaskingLayerSerialization
  
  trait DenseLayerConfig
    extends StObject
       with LayerConfig {
    
    var activation: js.UndefOr[ActivationSerialization] = js.undefined
    
    var activity_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var bias_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
    
    var bias_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var bias_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var input_dim: js.UndefOr[Double] = js.undefined
    
    var kernel_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
    
    var kernel_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var kernel_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var units: Double
    
    var use_bias: js.UndefOr[Boolean] = js.undefined
  }
  object DenseLayerConfig {
    
    inline def apply(units: Double): DenseLayerConfig = {
      val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
      __obj.asInstanceOf[DenseLayerConfig]
    }
    
    extension [Self <: DenseLayerConfig](x: Self) {
      
      inline def setActivation(value: ActivationSerialization): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      inline def setActivity_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "activity_regularizer", value.asInstanceOf[js.Any])
      
      inline def setActivity_regularizerUndefined: Self = StObject.set(x, "activity_regularizer", js.undefined)
      
      inline def setBias_constraint(value: ConstraintSerialization): Self = StObject.set(x, "bias_constraint", value.asInstanceOf[js.Any])
      
      inline def setBias_constraintUndefined: Self = StObject.set(x, "bias_constraint", js.undefined)
      
      inline def setBias_initializer(value: InitializerSerialization): Self = StObject.set(x, "bias_initializer", value.asInstanceOf[js.Any])
      
      inline def setBias_initializerUndefined: Self = StObject.set(x, "bias_initializer", js.undefined)
      
      inline def setBias_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "bias_regularizer", value.asInstanceOf[js.Any])
      
      inline def setBias_regularizerUndefined: Self = StObject.set(x, "bias_regularizer", js.undefined)
      
      inline def setInput_dim(value: Double): Self = StObject.set(x, "input_dim", value.asInstanceOf[js.Any])
      
      inline def setInput_dimUndefined: Self = StObject.set(x, "input_dim", js.undefined)
      
      inline def setKernel_constraint(value: ConstraintSerialization): Self = StObject.set(x, "kernel_constraint", value.asInstanceOf[js.Any])
      
      inline def setKernel_constraintUndefined: Self = StObject.set(x, "kernel_constraint", js.undefined)
      
      inline def setKernel_initializer(value: InitializerSerialization): Self = StObject.set(x, "kernel_initializer", value.asInstanceOf[js.Any])
      
      inline def setKernel_initializerUndefined: Self = StObject.set(x, "kernel_initializer", js.undefined)
      
      inline def setKernel_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "kernel_regularizer", value.asInstanceOf[js.Any])
      
      inline def setKernel_regularizerUndefined: Self = StObject.set(x, "kernel_regularizer", js.undefined)
      
      inline def setUnits(value: Double): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUse_bias(value: Boolean): Self = StObject.set(x, "use_bias", value.asInstanceOf[js.Any])
      
      inline def setUse_biasUndefined: Self = StObject.set(x, "use_bias", js.undefined)
    }
  }
  
  type DenseLayerSerialization = BaseLayerSerialization[Dense, DenseLayerConfig]
  
  trait DropoutLayerConfig
    extends StObject
       with LayerConfig {
    
    var noise_shape: js.UndefOr[js.Array[Double]] = js.undefined
    
    var rate: Double
    
    var seed: js.UndefOr[Double] = js.undefined
  }
  object DropoutLayerConfig {
    
    inline def apply(rate: Double): DropoutLayerConfig = {
      val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropoutLayerConfig]
    }
    
    extension [Self <: DropoutLayerConfig](x: Self) {
      
      inline def setNoise_shape(value: js.Array[Double]): Self = StObject.set(x, "noise_shape", value.asInstanceOf[js.Any])
      
      inline def setNoise_shapeUndefined: Self = StObject.set(x, "noise_shape", js.undefined)
      
      inline def setNoise_shapeVarargs(value: Double*): Self = StObject.set(x, "noise_shape", js.Array(value*))
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
  
  type DropoutLayerSerialization = BaseLayerSerialization[Dropout, DropoutLayerConfig]
  
  type FlattenLayerSerialization = BaseLayerSerialization[Flatten, LayerConfig]
  
  trait MaskingLayerConfig
    extends StObject
       with LayerConfig {
    
    var maskValue: Double
  }
  object MaskingLayerConfig {
    
    inline def apply(maskValue: Double): MaskingLayerConfig = {
      val __obj = js.Dynamic.literal(maskValue = maskValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaskingLayerConfig]
    }
    
    extension [Self <: MaskingLayerConfig](x: Self) {
      
      inline def setMaskValue(value: Double): Self = StObject.set(x, "maskValue", value.asInstanceOf[js.Any])
    }
  }
  
  type MaskingLayerSerialization = BaseLayerSerialization[Masking, MaskingLayerConfig]
  
  trait PermuteLayerConfig
    extends StObject
       with LayerConfig {
    
    var dims: js.Array[Double]
  }
  object PermuteLayerConfig {
    
    inline def apply(dims: js.Array[Double]): PermuteLayerConfig = {
      val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermuteLayerConfig]
    }
    
    extension [Self <: PermuteLayerConfig](x: Self) {
      
      inline def setDims(value: js.Array[Double]): Self = StObject.set(x, "dims", value.asInstanceOf[js.Any])
      
      inline def setDimsVarargs(value: Double*): Self = StObject.set(x, "dims", js.Array(value*))
    }
  }
  
  type PermuteLayerSerialization = BaseLayerSerialization[Permute, PermuteLayerConfig]
  
  trait RepeatVectorLayerConfig
    extends StObject
       with LayerConfig {
    
    var n: Double
  }
  object RepeatVectorLayerConfig {
    
    inline def apply(n: Double): RepeatVectorLayerConfig = {
      val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepeatVectorLayerConfig]
    }
    
    extension [Self <: RepeatVectorLayerConfig](x: Self) {
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    }
  }
  
  type RepeatVectorLayerSerialization = BaseLayerSerialization[RepeatVector, RepeatVectorLayerConfig]
  
  trait ReshapeLayerConfig
    extends StObject
       with LayerConfig {
    
    var target_shape: Shape
  }
  object ReshapeLayerConfig {
    
    inline def apply(target_shape: Shape): ReshapeLayerConfig = {
      val __obj = js.Dynamic.literal(target_shape = target_shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReshapeLayerConfig]
    }
    
    extension [Self <: ReshapeLayerConfig](x: Self) {
      
      inline def setTarget_shape(value: Shape): Self = StObject.set(x, "target_shape", value.asInstanceOf[js.Any])
      
      inline def setTarget_shapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "target_shape", js.Array(value*))
    }
  }
  
  type ReshapeLayerSerialization = BaseLayerSerialization[Reshape, ReshapeLayerConfig]
}
