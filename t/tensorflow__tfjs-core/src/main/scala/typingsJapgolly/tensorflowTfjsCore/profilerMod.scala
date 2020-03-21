package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.backendMod.BackendTimer
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/profiler", JSImport.Namespace)
@js.native
object profilerMod extends js.Object {
  @js.native
  class Logger () extends js.Object {
    def logKernelProfile(name: String, result: Tensor[Rank], vals: TypedArray, timeMs: Double, inputs: NamedTensorMap): Unit = js.native
    def logKernelProfile(
      name: String,
      result: Tensor[Rank],
      vals: TypedArray,
      timeMs: Double,
      inputs: NamedTensorMap,
      extraInfo: String
    ): Unit = js.native
  }
  
  @js.native
  class Profiler protected () extends js.Object {
    def this(backendTimer: BackendTimer) = this()
    def this(backendTimer: BackendTimer, logger: Logger) = this()
    var backendTimer: js.Any = js.native
    var logger: js.UndefOr[js.Any] = js.native
    def profileKernel(kernelName: String, inputs: NamedTensorMap, f: js.Function0[js.Array[Tensor[Rank]]]): js.Array[Tensor[Rank]] = js.native
  }
  
  @JSName("checkComputationForErrors")
  def checkComputationForErrors_bool(vals: scala.scalajs.js.typedarray.Uint8Array, dtype: bool, kernelName: String): Boolean = js.native
  @JSName("checkComputationForErrors")
  def checkComputationForErrors_complex64(vals: scala.scalajs.js.typedarray.Float32Array, dtype: complex64, kernelName: String): Boolean = js.native
  @JSName("checkComputationForErrors")
  def checkComputationForErrors_float32(vals: scala.scalajs.js.typedarray.Float32Array, dtype: float32, kernelName: String): Boolean = js.native
  @JSName("checkComputationForErrors")
  def checkComputationForErrors_int32(vals: scala.scalajs.js.typedarray.Int32Array, dtype: int32, kernelName: String): Boolean = js.native
  @JSName("checkComputationForErrors")
  def checkComputationForErrors_string(vals: js.Array[String], dtype: string, kernelName: String): Boolean = js.native
}

