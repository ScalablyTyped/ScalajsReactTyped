package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketTask extends StObject {
  
  /** [SocketTask.close(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/SocketTask.close.html)
    *
    * 关闭 WebSocket 连接 */
  def close(option: SocketTaskCloseOption): Unit
  
  /** [SocketTask.onClose(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/SocketTask.onClose.html)
    *
    * 监听 WebSocket 连接关闭事件 */
  def onClose(/** WebSocket 连接关闭事件的回调函数 */
  callback: SocketTaskOnCloseCallback): Unit
  
  /** [SocketTask.onError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/SocketTask.onError.html)
    *
    * 监听 WebSocket 错误事件 */
  def onError(/** WebSocket 错误事件的回调函数 */
  callback: UDPSocketOnErrorCallback): Unit
  
  /** [SocketTask.onMessage(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/SocketTask.onMessage.html)
    *
    * 监听 WebSocket 接受到服务器的消息事件 */
  def onMessage(/** WebSocket 接受到服务器的消息事件的回调函数 */
  callback: SocketTaskOnMessageCallback): Unit
  
  /** [SocketTask.onOpen(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/SocketTask.onOpen.html)
    *
    * 监听 WebSocket 连接打开事件 */
  def onOpen(/** WebSocket 连接打开事件的回调函数 */
  callback: OnOpenCallback): Unit
  
  /** [SocketTask.send(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/SocketTask.send.html)
    *
    * 通过 WebSocket 连接发送数据 */
  def send(option: SocketTaskSendOption): Unit
}
object SocketTask {
  
  inline def apply(
    close: SocketTaskCloseOption => Callback,
    onClose: SocketTaskOnCloseCallback => Callback,
    onError: UDPSocketOnErrorCallback => Callback,
    onMessage: SocketTaskOnMessageCallback => Callback,
    onOpen: OnOpenCallback => Callback,
    send: SocketTaskSendOption => Callback
  ): SocketTask = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1((t0: SocketTaskCloseOption) => close(t0).runNow()), onClose = js.Any.fromFunction1((t0: SocketTaskOnCloseCallback) => onClose(t0).runNow()), onError = js.Any.fromFunction1((t0: UDPSocketOnErrorCallback) => onError(t0).runNow()), onMessage = js.Any.fromFunction1((t0: SocketTaskOnMessageCallback) => onMessage(t0).runNow()), onOpen = js.Any.fromFunction1((t0: OnOpenCallback) => onOpen(t0).runNow()), send = js.Any.fromFunction1((t0: SocketTaskSendOption) => send(t0).runNow()))
    __obj.asInstanceOf[SocketTask]
  }
  
  extension [Self <: SocketTask](x: Self) {
    
    inline def setClose(value: SocketTaskCloseOption => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: SocketTaskCloseOption) => value(t0).runNow()))
    
    inline def setOnClose(value: SocketTaskOnCloseCallback => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: SocketTaskOnCloseCallback) => value(t0).runNow()))
    
    inline def setOnError(value: UDPSocketOnErrorCallback => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: UDPSocketOnErrorCallback) => value(t0).runNow()))
    
    inline def setOnMessage(value: SocketTaskOnMessageCallback => Callback): Self = StObject.set(x, "onMessage", js.Any.fromFunction1((t0: SocketTaskOnMessageCallback) => value(t0).runNow()))
    
    inline def setOnOpen(value: OnOpenCallback => Callback): Self = StObject.set(x, "onOpen", js.Any.fromFunction1((t0: OnOpenCallback) => value(t0).runNow()))
    
    inline def setSend(value: SocketTaskSendOption => Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: SocketTaskSendOption) => value(t0).runNow()))
  }
}
