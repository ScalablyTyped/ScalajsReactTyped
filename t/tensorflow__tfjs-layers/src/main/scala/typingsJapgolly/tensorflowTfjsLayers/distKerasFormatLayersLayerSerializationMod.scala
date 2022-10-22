package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatInputConfigMod.InputLayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatLayersAdvancedActivationSerializationMod.AdvancedActivationLayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatLayersConvolutionalDepthwiseSerializationMod.ConvolutionalDepthwiseLayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatLayersConvolutionalSerializationMod.ConvolutionalLayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatLayersCoreSerializationMod.CoreLayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatLayersEmbeddingsSerializationMod.EmbeddingLayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatLayersMergeSerializationMod.MergeLayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatLayersNormalizationSerializationMod.NormalizationLayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatLayersPaddingSerializationMod.PaddingLayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatLayersPoolingSerializationMod.PoolingLayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatLayersRecurrentSerializationMod.RecurrentLayerSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatLayersLayerSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/layer_serialization", "layerClassNames")
  @js.native
  val layerClassNames: js.Array[LayerClassName] = js.native
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/layer_serialization.LayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.InputLayer
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout
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
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.DepthwiseConv2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv1D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Embedding
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Cropping2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D
  */
  trait LayerClassName extends StObject
  object LayerClassName {
    
    inline def Activation: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation = "Activation".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation]
    
    inline def Add: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add = "Add".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add]
    
    inline def Average: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average = "Average".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average]
    
    inline def AveragePooling1D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D = "AveragePooling1D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D]
    
    inline def AveragePooling2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D = "AveragePooling2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D]
    
    inline def BatchNormalization: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.BatchNormalization = "BatchNormalization".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.BatchNormalization]
    
    inline def Concatenate: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate = "Concatenate".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate]
    
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
    
    inline def InputLayer: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.InputLayer = "InputLayer".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.InputLayer]
    
    inline def LSTM: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM = "LSTM".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM]
    
    inline def LeakyReLU: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU = "LeakyReLU".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU]
    
    inline def Masking: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking = "Masking".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking]
    
    inline def MaxPooling1D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D = "MaxPooling1D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D]
    
    inline def MaxPooling2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D = "MaxPooling2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D]
    
    inline def Maximum: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum = "Maximum".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum]
    
    inline def Minimum: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum = "Minimum".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum]
    
    inline def Multiply: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply = "Multiply".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply]
    
    inline def PReLU: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU = "PReLU".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU]
    
    inline def Permute: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute = "Permute".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute]
    
    inline def ReLU: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU = "ReLU".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU]
    
    inline def RepeatVector: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector = "RepeatVector".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector]
    
    inline def Reshape: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape = "Reshape".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape]
    
    inline def SeparableConv2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D = "SeparableConv2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D]
    
    inline def SimpleRNN: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN = "SimpleRNN".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN]
    
    inline def Softmax: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax = "Softmax".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax]
    
    inline def ThresholdedReLU: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU = "ThresholdedReLU".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU]
    
    inline def UpSampling2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D = "UpSampling2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D]
    
    inline def ZeroPadding2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ZeroPadding2D = "ZeroPadding2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ZeroPadding2D]
  }
  
  type LayerSerialization = AdvancedActivationLayerSerialization | ConvolutionalDepthwiseLayerSerialization | ConvolutionalLayerSerialization | CoreLayerSerialization | EmbeddingLayerSerialization | MergeLayerSerialization | NormalizationLayerSerialization | PaddingLayerSerialization | PoolingLayerSerialization | RecurrentLayerSerialization | InputLayerSerialization
}
