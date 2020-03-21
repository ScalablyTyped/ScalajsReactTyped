package typingsJapgolly.tensorflowTfjsCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFft extends js.Object {
  def fft(x: Tensor[Rank]): Tensor[Rank]
  def ifft(x: Tensor[Rank]): Tensor[Rank]
  def irfft(x: Tensor[Rank]): Tensor[Rank]
  def rfft(x: Tensor[Rank]): Tensor[Rank]
}

object AnonFft {
  @scala.inline
  def apply(
    fft: Tensor[Rank] => CallbackTo[Tensor[Rank]],
    ifft: Tensor[Rank] => CallbackTo[Tensor[Rank]],
    irfft: Tensor[Rank] => CallbackTo[Tensor[Rank]],
    rfft: Tensor[Rank] => CallbackTo[Tensor[Rank]]
  ): AnonFft = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fft")(js.Any.fromFunction1((t0: typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]) => fft(t0).runNow()))
    __obj.updateDynamic("ifft")(js.Any.fromFunction1((t0: typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]) => ifft(t0).runNow()))
    __obj.updateDynamic("irfft")(js.Any.fromFunction1((t0: typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]) => irfft(t0).runNow()))
    __obj.updateDynamic("rfft")(js.Any.fromFunction1((t0: typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]) => rfft(t0).runNow()))
    __obj.asInstanceOf[AnonFft]
  }
}

