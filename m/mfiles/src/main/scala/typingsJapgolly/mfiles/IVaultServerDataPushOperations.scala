package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultServerDataPushOperations extends StObject {
  
  def CloneVaultForServerDataPush(ServerDataPushSink: IServerDataPushSink): IVault
  
  def SendCancel(RequestID: Double): Unit
  
  def SendError(RequestID: Double, Error: String): Unit
  
  def SendHeartbeat(RequestID: Double): Unit
  
  def SendResponse(RequestID: Double, JsonResponseContent: String): Unit
  
  def SetServerDataPushSink(ServerDataPushSink: IServerDataPushSink): Unit
}
object IVaultServerDataPushOperations {
  
  inline def apply(
    CloneVaultForServerDataPush: IServerDataPushSink => IVault,
    SendCancel: Double => Callback,
    SendError: (Double, String) => Callback,
    SendHeartbeat: Double => Callback,
    SendResponse: (Double, String) => Callback,
    SetServerDataPushSink: IServerDataPushSink => Callback
  ): IVaultServerDataPushOperations = {
    val __obj = js.Dynamic.literal(CloneVaultForServerDataPush = js.Any.fromFunction1(CloneVaultForServerDataPush), SendCancel = js.Any.fromFunction1((t0: Double) => SendCancel(t0).runNow()), SendError = js.Any.fromFunction2((t0: Double, t1: String) => (SendError(t0, t1)).runNow()), SendHeartbeat = js.Any.fromFunction1((t0: Double) => SendHeartbeat(t0).runNow()), SendResponse = js.Any.fromFunction2((t0: Double, t1: String) => (SendResponse(t0, t1)).runNow()), SetServerDataPushSink = js.Any.fromFunction1((t0: IServerDataPushSink) => SetServerDataPushSink(t0).runNow()))
    __obj.asInstanceOf[IVaultServerDataPushOperations]
  }
  
  extension [Self <: IVaultServerDataPushOperations](x: Self) {
    
    inline def setCloneVaultForServerDataPush(value: IServerDataPushSink => IVault): Self = StObject.set(x, "CloneVaultForServerDataPush", js.Any.fromFunction1(value))
    
    inline def setSendCancel(value: Double => Callback): Self = StObject.set(x, "SendCancel", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSendError(value: (Double, String) => Callback): Self = StObject.set(x, "SendError", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSendHeartbeat(value: Double => Callback): Self = StObject.set(x, "SendHeartbeat", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSendResponse(value: (Double, String) => Callback): Self = StObject.set(x, "SendResponse", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetServerDataPushSink(value: IServerDataPushSink => Callback): Self = StObject.set(x, "SetServerDataPushSink", js.Any.fromFunction1((t0: IServerDataPushSink) => value(t0).runNow()))
  }
}
