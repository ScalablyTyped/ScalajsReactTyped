package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatCommonMod.DataFormatSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatCommonMod.PaddingMode
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.BaseLayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.LayerConfig
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatLayersPoolingSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/pooling_serialization", "poolingLayerClassNames")
  @js.native
  val poolingLayerClassNames: js.Array[PoolingLayerClassName] = js.native
  
  type AveragePooling1DLayerSerialization = BaseLayerSerialization[AveragePooling1D, Pooling1DLayerConfig]
  
  type AveragePooling2DLayerSerialization = BaseLayerSerialization[AveragePooling2D, Pooling2DLayerConfig]
  
  type GlobalAveragePooling1DLayerSerialization = BaseLayerSerialization[GlobalAveragePooling1D, LayerConfig]
  
  type GlobalAveragePooling2DLayerSerialization = BaseLayerSerialization[GlobalAveragePooling2D, GlobalPooling2DLayerConfig]
  
  type GlobalMaxPooling1DLayerSerialization = BaseLayerSerialization[GlobalMaxPooling1D, LayerConfig]
  
  type GlobalMaxPooling2DLayerSerialization = BaseLayerSerialization[GlobalMaxPooling2D, GlobalPooling2DLayerConfig]
  
  trait GlobalPooling2DLayerConfig
    extends StObject
       with LayerConfig {
    
    var data_format: js.UndefOr[DataFormatSerialization] = js.undefined
  }
  object GlobalPooling2DLayerConfig {
    
    inline def apply(): GlobalPooling2DLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalPooling2DLayerConfig]
    }
    
    extension [Self <: GlobalPooling2DLayerConfig](x: Self) {
      
      inline def setData_format(value: DataFormatSerialization): Self = StObject.set(x, "data_format", value.asInstanceOf[js.Any])
      
      inline def setData_formatUndefined: Self = StObject.set(x, "data_format", js.undefined)
    }
  }
  
  type MaxPooling1DLayerSerialization = BaseLayerSerialization[MaxPooling1D, Pooling1DLayerConfig]
  
  type MaxPooling2DLayerSerialization = BaseLayerSerialization[MaxPooling2D, Pooling2DLayerConfig]
  
  trait Pooling1DLayerConfig
    extends StObject
       with LayerConfig {
    
    var padding: js.UndefOr[PaddingMode] = js.undefined
    
    var pool_size: js.UndefOr[js.Array[Double]] = js.undefined
    
    var strides: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Pooling1DLayerConfig {
    
    inline def apply(): Pooling1DLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pooling1DLayerConfig]
    }
    
    extension [Self <: Pooling1DLayerConfig](x: Self) {
      
      inline def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPool_size(value: js.Array[Double]): Self = StObject.set(x, "pool_size", value.asInstanceOf[js.Any])
      
      inline def setPool_sizeUndefined: Self = StObject.set(x, "pool_size", js.undefined)
      
      inline def setPool_sizeVarargs(value: Double*): Self = StObject.set(x, "pool_size", js.Array(value*))
      
      inline def setStrides(value: js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      inline def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
      
      inline def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value*))
    }
  }
  
  trait Pooling2DLayerConfig
    extends StObject
       with LayerConfig {
    
    var data_format: js.UndefOr[DataFormatSerialization] = js.undefined
    
    var padding: js.UndefOr[PaddingMode] = js.undefined
    
    var pool_size: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.undefined
    
    var strides: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.undefined
  }
  object Pooling2DLayerConfig {
    
    inline def apply(): Pooling2DLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pooling2DLayerConfig]
    }
    
    extension [Self <: Pooling2DLayerConfig](x: Self) {
      
      inline def setData_format(value: DataFormatSerialization): Self = StObject.set(x, "data_format", value.asInstanceOf[js.Any])
      
      inline def setData_formatUndefined: Self = StObject.set(x, "data_format", js.undefined)
      
      inline def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPool_size(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "pool_size", value.asInstanceOf[js.Any])
      
      inline def setPool_sizeUndefined: Self = StObject.set(x, "pool_size", js.undefined)
      
      inline def setStrides(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      inline def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
    }
  }
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/pooling_serialization.PoolingLayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D
  */
  trait PoolingLayerClassName extends StObject
  object PoolingLayerClassName {
    
    inline def AveragePooling1D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D = "AveragePooling1D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D]
    
    inline def AveragePooling2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D = "AveragePooling2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D]
    
    inline def GlobalAveragePooling1D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D = "GlobalAveragePooling1D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D]
    
    inline def GlobalAveragePooling2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D = "GlobalAveragePooling2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D]
    
    inline def GlobalMaxPooling1D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D = "GlobalMaxPooling1D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D]
    
    inline def GlobalMaxPooling2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D = "GlobalMaxPooling2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D]
    
    inline def MaxPooling1D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D = "MaxPooling1D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D]
    
    inline def MaxPooling2D: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D = "MaxPooling2D".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D]
  }
  
  type PoolingLayerSerialization = MaxPooling1DLayerSerialization | AveragePooling1DLayerSerialization | MaxPooling2DLayerSerialization | AveragePooling2DLayerSerialization | GlobalAveragePooling1DLayerSerialization | GlobalMaxPooling1DLayerSerialization | GlobalAveragePooling2DLayerSerialization | GlobalMaxPooling2DLayerSerialization
}
