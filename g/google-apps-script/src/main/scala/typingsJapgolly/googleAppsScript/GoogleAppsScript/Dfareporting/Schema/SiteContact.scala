package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteContact extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var contactType: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var firstName: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var lastName: js.UndefOr[String] = js.undefined
  var phone: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object SiteContact {
  @scala.inline
  def apply(
    address: String = null,
    contactType: String = null,
    email: String = null,
    firstName: String = null,
    id: String = null,
    lastName: String = null,
    phone: String = null,
    title: String = null
  ): SiteContact = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (contactType != null) __obj.updateDynamic("contactType")(contactType.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (firstName != null) __obj.updateDynamic("firstName")(firstName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastName != null) __obj.updateDynamic("lastName")(lastName.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteContact]
  }
}

