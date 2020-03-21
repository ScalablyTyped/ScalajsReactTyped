package typingsJapgolly.tensorflowTfjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "registerBackend")
@js.native
object registerBackend extends js.Object {
  def apply(
    name: String,
    factory: js.Function0[
      typingsJapgolly.tensorflowTfjsCore.backendMod.KernelBackend | js.Promise[typingsJapgolly.tensorflowTfjsCore.backendMod.KernelBackend]
    ]
  ): Boolean = js.native
  def apply(
    name: String,
    factory: js.Function0[
      typingsJapgolly.tensorflowTfjsCore.backendMod.KernelBackend | js.Promise[typingsJapgolly.tensorflowTfjsCore.backendMod.KernelBackend]
    ],
    priority: Double
  ): Boolean = js.native
}

