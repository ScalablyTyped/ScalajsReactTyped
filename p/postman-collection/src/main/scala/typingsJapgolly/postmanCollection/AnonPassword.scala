package typingsJapgolly.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPassword extends js.Object {
  var password: String
  var user: String
}

object AnonPassword {
  @scala.inline
  def apply(password: String, user: String): AnonPassword = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPassword]
  }
}

