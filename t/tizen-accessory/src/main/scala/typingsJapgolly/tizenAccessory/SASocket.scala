package typingsJapgolly.tizenAccessory

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SASocket extends StObject {
  
  def close(): Unit
  
  def isConnected(): Boolean
  
  val peerAgent: SAPeerAgent
  
  def sendData(channelId: Double, data: String): Unit
  
  def sendSecureData(channelId: Double, data: String): Unit
  
  def setDataReceiveListener(dataReceiveCallback: js.Function2[/* channelId */ Double, /* data */ String, Unit]): Unit
  
  def setSocketStatusListener(socketStatusCallback: js.Function1[/* reason */ String, Unit]): Unit
}
object SASocket {
  
  inline def apply(
    close: Callback,
    isConnected: CallbackTo[Boolean],
    peerAgent: SAPeerAgent,
    sendData: (Double, String) => Callback,
    sendSecureData: (Double, String) => Callback,
    setDataReceiveListener: js.Function2[/* channelId */ Double, /* data */ String, Unit] => Callback,
    setSocketStatusListener: js.Function1[/* reason */ String, Unit] => Callback
  ): SASocket = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, isConnected = isConnected.toJsFn, peerAgent = peerAgent.asInstanceOf[js.Any], sendData = js.Any.fromFunction2((t0: Double, t1: String) => (sendData(t0, t1)).runNow()), sendSecureData = js.Any.fromFunction2((t0: Double, t1: String) => (sendSecureData(t0, t1)).runNow()), setDataReceiveListener = js.Any.fromFunction1((t0: js.Function2[/* channelId */ Double, /* data */ String, Unit]) => setDataReceiveListener(t0).runNow()), setSocketStatusListener = js.Any.fromFunction1((t0: js.Function1[/* reason */ String, Unit]) => setSocketStatusListener(t0).runNow()))
    __obj.asInstanceOf[SASocket]
  }
  
  extension [Self <: SASocket](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setIsConnected(value: CallbackTo[Boolean]): Self = StObject.set(x, "isConnected", value.toJsFn)
    
    inline def setPeerAgent(value: SAPeerAgent): Self = StObject.set(x, "peerAgent", value.asInstanceOf[js.Any])
    
    inline def setSendData(value: (Double, String) => Callback): Self = StObject.set(x, "sendData", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSendSecureData(value: (Double, String) => Callback): Self = StObject.set(x, "sendSecureData", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetDataReceiveListener(value: js.Function2[/* channelId */ Double, /* data */ String, Unit] => Callback): Self = StObject.set(x, "setDataReceiveListener", js.Any.fromFunction1((t0: js.Function2[/* channelId */ Double, /* data */ String, Unit]) => value(t0).runNow()))
    
    inline def setSetSocketStatusListener(value: js.Function1[/* reason */ String, Unit] => Callback): Self = StObject.set(x, "setSocketStatusListener", js.Any.fromFunction1((t0: js.Function1[/* reason */ String, Unit]) => value(t0).runNow()))
  }
}
