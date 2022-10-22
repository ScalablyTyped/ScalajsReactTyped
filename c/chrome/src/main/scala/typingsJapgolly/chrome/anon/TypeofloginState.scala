package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.loginState.ProfileType
import typingsJapgolly.chrome.chrome.loginState.SessionState
import typingsJapgolly.chrome.chrome.loginState.SessionStateChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofloginState extends StObject {
  
  def getProfileType(callback: js.Function1[/* profileType */ ProfileType, Unit]): Unit
  
  def getSessionState(callback: js.Function1[/* sessionState */ SessionState, Unit]): Unit
  
  val onSessionStateChanged: SessionStateChangedEvent
}
object TypeofloginState {
  
  inline def apply(
    getProfileType: js.Function1[/* profileType */ ProfileType, Unit] => Callback,
    getSessionState: js.Function1[/* sessionState */ SessionState, Unit] => Callback,
    onSessionStateChanged: SessionStateChangedEvent
  ): TypeofloginState = {
    val __obj = js.Dynamic.literal(getProfileType = js.Any.fromFunction1((t0: js.Function1[/* profileType */ ProfileType, Unit]) => getProfileType(t0).runNow()), getSessionState = js.Any.fromFunction1((t0: js.Function1[/* sessionState */ SessionState, Unit]) => getSessionState(t0).runNow()), onSessionStateChanged = onSessionStateChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofloginState]
  }
  
  extension [Self <: TypeofloginState](x: Self) {
    
    inline def setGetProfileType(value: js.Function1[/* profileType */ ProfileType, Unit] => Callback): Self = StObject.set(x, "getProfileType", js.Any.fromFunction1((t0: js.Function1[/* profileType */ ProfileType, Unit]) => value(t0).runNow()))
    
    inline def setGetSessionState(value: js.Function1[/* sessionState */ SessionState, Unit] => Callback): Self = StObject.set(x, "getSessionState", js.Any.fromFunction1((t0: js.Function1[/* sessionState */ SessionState, Unit]) => value(t0).runNow()))
    
    inline def setOnSessionStateChanged(value: SessionStateChangedEvent): Self = StObject.set(x, "onSessionStateChanged", value.asInstanceOf[js.Any])
  }
}
