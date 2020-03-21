package typingsJapgolly.tensorflowTfjsLayers.poolingMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsJapgolly.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "Pooling3D")
@js.native
abstract class Pooling3D protected () extends Layer {
  def this(args: Pooling3DLayerArgs) = this()
  val dataFormat: DataFormat = js.native
  val padding: PaddingMode = js.native
  val poolSize: js.Tuple3[Double, Double, Double] = js.native
  val strides: js.Tuple3[Double, Double, Double] = js.native
  /* protected */ def poolingFunction(
    inputs: Tensor_[Rank],
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor_[Rank] = js.native
}

