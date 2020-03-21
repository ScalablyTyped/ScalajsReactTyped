package typingsJapgolly.materialUiCore.modalManagerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalManager extends js.Object {
  def add(modal: js.Any, container: js.Any): Double = js.native
  def isTopModal(modal: js.Any): Boolean = js.native
  def remove(modal: js.Any): Unit = js.native
}

object ModalManager {
  @scala.inline
  def apply(
    add: (js.Any, js.Any) => CallbackTo[Double],
    isTopModal: js.Any => CallbackTo[Boolean],
    remove: js.Any => Callback
  ): ModalManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => add(t0, t1).runNow()))
    __obj.updateDynamic("isTopModal")(js.Any.fromFunction1((t0: js.Any) => isTopModal(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: js.Any) => remove(t0).runNow()))
    __obj.asInstanceOf[ModalManager]
  }
}

