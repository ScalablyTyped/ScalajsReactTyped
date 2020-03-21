package typingsJapgolly.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object initializerConfigMod {
  type ConstantSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant, 
    typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.ConstantConfig
  ]
  type IdentitySerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity, 
    typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.IdentityConfig
  ]
  type InitializerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/initializer_config.InitializerSerialization['class_name'] */ js.Any
  type InitializerSerialization = typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.ZerosSerialization | typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.OnesSerialization | typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.ConstantSerialization | typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.RandomUniformSerialization | typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.RandomNormalSerialization | typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.TruncatedNormalSerialization | typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.IdentitySerialization | typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.VarianceScalingSerialization | typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.OrthogonalSerialization
  type OnesSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones, js.Object]
  type OrthogonalSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal, 
    typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.OrthogonalConfig
  ]
  type RandomNormalSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal, 
    typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.RandomNormalConfig
  ]
  type RandomUniformSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform, 
    typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.RandomUniformConfig
  ]
  type TruncatedNormalSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal, 
    typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.TruncatedNormalConfig
  ]
  type VarianceScalingSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling, 
    typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.VarianceScalingConfig
  ]
  type ZerosSerialization = typingsJapgolly.tensorflowTfjsLayers.typesMod.BaseSerialization[typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros, js.Object]
}
