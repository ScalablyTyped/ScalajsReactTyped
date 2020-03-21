package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.IServerDataPushSink
import typingsJapgolly.mfiles.IVault
import typingsJapgolly.mfiles.IVaultServerDataPushOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultServerDataPushOperations")
@js.native
class VaultServerDataPushOperations () extends IVaultServerDataPushOperations {
  /* CompleteClass */
  override def CloneVaultForServerDataPush(ServerDataPushSink: IServerDataPushSink): IVault = js.native
  /* CompleteClass */
  override def SendCancel(RequestID: Double): Unit = js.native
  /* CompleteClass */
  override def SendError(RequestID: Double, Error: String): Unit = js.native
  /* CompleteClass */
  override def SendHeartbeat(RequestID: Double): Unit = js.native
  /* CompleteClass */
  override def SendResponse(RequestID: Double, JsonResponseContent: String): Unit = js.native
  /* CompleteClass */
  override def SetServerDataPushSink(ServerDataPushSink: IServerDataPushSink): Unit = js.native
}

@JSGlobal("MFiles.VaultServerDataPushOperations")
@js.native
object VaultServerDataPushOperations extends Instantiable0[IVaultServerDataPushOperations]

