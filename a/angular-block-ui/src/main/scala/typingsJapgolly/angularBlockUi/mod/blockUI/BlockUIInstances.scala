package typingsJapgolly.angularBlockUi.mod.blockUI

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockUIInstances extends js.Object {
  def get(id: String): BlockUIService
}

object BlockUIInstances {
  @scala.inline
  def apply(get: String => CallbackTo[BlockUIService]): BlockUIInstances = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.asInstanceOf[BlockUIInstances]
  }
}

