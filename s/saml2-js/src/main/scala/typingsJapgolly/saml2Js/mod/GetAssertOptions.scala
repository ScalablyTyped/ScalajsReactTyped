package typingsJapgolly.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAssertOptions extends js.Object {
  var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.undefined
  var request_body: js.UndefOr[js.Any] = js.undefined
}

object GetAssertOptions {
  @scala.inline
  def apply(allow_unencrypted_assertion: js.UndefOr[Boolean] = js.undefined, request_body: js.Any = null): GetAssertOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_unencrypted_assertion)) __obj.updateDynamic("allow_unencrypted_assertion")(allow_unencrypted_assertion.asInstanceOf[js.Any])
    if (request_body != null) __obj.updateDynamic("request_body")(request_body.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssertOptions]
  }
}

