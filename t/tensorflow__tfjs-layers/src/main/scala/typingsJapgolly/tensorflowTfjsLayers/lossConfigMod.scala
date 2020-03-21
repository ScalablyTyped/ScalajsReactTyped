package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.categorical_crossentropy
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.categorical_hinge
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.cosine_proximity
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hinge
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.kullback_leibler_divergence
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.logcosh
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mean_absolute_error
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mean_absolute_percentage_error
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mean_squared_error
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mean_squared_logarithmic_error
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.poisson
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sparse_categorical_crossentropy
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.squared_hinge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/keras_format/loss_config", JSImport.Namespace)
@js.native
object lossConfigMod extends js.Object {
  val lossOptions: js.Array[
    mean_squared_error | mean_absolute_error | mean_absolute_percentage_error | mean_squared_logarithmic_error | squared_hinge | hinge | categorical_hinge | logcosh | categorical_crossentropy | sparse_categorical_crossentropy | kullback_leibler_divergence | poisson | cosine_proximity
  ] = js.native
  type LossIdentifier = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<'mean_squared_error' | 'mean_absolute_error' | 'mean_absolute_percentage_error' | 'mean_squared_logarithmic_error' | 'squared_hinge' | 'hinge' | 'categorical_hinge' | 'logcosh' | 'categorical_crossentropy' | 'sparse_categorical_crossentropy' | 'kullback_leibler_divergence' | 'poisson' | 'cosine_proximity'>[number] */ js.Any
}

