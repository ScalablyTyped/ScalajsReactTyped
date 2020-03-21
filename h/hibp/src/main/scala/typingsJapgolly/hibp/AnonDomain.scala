package typingsJapgolly.hibp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDomain extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
}

object AnonDomain {
  @scala.inline
  def apply(baseUrl: String = null, domain: String = null, userAgent: String = null): AnonDomain = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDomain]
  }
}

