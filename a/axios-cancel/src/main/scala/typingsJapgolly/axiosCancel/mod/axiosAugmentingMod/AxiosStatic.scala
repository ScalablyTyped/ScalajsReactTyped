package typingsJapgolly.axiosCancel.mod.axiosAugmentingMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosStatic extends js.Object {
  def cancel(requestId: String): Unit
  def cancelAll(): Unit
}

object AxiosStatic {
  @scala.inline
  def apply(cancel: String => Callback, cancelAll: Callback): AxiosStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: java.lang.String) => cancel(t0).runNow()))
    __obj.updateDynamic("cancelAll")(cancelAll.toJsFn)
    __obj.asInstanceOf[AxiosStatic]
  }
}

