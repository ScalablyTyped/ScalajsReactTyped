package typingsJapgolly.openpgp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserID extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object UserID {
  @scala.inline
  def apply(email: String = null, name: String = null): UserID = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserID]
  }
}

