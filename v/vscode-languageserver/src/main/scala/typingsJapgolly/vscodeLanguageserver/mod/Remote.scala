package typingsJapgolly.vscodeLanguageserver.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Remote extends js.Object {
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection
  /**
    * Attach the remote to the given connection.
    *
    * @param connection The connection this remote is operating on.
    */
  def attach(connection: IConnection): Unit
  /**
    * Called to fill in the server capabilities this feature implements.
    *
    * @param capabilities The server capabilities to fill.
    */
  def fillServerCapabilities(capabilities: ServerCapabilities): Unit
  /**
    * Called to initialize the remote with the given
    * client capabilities
    *
    * @param capabilities The client capabilities
    */
  def initialize(capabilities: ClientCapabilities): Unit
}

object Remote {
  @scala.inline
  def apply(
    attach: IConnection => Callback,
    connection: IConnection,
    fillServerCapabilities: ServerCapabilities => Callback,
    initialize: ClientCapabilities => Callback
  ): Remote = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
    __obj.updateDynamic("attach")(js.Any.fromFunction1((t0: typingsJapgolly.vscodeLanguageserver.mod.IConnection) => attach(t0).runNow()))
    __obj.updateDynamic("fillServerCapabilities")(js.Any.fromFunction1((t0: typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities) => fillServerCapabilities(t0).runNow()))
    __obj.updateDynamic("initialize")(js.Any.fromFunction1((t0: typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities) => initialize(t0).runNow()))
    __obj.asInstanceOf[Remote]
  }
}

