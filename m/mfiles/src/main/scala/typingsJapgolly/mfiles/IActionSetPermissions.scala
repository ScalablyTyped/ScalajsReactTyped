package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionSetPermissions extends js.Object {
  var DiscardsAutomaticPermissions: Boolean
  var Permissions: IAccessControlList
  def Clone(): IActionSetPermissions
}

object IActionSetPermissions {
  @scala.inline
  def apply(
    Clone: CallbackTo[IActionSetPermissions],
    DiscardsAutomaticPermissions: Boolean,
    Permissions: IAccessControlList
  ): IActionSetPermissions = {
    val __obj = js.Dynamic.literal(DiscardsAutomaticPermissions = DiscardsAutomaticPermissions.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IActionSetPermissions]
  }
}

