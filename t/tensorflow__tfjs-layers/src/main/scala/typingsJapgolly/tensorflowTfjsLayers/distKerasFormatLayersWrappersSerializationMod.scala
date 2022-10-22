package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatCommonMod.BidirectionalMergeMode
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatLayersLayerSerializationMod.LayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatLayersRecurrentSerializationMod.RecurrentLayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.BaseLayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.LayerConfig
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Bidirectional
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TimeDistributed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatLayersWrappersSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/wrappers_serialization", "wrapperLayerClassNames")
  @js.native
  val wrapperLayerClassNames: js.Array[WrapperLayerClassName] = js.native
  
  trait BidirectionalLayerConfig
    extends StObject
       with LayerConfig {
    
    var layer: RecurrentLayerSerialization
    
    var merge_mode: js.UndefOr[BidirectionalMergeMode] = js.undefined
  }
  object BidirectionalLayerConfig {
    
    inline def apply(layer: RecurrentLayerSerialization): BidirectionalLayerConfig = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[BidirectionalLayerConfig]
    }
    
    extension [Self <: BidirectionalLayerConfig](x: Self) {
      
      inline def setLayer(value: RecurrentLayerSerialization): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setMerge_mode(value: BidirectionalMergeMode): Self = StObject.set(x, "merge_mode", value.asInstanceOf[js.Any])
      
      inline def setMerge_modeUndefined: Self = StObject.set(x, "merge_mode", js.undefined)
    }
  }
  
  type BidirectionalLayerSerialization = BaseLayerSerialization[Bidirectional, BidirectionalLayerConfig]
  
  trait TimeDistributedLayerConfig
    extends StObject
       with LayerConfig {
    
    var layer: LayerSerialization
  }
  object TimeDistributedLayerConfig {
    
    inline def apply(layer: LayerSerialization): TimeDistributedLayerConfig = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeDistributedLayerConfig]
    }
    
    extension [Self <: TimeDistributedLayerConfig](x: Self) {
      
      inline def setLayer(value: LayerSerialization): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    }
  }
  
  type TimeDistributedLayerSerialization = BaseLayerSerialization[TimeDistributed, TimeDistributedLayerConfig]
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/wrappers_serialization.WrapperLayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TimeDistributed
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Bidirectional
  */
  trait WrapperLayerClassName extends StObject
  object WrapperLayerClassName {
    
    inline def Bidirectional: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Bidirectional = "Bidirectional".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Bidirectional]
    
    inline def TimeDistributed: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TimeDistributed = "TimeDistributed".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TimeDistributed]
  }
  
  type WrapperLayerSerialization = TimeDistributedLayerSerialization | BidirectionalLayerSerialization
}
