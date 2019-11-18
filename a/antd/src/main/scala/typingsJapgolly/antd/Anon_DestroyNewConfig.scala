package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.libModalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestroyNewConfig extends js.Object {
  def destroy(): Unit
  def update(newConfig: ModalFuncProps): Unit
}

object Anon_DestroyNewConfig {
  @scala.inline
  def apply(destroy: Callback, update: ModalFuncProps => Callback): Anon_DestroyNewConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.antd.libModalModalMod.ModalFuncProps) => update(t0).runNow()))
    __obj.asInstanceOf[Anon_DestroyNewConfig]
  }
}

