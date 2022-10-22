package typingsJapgolly.chrome.global.chrome

import typingsJapgolly.chrome.chrome.loginState.ProfileType
import typingsJapgolly.chrome.chrome.loginState.SessionState
import typingsJapgolly.chrome.chrome.loginState.SessionStateChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// LoginState
////////////////////
/**
  * Use the chrome.loginState API to read and monitor the login state.
  * Permissions: "loginState"
  * @since Chrome 78.
  * Important: This API works only on Chrome OS.
  */
object loginState {
  
  @JSGlobal("chrome.loginState")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProfileType(callback: js.Function1[/* profileType */ ProfileType, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfileType")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getSessionState(callback: js.Function1[/* sessionState */ SessionState, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSessionState")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("chrome.loginState.onSessionStateChanged")
  @js.native
  val onSessionStateChanged: SessionStateChangedEvent = js.native
}
