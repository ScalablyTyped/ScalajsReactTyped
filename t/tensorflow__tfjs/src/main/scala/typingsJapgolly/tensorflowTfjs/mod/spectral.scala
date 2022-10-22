package typingsJapgolly.tensorflowTfjs.mod

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spectral {
  
  @JSImport("@tensorflow/tfjs", "spectral")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fft(input: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("fft")(input.asInstanceOf[js.Any]).asInstanceOf[Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]]
  
  inline def ifft(input: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifft")(input.asInstanceOf[js.Any]).asInstanceOf[Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]]
  
  inline def irfft(input: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("irfft")(input.asInstanceOf[js.Any]).asInstanceOf[Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]]
  
  inline def rfft(input: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("rfft")(input.asInstanceOf[js.Any]).asInstanceOf[Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]]
  inline def rfft(input: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], fftLength: Double): Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("rfft")(input.asInstanceOf[js.Any], fftLength.asInstanceOf[js.Any])).asInstanceOf[Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]]
}
