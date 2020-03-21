package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFUserAccountVaultRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserAccount extends js.Object {
  var AccessControlList: IAccessControlList
  var Enabled: Boolean
  var ID: Double
  var InternalUser: Boolean
  var LoginName: String
  var VaultLanguage: Double
  var VaultRoles: MFUserAccountVaultRole
  def AddVaultRoles(VaultRolesToAdd: MFUserAccountVaultRole): Unit
  def Clone(): IUserAccount
  def CloneFrom(UserAccount: IUserAccount): Unit
  def RemoveVaultRoles(VaultRolesToRemove: MFUserAccountVaultRole): Unit
}

object IUserAccount {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    AddVaultRoles: MFUserAccountVaultRole => Callback,
    Clone: CallbackTo[IUserAccount],
    CloneFrom: IUserAccount => Callback,
    Enabled: Boolean,
    ID: Double,
    InternalUser: Boolean,
    LoginName: String,
    RemoveVaultRoles: MFUserAccountVaultRole => Callback,
    VaultLanguage: Double,
    VaultRoles: MFUserAccountVaultRole
  ): IUserAccount = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], InternalUser = InternalUser.asInstanceOf[js.Any], LoginName = LoginName.asInstanceOf[js.Any], VaultLanguage = VaultLanguage.asInstanceOf[js.Any], VaultRoles = VaultRoles.asInstanceOf[js.Any])
    __obj.updateDynamic("AddVaultRoles")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.MFiles.MFUserAccountVaultRole) => AddVaultRoles(t0).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("CloneFrom")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IUserAccount) => CloneFrom(t0).runNow()))
    __obj.updateDynamic("RemoveVaultRoles")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.MFiles.MFUserAccountVaultRole) => RemoveVaultRoles(t0).runNow()))
    __obj.asInstanceOf[IUserAccount]
  }
}

