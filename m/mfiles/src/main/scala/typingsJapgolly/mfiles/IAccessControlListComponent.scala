package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlListComponent extends js.Object {
  var AccessControlEntries: IAccessControlEntryContainer
  var CanDeactivate: Boolean
  val CurrentUserBinding: Double
  val HasCurrentUser: Boolean
  val HasCurrentUserBinding: Boolean
  val HasNamedACLLink: Boolean
  val HasPseudoUsers: Boolean
  var IsActive: Boolean
  val NamedACLLink: Double
  def Clone(): IAccessControlListComponent
  def GetACEByUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): IAccessControlEntryData
  def GetACEKeyByUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): IAccessControlEntryKey
  def ResetCurrentUserBinding(): Unit
  def ResetNamedACLLink(): Unit
}

object IAccessControlListComponent {
  @scala.inline
  def apply(
    AccessControlEntries: IAccessControlEntryContainer,
    CanDeactivate: Boolean,
    Clone: CallbackTo[IAccessControlListComponent],
    CurrentUserBinding: Double,
    GetACEByUserOrGroupID: (Double, Boolean) => CallbackTo[IAccessControlEntryData],
    GetACEKeyByUserOrGroupID: (Double, Boolean) => CallbackTo[IAccessControlEntryKey],
    HasCurrentUser: Boolean,
    HasCurrentUserBinding: Boolean,
    HasNamedACLLink: Boolean,
    HasPseudoUsers: Boolean,
    IsActive: Boolean,
    NamedACLLink: Double,
    ResetCurrentUserBinding: Callback,
    ResetNamedACLLink: Callback
  ): IAccessControlListComponent = {
    val __obj = js.Dynamic.literal(AccessControlEntries = AccessControlEntries.asInstanceOf[js.Any], CanDeactivate = CanDeactivate.asInstanceOf[js.Any], CurrentUserBinding = CurrentUserBinding.asInstanceOf[js.Any], HasCurrentUser = HasCurrentUser.asInstanceOf[js.Any], HasCurrentUserBinding = HasCurrentUserBinding.asInstanceOf[js.Any], HasNamedACLLink = HasNamedACLLink.asInstanceOf[js.Any], HasPseudoUsers = HasPseudoUsers.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], NamedACLLink = NamedACLLink.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("GetACEByUserOrGroupID")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => GetACEByUserOrGroupID(t0, t1).runNow()))
    __obj.updateDynamic("GetACEKeyByUserOrGroupID")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => GetACEKeyByUserOrGroupID(t0, t1).runNow()))
    __obj.updateDynamic("ResetCurrentUserBinding")(ResetCurrentUserBinding.toJsFn)
    __obj.updateDynamic("ResetNamedACLLink")(ResetNamedACLLink.toJsFn)
    __obj.asInstanceOf[IAccessControlListComponent]
  }
}

