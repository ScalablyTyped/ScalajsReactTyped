package typingsJapgolly.tensorflowTfjsCore.mod

import typingsJapgolly.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsJapgolly.tensorflowTfjsCore.serializationMod.Serializable
import typingsJapgolly.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "SGDOptimizer")
@js.native
class SGDOptimizer protected ()
  extends typingsJapgolly.tensorflowTfjsCore.sgdOptimizerMod.SGDOptimizer {
  def this(learningRate: Double) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-core", "SGDOptimizer")
@js.native
object SGDOptimizer extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

