package typingsJapgolly.typeFest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmailUrl extends js.Object {
  /**
  			The email address to which issues should be reported.
  			*/
  var email: js.UndefOr[String] = js.undefined
  /**
  			The URL to the package's issue tracker.
  			*/
  var url: js.UndefOr[String] = js.undefined
}

object AnonEmailUrl {
  @scala.inline
  def apply(email: String = null, url: String = null): AnonEmailUrl = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmailUrl]
  }
}

