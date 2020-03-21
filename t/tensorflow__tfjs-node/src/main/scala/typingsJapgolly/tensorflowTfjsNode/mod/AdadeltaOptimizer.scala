package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsJapgolly.tensorflowTfjsCore.serializationMod.Serializable
import typingsJapgolly.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "AdadeltaOptimizer")
@js.native
class AdadeltaOptimizer protected ()
  extends typingsJapgolly.tensorflowTfjs.mod.AdadeltaOptimizer {
  def this(learningRate: Double, rho: Double) = this()
  def this(learningRate: Double, rho: Double, epsilon: Double) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-node", "AdadeltaOptimizer")
@js.native
object AdadeltaOptimizer extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

