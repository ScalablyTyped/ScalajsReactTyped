package typingsJapgolly.tensorflowTfjsCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGradFunc[T /* <: Tensor[Rank] */] extends js.Object {
  var value: T
  def gradFunc(dy: T, saved: js.Array[Tensor[Rank]]): Tensor[Rank] | js.Array[Tensor[Rank]]
}

object AnonGradFunc {
  @scala.inline
  def apply[T /* <: Tensor[Rank] */](
    gradFunc: (T, js.Array[Tensor[Rank]]) => CallbackTo[Tensor[Rank] | js.Array[Tensor[Rank]]],
    value: T
  ): AnonGradFunc[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("gradFunc")(js.Any.fromFunction2((t0: T, t1: js.Array[
  typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]]) => gradFunc(t0, t1).runNow()))
    __obj.asInstanceOf[AnonGradFunc[T]]
  }
}

