package typingsJapgolly.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object advancedActivationSerializationMod {
  type AdvancedActivationLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/advanced_activation_serialization.AdvancedActivationLayerSerialization['class_name'] */ js.Any
  type AdvancedActivationLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.advancedActivationSerializationMod.ReLULayerSerialization | typingsJapgolly.tensorflowTfjsLayers.advancedActivationSerializationMod.LeakyReLULayerSerialization | typingsJapgolly.tensorflowTfjsLayers.advancedActivationSerializationMod.PReLULayerSerialization | typingsJapgolly.tensorflowTfjsLayers.advancedActivationSerializationMod.ELULayerSerialization | typingsJapgolly.tensorflowTfjsLayers.advancedActivationSerializationMod.ThresholdedReLULayerSerialization | typingsJapgolly.tensorflowTfjsLayers.advancedActivationSerializationMod.SoftmaxLayerSerialization
  type ELULayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU, 
    typingsJapgolly.tensorflowTfjsLayers.advancedActivationSerializationMod.ELULayerConfig
  ]
  type LeakyReLULayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU, 
    typingsJapgolly.tensorflowTfjsLayers.advancedActivationSerializationMod.LeakyReLULayerConfig
  ]
  type PReLULayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU, 
    typingsJapgolly.tensorflowTfjsLayers.advancedActivationSerializationMod.PReLULayerConfig
  ]
  type ReLULayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU, 
    typingsJapgolly.tensorflowTfjsLayers.advancedActivationSerializationMod.ReLULayerConfig
  ]
  type SoftmaxLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax, 
    typingsJapgolly.tensorflowTfjsLayers.advancedActivationSerializationMod.SoftmaxLayerConfig
  ]
  type ThresholdedReLULayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU, 
    typingsJapgolly.tensorflowTfjsLayers.advancedActivationSerializationMod.ThresholdedReLULayerConfig
  ]
}
