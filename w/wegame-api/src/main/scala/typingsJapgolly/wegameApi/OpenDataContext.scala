package typingsJapgolly.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OpenDataContext")
@js.native
class OpenDataContext () extends js.Object {
  /**
    * 开放数据域和主域共享的 sharedCanvas，注意在开放数据域内时getContext只能使用2d模式
    */
  var canvas: Canvas = js.native
  /**
    * 向开放数据域发送消息
    * @param message 要发送的消息，message 中及嵌套对象中 key 的 value 只能是 primitive value。即 number、string、boolean、null、undefined。
    */
  def postMessage(message: js.Any): Unit = js.native
}

