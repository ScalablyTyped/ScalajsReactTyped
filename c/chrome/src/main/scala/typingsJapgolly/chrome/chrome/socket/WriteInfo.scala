package typingsJapgolly.chrome.chrome.socket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteInfo extends js.Object {
  var bytesWritten: Double
}

object WriteInfo {
  @scala.inline
  def apply(bytesWritten: Double): WriteInfo = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WriteInfo]
  }
}

