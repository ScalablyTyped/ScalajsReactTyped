package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipboardStatic extends js.Object {
  def getString(): js.Promise[String]
  def setString(content: String): Unit
}

object ClipboardStatic {
  @scala.inline
  def apply(getString: CallbackTo[js.Promise[String]], setString: String => Callback): ClipboardStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getString")(getString.toJsFn)
    __obj.updateDynamic("setString")(js.Any.fromFunction1((t0: java.lang.String) => setString(t0).runNow()))
    __obj.asInstanceOf[ClipboardStatic]
  }
}

