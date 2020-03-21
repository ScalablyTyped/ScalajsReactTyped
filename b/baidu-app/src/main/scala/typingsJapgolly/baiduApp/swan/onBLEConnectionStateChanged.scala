package typingsJapgolly.baiduApp.swan

import typingsJapgolly.baiduApp.AnonConnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.onBLEConnectionStateChanged")
@js.native
object onBLEConnectionStateChanged extends js.Object {
  /**
  	 * 监听低功耗蓝牙连接的错误事件，包括设备丢失，连接异常断开等等。
  	 */
  def apply(callback: js.Function1[/* res */ AnonConnected, Unit]): Unit = js.native
}

