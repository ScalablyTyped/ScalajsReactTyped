package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExplorerProviderBase extends DataProvider {
  def expandNode(nodeInfo: ExpandNodeInfo): Thenable[Boolean]
  def findNodes(findNodesInfo: FindNodesInfo): Thenable[ObjectExplorerFindNodesResponse]
  def refreshNode(nodeInfo: ExpandNodeInfo): Thenable[Boolean]
  def registerOnExpandCompleted(handler: js.Function1[/* response */ ObjectExplorerExpandInfo, _]): Unit
}

object ObjectExplorerProviderBase {
  @scala.inline
  def apply(
    expandNode: ExpandNodeInfo => CallbackTo[Thenable[Boolean]],
    findNodes: FindNodesInfo => CallbackTo[Thenable[ObjectExplorerFindNodesResponse]],
    providerId: String,
    refreshNode: ExpandNodeInfo => CallbackTo[Thenable[Boolean]],
    registerOnExpandCompleted: js.Function1[/* response */ ObjectExplorerExpandInfo, js.Any] => Callback,
    handle: Int | Double = null
  ): ObjectExplorerProviderBase = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.updateDynamic("expandNode")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.ExpandNodeInfo) => expandNode(t0).runNow()))
    __obj.updateDynamic("findNodes")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.FindNodesInfo) => findNodes(t0).runNow()))
    __obj.updateDynamic("refreshNode")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.ExpandNodeInfo) => refreshNode(t0).runNow()))
    __obj.updateDynamic("registerOnExpandCompleted")(js.Any.fromFunction1((t0: js.Function1[/* response */ typingsJapgolly.azdata.mod.ObjectExplorerExpandInfo, js.Any]) => registerOnExpandCompleted(t0).runNow()))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerProviderBase]
  }
}

