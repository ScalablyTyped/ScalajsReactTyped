package typingsJapgolly.nodemailer.mailerMod

import typingsJapgolly.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var connection: Socket
}

object Connection {
  @scala.inline
  def apply(connection: Socket): Connection = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Connection]
  }
}

