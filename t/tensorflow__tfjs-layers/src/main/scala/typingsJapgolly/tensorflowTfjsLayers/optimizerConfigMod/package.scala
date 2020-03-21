package typingsJapgolly.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object optimizerConfigMod {
  type AdadeltaSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adadelta, 
    typingsJapgolly.tensorflowTfjsLayers.optimizerConfigMod.AdadeltaOptimizerConfig
  ]
  type AdagradSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adagrad, 
    typingsJapgolly.tensorflowTfjsLayers.optimizerConfigMod.AdagradOptimizerConfig
  ]
  type AdamSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adam, 
    typingsJapgolly.tensorflowTfjsLayers.optimizerConfigMod.AdamOptimizerConfig
  ]
  type AdamaxSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Adamax, 
    typingsJapgolly.tensorflowTfjsLayers.optimizerConfigMod.AdamaxOptimizerConfig
  ]
  type MomentumSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Momentum, 
    typingsJapgolly.tensorflowTfjsLayers.optimizerConfigMod.MomentumOptimizerConfig
  ]
  type OptimizerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/optimizer_config.OptimizerSerialization['class_name'] */ js.Any
  type OptimizerSerialization = typingsJapgolly.tensorflowTfjsLayers.optimizerConfigMod.AdadeltaSerialization | typingsJapgolly.tensorflowTfjsLayers.optimizerConfigMod.AdagradSerialization | typingsJapgolly.tensorflowTfjsLayers.optimizerConfigMod.AdamSerialization | typingsJapgolly.tensorflowTfjsLayers.optimizerConfigMod.AdamaxSerialization | typingsJapgolly.tensorflowTfjsLayers.optimizerConfigMod.MomentumSerialization | typingsJapgolly.tensorflowTfjsLayers.optimizerConfigMod.RMSPropSerialization | typingsJapgolly.tensorflowTfjsLayers.optimizerConfigMod.SGDSerialization
  type RMSPropSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RMSProp, 
    typingsJapgolly.tensorflowTfjsLayers.optimizerConfigMod.RMSPropOptimizerConfig
  ]
  type SGDSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SGD, 
    typingsJapgolly.tensorflowTfjsLayers.optimizerConfigMod.SGDOptimizerConfig
  ]
}
