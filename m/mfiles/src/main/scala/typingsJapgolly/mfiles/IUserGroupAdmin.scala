package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserGroupAdmin extends js.Object {
  var AccessControlList: IAccessControlList
  var SemanticAliases: ISemanticAliases
  var UserGroup: IUserGroup
  def Clone(): IUserGroupAdmin
  def CloneFrom(UserGroupAdmin: IUserGroupAdmin): Unit
}

object IUserGroupAdmin {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    Clone: CallbackTo[IUserGroupAdmin],
    CloneFrom: IUserGroupAdmin => Callback,
    SemanticAliases: ISemanticAliases,
    UserGroup: IUserGroup
  ): IUserGroupAdmin = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], UserGroup = UserGroup.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("CloneFrom")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IUserGroupAdmin) => CloneFrom(t0).runNow()))
    __obj.asInstanceOf[IUserGroupAdmin]
  }
}

