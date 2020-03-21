package typingsJapgolly.tensorflowTfjsLayers.trainingMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training", "isDataTensor")
@js.native
object isDataTensor extends js.Object {
  def apply(x: js.Array[Tensor_[Rank]]): Boolean = js.native
  def apply(x: StringDictionary[js.Array[Tensor_[Rank]] | Tensor_[Rank]]): Boolean = js.native
  def apply(x: Tensor_[Rank]): Boolean = js.native
}

