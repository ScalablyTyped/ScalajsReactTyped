package typingsJapgolly.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmailString extends js.Object {
  var email: js.UndefOr[String] = js.undefined
}

object AnonEmailString {
  @scala.inline
  def apply(email: String = null): AnonEmailString = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmailString]
  }
}

