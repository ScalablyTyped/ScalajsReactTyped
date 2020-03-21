package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultServerDataPushOperations extends js.Object {
  def CloneVaultForServerDataPush(ServerDataPushSink: IServerDataPushSink): IVault
  def SendCancel(RequestID: Double): Unit
  def SendError(RequestID: Double, Error: String): Unit
  def SendHeartbeat(RequestID: Double): Unit
  def SendResponse(RequestID: Double, JsonResponseContent: String): Unit
  def SetServerDataPushSink(ServerDataPushSink: IServerDataPushSink): Unit
}

object IVaultServerDataPushOperations {
  @scala.inline
  def apply(
    CloneVaultForServerDataPush: IServerDataPushSink => CallbackTo[IVault],
    SendCancel: Double => Callback,
    SendError: (Double, String) => Callback,
    SendHeartbeat: Double => Callback,
    SendResponse: (Double, String) => Callback,
    SetServerDataPushSink: IServerDataPushSink => Callback
  ): IVaultServerDataPushOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CloneVaultForServerDataPush")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IServerDataPushSink) => CloneVaultForServerDataPush(t0).runNow()))
    __obj.updateDynamic("SendCancel")(js.Any.fromFunction1((t0: scala.Double) => SendCancel(t0).runNow()))
    __obj.updateDynamic("SendError")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => SendError(t0, t1).runNow()))
    __obj.updateDynamic("SendHeartbeat")(js.Any.fromFunction1((t0: scala.Double) => SendHeartbeat(t0).runNow()))
    __obj.updateDynamic("SendResponse")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => SendResponse(t0, t1).runNow()))
    __obj.updateDynamic("SetServerDataPushSink")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IServerDataPushSink) => SetServerDataPushSink(t0).runNow()))
    __obj.asInstanceOf[IVaultServerDataPushOperations]
  }
}

