package typingsJapgolly.tensorflowTfjsCore.opsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "spectral")
@js.native
object spectral extends js.Object {
  val fft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  val ifft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  val irfft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  val rfft: js.Function2[/* input */ Tensor[Rank], /* fftLength */ js.UndefOr[Double], Tensor[Rank]] = js.native
}

