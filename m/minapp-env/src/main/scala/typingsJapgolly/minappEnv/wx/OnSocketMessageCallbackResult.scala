package typingsJapgolly.minappEnv.wx

import typingsJapgolly.minappEnv.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSocketMessageCallbackResult extends js.Object {
  /** 服务器返回的消息 */
  var data: String | ArrayBuffer
}

object OnSocketMessageCallbackResult {
  @scala.inline
  def apply(data: String | ArrayBuffer): OnSocketMessageCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnSocketMessageCallbackResult]
  }
}

