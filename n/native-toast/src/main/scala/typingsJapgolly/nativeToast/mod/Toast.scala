package typingsJapgolly.nativeToast.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toast extends js.Object {
  def destroy(): Unit
  def hide(): Unit
  def show(): Unit
}

object Toast {
  @scala.inline
  def apply(destroy: Callback, hide: Callback, show: Callback): Toast = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[Toast]
  }
}

