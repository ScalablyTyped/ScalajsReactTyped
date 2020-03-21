package typingsJapgolly.vscodeLanguageserver.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Telemetry extends Remote {
  /**
    * Log the given data to telemetry.
    *
    * @param data The data to log. Must be a JSON serializable object.
    */
  def logEvent(data: js.Any): Unit
}

object Telemetry {
  @scala.inline
  def apply(
    attach: IConnection => Callback,
    connection: IConnection,
    fillServerCapabilities: ServerCapabilities => Callback,
    initialize: ClientCapabilities => Callback,
    logEvent: js.Any => Callback
  ): Telemetry = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
    __obj.updateDynamic("attach")(js.Any.fromFunction1((t0: typingsJapgolly.vscodeLanguageserver.mod.IConnection) => attach(t0).runNow()))
    __obj.updateDynamic("fillServerCapabilities")(js.Any.fromFunction1((t0: typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities) => fillServerCapabilities(t0).runNow()))
    __obj.updateDynamic("initialize")(js.Any.fromFunction1((t0: typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities) => initialize(t0).runNow()))
    __obj.updateDynamic("logEvent")(js.Any.fromFunction1((t0: js.Any) => logEvent(t0).runNow()))
    __obj.asInstanceOf[Telemetry]
  }
}

