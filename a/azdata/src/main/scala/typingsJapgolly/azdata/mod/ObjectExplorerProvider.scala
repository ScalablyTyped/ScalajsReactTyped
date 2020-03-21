package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExplorerProvider extends ObjectExplorerProviderBase {
  var registerOnSessionDisconnected: js.UndefOr[
    js.Function1[/* handler */ js.Function1[/* response */ ObjectExplorerSession, _], Unit]
  ] = js.undefined
  def closeSession(closeSessionInfo: ObjectExplorerCloseSessionInfo): Thenable[ObjectExplorerCloseSessionResponse]
  def createNewSession(connInfo: ConnectionInfo): Thenable[ObjectExplorerSessionResponse]
  def registerOnSessionCreated(handler: js.Function1[/* response */ ObjectExplorerSession, _]): Unit
}

object ObjectExplorerProvider {
  @scala.inline
  def apply(
    closeSession: ObjectExplorerCloseSessionInfo => CallbackTo[Thenable[ObjectExplorerCloseSessionResponse]],
    createNewSession: ConnectionInfo => CallbackTo[Thenable[ObjectExplorerSessionResponse]],
    expandNode: ExpandNodeInfo => CallbackTo[Thenable[Boolean]],
    findNodes: FindNodesInfo => CallbackTo[Thenable[ObjectExplorerFindNodesResponse]],
    providerId: String,
    refreshNode: ExpandNodeInfo => CallbackTo[Thenable[Boolean]],
    registerOnExpandCompleted: js.Function1[/* response */ ObjectExplorerExpandInfo, js.Any] => Callback,
    registerOnSessionCreated: js.Function1[/* response */ ObjectExplorerSession, js.Any] => Callback,
    handle: Int | Double = null,
    registerOnSessionDisconnected: /* handler */ js.Function1[/* response */ ObjectExplorerSession, js.Any] => Callback = null
  ): ObjectExplorerProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.updateDynamic("closeSession")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.ObjectExplorerCloseSessionInfo) => closeSession(t0).runNow()))
    __obj.updateDynamic("createNewSession")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.ConnectionInfo) => createNewSession(t0).runNow()))
    __obj.updateDynamic("expandNode")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.ExpandNodeInfo) => expandNode(t0).runNow()))
    __obj.updateDynamic("findNodes")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.FindNodesInfo) => findNodes(t0).runNow()))
    __obj.updateDynamic("refreshNode")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.ExpandNodeInfo) => refreshNode(t0).runNow()))
    __obj.updateDynamic("registerOnExpandCompleted")(js.Any.fromFunction1((t0: js.Function1[/* response */ typingsJapgolly.azdata.mod.ObjectExplorerExpandInfo, js.Any]) => registerOnExpandCompleted(t0).runNow()))
    __obj.updateDynamic("registerOnSessionCreated")(js.Any.fromFunction1((t0: js.Function1[/* response */ typingsJapgolly.azdata.mod.ObjectExplorerSession, js.Any]) => registerOnSessionCreated(t0).runNow()))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (registerOnSessionDisconnected != null) __obj.updateDynamic("registerOnSessionDisconnected")(js.Any.fromFunction1((t0: /* handler */ js.Function1[/* response */ typingsJapgolly.azdata.mod.ObjectExplorerSession, js.Any]) => registerOnSessionDisconnected(t0).runNow()))
    __obj.asInstanceOf[ObjectExplorerProvider]
  }
}

