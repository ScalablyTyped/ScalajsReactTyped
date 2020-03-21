package typingsJapgolly.antd.hookModalMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookModalProps extends js.Object {
  var config: ModalFuncProps
  def afterClose(): Unit
}

object HookModalProps {
  @scala.inline
  def apply(afterClose: Callback, config: ModalFuncProps): HookModalProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.updateDynamic("afterClose")(afterClose.toJsFn)
    __obj.asInstanceOf[HookModalProps]
  }
}

