package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatConstraintConfigMod.ConstraintSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatInitializerConfigMod.InitializerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatLayersLayerSerializationMod.LayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatOptimizerConfigMod.OptimizerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatRegularizerConfigMod.RegularizerSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatKerasClassNamesMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/keras_class_names", "kerasClassNames")
  @js.native
  val kerasClassNames: js.Array[KerasClassName] = js.native
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/keras_class_names.KerasSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.InputLayer
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2DTranspose
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ZeroPadding2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.BatchNormalization
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.L1L2
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.DepthwiseConv2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv1D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Embedding
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Cropping2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D
  */
  trait KerasClassName extends StObject
  object KerasClassName {
    
    inline def Activation: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation = "Activation".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation]
    
    inline def Adadelta: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta = "Adadelta".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta]
    
    inline def Adagrad: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad = "Adagrad".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad]
    
    inline def Adam: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam = "Adam".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam]
    
    inline def Adamax: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax = "Adamax".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax]
    
    inline def Add: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add = "Add".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add]
    
    inline def Average: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average = "Average".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average]
    
    inline def AveragePooling1D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D = "AveragePooling1D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D]
    
    inline def AveragePooling2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D = "AveragePooling2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D]
    
    inline def BatchNormalization: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.BatchNormalization = "BatchNormalization".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.BatchNormalization]
    
    inline def Concatenate: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate = "Concatenate".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate]
    
    inline def Constant: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant = "Constant".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant]
    
    inline def Conv1D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv1D = "Conv1D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv1D]
    
    inline def Conv2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2D = "Conv2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2D]
    
    inline def Conv2DTranspose: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2DTranspose = "Conv2DTranspose".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2DTranspose]
    
    inline def Cropping2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Cropping2D = "Cropping2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Cropping2D]
    
    inline def Dense: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense = "Dense".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense]
    
    inline def DepthwiseConv2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.DepthwiseConv2D = "DepthwiseConv2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.DepthwiseConv2D]
    
    inline def Dot: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot = "Dot".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot]
    
    inline def Dropout: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout = "Dropout".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout]
    
    inline def ELU: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU = "ELU".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU]
    
    inline def Embedding: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Embedding = "Embedding".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Embedding]
    
    inline def Flatten: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten = "Flatten".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten]
    
    inline def GRU: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU = "GRU".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU]
    
    inline def GlobalAveragePooling1D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D = "GlobalAveragePooling1D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D]
    
    inline def GlobalAveragePooling2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D = "GlobalAveragePooling2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D]
    
    inline def GlobalMaxPooling1D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D = "GlobalMaxPooling1D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D]
    
    inline def GlobalMaxPooling2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D = "GlobalMaxPooling2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D]
    
    inline def Identity: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity = "Identity".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity]
    
    inline def InputLayer: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.InputLayer = "InputLayer".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.InputLayer]
    
    inline def L1L2: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.L1L2 = "L1L2".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.L1L2]
    
    inline def LSTM: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM = "LSTM".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM]
    
    inline def LeakyReLU: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU = "LeakyReLU".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU]
    
    inline def Masking: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking = "Masking".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking]
    
    inline def MaxNorm: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm = "MaxNorm".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm]
    
    inline def MaxPooling1D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D = "MaxPooling1D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D]
    
    inline def MaxPooling2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D = "MaxPooling2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D]
    
    inline def Maximum: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum = "Maximum".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum]
    
    inline def MinMaxNorm: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm = "MinMaxNorm".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm]
    
    inline def Minimum: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum = "Minimum".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum]
    
    inline def Momentum: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum = "Momentum".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum]
    
    inline def Multiply: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply = "Multiply".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply]
    
    inline def NonNeg: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg = "NonNeg".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg]
    
    inline def Ones: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones = "Ones".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones]
    
    inline def Orthogonal: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal = "Orthogonal".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal]
    
    inline def PReLU: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU = "PReLU".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU]
    
    inline def Permute: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute = "Permute".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute]
    
    inline def RMSProp: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp = "RMSProp".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp]
    
    inline def RandomNormal: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal = "RandomNormal".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal]
    
    inline def RandomUniform: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform = "RandomUniform".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform]
    
    inline def ReLU: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU = "ReLU".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU]
    
    inline def RepeatVector: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector = "RepeatVector".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector]
    
    inline def Reshape: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape = "Reshape".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape]
    
    inline def SGD: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD = "SGD".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD]
    
    inline def SeparableConv2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D = "SeparableConv2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D]
    
    inline def SimpleRNN: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN = "SimpleRNN".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN]
    
    inline def Softmax: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax = "Softmax".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax]
    
    inline def ThresholdedReLU: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU = "ThresholdedReLU".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU]
    
    inline def TruncatedNormal: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal = "TruncatedNormal".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal]
    
    inline def UnitNorm: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm = "UnitNorm".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm]
    
    inline def UpSampling2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D = "UpSampling2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D]
    
    inline def VarianceScaling: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling = "VarianceScaling".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling]
    
    inline def ZeroPadding2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ZeroPadding2D = "ZeroPadding2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ZeroPadding2D]
    
    inline def Zeros: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros = "Zeros".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros]
  }
  
  type KerasSerialization = LayerSerialization | ConstraintSerialization | InitializerSerialization | RegularizerSerialization | OptimizerSerialization
}
