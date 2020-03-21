package typingsJapgolly.tensorflowTfjsLayers.datasetFakesMod

import typingsJapgolly.tensorflowTfjsLayers.datasetStubMod.Dataset
import typingsJapgolly.tensorflowTfjsLayers.trainingDatasetMod.FitDatasetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/dataset_fakes", "FakeNumericDataset")
@js.native
class FakeNumericDataset protected () extends Dataset[FitDatasetElement] {
  def this(args: FakeDatasetArgs) = this()
  val args: FakeDatasetArgs = js.native
}

