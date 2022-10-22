package typingsJapgolly.tizenAccessory

import japgolly.scalajs.react.Callback
import typingsJapgolly.tizenAccessory.anon.Oncomplete
import typingsJapgolly.tizenAccessory.anon.Onprogress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAFileTransfer extends StObject {
  
  def cancelFile(id: String): Unit
  
  val defaultReceivePath: String
  
  def receiveFile(id: String, localPath: String): Unit
  
  def rejectFile(id: String): Unit
  
  def sendFile(peerAgent: SAPeerAgent, filePath: String): Double
  
  def setFileReceiveListener(callback: Onprogress): Unit
  
  def setFileSendListener(callback: Oncomplete): Unit
}
object SAFileTransfer {
  
  inline def apply(
    cancelFile: String => Callback,
    defaultReceivePath: String,
    receiveFile: (String, String) => Callback,
    rejectFile: String => Callback,
    sendFile: (SAPeerAgent, String) => Double,
    setFileReceiveListener: Onprogress => Callback,
    setFileSendListener: Oncomplete => Callback
  ): SAFileTransfer = {
    val __obj = js.Dynamic.literal(cancelFile = js.Any.fromFunction1((t0: String) => cancelFile(t0).runNow()), defaultReceivePath = defaultReceivePath.asInstanceOf[js.Any], receiveFile = js.Any.fromFunction2((t0: String, t1: String) => (receiveFile(t0, t1)).runNow()), rejectFile = js.Any.fromFunction1((t0: String) => rejectFile(t0).runNow()), sendFile = js.Any.fromFunction2(sendFile), setFileReceiveListener = js.Any.fromFunction1((t0: Onprogress) => setFileReceiveListener(t0).runNow()), setFileSendListener = js.Any.fromFunction1((t0: Oncomplete) => setFileSendListener(t0).runNow()))
    __obj.asInstanceOf[SAFileTransfer]
  }
  
  extension [Self <: SAFileTransfer](x: Self) {
    
    inline def setCancelFile(value: String => Callback): Self = StObject.set(x, "cancelFile", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setDefaultReceivePath(value: String): Self = StObject.set(x, "defaultReceivePath", value.asInstanceOf[js.Any])
    
    inline def setReceiveFile(value: (String, String) => Callback): Self = StObject.set(x, "receiveFile", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setRejectFile(value: String => Callback): Self = StObject.set(x, "rejectFile", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSendFile(value: (SAPeerAgent, String) => Double): Self = StObject.set(x, "sendFile", js.Any.fromFunction2(value))
    
    inline def setSetFileReceiveListener(value: Onprogress => Callback): Self = StObject.set(x, "setFileReceiveListener", js.Any.fromFunction1((t0: Onprogress) => value(t0).runNow()))
    
    inline def setSetFileSendListener(value: Oncomplete => Callback): Self = StObject.set(x, "setFileSendListener", js.Any.fromFunction1((t0: Oncomplete) => value(t0).runNow()))
  }
}
