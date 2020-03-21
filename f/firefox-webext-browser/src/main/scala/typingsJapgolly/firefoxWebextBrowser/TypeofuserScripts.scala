package typingsJapgolly.firefoxWebextBrowser

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firefoxWebextBrowser.browser.userScripts.RegisteredUserScript
import typingsJapgolly.firefoxWebextBrowser.browser.userScripts.UserScriptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofuserScripts extends js.Object {
  /* userScripts events */
  /**
    * Event called when a new userScript global has been created
    *
    * Allowed in: Content scripts only
    */
  val onBeforeScript: WebExtEvent[js.Function1[/* userScript */ AnonDefineGlobals, Unit]]
  /* userScripts functions */
  /**
    * Register a user script programmatically given its `userScripts.UserScriptOptions`, and resolves to a
    * `userScripts.RegisteredUserScript` instance
    */
  def register(userScriptOptions: UserScriptOptions): js.Promise[RegisteredUserScript]
}

object TypeofuserScripts {
  @scala.inline
  def apply(
    onBeforeScript: WebExtEvent[js.Function1[/* userScript */ AnonDefineGlobals, Unit]],
    register: UserScriptOptions => CallbackTo[js.Promise[RegisteredUserScript]]
  ): TypeofuserScripts = {
    val __obj = js.Dynamic.literal(onBeforeScript = onBeforeScript.asInstanceOf[js.Any])
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.browser.userScripts.UserScriptOptions) => register(t0).runNow()))
    __obj.asInstanceOf[TypeofuserScripts]
  }
}

