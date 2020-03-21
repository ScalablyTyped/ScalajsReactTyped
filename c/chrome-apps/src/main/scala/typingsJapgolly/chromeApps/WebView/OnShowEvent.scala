package typingsJapgolly.chromeApps.WebView

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnShowEvent extends js.Object {
  /** Call this to prevent showing the context menu. */
  def preventDefault(): Unit
}

object OnShowEvent {
  @scala.inline
  def apply(preventDefault: Callback): OnShowEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.asInstanceOf[OnShowEvent]
  }
}

