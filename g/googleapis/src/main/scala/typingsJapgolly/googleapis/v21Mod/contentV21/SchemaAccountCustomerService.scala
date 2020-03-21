package typingsJapgolly.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountCustomerService extends js.Object {
  /**
    * Customer service email.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Customer service phone number.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  /**
    * Customer service URL.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaAccountCustomerService {
  @scala.inline
  def apply(email: String = null, phoneNumber: String = null, url: String = null): SchemaAccountCustomerService = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountCustomerService]
  }
}

