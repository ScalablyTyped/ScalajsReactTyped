package typingsJapgolly.jupyterlabCells.mod

import typingsJapgolly.jupyterlabApputils.clientsessionMod.IClientSession
import typingsJapgolly.jupyterlabCells.widgetMod.CodeCell.IOptions
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IExecuteReplyMsg
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "CodeCell")
@js.native
class CodeCell protected ()
  extends typingsJapgolly.jupyterlabCells.widgetMod.CodeCell {
  /**
    * Construct a code cell widget.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/cells", "CodeCell")
@js.native
object CodeCell extends js.Object {
  /**
    * Execute a cell given a client session.
    */
  def execute(cell: typingsJapgolly.jupyterlabCells.widgetMod.CodeCell, session: IClientSession): js.Promise[IExecuteReplyMsg | Unit] = js.native
  def execute(
    cell: typingsJapgolly.jupyterlabCells.widgetMod.CodeCell,
    session: IClientSession,
    metadata: JSONObject
  ): js.Promise[IExecuteReplyMsg | Unit] = js.native
}

