package typingsJapgolly.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object convolutionalSerializationMod {
  type Conv1DLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv1D, 
    typingsJapgolly.tensorflowTfjsLayers.convolutionalSerializationMod.ConvLayerConfig
  ]
  type Conv2DLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2D, 
    typingsJapgolly.tensorflowTfjsLayers.convolutionalSerializationMod.ConvLayerConfig
  ]
  type Conv2DTransposeLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2DTranspose, 
    typingsJapgolly.tensorflowTfjsLayers.convolutionalSerializationMod.ConvLayerConfig
  ]
  type ConvolutionalLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/convolutional_serialization.ConvolutionalLayerSerialization['class_name'] */ js.Any
  type ConvolutionalLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.convolutionalSerializationMod.Conv1DLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.convolutionalSerializationMod.Conv2DLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.convolutionalSerializationMod.Conv2DTransposeLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.convolutionalSerializationMod.SeparableConv2DLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.convolutionalSerializationMod.Cropping2DLayerSerialization | typingsJapgolly.tensorflowTfjsLayers.convolutionalSerializationMod.UpSampling2DLayerSerialization
  type Cropping2DLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Cropping2D, 
    typingsJapgolly.tensorflowTfjsLayers.convolutionalSerializationMod.Cropping2DLayerConfig
  ]
  type SeparableConv2DLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D, 
    typingsJapgolly.tensorflowTfjsLayers.convolutionalSerializationMod.ConvLayerConfig
  ]
  type UpSampling2DLayerSerialization = typingsJapgolly.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D, 
    typingsJapgolly.tensorflowTfjsLayers.convolutionalSerializationMod.UpSampling2DLayerConfig
  ]
}
