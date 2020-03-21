package typingsJapgolly.jupyterlabCells.widgetMod.CodeCell

import typingsJapgolly.jupyterlabApputils.clientsessionMod.IClientSession
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IExecuteReplyMsg
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/widget", "CodeCell.execute")
@js.native
object execute extends js.Object {
  /**
    * Execute a cell given a client session.
    */
  def apply(cell: typingsJapgolly.jupyterlabCells.widgetMod.CodeCell, session: IClientSession): js.Promise[IExecuteReplyMsg | Unit] = js.native
  def apply(
    cell: typingsJapgolly.jupyterlabCells.widgetMod.CodeCell,
    session: IClientSession,
    metadata: JSONObject
  ): js.Promise[IExecuteReplyMsg | Unit] = js.native
}

