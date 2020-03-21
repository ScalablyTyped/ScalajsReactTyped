package typingsJapgolly.electron

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.electron.Electron.WebviewTag_
import typingsJapgolly.electron.electronStrings.webview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  @JSName("createElement")
  def createElement_webview(tagName: webview): WebviewTag_
}

object Document {
  @scala.inline
  def apply(createElement: webview => CallbackTo[WebviewTag_]): Document = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createElement")(js.Any.fromFunction1((t0: typingsJapgolly.electron.electronStrings.webview) => createElement(t0).runNow()))
    __obj.asInstanceOf[Document]
  }
}

