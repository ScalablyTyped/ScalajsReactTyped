package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlEntryData extends js.Object {
  var AttachObjectsPermission: MFPermission
  var ChangePermissionsPermission: MFPermission
  var DeletePermission: MFPermission
  var EditPermission: MFPermission
  var ReadPermission: MFPermission
  def Clone(): IAccessControlEntryData
  def SetAllPermissions(Permission: MFPermission): Unit
}

object IAccessControlEntryData {
  @scala.inline
  def apply(
    AttachObjectsPermission: MFPermission,
    ChangePermissionsPermission: MFPermission,
    Clone: CallbackTo[IAccessControlEntryData],
    DeletePermission: MFPermission,
    EditPermission: MFPermission,
    ReadPermission: MFPermission,
    SetAllPermissions: MFPermission => Callback
  ): IAccessControlEntryData = {
    val __obj = js.Dynamic.literal(AttachObjectsPermission = AttachObjectsPermission.asInstanceOf[js.Any], ChangePermissionsPermission = ChangePermissionsPermission.asInstanceOf[js.Any], DeletePermission = DeletePermission.asInstanceOf[js.Any], EditPermission = EditPermission.asInstanceOf[js.Any], ReadPermission = ReadPermission.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("SetAllPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.MFiles.MFPermission) => SetAllPermissions(t0).runNow()))
    __obj.asInstanceOf[IAccessControlEntryData]
  }
}

