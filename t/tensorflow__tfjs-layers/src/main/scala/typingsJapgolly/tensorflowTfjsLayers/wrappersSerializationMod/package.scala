package typingsJapgolly.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wrappersSerializationMod {
  type BidirectionalLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Bidirectional, 
    typingsJapgolly.tensorflowTfjsLayers.wrappersSerializationMod.BidirectionalLayerConfig
  ]
  type TimeDistributedLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TimeDistributed, 
    typingsJapgolly.tensorflowTfjsLayers.wrappersSerializationMod.TimeDistributedLayerConfig
  ]
  type WrapperLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/wrappers_serialization.WrapperLayerSerialization['class_name'] */ js.Any
  type WrapperLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.wrappersSerializationMod.TimeDistributedLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.wrappersSerializationMod.BidirectionalLayerSerialization
}
