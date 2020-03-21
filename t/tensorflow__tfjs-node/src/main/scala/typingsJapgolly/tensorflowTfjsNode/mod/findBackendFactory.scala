package typingsJapgolly.tensorflowTfjsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "findBackendFactory")
@js.native
object findBackendFactory extends js.Object {
  def apply(name: String): js.Function0[
    typingsJapgolly.tensorflowTfjsCore.backendMod.KernelBackend | js.Promise[typingsJapgolly.tensorflowTfjsCore.backendMod.KernelBackend]
  ] = js.native
}

