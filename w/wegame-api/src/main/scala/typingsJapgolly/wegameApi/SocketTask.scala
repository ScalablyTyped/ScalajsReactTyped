package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.wx.types.SocketCloseParams
import typingsJapgolly.wegameApi.wx.types.SocketErrorCallback
import typingsJapgolly.wegameApi.wx.types.SocketMessageCallback
import typingsJapgolly.wegameApi.wx.types.SocketOpenCallback
import typingsJapgolly.wegameApi.wx.types.SocketSendParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketTask extends StObject {
  
  /**
    * 关闭WebSocket连接
    */
  def close(param: SocketCloseParams): Unit
  
  /**
    * 监听WebSocket 连接关闭事件
    */
  def onClose(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听WebSocket 错误事件
    */
  def onError(callback: SocketErrorCallback): Unit
  
  /**
    * 监听WebSocket 接受到服务器的消息事件
    */
  def onMessage(callback: SocketMessageCallback): Unit
  
  /**
    * 监听WebSocket 连接打开事件
    */
  def onOpen(callback: SocketOpenCallback): Unit
  
  /**
    * 通过WebSocket发送数据
    */
  def send(param: SocketSendParams): Unit
}
object SocketTask {
  
  inline def apply(
    close: SocketCloseParams => Callback,
    onClose: js.Function0[Unit] => Callback,
    onError: SocketErrorCallback => Callback,
    onMessage: SocketMessageCallback => Callback,
    onOpen: SocketOpenCallback => Callback,
    send: SocketSendParams => Callback
  ): SocketTask = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1((t0: SocketCloseParams) => close(t0).runNow()), onClose = js.Any.fromFunction1((t0: js.Function0[Unit]) => onClose(t0).runNow()), onError = js.Any.fromFunction1((t0: SocketErrorCallback) => onError(t0).runNow()), onMessage = js.Any.fromFunction1((t0: SocketMessageCallback) => onMessage(t0).runNow()), onOpen = js.Any.fromFunction1((t0: SocketOpenCallback) => onOpen(t0).runNow()), send = js.Any.fromFunction1((t0: SocketSendParams) => send(t0).runNow()))
    __obj.asInstanceOf[SocketTask]
  }
  
  extension [Self <: SocketTask](x: Self) {
    
    inline def setClose(value: SocketCloseParams => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: SocketCloseParams) => value(t0).runNow()))
    
    inline def setOnClose(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnError(value: SocketErrorCallback => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: SocketErrorCallback) => value(t0).runNow()))
    
    inline def setOnMessage(value: SocketMessageCallback => Callback): Self = StObject.set(x, "onMessage", js.Any.fromFunction1((t0: SocketMessageCallback) => value(t0).runNow()))
    
    inline def setOnOpen(value: SocketOpenCallback => Callback): Self = StObject.set(x, "onOpen", js.Any.fromFunction1((t0: SocketOpenCallback) => value(t0).runNow()))
    
    inline def setSend(value: SocketSendParams => Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: SocketSendParams) => value(t0).runNow()))
  }
}
