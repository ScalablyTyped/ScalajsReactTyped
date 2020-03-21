package typingsJapgolly.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("weapp-api", "wx.sendSocketMessage")
@js.native
object sendSocketMessage extends js.Object {
  /**
    * 通过 WebSocket 连接发送数据，需要先 wx.connectSocket，
    * 并在 wx.onSocketOpen 回调之后才能发送。
    */
  def apply(options: SendSocketMessageOptions): Unit = js.native
}

