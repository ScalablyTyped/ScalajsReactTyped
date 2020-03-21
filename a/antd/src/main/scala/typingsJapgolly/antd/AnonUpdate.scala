package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUpdate extends js.Object {
  def destroy(args: js.Any*): Unit
  def update(newConfig: ModalFuncProps): Unit
}

object AnonUpdate {
  @scala.inline
  def apply(destroy: /* repeated */ js.Any => Callback, update: ModalFuncProps => Callback): AnonUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => destroy(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.antd.modalModalMod.ModalFuncProps) => update(t0).runNow()))
    __obj.asInstanceOf[AnonUpdate]
  }
}

