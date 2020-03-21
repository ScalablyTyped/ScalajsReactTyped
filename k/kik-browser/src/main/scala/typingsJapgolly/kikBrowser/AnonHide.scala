package typingsJapgolly.kikBrowser

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHide extends js.Object {
  def hide(): Unit
  def isEnabled(): Boolean
  def show(): Unit
}

object AnonHide {
  @scala.inline
  def apply(hide: Callback, isEnabled: CallbackTo[Boolean], show: Callback): AnonHide = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("isEnabled")(isEnabled.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[AnonHide]
  }
}

