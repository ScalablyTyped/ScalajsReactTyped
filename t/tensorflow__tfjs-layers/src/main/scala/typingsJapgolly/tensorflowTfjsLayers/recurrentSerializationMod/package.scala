package typingsJapgolly.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object recurrentSerializationMod {
  type GRUCellSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRUCell, 
    typingsJapgolly.tensorflowTfjsLayers.recurrentSerializationMod.GRUCellConfig
  ]
  type GRULayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU, 
    typingsJapgolly.tensorflowTfjsLayers.recurrentSerializationMod.GRULayerConfig
  ]
  type LSTMCellSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTMCell, 
    typingsJapgolly.tensorflowTfjsLayers.recurrentSerializationMod.LSTMCellConfig
  ]
  type LSTMLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM, 
    typingsJapgolly.tensorflowTfjsLayers.recurrentSerializationMod.LSTMLayerConfig
  ]
  type RNNCellSerialization = typingsJapgolly.tensorflowTfjsLayers.recurrentSerializationMod.SimpleRNNCellSerialization | typingsJapgolly.tensorflowTfjsLayers.recurrentSerializationMod.GRUCellSerialization | typingsJapgolly.tensorflowTfjsLayers.recurrentSerializationMod.LSTMCellSerialization | typingsJapgolly.tensorflowTfjsLayers.recurrentSerializationMod.StackedRNNCellsSerialization
  type RecurrentLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/recurrent_serialization.RecurrentLayerSerialization['class_name'] */ js.Any
  type RecurrentLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.recurrentSerializationMod.SimpleRNNLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.recurrentSerializationMod.LSTMLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.recurrentSerializationMod.GRULayerSerialization
  type SimpleRNNCellSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNNCell, 
    typingsJapgolly.tensorflowTfjsLayers.recurrentSerializationMod.SimpleRNNCellConfig
  ]
  type SimpleRNNLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN, 
    typingsJapgolly.tensorflowTfjsLayers.recurrentSerializationMod.SimpleRNNLayerConfig
  ]
  type StackedRNNCellsSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.StackedRNNCells, 
    typingsJapgolly.tensorflowTfjsLayers.recurrentSerializationMod.StackedRNNCellsConfig
  ]
}
