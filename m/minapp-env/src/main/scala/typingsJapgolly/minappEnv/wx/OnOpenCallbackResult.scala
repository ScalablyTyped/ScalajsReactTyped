package typingsJapgolly.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnOpenCallbackResult extends js.Object {
  /** 连接成功的 HTTP 响应 Header
    *
    * 最低基础库： `2.0.0` */
  var header: js.Object
}

object OnOpenCallbackResult {
  @scala.inline
  def apply(header: js.Object): OnOpenCallbackResult = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnOpenCallbackResult]
  }
}

