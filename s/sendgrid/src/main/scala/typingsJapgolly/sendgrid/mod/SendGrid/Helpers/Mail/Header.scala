package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var key: String
  var value: String
}

object Header {
  @scala.inline
  def apply(key: String, value: String): Header = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Header]
  }
}

