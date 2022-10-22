package typingsJapgolly.tensorflowTfjs.mod

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor1D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signal {
  
  @JSImport("@tensorflow/tfjs", "signal")
  @js.native
  val ^ : js.Any = js.native
  
  inline def frame(signal: Tensor1D, frameLength: Double, frameStep: Double): Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any])).asInstanceOf[Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]]
  inline def frame(signal: Tensor1D, frameLength: Double, frameStep: Double, padEnd: Boolean): Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], padEnd.asInstanceOf[js.Any])).asInstanceOf[Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]]
  inline def frame(signal: Tensor1D, frameLength: Double, frameStep: Double, padEnd: Boolean, padValue: Double): Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], padEnd.asInstanceOf[js.Any], padValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]]
  inline def frame(signal: Tensor1D, frameLength: Double, frameStep: Double, padEnd: Unit, padValue: Double): Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], padEnd.asInstanceOf[js.Any], padValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]]
  
  inline def hammingWindow(windowLength: Double): Tensor1D = ^.asInstanceOf[js.Dynamic].applyDynamic("hammingWindow")(windowLength.asInstanceOf[js.Any]).asInstanceOf[Tensor1D]
  
  inline def hannWindow(windowLength: Double): Tensor1D = ^.asInstanceOf[js.Dynamic].applyDynamic("hannWindow")(windowLength.asInstanceOf[js.Any]).asInstanceOf[Tensor1D]
  
  inline def stft(signal: Tensor1D, frameLength: Double, frameStep: Double): Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stft")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any])).asInstanceOf[Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]]
  inline def stft(signal: Tensor1D, frameLength: Double, frameStep: Double, fftLength: Double): Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stft")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], fftLength.asInstanceOf[js.Any])).asInstanceOf[Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]]
  inline def stft(
    signal: Tensor1D,
    frameLength: Double,
    frameStep: Double,
    fftLength: Double,
    windowFn: js.Function1[/* length */ Double, Tensor1D]
  ): Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stft")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], fftLength.asInstanceOf[js.Any], windowFn.asInstanceOf[js.Any])).asInstanceOf[Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]]
  inline def stft(
    signal: Tensor1D,
    frameLength: Double,
    frameStep: Double,
    fftLength: Unit,
    windowFn: js.Function1[/* length */ Double, Tensor1D]
  ): Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stft")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], fftLength.asInstanceOf[js.Any], windowFn.asInstanceOf[js.Any])).asInstanceOf[Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]]
}
