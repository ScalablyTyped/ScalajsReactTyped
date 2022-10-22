package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatActivationConfigMod.ActivationSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatConstraintConfigMod.ConstraintSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatInitializerConfigMod.InitializerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatRegularizerConfigMod.RegularizerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.BaseLayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.LayerConfig
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatTypesMod.BaseSerialization
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRUCell
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTMCell
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNNCell
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.StackedRNNCells
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatLayersRecurrentSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/recurrent_serialization", "recurrentLayerClassNames")
  @js.native
  val recurrentLayerClassNames: js.Array[RecurrentLayerClassName] = js.native
  
  trait BaseRNNLayerConfig
    extends StObject
       with LayerConfig {
    
    var cell: js.UndefOr[RNNCellSerialization | js.Array[RNNCellSerialization]] = js.undefined
    
    var go_backwards: js.UndefOr[Boolean] = js.undefined
    
    var input_dim: js.UndefOr[Double] = js.undefined
    
    var input_length: js.UndefOr[Double] = js.undefined
    
    var return_sequences: js.UndefOr[Boolean] = js.undefined
    
    var return_state: js.UndefOr[Boolean] = js.undefined
    
    var stateful: js.UndefOr[Boolean] = js.undefined
    
    var unroll: js.UndefOr[Boolean] = js.undefined
  }
  object BaseRNNLayerConfig {
    
    inline def apply(): BaseRNNLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseRNNLayerConfig]
    }
    
    extension [Self <: BaseRNNLayerConfig](x: Self) {
      
      inline def setCell(value: RNNCellSerialization | js.Array[RNNCellSerialization]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setCellVarargs(value: RNNCellSerialization*): Self = StObject.set(x, "cell", js.Array(value*))
      
      inline def setGo_backwards(value: Boolean): Self = StObject.set(x, "go_backwards", value.asInstanceOf[js.Any])
      
      inline def setGo_backwardsUndefined: Self = StObject.set(x, "go_backwards", js.undefined)
      
      inline def setInput_dim(value: Double): Self = StObject.set(x, "input_dim", value.asInstanceOf[js.Any])
      
      inline def setInput_dimUndefined: Self = StObject.set(x, "input_dim", js.undefined)
      
      inline def setInput_length(value: Double): Self = StObject.set(x, "input_length", value.asInstanceOf[js.Any])
      
      inline def setInput_lengthUndefined: Self = StObject.set(x, "input_length", js.undefined)
      
      inline def setReturn_sequences(value: Boolean): Self = StObject.set(x, "return_sequences", value.asInstanceOf[js.Any])
      
      inline def setReturn_sequencesUndefined: Self = StObject.set(x, "return_sequences", js.undefined)
      
      inline def setReturn_state(value: Boolean): Self = StObject.set(x, "return_state", value.asInstanceOf[js.Any])
      
      inline def setReturn_stateUndefined: Self = StObject.set(x, "return_state", js.undefined)
      
      inline def setStateful(value: Boolean): Self = StObject.set(x, "stateful", value.asInstanceOf[js.Any])
      
      inline def setStatefulUndefined: Self = StObject.set(x, "stateful", js.undefined)
      
      inline def setUnroll(value: Boolean): Self = StObject.set(x, "unroll", value.asInstanceOf[js.Any])
      
      inline def setUnrollUndefined: Self = StObject.set(x, "unroll", js.undefined)
    }
  }
  
  trait GRUCellConfig
    extends StObject
       with SimpleRNNCellConfig {
    
    var implementation: js.UndefOr[Double] = js.undefined
    
    var recurrent_activation: js.UndefOr[String] = js.undefined
  }
  object GRUCellConfig {
    
    inline def apply(units: Double): GRUCellConfig = {
      val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
      __obj.asInstanceOf[GRUCellConfig]
    }
    
    extension [Self <: GRUCellConfig](x: Self) {
      
      inline def setImplementation(value: Double): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      inline def setRecurrent_activation(value: String): Self = StObject.set(x, "recurrent_activation", value.asInstanceOf[js.Any])
      
      inline def setRecurrent_activationUndefined: Self = StObject.set(x, "recurrent_activation", js.undefined)
    }
  }
  
  type GRUCellSerialization = BaseSerialization[GRUCell, GRUCellConfig]
  
  trait GRULayerConfig
    extends StObject
       with SimpleRNNLayerConfig {
    
    var implementation: js.UndefOr[Double] = js.undefined
    
    var recurrent_activation: js.UndefOr[ActivationSerialization] = js.undefined
  }
  object GRULayerConfig {
    
    inline def apply(units: Double): GRULayerConfig = {
      val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
      __obj.asInstanceOf[GRULayerConfig]
    }
    
    extension [Self <: GRULayerConfig](x: Self) {
      
      inline def setImplementation(value: Double): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      inline def setRecurrent_activation(value: ActivationSerialization): Self = StObject.set(x, "recurrent_activation", value.asInstanceOf[js.Any])
      
      inline def setRecurrent_activationUndefined: Self = StObject.set(x, "recurrent_activation", js.undefined)
    }
  }
  
  type GRULayerSerialization = BaseLayerSerialization[GRU, GRULayerConfig]
  
  trait LSTMCellConfig
    extends StObject
       with SimpleRNNCellConfig {
    
    var implementation: js.UndefOr[Double] = js.undefined
    
    var recurrent_activation: js.UndefOr[ActivationSerialization] = js.undefined
    
    var unit_forget_bias: js.UndefOr[Boolean] = js.undefined
  }
  object LSTMCellConfig {
    
    inline def apply(units: Double): LSTMCellConfig = {
      val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
      __obj.asInstanceOf[LSTMCellConfig]
    }
    
    extension [Self <: LSTMCellConfig](x: Self) {
      
      inline def setImplementation(value: Double): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      inline def setRecurrent_activation(value: ActivationSerialization): Self = StObject.set(x, "recurrent_activation", value.asInstanceOf[js.Any])
      
      inline def setRecurrent_activationUndefined: Self = StObject.set(x, "recurrent_activation", js.undefined)
      
      inline def setUnit_forget_bias(value: Boolean): Self = StObject.set(x, "unit_forget_bias", value.asInstanceOf[js.Any])
      
      inline def setUnit_forget_biasUndefined: Self = StObject.set(x, "unit_forget_bias", js.undefined)
    }
  }
  
  type LSTMCellSerialization = BaseSerialization[LSTMCell, LSTMCellConfig]
  
  trait LSTMLayerConfig
    extends StObject
       with SimpleRNNLayerConfig {
    
    var implementation: js.UndefOr[Double] = js.undefined
    
    var recurrent_activation: js.UndefOr[ActivationSerialization] = js.undefined
    
    var unit_forget_bias: js.UndefOr[Boolean] = js.undefined
  }
  object LSTMLayerConfig {
    
    inline def apply(units: Double): LSTMLayerConfig = {
      val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
      __obj.asInstanceOf[LSTMLayerConfig]
    }
    
    extension [Self <: LSTMLayerConfig](x: Self) {
      
      inline def setImplementation(value: Double): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      inline def setRecurrent_activation(value: ActivationSerialization): Self = StObject.set(x, "recurrent_activation", value.asInstanceOf[js.Any])
      
      inline def setRecurrent_activationUndefined: Self = StObject.set(x, "recurrent_activation", js.undefined)
      
      inline def setUnit_forget_bias(value: Boolean): Self = StObject.set(x, "unit_forget_bias", value.asInstanceOf[js.Any])
      
      inline def setUnit_forget_biasUndefined: Self = StObject.set(x, "unit_forget_bias", js.undefined)
    }
  }
  
  type LSTMLayerSerialization = BaseLayerSerialization[LSTM, LSTMLayerConfig]
  
  type RNNCellSerialization = SimpleRNNCellSerialization | GRUCellSerialization | LSTMCellSerialization | StackedRNNCellsSerialization
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/recurrent_serialization.RecurrentLayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU
  */
  trait RecurrentLayerClassName extends StObject
  object RecurrentLayerClassName {
    
    inline def GRU: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU = "GRU".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU]
    
    inline def LSTM: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM = "LSTM".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM]
    
    inline def SimpleRNN: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN = "SimpleRNN".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN]
  }
  
  type RecurrentLayerSerialization = SimpleRNNLayerSerialization | LSTMLayerSerialization | GRULayerSerialization
  
  trait SimpleRNNCellConfig
    extends StObject
       with LayerConfig {
    
    var activation: js.UndefOr[ActivationSerialization] = js.undefined
    
    var bias_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
    
    var bias_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var bias_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var dropout: js.UndefOr[Double] = js.undefined
    
    var kernel_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
    
    var kernel_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var kernel_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var recurrent_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
    
    var recurrent_dropout: js.UndefOr[Double] = js.undefined
    
    var recurrent_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var recurrent_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var units: Double
    
    var use_bias: js.UndefOr[Boolean] = js.undefined
  }
  object SimpleRNNCellConfig {
    
    inline def apply(units: Double): SimpleRNNCellConfig = {
      val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleRNNCellConfig]
    }
    
    extension [Self <: SimpleRNNCellConfig](x: Self) {
      
      inline def setActivation(value: ActivationSerialization): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      inline def setBias_constraint(value: ConstraintSerialization): Self = StObject.set(x, "bias_constraint", value.asInstanceOf[js.Any])
      
      inline def setBias_constraintUndefined: Self = StObject.set(x, "bias_constraint", js.undefined)
      
      inline def setBias_initializer(value: InitializerSerialization): Self = StObject.set(x, "bias_initializer", value.asInstanceOf[js.Any])
      
      inline def setBias_initializerUndefined: Self = StObject.set(x, "bias_initializer", js.undefined)
      
      inline def setBias_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "bias_regularizer", value.asInstanceOf[js.Any])
      
      inline def setBias_regularizerUndefined: Self = StObject.set(x, "bias_regularizer", js.undefined)
      
      inline def setDropout(value: Double): Self = StObject.set(x, "dropout", value.asInstanceOf[js.Any])
      
      inline def setDropoutUndefined: Self = StObject.set(x, "dropout", js.undefined)
      
      inline def setKernel_constraint(value: ConstraintSerialization): Self = StObject.set(x, "kernel_constraint", value.asInstanceOf[js.Any])
      
      inline def setKernel_constraintUndefined: Self = StObject.set(x, "kernel_constraint", js.undefined)
      
      inline def setKernel_initializer(value: InitializerSerialization): Self = StObject.set(x, "kernel_initializer", value.asInstanceOf[js.Any])
      
      inline def setKernel_initializerUndefined: Self = StObject.set(x, "kernel_initializer", js.undefined)
      
      inline def setKernel_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "kernel_regularizer", value.asInstanceOf[js.Any])
      
      inline def setKernel_regularizerUndefined: Self = StObject.set(x, "kernel_regularizer", js.undefined)
      
      inline def setRecurrent_constraint(value: ConstraintSerialization): Self = StObject.set(x, "recurrent_constraint", value.asInstanceOf[js.Any])
      
      inline def setRecurrent_constraintUndefined: Self = StObject.set(x, "recurrent_constraint", js.undefined)
      
      inline def setRecurrent_dropout(value: Double): Self = StObject.set(x, "recurrent_dropout", value.asInstanceOf[js.Any])
      
      inline def setRecurrent_dropoutUndefined: Self = StObject.set(x, "recurrent_dropout", js.undefined)
      
      inline def setRecurrent_initializer(value: InitializerSerialization): Self = StObject.set(x, "recurrent_initializer", value.asInstanceOf[js.Any])
      
      inline def setRecurrent_initializerUndefined: Self = StObject.set(x, "recurrent_initializer", js.undefined)
      
      inline def setRecurrent_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "recurrent_regularizer", value.asInstanceOf[js.Any])
      
      inline def setRecurrent_regularizerUndefined: Self = StObject.set(x, "recurrent_regularizer", js.undefined)
      
      inline def setUnits(value: Double): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUse_bias(value: Boolean): Self = StObject.set(x, "use_bias", value.asInstanceOf[js.Any])
      
      inline def setUse_biasUndefined: Self = StObject.set(x, "use_bias", js.undefined)
    }
  }
  
  type SimpleRNNCellSerialization = BaseSerialization[SimpleRNNCell, SimpleRNNCellConfig]
  
  trait SimpleRNNLayerConfig
    extends StObject
       with BaseRNNLayerConfig {
    
    var activation: js.UndefOr[ActivationSerialization] = js.undefined
    
    var bias_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
    
    var bias_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var bias_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var dropout: js.UndefOr[Double] = js.undefined
    
    var kernel_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
    
    var kernel_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var kernel_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var recurrent_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
    
    var recurrent_dropout: js.UndefOr[Double] = js.undefined
    
    var recurrent_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var recurrent_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var units: Double
    
    var use_bias: js.UndefOr[Boolean] = js.undefined
  }
  object SimpleRNNLayerConfig {
    
    inline def apply(units: Double): SimpleRNNLayerConfig = {
      val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleRNNLayerConfig]
    }
    
    extension [Self <: SimpleRNNLayerConfig](x: Self) {
      
      inline def setActivation(value: ActivationSerialization): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      inline def setBias_constraint(value: ConstraintSerialization): Self = StObject.set(x, "bias_constraint", value.asInstanceOf[js.Any])
      
      inline def setBias_constraintUndefined: Self = StObject.set(x, "bias_constraint", js.undefined)
      
      inline def setBias_initializer(value: InitializerSerialization): Self = StObject.set(x, "bias_initializer", value.asInstanceOf[js.Any])
      
      inline def setBias_initializerUndefined: Self = StObject.set(x, "bias_initializer", js.undefined)
      
      inline def setBias_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "bias_regularizer", value.asInstanceOf[js.Any])
      
      inline def setBias_regularizerUndefined: Self = StObject.set(x, "bias_regularizer", js.undefined)
      
      inline def setDropout(value: Double): Self = StObject.set(x, "dropout", value.asInstanceOf[js.Any])
      
      inline def setDropoutUndefined: Self = StObject.set(x, "dropout", js.undefined)
      
      inline def setKernel_constraint(value: ConstraintSerialization): Self = StObject.set(x, "kernel_constraint", value.asInstanceOf[js.Any])
      
      inline def setKernel_constraintUndefined: Self = StObject.set(x, "kernel_constraint", js.undefined)
      
      inline def setKernel_initializer(value: InitializerSerialization): Self = StObject.set(x, "kernel_initializer", value.asInstanceOf[js.Any])
      
      inline def setKernel_initializerUndefined: Self = StObject.set(x, "kernel_initializer", js.undefined)
      
      inline def setKernel_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "kernel_regularizer", value.asInstanceOf[js.Any])
      
      inline def setKernel_regularizerUndefined: Self = StObject.set(x, "kernel_regularizer", js.undefined)
      
      inline def setRecurrent_constraint(value: ConstraintSerialization): Self = StObject.set(x, "recurrent_constraint", value.asInstanceOf[js.Any])
      
      inline def setRecurrent_constraintUndefined: Self = StObject.set(x, "recurrent_constraint", js.undefined)
      
      inline def setRecurrent_dropout(value: Double): Self = StObject.set(x, "recurrent_dropout", value.asInstanceOf[js.Any])
      
      inline def setRecurrent_dropoutUndefined: Self = StObject.set(x, "recurrent_dropout", js.undefined)
      
      inline def setRecurrent_initializer(value: InitializerSerialization): Self = StObject.set(x, "recurrent_initializer", value.asInstanceOf[js.Any])
      
      inline def setRecurrent_initializerUndefined: Self = StObject.set(x, "recurrent_initializer", js.undefined)
      
      inline def setRecurrent_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "recurrent_regularizer", value.asInstanceOf[js.Any])
      
      inline def setRecurrent_regularizerUndefined: Self = StObject.set(x, "recurrent_regularizer", js.undefined)
      
      inline def setUnits(value: Double): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUse_bias(value: Boolean): Self = StObject.set(x, "use_bias", value.asInstanceOf[js.Any])
      
      inline def setUse_biasUndefined: Self = StObject.set(x, "use_bias", js.undefined)
    }
  }
  
  type SimpleRNNLayerSerialization = BaseLayerSerialization[SimpleRNN, SimpleRNNLayerConfig]
  
  trait StackedRNNCellsConfig
    extends StObject
       with LayerConfig {
    
    var cells: js.Array[RNNCellSerialization]
  }
  object StackedRNNCellsConfig {
    
    inline def apply(cells: js.Array[RNNCellSerialization]): StackedRNNCellsConfig = {
      val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackedRNNCellsConfig]
    }
    
    extension [Self <: StackedRNNCellsConfig](x: Self) {
      
      inline def setCells(value: js.Array[RNNCellSerialization]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsVarargs(value: RNNCellSerialization*): Self = StObject.set(x, "cells", js.Array(value*))
    }
  }
  
  type StackedRNNCellsSerialization = BaseSerialization[StackedRNNCells, StackedRNNCellsConfig]
}
