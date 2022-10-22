package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilerProvider
  extends StObject
     with DataProvider {
  
  def connectSession(sessionId: String): Thenable[Boolean]
  
  def createSession(sessionId: String, sessionName: String, template: ProfilerSessionTemplate): Thenable[Boolean]
  
  def disconnectSession(sessionId: String): Thenable[Boolean]
  
  def getXEventSessions(sessionId: String): Thenable[js.Array[String]]
  
  def pauseSession(sessionId: String): Thenable[Boolean]
  
  def registerOnProfilerSessionCreated(handler: js.Function1[/* response */ ProfilerSessionCreatedParams, Any]): Unit
  
  def registerOnSessionEventsAvailable(handler: js.Function1[/* response */ ProfilerSessionEvents, Any]): Unit
  
  def registerOnSessionStopped(handler: js.Function1[/* response */ ProfilerSessionStoppedParams, Any]): Unit
  
  def startSession(sessionId: String, sessionName: String): Thenable[Boolean]
  
  def stopSession(sessionId: String): Thenable[Boolean]
}
object ProfilerProvider {
  
  inline def apply(
    connectSession: String => Thenable[Boolean],
    createSession: (String, String, ProfilerSessionTemplate) => Thenable[Boolean],
    disconnectSession: String => Thenable[Boolean],
    getXEventSessions: String => Thenable[js.Array[String]],
    pauseSession: String => Thenable[Boolean],
    providerId: String,
    registerOnProfilerSessionCreated: js.Function1[/* response */ ProfilerSessionCreatedParams, Any] => Callback,
    registerOnSessionEventsAvailable: js.Function1[/* response */ ProfilerSessionEvents, Any] => Callback,
    registerOnSessionStopped: js.Function1[/* response */ ProfilerSessionStoppedParams, Any] => Callback,
    startSession: (String, String) => Thenable[Boolean],
    stopSession: String => Thenable[Boolean]
  ): ProfilerProvider = {
    val __obj = js.Dynamic.literal(connectSession = js.Any.fromFunction1(connectSession), createSession = js.Any.fromFunction3(createSession), disconnectSession = js.Any.fromFunction1(disconnectSession), getXEventSessions = js.Any.fromFunction1(getXEventSessions), pauseSession = js.Any.fromFunction1(pauseSession), providerId = providerId.asInstanceOf[js.Any], registerOnProfilerSessionCreated = js.Any.fromFunction1((t0: js.Function1[/* response */ ProfilerSessionCreatedParams, Any]) => registerOnProfilerSessionCreated(t0).runNow()), registerOnSessionEventsAvailable = js.Any.fromFunction1((t0: js.Function1[/* response */ ProfilerSessionEvents, Any]) => registerOnSessionEventsAvailable(t0).runNow()), registerOnSessionStopped = js.Any.fromFunction1((t0: js.Function1[/* response */ ProfilerSessionStoppedParams, Any]) => registerOnSessionStopped(t0).runNow()), startSession = js.Any.fromFunction2(startSession), stopSession = js.Any.fromFunction1(stopSession))
    __obj.asInstanceOf[ProfilerProvider]
  }
  
  extension [Self <: ProfilerProvider](x: Self) {
    
    inline def setConnectSession(value: String => Thenable[Boolean]): Self = StObject.set(x, "connectSession", js.Any.fromFunction1(value))
    
    inline def setCreateSession(value: (String, String, ProfilerSessionTemplate) => Thenable[Boolean]): Self = StObject.set(x, "createSession", js.Any.fromFunction3(value))
    
    inline def setDisconnectSession(value: String => Thenable[Boolean]): Self = StObject.set(x, "disconnectSession", js.Any.fromFunction1(value))
    
    inline def setGetXEventSessions(value: String => Thenable[js.Array[String]]): Self = StObject.set(x, "getXEventSessions", js.Any.fromFunction1(value))
    
    inline def setPauseSession(value: String => Thenable[Boolean]): Self = StObject.set(x, "pauseSession", js.Any.fromFunction1(value))
    
    inline def setRegisterOnProfilerSessionCreated(value: js.Function1[/* response */ ProfilerSessionCreatedParams, Any] => Callback): Self = StObject.set(x, "registerOnProfilerSessionCreated", js.Any.fromFunction1((t0: js.Function1[/* response */ ProfilerSessionCreatedParams, Any]) => value(t0).runNow()))
    
    inline def setRegisterOnSessionEventsAvailable(value: js.Function1[/* response */ ProfilerSessionEvents, Any] => Callback): Self = StObject.set(x, "registerOnSessionEventsAvailable", js.Any.fromFunction1((t0: js.Function1[/* response */ ProfilerSessionEvents, Any]) => value(t0).runNow()))
    
    inline def setRegisterOnSessionStopped(value: js.Function1[/* response */ ProfilerSessionStoppedParams, Any] => Callback): Self = StObject.set(x, "registerOnSessionStopped", js.Any.fromFunction1((t0: js.Function1[/* response */ ProfilerSessionStoppedParams, Any]) => value(t0).runNow()))
    
    inline def setStartSession(value: (String, String) => Thenable[Boolean]): Self = StObject.set(x, "startSession", js.Any.fromFunction2(value))
    
    inline def setStopSession(value: String => Thenable[Boolean]): Self = StObject.set(x, "stopSession", js.Any.fromFunction1(value))
  }
}
