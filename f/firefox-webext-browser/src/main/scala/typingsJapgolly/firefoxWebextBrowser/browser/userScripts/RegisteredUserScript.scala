package typingsJapgolly.firefoxWebextBrowser.browser.userScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object that represents a user script registered programmatically */
trait RegisteredUserScript extends js.Object {
  /** Unregister a user script registered programmatically */
  def unregister(): js.Promise[_]
}

object RegisteredUserScript {
  @scala.inline
  def apply(unregister: CallbackTo[js.Promise[js.Any]]): RegisteredUserScript = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unregister")(unregister.toJsFn)
    __obj.asInstanceOf[RegisteredUserScript]
  }
}

