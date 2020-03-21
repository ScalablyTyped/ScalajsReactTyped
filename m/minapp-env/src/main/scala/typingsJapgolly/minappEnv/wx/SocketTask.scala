package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketTask extends js.Object {
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
  @scala.inline
  def apply(
    close: CloseOption => Callback,
    onClose: OnCloseCallback => Callback,
    onError: SocketTaskOnErrorCallback => Callback,
    onMessage: SocketTaskOnMessageCallback => Callback,
    onOpen: OnOpenCallback => Callback,
    send: SendOption => Callback
  ): SocketTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.CloseOption) => close(t0).runNow()))
    __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OnCloseCallback) => onClose(t0).runNow()))
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.SocketTaskOnErrorCallback) => onError(t0).runNow()))
    __obj.updateDynamic("onMessage")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.SocketTaskOnMessageCallback) => onMessage(t0).runNow()))
    __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OnOpenCallback) => onOpen(t0).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.SendOption) => send(t0).runNow()))
    __obj.asInstanceOf[SocketTask]
  }
}

