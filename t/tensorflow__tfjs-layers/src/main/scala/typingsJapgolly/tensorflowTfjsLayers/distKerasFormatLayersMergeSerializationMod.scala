package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.BaseLayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.LayerConfig
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatLayersMergeSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/merge_serialization", "mergeLayerClassNames")
  @js.native
  val mergeLayerClassNames: js.Array[MergeLayerClassName] = js.native
  
  type AddLayerSerialization = BaseLayerSerialization[Add, LayerConfig]
  
  type AverageLayerSerialization = BaseLayerSerialization[Average, LayerConfig]
  
  trait ConcatenateLayerConfig
    extends StObject
       with LayerConfig {
    
    var axis: js.UndefOr[Double] = js.undefined
  }
  object ConcatenateLayerConfig {
    
    inline def apply(): ConcatenateLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConcatenateLayerConfig]
    }
    
    extension [Self <: ConcatenateLayerConfig](x: Self) {
      
      inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    }
  }
  
  type ConcatenateLayerSerialization = BaseLayerSerialization[Concatenate, ConcatenateLayerConfig]
  
  trait DotLayerConfig
    extends StObject
       with LayerConfig {
    
    var axes: Double | (js.Tuple2[Double, Double])
    
    var normalize: js.UndefOr[Boolean] = js.undefined
  }
  object DotLayerConfig {
    
    inline def apply(axes: Double | (js.Tuple2[Double, Double])): DotLayerConfig = {
      val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DotLayerConfig]
    }
    
    extension [Self <: DotLayerConfig](x: Self) {
      
      inline def setAxes(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    }
  }
  
  type DotLayerSerialization = BaseLayerSerialization[Dot, DotLayerConfig]
  
  type MaximumLayerSerialization = BaseLayerSerialization[Maximum, LayerConfig]
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/merge_serialization.MergeLayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average
  */
  trait MergeLayerClassName extends StObject
  object MergeLayerClassName {
    
    inline def Add: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add = "Add".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add]
    
    inline def Average: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average = "Average".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average]
    
    inline def Concatenate: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate = "Concatenate".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate]
    
    inline def Dot: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot = "Dot".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot]
    
    inline def Maximum: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum = "Maximum".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum]
    
    inline def Minimum: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum = "Minimum".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum]
    
    inline def Multiply: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply = "Multiply".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply]
  }
  
  type MergeLayerSerialization = AddLayerSerialization | MultiplyLayerSerialization | AverageLayerSerialization | MaximumLayerSerialization | MinimumLayerSerialization | ConcatenateLayerSerialization | DotLayerSerialization
  
  type MinimumLayerSerialization = BaseLayerSerialization[Minimum, LayerConfig]
  
  type MultiplyLayerSerialization = BaseLayerSerialization[Multiply, LayerConfig]
}
