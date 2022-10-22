package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketTask extends StObject {
  
  /** [SocketTask.close(Object object)](SocketTask.close.md)
    *
    * 关闭 WebSocket 连接 */
  def close(option: CloseOption): Unit
  
  /** [SocketTask.onClose(function callback)](SocketTask.onClose.md)
    *
    * 监听 WebSocket 连接关闭事件 */
  def onClose(/** WebSocket 连接关闭事件的回调函数 */
  callback: OnCloseCallback): Unit
  
  /** [SocketTask.onError(function callback)](SocketTask.onError.md)
    *
    * 监听 WebSocket 错误事件 */
  def onError(/** WebSocket 错误事件的回调函数 */
  callback: SocketTaskOnErrorCallback): Unit
  
  /** [SocketTask.onMessage(function callback)](SocketTask.onMessage.md)
    *
    * 监听 WebSocket 接受到服务器的消息事件 */
  def onMessage(/** WebSocket 接受到服务器的消息事件的回调函数 */
  callback: SocketTaskOnMessageCallback): Unit
  
  /** [SocketTask.onOpen(function callback)](SocketTask.onOpen.md)
    *
    * 监听 WebSocket 连接打开事件 */
  def onOpen(/** WebSocket 连接打开事件的回调函数 */
  callback: OnOpenCallback): Unit
  
  /** [SocketTask.send(Object object)](SocketTask.send.md)
    *
    * 通过 WebSocket 连接发送数据 */
  def send(option: SendOption): Unit
}
object SocketTask {
  
  inline def apply(
    close: CloseOption => Callback,
    onClose: OnCloseCallback => Callback,
    onError: SocketTaskOnErrorCallback => Callback,
    onMessage: SocketTaskOnMessageCallback => Callback,
    onOpen: OnOpenCallback => Callback,
    send: SendOption => Callback
  ): SocketTask = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1((t0: CloseOption) => close(t0).runNow()), onClose = js.Any.fromFunction1((t0: OnCloseCallback) => onClose(t0).runNow()), onError = js.Any.fromFunction1((t0: SocketTaskOnErrorCallback) => onError(t0).runNow()), onMessage = js.Any.fromFunction1((t0: SocketTaskOnMessageCallback) => onMessage(t0).runNow()), onOpen = js.Any.fromFunction1((t0: OnOpenCallback) => onOpen(t0).runNow()), send = js.Any.fromFunction1((t0: SendOption) => send(t0).runNow()))
    __obj.asInstanceOf[SocketTask]
  }
  
  extension [Self <: SocketTask](x: Self) {
    
    inline def setClose(value: CloseOption => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: CloseOption) => value(t0).runNow()))
    
    inline def setOnClose(value: OnCloseCallback => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: OnCloseCallback) => value(t0).runNow()))
    
    inline def setOnError(value: SocketTaskOnErrorCallback => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: SocketTaskOnErrorCallback) => value(t0).runNow()))
    
    inline def setOnMessage(value: SocketTaskOnMessageCallback => Callback): Self = StObject.set(x, "onMessage", js.Any.fromFunction1((t0: SocketTaskOnMessageCallback) => value(t0).runNow()))
    
    inline def setOnOpen(value: OnOpenCallback => Callback): Self = StObject.set(x, "onOpen", js.Any.fromFunction1((t0: OnOpenCallback) => value(t0).runNow()))
    
    inline def setSend(value: SendOption => Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: SendOption) => value(t0).runNow()))
  }
}
