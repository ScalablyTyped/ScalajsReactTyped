package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilerProvider extends DataProvider {
  def connectSession(sessionId: String): Thenable[Boolean]
  def createSession(sessionId: String, sessionName: String, template: ProfilerSessionTemplate): Thenable[Boolean]
  def disconnectSession(sessionId: String): Thenable[Boolean]
  def getXEventSessions(sessionId: String): Thenable[js.Array[String]]
  def pauseSession(sessionId: String): Thenable[Boolean]
  def registerOnProfilerSessionCreated(handler: js.Function1[/* response */ ProfilerSessionCreatedParams, _]): Unit
  def registerOnSessionEventsAvailable(handler: js.Function1[/* response */ ProfilerSessionEvents, _]): Unit
  def registerOnSessionStopped(handler: js.Function1[/* response */ ProfilerSessionStoppedParams, _]): Unit
  def startSession(sessionId: String, sessionName: String): Thenable[Boolean]
  def stopSession(sessionId: String): Thenable[Boolean]
}

object ProfilerProvider {
  @scala.inline
  def apply(
    connectSession: String => CallbackTo[Thenable[Boolean]],
    createSession: (String, String, ProfilerSessionTemplate) => CallbackTo[Thenable[Boolean]],
    disconnectSession: String => CallbackTo[Thenable[Boolean]],
    getXEventSessions: String => CallbackTo[Thenable[js.Array[String]]],
    pauseSession: String => CallbackTo[Thenable[Boolean]],
    providerId: String,
    registerOnProfilerSessionCreated: js.Function1[/* response */ ProfilerSessionCreatedParams, js.Any] => Callback,
    registerOnSessionEventsAvailable: js.Function1[/* response */ ProfilerSessionEvents, js.Any] => Callback,
    registerOnSessionStopped: js.Function1[/* response */ ProfilerSessionStoppedParams, js.Any] => Callback,
    startSession: (String, String) => CallbackTo[Thenable[Boolean]],
    stopSession: String => CallbackTo[Thenable[Boolean]],
    handle: Int | Double = null
  ): ProfilerProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.updateDynamic("connectSession")(js.Any.fromFunction1((t0: java.lang.String) => connectSession(t0).runNow()))
    __obj.updateDynamic("createSession")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.azdata.mod.ProfilerSessionTemplate) => createSession(t0, t1, t2).runNow()))
    __obj.updateDynamic("disconnectSession")(js.Any.fromFunction1((t0: java.lang.String) => disconnectSession(t0).runNow()))
    __obj.updateDynamic("getXEventSessions")(js.Any.fromFunction1((t0: java.lang.String) => getXEventSessions(t0).runNow()))
    __obj.updateDynamic("pauseSession")(js.Any.fromFunction1((t0: java.lang.String) => pauseSession(t0).runNow()))
    __obj.updateDynamic("registerOnProfilerSessionCreated")(js.Any.fromFunction1((t0: js.Function1[/* response */ typingsJapgolly.azdata.mod.ProfilerSessionCreatedParams, js.Any]) => registerOnProfilerSessionCreated(t0).runNow()))
    __obj.updateDynamic("registerOnSessionEventsAvailable")(js.Any.fromFunction1((t0: js.Function1[/* response */ typingsJapgolly.azdata.mod.ProfilerSessionEvents, js.Any]) => registerOnSessionEventsAvailable(t0).runNow()))
    __obj.updateDynamic("registerOnSessionStopped")(js.Any.fromFunction1((t0: js.Function1[/* response */ typingsJapgolly.azdata.mod.ProfilerSessionStoppedParams, js.Any]) => registerOnSessionStopped(t0).runNow()))
    __obj.updateDynamic("startSession")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => startSession(t0, t1).runNow()))
    __obj.updateDynamic("stopSession")(js.Any.fromFunction1((t0: java.lang.String) => stopSession(t0).runNow()))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerProvider]
  }
}

