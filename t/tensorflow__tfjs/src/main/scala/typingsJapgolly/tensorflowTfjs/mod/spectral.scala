package typingsJapgolly.tensorflowTfjs.mod

import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "spectral")
@js.native
object spectral extends js.Object {
  val fft: js.Function1[
    /* input */ Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
  val ifft: js.Function1[
    /* input */ Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
  val irfft: js.Function1[
    /* input */ Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
  val rfft: js.Function2[
    /* input */ Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], 
    /* fftLength */ js.UndefOr[Double], 
    Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
}

