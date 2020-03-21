package typingsJapgolly.tensorflowTfjsLayers.paddingMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "temporalPadding")
@js.native
object temporalPadding extends js.Object {
  def apply(x: Tensor_[Rank]): Tensor_[Rank] = js.native
  def apply(x: Tensor_[Rank], padding: js.Tuple2[Double, Double]): Tensor_[Rank] = js.native
}

