package typingsJapgolly.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreSerializationMod {
  type ActivationLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation, 
    typingsJapgolly.tensorflowTfjsLayers.coreSerializationMod.ActivationLayerConfig
  ]
  type CoreLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/core_serialization.CoreLayerSerialization['class_name'] */ js.Any
  type CoreLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.coreSerializationMod.DropoutLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.coreSerializationMod.DenseLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.coreSerializationMod.FlattenLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.coreSerializationMod.ActivationLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.coreSerializationMod.RepeatVectorLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.coreSerializationMod.ReshapeLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.coreSerializationMod.PermuteLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.coreSerializationMod.MaskingLayerSerialization
  type DenseLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense, 
    typingsJapgolly.tensorflowTfjsLayers.coreSerializationMod.DenseLayerConfig
  ]
  type DropoutLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout, 
    typingsJapgolly.tensorflowTfjsLayers.coreSerializationMod.DropoutLayerConfig
  ]
  type FlattenLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten, 
    typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  type MaskingLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking, 
    typingsJapgolly.tensorflowTfjsLayers.coreSerializationMod.MaskingLayerConfig
  ]
  type PermuteLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute, 
    typingsJapgolly.tensorflowTfjsLayers.coreSerializationMod.PermuteLayerConfig
  ]
  type RepeatVectorLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector, 
    typingsJapgolly.tensorflowTfjsLayers.coreSerializationMod.RepeatVectorLayerConfig
  ]
  type ReshapeLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape, 
    typingsJapgolly.tensorflowTfjsLayers.coreSerializationMod.ReshapeLayerConfig
  ]
}
