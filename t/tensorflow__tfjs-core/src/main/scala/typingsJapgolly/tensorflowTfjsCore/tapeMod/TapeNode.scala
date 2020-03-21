package typingsJapgolly.tensorflowTfjsCore.tapeMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TapeNode extends js.Object {
  var gradient: js.UndefOr[js.Function1[/* dys */ js.Array[Tensor[Rank]], NamedGradientMap]] = js.undefined
  var id: Double
  var inputs: NamedTensorMap
  var kernelName: String
  var outputs: js.Array[Tensor[Rank]]
  var saved: js.UndefOr[js.Array[Tensor[Rank]]] = js.undefined
}

object TapeNode {
  @scala.inline
  def apply(
    id: Double,
    inputs: NamedTensorMap,
    kernelName: String,
    outputs: js.Array[Tensor[Rank]],
    gradient: /* dys */ js.Array[Tensor[Rank]] => CallbackTo[NamedGradientMap] = null,
    saved: js.Array[Tensor[Rank]] = null
  ): TapeNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], kernelName = kernelName.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(js.Any.fromFunction1((t0: /* dys */ js.Array[
  typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]]) => gradient(t0).runNow()))
    if (saved != null) __obj.updateDynamic("saved")(saved.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapeNode]
  }
}

