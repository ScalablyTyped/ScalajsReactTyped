package typingsJapgolly.chromeApps.WebView

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.HTMLWebViewElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewWindow extends js.Object {
  /**
    * Attach the requested target page to an existing webview element.
    * @param webview The webview element to which the target page should be attached.
    */
  def attach(webview: HTMLWebViewElement): Unit
  /**
    * Cancel the new window request.
    */
  def discard(): Unit
}

object NewWindow {
  @scala.inline
  def apply(attach: HTMLWebViewElement => Callback, discard: Callback): NewWindow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attach")(js.Any.fromFunction1((t0: typingsJapgolly.chromeApps.HTMLWebViewElement) => attach(t0).runNow()))
    __obj.updateDynamic("discard")(discard.toJsFn)
    __obj.asInstanceOf[NewWindow]
  }
}

