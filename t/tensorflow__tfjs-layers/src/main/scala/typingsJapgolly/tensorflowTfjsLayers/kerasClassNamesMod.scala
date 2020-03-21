package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typingsJapgolly.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import typingsJapgolly.tensorflowTfjsLayers.optimizerConfigMod.OptimizerSerialization
import typingsJapgolly.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/keras_format/keras_class_names", JSImport.Namespace)
@js.native
object kerasClassNamesMod extends js.Object {
  val kerasClassNames: js.Array[KerasClassName] = js.native
  type KerasClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/keras_class_names.KerasSerialization['class_name'] */ js.Any
  type KerasSerialization = LayerSerialization | ConstraintSerialization | InitializerSerialization | RegularizerSerialization | OptimizerSerialization
}

