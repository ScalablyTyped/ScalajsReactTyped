package typingsJapgolly.antd.confirmMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.antd.AnonDestroy
import typingsJapgolly.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalStaticFunctions extends js.Object {
  var confirm: ModalFunc
  var error: ModalFunc
  var info: ModalFunc
  var success: ModalFunc
  var warn: ModalFunc
  var warning: ModalFunc
}

object ModalStaticFunctions {
  @scala.inline
  def apply(
    confirm: /* props */ ModalFuncProps => CallbackTo[AnonDestroy],
    error: /* props */ ModalFuncProps => CallbackTo[AnonDestroy],
    info: /* props */ ModalFuncProps => CallbackTo[AnonDestroy],
    success: /* props */ ModalFuncProps => CallbackTo[AnonDestroy],
    warn: /* props */ ModalFuncProps => CallbackTo[AnonDestroy],
    warning: /* props */ ModalFuncProps => CallbackTo[AnonDestroy]
  ): ModalStaticFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("confirm")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.modalModalMod.ModalFuncProps) => confirm(t0).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.modalModalMod.ModalFuncProps) => error(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.modalModalMod.ModalFuncProps) => info(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.modalModalMod.ModalFuncProps) => success(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.modalModalMod.ModalFuncProps) => warn(t0).runNow()))
    __obj.updateDynamic("warning")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.modalModalMod.ModalFuncProps) => warning(t0).runNow()))
    __obj.asInstanceOf[ModalStaticFunctions]
  }
}

