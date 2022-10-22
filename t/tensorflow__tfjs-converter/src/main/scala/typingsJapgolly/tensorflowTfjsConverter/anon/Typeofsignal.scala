package typingsJapgolly.tensorflowTfjsConverter.anon

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsignal extends StObject {
  
  def frame(signal: Tensor1D, frameLength: Double, frameStep: Double): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def frame(signal: Tensor1D, frameLength: Double, frameStep: Double, padEnd: Boolean): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def frame(signal: Tensor1D, frameLength: Double, frameStep: Double, padEnd: Boolean, padValue: Double): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def frame(signal: Tensor1D, frameLength: Double, frameStep: Double, padEnd: Unit, padValue: Double): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  def hammingWindow(windowLength: Double): Tensor1D = js.native
  
  def hannWindow(windowLength: Double): Tensor1D = js.native
  
  def stft(signal: Tensor1D, frameLength: Double, frameStep: Double): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stft(signal: Tensor1D, frameLength: Double, frameStep: Double, fftLength: Double): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stft(
    signal: Tensor1D,
    frameLength: Double,
    frameStep: Double,
    fftLength: Double,
    windowFn: js.Function1[/* length */ Double, Tensor1D]
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stft(
    signal: Tensor1D,
    frameLength: Double,
    frameStep: Double,
    fftLength: Unit,
    windowFn: js.Function1[/* length */ Double, Tensor1D]
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
}
