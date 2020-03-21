package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region webview组件控制 https://docs.alipay.com/mini/api/webview-context
trait WebViewContext extends js.Object {
  def postMessage(param: js.Any): Unit
}

object WebViewContext {
  @scala.inline
  def apply(postMessage: js.Any => Callback): WebViewContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("postMessage")(js.Any.fromFunction1((t0: js.Any) => postMessage(t0).runNow()))
    __obj.asInstanceOf[WebViewContext]
  }
}

