package typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamDriveCapabilities extends js.Object {
  var canAddChildren: js.UndefOr[Boolean] = js.undefined
  var canChangeCopyRequiresWriterPermissionRestriction: js.UndefOr[Boolean] = js.undefined
  var canChangeDomainUsersOnlyRestriction: js.UndefOr[Boolean] = js.undefined
  var canChangeTeamDriveBackground: js.UndefOr[Boolean] = js.undefined
  var canChangeTeamMembersOnlyRestriction: js.UndefOr[Boolean] = js.undefined
  var canComment: js.UndefOr[Boolean] = js.undefined
  var canCopy: js.UndefOr[Boolean] = js.undefined
  var canDeleteChildren: js.UndefOr[Boolean] = js.undefined
  var canDeleteTeamDrive: js.UndefOr[Boolean] = js.undefined
  var canDownload: js.UndefOr[Boolean] = js.undefined
  var canEdit: js.UndefOr[Boolean] = js.undefined
  var canListChildren: js.UndefOr[Boolean] = js.undefined
  var canManageMembers: js.UndefOr[Boolean] = js.undefined
  var canReadRevisions: js.UndefOr[Boolean] = js.undefined
  var canRemoveChildren: js.UndefOr[Boolean] = js.undefined
  var canRename: js.UndefOr[Boolean] = js.undefined
  var canRenameTeamDrive: js.UndefOr[Boolean] = js.undefined
  var canShare: js.UndefOr[Boolean] = js.undefined
  var canTrashChildren: js.UndefOr[Boolean] = js.undefined
}

object TeamDriveCapabilities {
  @scala.inline
  def apply(
    canAddChildren: js.UndefOr[Boolean] = js.undefined,
    canChangeCopyRequiresWriterPermissionRestriction: js.UndefOr[Boolean] = js.undefined,
    canChangeDomainUsersOnlyRestriction: js.UndefOr[Boolean] = js.undefined,
    canChangeTeamDriveBackground: js.UndefOr[Boolean] = js.undefined,
    canChangeTeamMembersOnlyRestriction: js.UndefOr[Boolean] = js.undefined,
    canComment: js.UndefOr[Boolean] = js.undefined,
    canCopy: js.UndefOr[Boolean] = js.undefined,
    canDeleteChildren: js.UndefOr[Boolean] = js.undefined,
    canDeleteTeamDrive: js.UndefOr[Boolean] = js.undefined,
    canDownload: js.UndefOr[Boolean] = js.undefined,
    canEdit: js.UndefOr[Boolean] = js.undefined,
    canListChildren: js.UndefOr[Boolean] = js.undefined,
    canManageMembers: js.UndefOr[Boolean] = js.undefined,
    canReadRevisions: js.UndefOr[Boolean] = js.undefined,
    canRemoveChildren: js.UndefOr[Boolean] = js.undefined,
    canRename: js.UndefOr[Boolean] = js.undefined,
    canRenameTeamDrive: js.UndefOr[Boolean] = js.undefined,
    canShare: js.UndefOr[Boolean] = js.undefined,
    canTrashChildren: js.UndefOr[Boolean] = js.undefined
  ): TeamDriveCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canAddChildren)) __obj.updateDynamic("canAddChildren")(canAddChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(canChangeCopyRequiresWriterPermissionRestriction)) __obj.updateDynamic("canChangeCopyRequiresWriterPermissionRestriction")(canChangeCopyRequiresWriterPermissionRestriction.asInstanceOf[js.Any])
    if (!js.isUndefined(canChangeDomainUsersOnlyRestriction)) __obj.updateDynamic("canChangeDomainUsersOnlyRestriction")(canChangeDomainUsersOnlyRestriction.asInstanceOf[js.Any])
    if (!js.isUndefined(canChangeTeamDriveBackground)) __obj.updateDynamic("canChangeTeamDriveBackground")(canChangeTeamDriveBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(canChangeTeamMembersOnlyRestriction)) __obj.updateDynamic("canChangeTeamMembersOnlyRestriction")(canChangeTeamMembersOnlyRestriction.asInstanceOf[js.Any])
    if (!js.isUndefined(canComment)) __obj.updateDynamic("canComment")(canComment.asInstanceOf[js.Any])
    if (!js.isUndefined(canCopy)) __obj.updateDynamic("canCopy")(canCopy.asInstanceOf[js.Any])
    if (!js.isUndefined(canDeleteChildren)) __obj.updateDynamic("canDeleteChildren")(canDeleteChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(canDeleteTeamDrive)) __obj.updateDynamic("canDeleteTeamDrive")(canDeleteTeamDrive.asInstanceOf[js.Any])
    if (!js.isUndefined(canDownload)) __obj.updateDynamic("canDownload")(canDownload.asInstanceOf[js.Any])
    if (!js.isUndefined(canEdit)) __obj.updateDynamic("canEdit")(canEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(canListChildren)) __obj.updateDynamic("canListChildren")(canListChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(canManageMembers)) __obj.updateDynamic("canManageMembers")(canManageMembers.asInstanceOf[js.Any])
    if (!js.isUndefined(canReadRevisions)) __obj.updateDynamic("canReadRevisions")(canReadRevisions.asInstanceOf[js.Any])
    if (!js.isUndefined(canRemoveChildren)) __obj.updateDynamic("canRemoveChildren")(canRemoveChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(canRename)) __obj.updateDynamic("canRename")(canRename.asInstanceOf[js.Any])
    if (!js.isUndefined(canRenameTeamDrive)) __obj.updateDynamic("canRenameTeamDrive")(canRenameTeamDrive.asInstanceOf[js.Any])
    if (!js.isUndefined(canShare)) __obj.updateDynamic("canShare")(canShare.asInstanceOf[js.Any])
    if (!js.isUndefined(canTrashChildren)) __obj.updateDynamic("canTrashChildren")(canTrashChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamDriveCapabilities]
  }
}

