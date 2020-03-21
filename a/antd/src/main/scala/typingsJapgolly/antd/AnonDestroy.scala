package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDestroy extends js.Object {
  def destroy(): Unit
  def update(newConfig: ModalFuncProps): Unit
}

object AnonDestroy {
  @scala.inline
  def apply(destroy: Callback, update: ModalFuncProps => Callback): AnonDestroy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.antd.modalModalMod.ModalFuncProps) => update(t0).runNow()))
    __obj.asInstanceOf[AnonDestroy]
  }
}

