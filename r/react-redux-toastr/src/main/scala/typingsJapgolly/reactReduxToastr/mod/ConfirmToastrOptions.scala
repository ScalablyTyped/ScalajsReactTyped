package typingsJapgolly.reactReduxToastr.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmToastrOptions extends js.Object {
  var disableCancel: js.UndefOr[Boolean] = js.undefined
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOk: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ConfirmToastrOptions {
  @scala.inline
  def apply(
    disableCancel: js.UndefOr[Boolean] = js.undefined,
    onCancel: js.UndefOr[Callback] = js.undefined,
    onOk: js.UndefOr[Callback] = js.undefined
  ): ConfirmToastrOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableCancel)) __obj.updateDynamic("disableCancel")(disableCancel.asInstanceOf[js.Any])
    onCancel.foreach(p => __obj.updateDynamic("onCancel")(p.toJsFn))
    onOk.foreach(p => __obj.updateDynamic("onOk")(p.toJsFn))
    __obj.asInstanceOf[ConfirmToastrOptions]
  }
}

