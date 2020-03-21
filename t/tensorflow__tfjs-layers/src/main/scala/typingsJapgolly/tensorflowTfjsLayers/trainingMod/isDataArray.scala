package typingsJapgolly.tensorflowTfjsLayers.trainingMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training", "isDataArray")
@js.native
object isDataArray extends js.Object {
  def apply(x: js.Array[Tensor_[Rank]]): Boolean = js.native
  def apply(x: StringDictionary[Tensor_[Rank]]): Boolean = js.native
  def apply(x: Tensor_[Rank]): Boolean = js.native
}

