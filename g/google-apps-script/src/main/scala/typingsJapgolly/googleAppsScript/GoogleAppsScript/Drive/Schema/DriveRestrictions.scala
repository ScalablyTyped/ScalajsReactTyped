package typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveRestrictions extends js.Object {
  var adminManagedRestrictions: js.UndefOr[Boolean] = js.undefined
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined
  var domainUsersOnly: js.UndefOr[Boolean] = js.undefined
  var driveMembersOnly: js.UndefOr[Boolean] = js.undefined
}

object DriveRestrictions {
  @scala.inline
  def apply(
    adminManagedRestrictions: js.UndefOr[Boolean] = js.undefined,
    copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined,
    domainUsersOnly: js.UndefOr[Boolean] = js.undefined,
    driveMembersOnly: js.UndefOr[Boolean] = js.undefined
  ): DriveRestrictions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adminManagedRestrictions)) __obj.updateDynamic("adminManagedRestrictions")(adminManagedRestrictions.asInstanceOf[js.Any])
    if (!js.isUndefined(copyRequiresWriterPermission)) __obj.updateDynamic("copyRequiresWriterPermission")(copyRequiresWriterPermission.asInstanceOf[js.Any])
    if (!js.isUndefined(domainUsersOnly)) __obj.updateDynamic("domainUsersOnly")(domainUsersOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(driveMembersOnly)) __obj.updateDynamic("driveMembersOnly")(driveMembersOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveRestrictions]
  }
}

