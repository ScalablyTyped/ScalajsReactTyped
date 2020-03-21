package typingsJapgolly.openfin.mod.fin

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFinExternalWindowStatic extends js.Object {
  /**
    * Returns an External Window object that wraps an existing window.
    */
  def wrap(appUuid: String, windowName: String): js.Promise[OpenFinExternalWindow]
  /**
    * Synchronously returns an External Window object that wraps an existing window.
    */
  def wrapSync(appUuid: String, windowName: String): OpenFinExternalWindow
}

object OpenFinExternalWindowStatic {
  @scala.inline
  def apply(
    wrap: (String, String) => CallbackTo[js.Promise[OpenFinExternalWindow]],
    wrapSync: (String, String) => CallbackTo[OpenFinExternalWindow]
  ): OpenFinExternalWindowStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("wrap")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => wrap(t0, t1).runNow()))
    __obj.updateDynamic("wrapSync")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => wrapSync(t0, t1).runNow()))
    __obj.asInstanceOf[OpenFinExternalWindowStatic]
  }
}

