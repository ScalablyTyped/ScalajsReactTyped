package typingsJapgolly.tensorflowTfjsNode

import typingsJapgolly.tensorflowTfjsCore.typesMod.IOHandler
import typingsJapgolly.tensorflowTfjsCore.typesMod.ModelArtifacts
import typingsJapgolly.tensorflowTfjsCore.typesMod.TrainingConfig
import typingsJapgolly.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallModelArtifactsWeightSpecsWeightDataTrainingConfig extends js.Object {
  def apply(modelArtifacts: js.Object): IOHandler = js.native
  def apply(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  def apply(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: scala.scalajs.js.typedarray.ArrayBuffer
  ): IOHandler = js.native
  def apply(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: scala.scalajs.js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def apply(modelArtifacts: ModelArtifacts): IOHandler = js.native
  def apply(modelArtifacts: ModelArtifacts, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  def apply(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: scala.scalajs.js.typedarray.ArrayBuffer
  ): IOHandler = js.native
  def apply(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: scala.scalajs.js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
}

