package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFUserOrUserGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserOrUserGroupID extends js.Object {
  var UserOrGroupID: Double
  var UserOrGroupType: MFUserOrUserGroupType
  def Clone(): IUserOrUserGroupID
}

object IUserOrUserGroupID {
  @scala.inline
  def apply(
    Clone: CallbackTo[IUserOrUserGroupID],
    UserOrGroupID: Double,
    UserOrGroupType: MFUserOrUserGroupType
  ): IUserOrUserGroupID = {
    val __obj = js.Dynamic.literal(UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any], UserOrGroupType = UserOrGroupType.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IUserOrUserGroupID]
  }
}

