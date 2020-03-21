package typingsJapgolly.tensorflowTfjsLayers.poolingMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.PoolMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "pool2d")
@js.native
object pool2d extends js.Object {
  def apply(x: Tensor_[Rank], poolSize: js.Tuple2[Double, Double]): Tensor_[Rank] = js.native
  def apply(x: Tensor_[Rank], poolSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double]): Tensor_[Rank] = js.native
  def apply(
    x: Tensor_[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode
  ): Tensor_[Rank] = js.native
  def apply(
    x: Tensor_[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor_[Rank] = js.native
  def apply(
    x: Tensor_[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor_[Rank] = js.native
}

