package typingsJapgolly.jupyterlabServices.workspaceMod

import typingsJapgolly.jupyterlabCoreutils.dataconnectorMod.DataConnector
import typingsJapgolly.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsJapgolly.jupyterlabServices.workspaceMod.Workspace.IWorkspace
import typingsJapgolly.jupyterlabServices.workspaceMod.WorkspaceManager.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/workspace", "WorkspaceManager")
@js.native
/**
  * Create a new workspace manager.
  */
class WorkspaceManager_ () extends DataConnector[IWorkspace, IWorkspace, String] {
  def this(options: IOptions) = this()
  /**
    * The server settings used to make API requests.
    */
  val serverSettings: ISettings = js.native
}

