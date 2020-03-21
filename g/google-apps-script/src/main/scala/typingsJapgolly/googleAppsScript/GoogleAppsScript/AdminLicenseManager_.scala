package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Collection.LicenseAssignmentsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Schema.LicenseAssignment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Schema.LicenseAssignmentInsert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminLicenseManager_ extends js.Object {
  var LicenseAssignments: js.UndefOr[LicenseAssignmentsCollection] = js.undefined
  // Create a new instance of LicenseAssignment
  def newLicenseAssignment(): LicenseAssignment
  // Create a new instance of LicenseAssignmentInsert
  def newLicenseAssignmentInsert(): LicenseAssignmentInsert
}

object AdminLicenseManager_ {
  @scala.inline
  def apply(
    newLicenseAssignment: CallbackTo[LicenseAssignment],
    newLicenseAssignmentInsert: CallbackTo[LicenseAssignmentInsert],
    LicenseAssignments: LicenseAssignmentsCollection = null
  ): AdminLicenseManager_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newLicenseAssignment")(newLicenseAssignment.toJsFn)
    __obj.updateDynamic("newLicenseAssignmentInsert")(newLicenseAssignmentInsert.toJsFn)
    if (LicenseAssignments != null) __obj.updateDynamic("LicenseAssignments")(LicenseAssignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminLicenseManager_]
  }
}

