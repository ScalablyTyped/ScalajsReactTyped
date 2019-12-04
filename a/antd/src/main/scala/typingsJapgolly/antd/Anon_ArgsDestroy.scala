package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.libModalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsDestroy extends js.Object {
  def destroy(args: js.Any*): Unit
  def update(newConfig: ModalFuncProps): Unit
}

object Anon_ArgsDestroy {
  @scala.inline
  def apply(destroy: /* repeated */ js.Any => Callback, update: ModalFuncProps => Callback): Anon_ArgsDestroy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => destroy(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.antd.libModalModalMod.ModalFuncProps) => update(t0).runNow()))
    __obj.asInstanceOf[Anon_ArgsDestroy]
  }
}

