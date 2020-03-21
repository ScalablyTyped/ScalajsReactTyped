package typingsJapgolly.evernote

import typingsJapgolly.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompanyStartDate extends js.Object {
  var companyStartDate: js.UndefOr[Timestamp] = js.undefined
  var department: js.UndefOr[String] = js.undefined
  var linkedInProfileUrl: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var mobilePhone: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var workPhone: js.UndefOr[String] = js.undefined
}

object AnonCompanyStartDate {
  @scala.inline
  def apply(
    companyStartDate: Int | Double = null,
    department: String = null,
    linkedInProfileUrl: String = null,
    location: String = null,
    mobilePhone: String = null,
    title: String = null,
    workPhone: String = null
  ): AnonCompanyStartDate = {
    val __obj = js.Dynamic.literal()
    if (companyStartDate != null) __obj.updateDynamic("companyStartDate")(companyStartDate.asInstanceOf[js.Any])
    if (department != null) __obj.updateDynamic("department")(department.asInstanceOf[js.Any])
    if (linkedInProfileUrl != null) __obj.updateDynamic("linkedInProfileUrl")(linkedInProfileUrl.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (mobilePhone != null) __obj.updateDynamic("mobilePhone")(mobilePhone.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (workPhone != null) __obj.updateDynamic("workPhone")(workPhone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompanyStartDate]
  }
}

