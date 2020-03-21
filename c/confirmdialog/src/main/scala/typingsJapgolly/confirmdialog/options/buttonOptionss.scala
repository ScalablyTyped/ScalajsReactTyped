package typingsJapgolly.confirmdialog.options

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait buttonOptionss extends js.Object {
  var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var confirm: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object buttonOptionss {
  @scala.inline
  def apply(cancel: js.UndefOr[Callback] = js.undefined, confirm: js.UndefOr[Callback] = js.undefined): buttonOptionss = {
    val __obj = js.Dynamic.literal()
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    confirm.foreach(p => __obj.updateDynamic("confirm")(p.toJsFn))
    __obj.asInstanceOf[buttonOptionss]
  }
}

