package typingsJapgolly.firefoxWebextBrowser

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firefoxWebextBrowser.browser.contentScripts.RegisteredContentScript
import typingsJapgolly.firefoxWebextBrowser.browser.contentScripts.RegisteredContentScriptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofcontentScripts extends js.Object {
  /* contentScripts functions */
  /** Register a content script programmatically */
  def register(contentScriptOptions: RegisteredContentScriptOptions): js.Promise[RegisteredContentScript]
}

object TypeofcontentScripts {
  @scala.inline
  def apply(register: RegisteredContentScriptOptions => CallbackTo[js.Promise[RegisteredContentScript]]): TypeofcontentScripts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.browser.contentScripts.RegisteredContentScriptOptions) => register(t0).runNow()))
    __obj.asInstanceOf[TypeofcontentScripts]
  }
}

