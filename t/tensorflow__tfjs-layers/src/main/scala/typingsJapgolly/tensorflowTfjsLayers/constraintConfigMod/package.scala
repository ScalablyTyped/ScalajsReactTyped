package typingsJapgolly.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object constraintConfigMod {
  type ConstraintClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/constraint_config.ConstraintSerialization['class_name'] */ js.Any
  type ConstraintSerialization = typingsJapgolly.tensorflowTfjsLayers.constraintConfigMod.MaxNormSerialization | typingsJapgolly.tensorflowTfjsLayers.constraintConfigMod.NonNegSerialization | typingsJapgolly.tensorflowTfjsLayers.constraintConfigMod.UnitNormSerialization | typingsJapgolly.tensorflowTfjsLayers.constraintConfigMod.MinMaxNormSerialization
  type MaxNormSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm, 
    typingsJapgolly.tensorflowTfjsLayers.constraintConfigMod.MaxNormConfig
  ]
  type MinMaxNormSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm, 
    typingsJapgolly.tensorflowTfjsLayers.constraintConfigMod.MinMaxNormConfig
  ]
  type NonNegSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg, 
    scala.Null
  ]
  type UnitNormSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm, 
    typingsJapgolly.tensorflowTfjsLayers.constraintConfigMod.UnitNormConfig
  ]
}
