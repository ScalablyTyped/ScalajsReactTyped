package typingsJapgolly.androiduix.androidui.AndroidUI

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIClient extends js.Object {
  var shouldShowAppClosed: js.UndefOr[js.Function1[/* androidUI */ typingsJapgolly.androiduix.androidui.AndroidUI, _]] = js.undefined
}

object UIClient {
  @scala.inline
  def apply(
    shouldShowAppClosed: /* androidUI */ typingsJapgolly.androiduix.androidui.AndroidUI => CallbackTo[js.Any] = null
  ): UIClient = {
    val __obj = js.Dynamic.literal()
    if (shouldShowAppClosed != null) __obj.updateDynamic("shouldShowAppClosed")(js.Any.fromFunction1((t0: /* androidUI */ typingsJapgolly.androiduix.androidui.AndroidUI) => shouldShowAppClosed(t0).runNow()))
    __obj.asInstanceOf[UIClient]
  }
}

