package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlEntry extends js.Object {
  var ChangePermissionsPermission: MFPermission
  var EditPermission: MFPermission
  var IsGroup: Boolean
  var ReadPermission: MFPermission
  var UserOrGroupID: Double
  def Clone(): IAccessControlEntry
}

object IAccessControlEntry {
  @scala.inline
  def apply(
    ChangePermissionsPermission: MFPermission,
    Clone: CallbackTo[IAccessControlEntry],
    EditPermission: MFPermission,
    IsGroup: Boolean,
    ReadPermission: MFPermission,
    UserOrGroupID: Double
  ): IAccessControlEntry = {
    val __obj = js.Dynamic.literal(ChangePermissionsPermission = ChangePermissionsPermission.asInstanceOf[js.Any], EditPermission = EditPermission.asInstanceOf[js.Any], IsGroup = IsGroup.asInstanceOf[js.Any], ReadPermission = ReadPermission.asInstanceOf[js.Any], UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IAccessControlEntry]
  }
}

