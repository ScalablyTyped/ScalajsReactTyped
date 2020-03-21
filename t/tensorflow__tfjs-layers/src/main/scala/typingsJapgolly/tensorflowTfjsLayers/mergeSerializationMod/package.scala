package typingsJapgolly.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mergeSerializationMod {
  type AddLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add, 
    typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  type AverageLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average, 
    typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  type ConcatenateLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate, 
    typingsJapgolly.tensorflowTfjsLayers.mergeSerializationMod.ConcatenateLayerConfig
  ]
  type DotLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot, 
    typingsJapgolly.tensorflowTfjsLayers.mergeSerializationMod.DotLayerConfig
  ]
  type MaximumLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum, 
    typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  type MergeLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/merge_serialization.MergeLayerSerialization['class_name'] */ js.Any
  type MergeLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.mergeSerializationMod.AddLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.mergeSerializationMod.MultiplyLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.mergeSerializationMod.AverageLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.mergeSerializationMod.MaximumLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.mergeSerializationMod.MinimumLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.mergeSerializationMod.ConcatenateLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.mergeSerializationMod.DotLayerSerialization
  type MinimumLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum, 
    typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  type MultiplyLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply, 
    typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
}
