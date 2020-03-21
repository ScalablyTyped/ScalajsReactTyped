package typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroupResponse extends js.Object {
  var contactGroup: js.UndefOr[ContactGroup] = js.undefined
  var requestedResourceName: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[Status] = js.undefined
}

object ContactGroupResponse {
  @scala.inline
  def apply(contactGroup: ContactGroup = null, requestedResourceName: String = null, status: Status = null): ContactGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (contactGroup != null) __obj.updateDynamic("contactGroup")(contactGroup.asInstanceOf[js.Any])
    if (requestedResourceName != null) __obj.updateDynamic("requestedResourceName")(requestedResourceName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactGroupResponse]
  }
}

