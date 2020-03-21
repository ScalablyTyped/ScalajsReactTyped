package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFLicenseType
import typingsJapgolly.mfiles.MFiles.MFLoginAccountType
import typingsJapgolly.mfiles.MFiles.MFLoginServerRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoginAccount extends js.Object {
  val AccountName: String
  var AccountType: MFLoginAccountType
  var DomainName: String
  var EmailAddress: String
  var Enabled: Boolean
  var FullName: String
  var LicenseType: MFLicenseType
  var ServerRoles: MFLoginServerRole
  var UserName: String
  def Clone(): ILoginAccount
  def CloneFrom(LoginAccount: ILoginAccount): Unit
  def Set(
    LoginAccountType: MFLoginAccountType,
    DomainName: String,
    UserName: String,
    ServerRoles: MFLoginServerRole,
    FullName: String,
    EmailAddress: String,
    LicenseType: MFLicenseType
  ): Unit
}

object ILoginAccount {
  @scala.inline
  def apply(
    AccountName: String,
    AccountType: MFLoginAccountType,
    Clone: CallbackTo[ILoginAccount],
    CloneFrom: ILoginAccount => Callback,
    DomainName: String,
    EmailAddress: String,
    Enabled: Boolean,
    FullName: String,
    LicenseType: MFLicenseType,
    ServerRoles: MFLoginServerRole,
    Set: (MFLoginAccountType, String, String, MFLoginServerRole, String, String, MFLicenseType) => Callback,
    UserName: String
  ): ILoginAccount = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], AccountType = AccountType.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], LicenseType = LicenseType.asInstanceOf[js.Any], ServerRoles = ServerRoles.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("CloneFrom")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.ILoginAccount) => CloneFrom(t0).runNow()))
    __obj.updateDynamic("Set")(js.Any.fromFunction7((t0: typingsJapgolly.mfiles.MFiles.MFLoginAccountType, t1: java.lang.String, t2: java.lang.String, t3: typingsJapgolly.mfiles.MFiles.MFLoginServerRole, t4: java.lang.String, t5: java.lang.String, t6: typingsJapgolly.mfiles.MFiles.MFLicenseType) => Set(t0, t1, t2, t3, t4, t5, t6).runNow()))
    __obj.asInstanceOf[ILoginAccount]
  }
}

