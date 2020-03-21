package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExplorerNodeProvider extends ObjectExplorerProviderBase {
  /**
  		 * Optional group name used to sort nodes in the tree. If not defined, the node order will be added in order based on provider ID, with
  		 * nodes from the main ObjectExplorerProvider for this provider type added first
  		 */
  val group: js.UndefOr[String] = js.undefined
  /**
  		 * The providerId for whichever type of ObjectExplorer connection this can add folders and objects to
  		 */
  val supportedProviderId: String
  def handleSessionClose(closeSessionInfo: ObjectExplorerCloseSessionInfo): Unit
  def handleSessionOpen(session: ObjectExplorerSession): Thenable[Boolean]
}

object ObjectExplorerNodeProvider {
  @scala.inline
  def apply(
    expandNode: ExpandNodeInfo => CallbackTo[Thenable[Boolean]],
    findNodes: FindNodesInfo => CallbackTo[Thenable[ObjectExplorerFindNodesResponse]],
    handleSessionClose: ObjectExplorerCloseSessionInfo => Callback,
    handleSessionOpen: ObjectExplorerSession => CallbackTo[Thenable[Boolean]],
    providerId: String,
    refreshNode: ExpandNodeInfo => CallbackTo[Thenable[Boolean]],
    registerOnExpandCompleted: js.Function1[/* response */ ObjectExplorerExpandInfo, js.Any] => Callback,
    supportedProviderId: String,
    group: String = null,
    handle: Int | Double = null
  ): ObjectExplorerNodeProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], supportedProviderId = supportedProviderId.asInstanceOf[js.Any])
    __obj.updateDynamic("expandNode")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.ExpandNodeInfo) => expandNode(t0).runNow()))
    __obj.updateDynamic("findNodes")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.FindNodesInfo) => findNodes(t0).runNow()))
    __obj.updateDynamic("handleSessionClose")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.ObjectExplorerCloseSessionInfo) => handleSessionClose(t0).runNow()))
    __obj.updateDynamic("handleSessionOpen")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.ObjectExplorerSession) => handleSessionOpen(t0).runNow()))
    __obj.updateDynamic("refreshNode")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.ExpandNodeInfo) => refreshNode(t0).runNow()))
    __obj.updateDynamic("registerOnExpandCompleted")(js.Any.fromFunction1((t0: js.Function1[/* response */ typingsJapgolly.azdata.mod.ObjectExplorerExpandInfo, js.Any]) => registerOnExpandCompleted(t0).runNow()))
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerNodeProvider]
  }
}

