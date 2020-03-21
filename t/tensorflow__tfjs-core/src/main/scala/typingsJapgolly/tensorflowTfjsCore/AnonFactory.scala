package typingsJapgolly.tensorflowTfjsCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tensorflowTfjsCore.backendMod.KernelBackend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFactory extends js.Object {
  var priority: Double
  def factory(): KernelBackend | js.Promise[KernelBackend]
}

object AnonFactory {
  @scala.inline
  def apply(factory: CallbackTo[KernelBackend | js.Promise[KernelBackend]], priority: Double): AnonFactory = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("factory")(factory.toJsFn)
    __obj.asInstanceOf[AnonFactory]
  }
}

