package typingsJapgolly.egg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var callback: String
  var csrf: Boolean
  var limit: Double
  var whiteList: String | js.RegExp | (js.Array[String | js.RegExp])
}

object AnonCallback {
  @scala.inline
  def apply(
    callback: String,
    csrf: Boolean,
    limit: Double,
    whiteList: String | js.RegExp | (js.Array[String | js.RegExp])
  ): AnonCallback = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], csrf = csrf.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCallback]
  }
}

