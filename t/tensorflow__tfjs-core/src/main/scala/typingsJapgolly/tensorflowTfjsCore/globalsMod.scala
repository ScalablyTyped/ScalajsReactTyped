package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.backendMod.KernelBackend
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.engineMod.Engine
import typingsJapgolly.tensorflowTfjsCore.engineMod.MemoryInfo
import typingsJapgolly.tensorflowTfjsCore.engineMod.ProfileInfo
import typingsJapgolly.tensorflowTfjsCore.engineMod.ScopeFn
import typingsJapgolly.tensorflowTfjsCore.engineMod.TimingInfo
import typingsJapgolly.tensorflowTfjsCore.platformMod.Platform
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/globals", JSImport.Namespace)
@js.native
object globalsMod extends js.Object {
  def backend(): KernelBackend = js.native
  def deprecationWarn(msg: String): Unit = js.native
  def disableDeprecationWarnings(): Unit = js.native
  def dispose(container: TensorContainer): Unit = js.native
  def disposeVariables(): Unit = js.native
  def enableDebugMode(): Unit = js.native
  def enableProdMode(): Unit = js.native
  def engine(): Engine = js.native
  def findBackend(name: String): KernelBackend = js.native
  def findBackendFactory(name: String): js.Function0[KernelBackend | js.Promise[KernelBackend]] = js.native
  def getBackend(): String = js.native
  def keep[T /* <: Tensor[Rank] */](result: T): T = js.native
  def memory(): MemoryInfo = js.native
  def profile(f: js.Function0[TensorContainer]): js.Promise[ProfileInfo] = js.native
  def ready(): js.Promise[Unit] = js.native
  def registerBackend(name: String, factory: js.Function0[KernelBackend | js.Promise[KernelBackend]]): Boolean = js.native
  def registerBackend(name: String, factory: js.Function0[KernelBackend | js.Promise[KernelBackend]], priority: Double): Boolean = js.native
  def removeBackend(name: String): Unit = js.native
  def setBackend(backendName: String): js.Promise[Boolean] = js.native
  def setPlatform(platformName: String, platform: Platform): Unit = js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: String): T = js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: String, fn: ScopeFn[T]): T = js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T]): T = js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T], fn: ScopeFn[T]): T = js.native
  def time(f: js.Function0[Unit]): js.Promise[TimingInfo] = js.native
}

