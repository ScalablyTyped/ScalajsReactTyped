package typingsJapgolly.freedom.freedom.TcpSocket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisconnectInfo extends js.Object {
  var errcode: String
  var message: String
}

object DisconnectInfo {
  @scala.inline
  def apply(errcode: String, message: String): DisconnectInfo = {
    val __obj = js.Dynamic.literal(errcode = errcode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisconnectInfo]
  }
}

