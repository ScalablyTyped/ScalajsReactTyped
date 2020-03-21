package typingsJapgolly.jupyterlabOutputarea.widgetMod.OutputArea

import typingsJapgolly.jupyterlabApputils.clientsessionMod.IClientSession
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IExecuteReplyMsg
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea.execute")
@js.native
object execute extends js.Object {
  /**
    * Execute code on an output area.
    */
  def apply(
    code: String,
    output: typingsJapgolly.jupyterlabOutputarea.widgetMod.OutputArea,
    session: IClientSession
  ): js.Promise[IExecuteReplyMsg] = js.native
  def apply(
    code: String,
    output: typingsJapgolly.jupyterlabOutputarea.widgetMod.OutputArea,
    session: IClientSession,
    metadata: JSONObject
  ): js.Promise[IExecuteReplyMsg] = js.native
}

