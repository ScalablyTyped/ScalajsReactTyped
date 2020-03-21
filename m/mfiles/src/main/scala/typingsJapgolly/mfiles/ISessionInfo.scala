package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFACLMode
import typingsJapgolly.mfiles.MFiles.MFAuthType
import typingsJapgolly.mfiles.MFiles.MFObjectAccess
import typingsJapgolly.mfiles.MFiles.MFObjectTypeAccess
import typingsJapgolly.mfiles.MFiles.MFProductMode
import typingsJapgolly.mfiles.MFiles.MFPropertyDefAccess
import typingsJapgolly.mfiles.MFiles.MFVaultAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISessionInfo extends js.Object {
  val ACLMode: MFACLMode
  val AccountName: String
  val AuthenticationType: MFAuthType
  val CanCreateObjects: Boolean
  val CanForceUndoCheckout: Boolean
  val CanManageCommonUISettings: Boolean
  val CanManageCommonViews: Boolean
  val CanManageTraditionalFolders: Boolean
  val CanMaterializeViews: Boolean
  val CanSeeAllObjects: Boolean
  val CanSeeDeletedObjects: Boolean
  val ClientCulture: String
  val InternalUser: Boolean
  val IsSharingPublicLinksAllowed: Boolean
  val IsSharingPublicLinksToLatestVersionAllowed: Boolean
  val KeepAliveIntervalInSeconds: Double
  val Language: Double
  val LicenseAllowsModifications: Boolean
  val LocalComputerName: String
  val ProductMode: MFProductMode
  val ServerVersion: Double
  val TimeZoneInfo: ITimeZoneInformation
  val UserAndGroupMemberships: IUserOrUserGroupIDs
  val UserAndSubstitutedByMe: IUserOrUserGroupIDs
  val UserID: Double
  val VaultGUID: String
  def CheckObjectAccess(ObjectAccessControlList: IAccessControlList, DesiredObjectAccess: MFObjectAccess): Boolean
  def CheckObjectTypeAccess(ObjectTypeAccessControlList: IAccessControlList, DesiredObjectTypeAccess: MFObjectTypeAccess): Boolean
  def CheckPropertyDefAccess(PropertyDefAccessControlList: IAccessControlList, DesiredPropertyDefAccess: MFPropertyDefAccess): Boolean
  def CheckVaultAccess(DesiredVaultAccess: MFVaultAccess): Boolean
  def CloneFrom(SessionInfo: ISessionInfo): Unit
  def IsLoggedOnUserSubstituteOfUser(UserID: Double): Boolean
}

object ISessionInfo {
  @scala.inline
  def apply(
    ACLMode: MFACLMode,
    AccountName: String,
    AuthenticationType: MFAuthType,
    CanCreateObjects: Boolean,
    CanForceUndoCheckout: Boolean,
    CanManageCommonUISettings: Boolean,
    CanManageCommonViews: Boolean,
    CanManageTraditionalFolders: Boolean,
    CanMaterializeViews: Boolean,
    CanSeeAllObjects: Boolean,
    CanSeeDeletedObjects: Boolean,
    CheckObjectAccess: (IAccessControlList, MFObjectAccess) => CallbackTo[Boolean],
    CheckObjectTypeAccess: (IAccessControlList, MFObjectTypeAccess) => CallbackTo[Boolean],
    CheckPropertyDefAccess: (IAccessControlList, MFPropertyDefAccess) => CallbackTo[Boolean],
    CheckVaultAccess: MFVaultAccess => CallbackTo[Boolean],
    ClientCulture: String,
    CloneFrom: ISessionInfo => Callback,
    InternalUser: Boolean,
    IsLoggedOnUserSubstituteOfUser: Double => CallbackTo[Boolean],
    IsSharingPublicLinksAllowed: Boolean,
    IsSharingPublicLinksToLatestVersionAllowed: Boolean,
    KeepAliveIntervalInSeconds: Double,
    Language: Double,
    LicenseAllowsModifications: Boolean,
    LocalComputerName: String,
    ProductMode: MFProductMode,
    ServerVersion: Double,
    TimeZoneInfo: ITimeZoneInformation,
    UserAndGroupMemberships: IUserOrUserGroupIDs,
    UserAndSubstitutedByMe: IUserOrUserGroupIDs,
    UserID: Double,
    VaultGUID: String
  ): ISessionInfo = {
    val __obj = js.Dynamic.literal(ACLMode = ACLMode.asInstanceOf[js.Any], AccountName = AccountName.asInstanceOf[js.Any], AuthenticationType = AuthenticationType.asInstanceOf[js.Any], CanCreateObjects = CanCreateObjects.asInstanceOf[js.Any], CanForceUndoCheckout = CanForceUndoCheckout.asInstanceOf[js.Any], CanManageCommonUISettings = CanManageCommonUISettings.asInstanceOf[js.Any], CanManageCommonViews = CanManageCommonViews.asInstanceOf[js.Any], CanManageTraditionalFolders = CanManageTraditionalFolders.asInstanceOf[js.Any], CanMaterializeViews = CanMaterializeViews.asInstanceOf[js.Any], CanSeeAllObjects = CanSeeAllObjects.asInstanceOf[js.Any], CanSeeDeletedObjects = CanSeeDeletedObjects.asInstanceOf[js.Any], ClientCulture = ClientCulture.asInstanceOf[js.Any], InternalUser = InternalUser.asInstanceOf[js.Any], IsSharingPublicLinksAllowed = IsSharingPublicLinksAllowed.asInstanceOf[js.Any], IsSharingPublicLinksToLatestVersionAllowed = IsSharingPublicLinksToLatestVersionAllowed.asInstanceOf[js.Any], KeepAliveIntervalInSeconds = KeepAliveIntervalInSeconds.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LicenseAllowsModifications = LicenseAllowsModifications.asInstanceOf[js.Any], LocalComputerName = LocalComputerName.asInstanceOf[js.Any], ProductMode = ProductMode.asInstanceOf[js.Any], ServerVersion = ServerVersion.asInstanceOf[js.Any], TimeZoneInfo = TimeZoneInfo.asInstanceOf[js.Any], UserAndGroupMemberships = UserAndGroupMemberships.asInstanceOf[js.Any], UserAndSubstitutedByMe = UserAndSubstitutedByMe.asInstanceOf[js.Any], UserID = UserID.asInstanceOf[js.Any], VaultGUID = VaultGUID.asInstanceOf[js.Any])
    __obj.updateDynamic("CheckObjectAccess")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IAccessControlList, t1: typingsJapgolly.mfiles.MFiles.MFObjectAccess) => CheckObjectAccess(t0, t1).runNow()))
    __obj.updateDynamic("CheckObjectTypeAccess")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IAccessControlList, t1: typingsJapgolly.mfiles.MFiles.MFObjectTypeAccess) => CheckObjectTypeAccess(t0, t1).runNow()))
    __obj.updateDynamic("CheckPropertyDefAccess")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IAccessControlList, t1: typingsJapgolly.mfiles.MFiles.MFPropertyDefAccess) => CheckPropertyDefAccess(t0, t1).runNow()))
    __obj.updateDynamic("CheckVaultAccess")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.MFiles.MFVaultAccess) => CheckVaultAccess(t0).runNow()))
    __obj.updateDynamic("CloneFrom")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.ISessionInfo) => CloneFrom(t0).runNow()))
    __obj.updateDynamic("IsLoggedOnUserSubstituteOfUser")(js.Any.fromFunction1((t0: scala.Double) => IsLoggedOnUserSubstituteOfUser(t0).runNow()))
    __obj.asInstanceOf[ISessionInfo]
  }
}

