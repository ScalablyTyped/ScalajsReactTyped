package typingsJapgolly.firefoxWebextBrowser.browser.contentScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object that represents a content script registered programmatically */
trait RegisteredContentScript extends js.Object {
  /** Unregister a content script registered programmatically */
  def unregister(): js.Promise[_]
}

object RegisteredContentScript {
  @scala.inline
  def apply(unregister: CallbackTo[js.Promise[js.Any]]): RegisteredContentScript = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unregister")(unregister.toJsFn)
    __obj.asInstanceOf[RegisteredContentScript]
  }
}

