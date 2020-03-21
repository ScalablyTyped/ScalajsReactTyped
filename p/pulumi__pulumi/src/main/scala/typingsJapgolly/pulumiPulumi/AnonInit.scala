package typingsJapgolly.pulumiPulumi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pulumiPulumi.outputMod.Inputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInit extends js.Object {
  def init(): js.Promise[Inputs]
}

object AnonInit {
  @scala.inline
  def apply(init: CallbackTo[js.Promise[Inputs]]): AnonInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.asInstanceOf[AnonInit]
  }
}

