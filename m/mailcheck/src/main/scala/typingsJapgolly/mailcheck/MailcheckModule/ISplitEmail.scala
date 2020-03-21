package typingsJapgolly.mailcheck.MailcheckModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISplitEmail extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var topLevelDomain: js.UndefOr[String] = js.undefined
}

object ISplitEmail {
  @scala.inline
  def apply(address: String = null, domain: String = null, topLevelDomain: String = null): ISplitEmail = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (topLevelDomain != null) __obj.updateDynamic("topLevelDomain")(topLevelDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISplitEmail]
  }
}

