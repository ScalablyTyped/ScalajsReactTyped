package typingsJapgolly.wegameApi.wx

import typingsJapgolly.wegameApi.SocketTask
import typingsJapgolly.wegameApi.wx.types.SocketConnectParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.connectSocket")
@js.native
object connectSocket extends js.Object {
  // --websocket
  /**
    * 创建一个 WebSocket 连接。最多同时存在 5 个 WebSocket 连接。
    */
  def apply(param: SocketConnectParams): SocketTask = js.native
}

