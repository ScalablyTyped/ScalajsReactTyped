package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.typesMod.IOHandler
import typingsJapgolly.tensorflowTfjsCore.typesMod.ModelArtifacts
import typingsJapgolly.tensorflowTfjsCore.typesMod.SaveResult
import typingsJapgolly.tensorflowTfjsCore.typesMod.TrainingConfig
import typingsJapgolly.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/passthrough", JSImport.Namespace)
@js.native
object passthroughMod extends js.Object {
  def fromMemory(modelArtifacts: js.Object): IOHandler = js.native
  def fromMemory(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: scala.scalajs.js.typedarray.ArrayBuffer
  ): IOHandler = js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: scala.scalajs.js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def fromMemory(modelArtifacts: ModelArtifacts): IOHandler = js.native
  def fromMemory(modelArtifacts: ModelArtifacts, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: scala.scalajs.js.typedarray.ArrayBuffer
  ): IOHandler = js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: scala.scalajs.js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def withSaveHandler(saveHandler: js.Function1[/* artifacts */ ModelArtifacts, js.Promise[SaveResult]]): IOHandler = js.native
}

