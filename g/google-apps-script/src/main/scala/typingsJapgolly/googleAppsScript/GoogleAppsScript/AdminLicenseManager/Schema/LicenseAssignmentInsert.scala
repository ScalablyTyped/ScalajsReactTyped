package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseAssignmentInsert extends js.Object {
  var userId: js.UndefOr[String] = js.undefined
}

object LicenseAssignmentInsert {
  @scala.inline
  def apply(userId: String = null): LicenseAssignmentInsert = {
    val __obj = js.Dynamic.literal()
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseAssignmentInsert]
  }
}

