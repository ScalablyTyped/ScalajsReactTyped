package typingsJapgolly.freedom.freedom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UdpSocket {
  
  trait Implementation extends StObject {
    
    def bind(address: String, port: Double, continuation: js.Function0[Unit]): Unit
    
    def destroy(continuation: js.Function0[Unit]): Unit
    
    def getInfo(continuation: js.Function1[/* socketInfo */ SocketInfo, Unit]): Unit
    
    def sendTo(
      data: js.typedarray.ArrayBuffer,
      address: String,
      port: Double,
      continuation: js.Function1[/* bytesWritten */ Double, Unit]
    ): Unit
  }
  object Implementation {
    
    inline def apply(
      bind: (String, Double, js.Function0[Unit]) => Callback,
      destroy: js.Function0[Unit] => Callback,
      getInfo: js.Function1[/* socketInfo */ SocketInfo, Unit] => Callback,
      sendTo: (js.typedarray.ArrayBuffer, String, Double, js.Function1[/* bytesWritten */ Double, Unit]) => Callback
    ): Implementation = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3((t0: String, t1: Double, t2: js.Function0[Unit]) => (bind(t0, t1, t2)).runNow()), destroy = js.Any.fromFunction1((t0: js.Function0[Unit]) => destroy(t0).runNow()), getInfo = js.Any.fromFunction1((t0: js.Function1[/* socketInfo */ SocketInfo, Unit]) => getInfo(t0).runNow()), sendTo = js.Any.fromFunction4((t0: js.typedarray.ArrayBuffer, t1: String, t2: Double, t3: js.Function1[/* bytesWritten */ Double, Unit]) => (sendTo(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[Implementation]
    }
    
    extension [Self <: Implementation](x: Self) {
      
      inline def setBind(value: (String, Double, js.Function0[Unit]) => Callback): Self = StObject.set(x, "bind", js.Any.fromFunction3((t0: String, t1: Double, t2: js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setDestroy(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "destroy", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
      
      inline def setGetInfo(value: js.Function1[/* socketInfo */ SocketInfo, Unit] => Callback): Self = StObject.set(x, "getInfo", js.Any.fromFunction1((t0: js.Function1[/* socketInfo */ SocketInfo, Unit]) => value(t0).runNow()))
      
      inline def setSendTo(
        value: (js.typedarray.ArrayBuffer, String, Double, js.Function1[/* bytesWritten */ Double, Unit]) => Callback
      ): Self = StObject.set(x, "sendTo", js.Any.fromFunction4((t0: js.typedarray.ArrayBuffer, t1: String, t2: Double, t3: js.Function1[/* bytesWritten */ Double, Unit]) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
  
  // Type for the chrome.socket.recvFrom callback:
  //   http://developer.chrome.com/apps/socket#method-recvFrom
  // This is also the type returned to onData callbacks.
  trait RecvFromInfo extends StObject {
    
    var address: String
    
    var data: js.typedarray.ArrayBuffer
    
    var port: Double
    
    var resultCode: Double
  }
  object RecvFromInfo {
    
    inline def apply(address: String, data: js.typedarray.ArrayBuffer, port: Double, resultCode: Double): RecvFromInfo = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecvFromInfo]
    }
    
    extension [Self <: RecvFromInfo](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setResultCode(value: Double): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Socket extends StObject {
    
    def bind(address: String, port: Double): js.Promise[Unit]
    
    def destroy(): js.Promise[Unit]
    
    def getInfo(): js.Promise[SocketInfo]
    
    def on(name: String, listener: js.Function): Unit
    
    def sendTo(a: js.typedarray.ArrayBuffer, b: String, c: Double): js.Promise[Double]
    @JSName("sendTo")
    var sendTo_Original: Method3[js.typedarray.ArrayBuffer, String, Double, Double]
  }
  object Socket {
    
    inline def apply(
      bind: (String, Double) => js.Promise[Unit],
      destroy: CallbackTo[js.Promise[Unit]],
      getInfo: CallbackTo[js.Promise[SocketInfo]],
      on: (String, js.Function) => Callback,
      sendTo: Method3[js.typedarray.ArrayBuffer, String, Double, Double]
    ): Socket = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind), destroy = destroy.toJsFn, getInfo = getInfo.toJsFn, on = js.Any.fromFunction2((t0: String, t1: js.Function) => (on(t0, t1)).runNow()), sendTo = sendTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Socket]
    }
    
    extension [Self <: Socket](x: Self) {
      
      inline def setBind(value: (String, Double) => js.Promise[Unit]): Self = StObject.set(x, "bind", js.Any.fromFunction2(value))
      
      inline def setDestroy(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetInfo(value: CallbackTo[js.Promise[SocketInfo]]): Self = StObject.set(x, "getInfo", value.toJsFn)
      
      inline def setOn(value: (String, js.Function) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: js.Function) => (value(t0, t1)).runNow()))
      
      inline def setSendTo(value: Method3[js.typedarray.ArrayBuffer, String, Double, Double]): Self = StObject.set(x, "sendTo", value.asInstanceOf[js.Any])
    }
  }
  
  // Type for the chrome.socket.getInfo callback:
  //   https://developer.chrome.com/apps/sockets_udp#type-SocketInfo
  // This is also the type returned by getInfo().
  trait SocketInfo extends StObject {
    
    // Note that there are other fields but these are the ones we care about.
    var localAddress: String
    
    var localPort: Double
  }
  object SocketInfo {
    
    inline def apply(localAddress: String, localPort: Double): SocketInfo = {
      val __obj = js.Dynamic.literal(localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketInfo]
    }
    
    extension [Self <: SocketInfo](x: Self) {
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
    }
  }
}
