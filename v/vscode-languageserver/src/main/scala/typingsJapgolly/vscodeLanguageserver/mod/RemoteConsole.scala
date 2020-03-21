package typingsJapgolly.vscodeLanguageserver.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteConsole extends Remote {
  /**
    * Show an error message.
    *
    * @param message The message to show.
    */
  def error(message: String): Unit
  /**
    * Show an information message.
    *
    * @param message The message to show.
    */
  def info(message: String): Unit
  /**
    * Log a message.
    *
    * @param message The message to log.
    */
  def log(message: String): Unit
  /**
    * Show a warning message.
    *
    * @param message The message to show.
    */
  def warn(message: String): Unit
}

object RemoteConsole {
  @scala.inline
  def apply(
    attach: IConnection => Callback,
    connection: IConnection,
    error: String => Callback,
    fillServerCapabilities: ServerCapabilities => Callback,
    info: String => Callback,
    initialize: ClientCapabilities => Callback,
    log: String => Callback,
    warn: String => Callback
  ): RemoteConsole = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
    __obj.updateDynamic("attach")(js.Any.fromFunction1((t0: typingsJapgolly.vscodeLanguageserver.mod.IConnection) => attach(t0).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: java.lang.String) => error(t0).runNow()))
    __obj.updateDynamic("fillServerCapabilities")(js.Any.fromFunction1((t0: typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities) => fillServerCapabilities(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: java.lang.String) => info(t0).runNow()))
    __obj.updateDynamic("initialize")(js.Any.fromFunction1((t0: typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities) => initialize(t0).runNow()))
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: java.lang.String) => log(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: java.lang.String) => warn(t0).runNow()))
    __obj.asInstanceOf[RemoteConsole]
  }
}

