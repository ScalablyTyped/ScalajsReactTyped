package typingsJapgolly.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSocketMessageCallbackResult extends js.Object {
  /**
    * 服务器返回的消息
    */
  var data: js.UndefOr[String | scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
}

object OnSocketMessageCallbackResult {
  @scala.inline
  def apply(data: String | scala.scalajs.js.typedarray.ArrayBuffer = null): OnSocketMessageCallbackResult = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSocketMessageCallbackResult]
  }
}

