package typingsJapgolly.tensorflowTfjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "metrics")
@js.native
object metrics extends js.Object {
  @JSName("MAPE")
  def MAPE_(
    yTrue: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  @JSName("MSE")
  def MSE_(
    yTrue: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def binaryAccuracy(
    yTrue: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def binaryCrossentropy(
    yTrue: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def categoricalAccuracy(
    yTrue: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def categoricalCrossentropy(
    yTrue: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def cosineProximity(
    yTrue: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def mape(
    yTrue: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def meanAbsoluteError(
    yTrue: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def meanAbsolutePercentageError(
    yTrue: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def meanSquaredError(
    yTrue: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def mse(
    yTrue: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def precision(
    yTrue: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def recall(
    yTrue: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def sparseCategoricalAccuracy(
    yTrue: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): typingsJapgolly.tensorflowTfjsCore.mod.Tensor_[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = js.native
}

