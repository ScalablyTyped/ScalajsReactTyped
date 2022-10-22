package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.temporal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatCommonMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/common", "VALID_BIDIRECTIONAL_MERGE_MODES")
  @js.native
  val VALID_BIDIRECTIONAL_MERGE_MODES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/common", "VALID_DATA_FORMAT_VALUES")
  @js.native
  val VALID_DATA_FORMAT_VALUES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/common", "VALID_INTERPOLATION_FORMAT_VALUES")
  @js.native
  val VALID_INTERPOLATION_FORMAT_VALUES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/common", "VALID_PADDING_MODE_VALUES")
  @js.native
  val VALID_PADDING_MODE_VALUES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/common", "VALID_POOL_MODE_VALUES")
  @js.native
  val VALID_POOL_MODE_VALUES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/common", "VALID_SAMPLE_WEIGHT_MODES")
  @js.native
  val VALID_SAMPLE_WEIGHT_MODES: js.Array[String] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sum
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mul
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.concat
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ave
  */
  trait BidirectionalMergeMode extends StObject
  object BidirectionalMergeMode {
    
    inline def ave: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ave = "ave".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ave]
    
    inline def concat: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.concat = "concat".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.concat]
    
    inline def mul: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mul = "mul".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mul]
    
    inline def sum: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sum = "sum".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sum]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsFirst
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsLast
  */
  trait DataFormat extends StObject
  object DataFormat {
    
    inline def channelsFirst: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsFirst = "channelsFirst".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsFirst]
    
    inline def channelsLast: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsLast = "channelsLast".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsLast]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_first
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_last
  */
  trait DataFormatSerialization extends StObject
  object DataFormatSerialization {
    
    inline def channels_first: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_first = "channels_first".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_first]
    
    inline def channels_last: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_last = "channels_last".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_last]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bool
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.complex64
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.string
  */
  trait DataType extends StObject
  object DataType {
    
    inline def bool: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bool = "bool".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bool]
    
    inline def complex64: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.complex64 = "complex64".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.complex64]
    
    inline def float32: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32 = "float32".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32]
    
    inline def int32: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32 = "int32".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32]
    
    inline def string: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.string = "string".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.string]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.nearest
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bilinear
  */
  trait InterpolationFormat extends StObject
  object InterpolationFormat {
    
    inline def bilinear: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bilinear = "bilinear".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bilinear]
    
    inline def nearest: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.nearest = "nearest".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.nearest]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.valid
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.same
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.causal
  */
  trait PaddingMode extends StObject
  object PaddingMode {
    
    inline def causal: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.causal = "causal".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.causal]
    
    inline def same: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.same = "same".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.same]
    
    inline def valid: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.valid = "valid".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.valid]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.max
    - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.avg
  */
  trait PoolMode extends StObject
  object PoolMode {
    
    inline def avg: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.avg = "avg".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.avg]
    
    inline def max: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.max = "max".asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.max]
  }
  
  type SampleWeightMode = temporal
  
  type Shape = js.Array[Null | Double]
}
