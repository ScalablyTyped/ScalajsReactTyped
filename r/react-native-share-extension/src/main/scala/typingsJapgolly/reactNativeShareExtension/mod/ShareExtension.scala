package typingsJapgolly.reactNativeShareExtension.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareExtension extends js.Object {
  def close(): Unit
  def data(): js.Promise[ShareData]
  def openURL(uri: String): Unit
}

object ShareExtension {
  @scala.inline
  def apply(close: Callback, data: CallbackTo[js.Promise[ShareData]], openURL: String => Callback): ShareExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("data")(data.toJsFn)
    __obj.updateDynamic("openURL")(js.Any.fromFunction1((t0: java.lang.String) => openURL(t0).runNow()))
    __obj.asInstanceOf[ShareExtension]
  }
}

