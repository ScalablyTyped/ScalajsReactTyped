package typingsJapgolly.azure.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  def handle(requestOptions: js.Any, next: js.Function): Unit
}

object Filter {
  @scala.inline
  def apply(handle: (js.Any, js.Function) => Callback): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handle")(js.Any.fromFunction2((t0: js.Any, t1: js.Function) => handle(t0, t1).runNow()))
    __obj.asInstanceOf[Filter]
  }
}

