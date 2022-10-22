package typingsJapgolly.firefoxWebextBrowser.global.browser

import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import typingsJapgolly.firefoxWebextBrowser.browser.userScripts.OnBeforeScriptUserScript
import typingsJapgolly.firefoxWebextBrowser.browser.userScripts.RegisteredUserScript
import typingsJapgolly.firefoxWebextBrowser.browser.userScripts.UserScriptOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manifest keys: `user_scripts`, `user_scripts`
  *
  * Not allowed in: Devtools pages
  */
object userScripts {
  
  @JSGlobal("browser.userScripts")
  @js.native
  val ^ : js.Any = js.native
  
  /* userScripts events */
  /**
    * Event called when a new userScript global has been created
    *
    * Allowed in: Content scripts only
    */
  @JSGlobal("browser.userScripts.onBeforeScript")
  @js.native
  val onBeforeScript: WebExtEvent[js.Function1[/* userScript */ OnBeforeScriptUserScript, Unit]] = js.native
  
  /* userScripts functions */
  /**
    * Register a user script programmatically given its `userScripts.UserScriptOptions`, and resolves to a `userScripts.RegisteredUserScript` instance
    */
  inline def register(userScriptOptions: UserScriptOptions): js.Promise[RegisteredUserScript] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(userScriptOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RegisteredUserScript]]
}
