package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import typingsJapgolly.mfiles.MFiles.MFACLMode
import typingsJapgolly.mfiles.MFiles.MFAuthType
import typingsJapgolly.mfiles.MFiles.MFObjectAccess
import typingsJapgolly.mfiles.MFiles.MFObjectTypeAccess
import typingsJapgolly.mfiles.MFiles.MFProductMode
import typingsJapgolly.mfiles.MFiles.MFPropertyDefAccess
import typingsJapgolly.mfiles.MFiles.MFVaultAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISessionInfo extends StObject {
  
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
  
  def CheckObjectAccess(ObjectAccessControlList: IAccessControlList, DesiredObjectAccess: MFObjectAccess): Boolean
  
  def CheckObjectTypeAccess(ObjectTypeAccessControlList: IAccessControlList, DesiredObjectTypeAccess: MFObjectTypeAccess): Boolean
  
  def CheckPropertyDefAccess(PropertyDefAccessControlList: IAccessControlList, DesiredPropertyDefAccess: MFPropertyDefAccess): Boolean
  
  def CheckVaultAccess(DesiredVaultAccess: MFVaultAccess): Boolean
  
  val ClientCulture: String
  
  def CloneFrom(SessionInfo: ISessionInfo): Unit
  
  val InternalUser: Boolean
  
  def IsLoggedOnUserSubstituteOfUser(UserID: Double): Boolean
  
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
}
object ISessionInfo {
  
  inline def apply(
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
    CheckObjectAccess: (IAccessControlList, MFObjectAccess) => Boolean,
    CheckObjectTypeAccess: (IAccessControlList, MFObjectTypeAccess) => Boolean,
    CheckPropertyDefAccess: (IAccessControlList, MFPropertyDefAccess) => Boolean,
    CheckVaultAccess: MFVaultAccess => Boolean,
    ClientCulture: String,
    CloneFrom: ISessionInfo => Callback,
    InternalUser: Boolean,
    IsLoggedOnUserSubstituteOfUser: Double => Boolean,
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
    val __obj = js.Dynamic.literal(ACLMode = ACLMode.asInstanceOf[js.Any], AccountName = AccountName.asInstanceOf[js.Any], AuthenticationType = AuthenticationType.asInstanceOf[js.Any], CanCreateObjects = CanCreateObjects.asInstanceOf[js.Any], CanForceUndoCheckout = CanForceUndoCheckout.asInstanceOf[js.Any], CanManageCommonUISettings = CanManageCommonUISettings.asInstanceOf[js.Any], CanManageCommonViews = CanManageCommonViews.asInstanceOf[js.Any], CanManageTraditionalFolders = CanManageTraditionalFolders.asInstanceOf[js.Any], CanMaterializeViews = CanMaterializeViews.asInstanceOf[js.Any], CanSeeAllObjects = CanSeeAllObjects.asInstanceOf[js.Any], CanSeeDeletedObjects = CanSeeDeletedObjects.asInstanceOf[js.Any], CheckObjectAccess = js.Any.fromFunction2(CheckObjectAccess), CheckObjectTypeAccess = js.Any.fromFunction2(CheckObjectTypeAccess), CheckPropertyDefAccess = js.Any.fromFunction2(CheckPropertyDefAccess), CheckVaultAccess = js.Any.fromFunction1(CheckVaultAccess), ClientCulture = ClientCulture.asInstanceOf[js.Any], CloneFrom = js.Any.fromFunction1((t0: ISessionInfo) => CloneFrom(t0).runNow()), InternalUser = InternalUser.asInstanceOf[js.Any], IsLoggedOnUserSubstituteOfUser = js.Any.fromFunction1(IsLoggedOnUserSubstituteOfUser), IsSharingPublicLinksAllowed = IsSharingPublicLinksAllowed.asInstanceOf[js.Any], IsSharingPublicLinksToLatestVersionAllowed = IsSharingPublicLinksToLatestVersionAllowed.asInstanceOf[js.Any], KeepAliveIntervalInSeconds = KeepAliveIntervalInSeconds.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LicenseAllowsModifications = LicenseAllowsModifications.asInstanceOf[js.Any], LocalComputerName = LocalComputerName.asInstanceOf[js.Any], ProductMode = ProductMode.asInstanceOf[js.Any], ServerVersion = ServerVersion.asInstanceOf[js.Any], TimeZoneInfo = TimeZoneInfo.asInstanceOf[js.Any], UserAndGroupMemberships = UserAndGroupMemberships.asInstanceOf[js.Any], UserAndSubstitutedByMe = UserAndSubstitutedByMe.asInstanceOf[js.Any], UserID = UserID.asInstanceOf[js.Any], VaultGUID = VaultGUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISessionInfo]
  }
  
  extension [Self <: ISessionInfo](x: Self) {
    
    inline def setACLMode(value: MFACLMode): Self = StObject.set(x, "ACLMode", value.asInstanceOf[js.Any])
    
    inline def setAccountName(value: String): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationType(value: MFAuthType): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    inline def setCanCreateObjects(value: Boolean): Self = StObject.set(x, "CanCreateObjects", value.asInstanceOf[js.Any])
    
    inline def setCanForceUndoCheckout(value: Boolean): Self = StObject.set(x, "CanForceUndoCheckout", value.asInstanceOf[js.Any])
    
    inline def setCanManageCommonUISettings(value: Boolean): Self = StObject.set(x, "CanManageCommonUISettings", value.asInstanceOf[js.Any])
    
    inline def setCanManageCommonViews(value: Boolean): Self = StObject.set(x, "CanManageCommonViews", value.asInstanceOf[js.Any])
    
    inline def setCanManageTraditionalFolders(value: Boolean): Self = StObject.set(x, "CanManageTraditionalFolders", value.asInstanceOf[js.Any])
    
    inline def setCanMaterializeViews(value: Boolean): Self = StObject.set(x, "CanMaterializeViews", value.asInstanceOf[js.Any])
    
    inline def setCanSeeAllObjects(value: Boolean): Self = StObject.set(x, "CanSeeAllObjects", value.asInstanceOf[js.Any])
    
    inline def setCanSeeDeletedObjects(value: Boolean): Self = StObject.set(x, "CanSeeDeletedObjects", value.asInstanceOf[js.Any])
    
    inline def setCheckObjectAccess(value: (IAccessControlList, MFObjectAccess) => Boolean): Self = StObject.set(x, "CheckObjectAccess", js.Any.fromFunction2(value))
    
    inline def setCheckObjectTypeAccess(value: (IAccessControlList, MFObjectTypeAccess) => Boolean): Self = StObject.set(x, "CheckObjectTypeAccess", js.Any.fromFunction2(value))
    
    inline def setCheckPropertyDefAccess(value: (IAccessControlList, MFPropertyDefAccess) => Boolean): Self = StObject.set(x, "CheckPropertyDefAccess", js.Any.fromFunction2(value))
    
    inline def setCheckVaultAccess(value: MFVaultAccess => Boolean): Self = StObject.set(x, "CheckVaultAccess", js.Any.fromFunction1(value))
    
    inline def setClientCulture(value: String): Self = StObject.set(x, "ClientCulture", value.asInstanceOf[js.Any])
    
    inline def setCloneFrom(value: ISessionInfo => Callback): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1((t0: ISessionInfo) => value(t0).runNow()))
    
    inline def setInternalUser(value: Boolean): Self = StObject.set(x, "InternalUser", value.asInstanceOf[js.Any])
    
    inline def setIsLoggedOnUserSubstituteOfUser(value: Double => Boolean): Self = StObject.set(x, "IsLoggedOnUserSubstituteOfUser", js.Any.fromFunction1(value))
    
    inline def setIsSharingPublicLinksAllowed(value: Boolean): Self = StObject.set(x, "IsSharingPublicLinksAllowed", value.asInstanceOf[js.Any])
    
    inline def setIsSharingPublicLinksToLatestVersionAllowed(value: Boolean): Self = StObject.set(x, "IsSharingPublicLinksToLatestVersionAllowed", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveIntervalInSeconds(value: Double): Self = StObject.set(x, "KeepAliveIntervalInSeconds", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: Double): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLicenseAllowsModifications(value: Boolean): Self = StObject.set(x, "LicenseAllowsModifications", value.asInstanceOf[js.Any])
    
    inline def setLocalComputerName(value: String): Self = StObject.set(x, "LocalComputerName", value.asInstanceOf[js.Any])
    
    inline def setProductMode(value: MFProductMode): Self = StObject.set(x, "ProductMode", value.asInstanceOf[js.Any])
    
    inline def setServerVersion(value: Double): Self = StObject.set(x, "ServerVersion", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneInfo(value: ITimeZoneInformation): Self = StObject.set(x, "TimeZoneInfo", value.asInstanceOf[js.Any])
    
    inline def setUserAndGroupMemberships(value: IUserOrUserGroupIDs): Self = StObject.set(x, "UserAndGroupMemberships", value.asInstanceOf[js.Any])
    
    inline def setUserAndSubstitutedByMe(value: IUserOrUserGroupIDs): Self = StObject.set(x, "UserAndSubstitutedByMe", value.asInstanceOf[js.Any])
    
    inline def setUserID(value: Double): Self = StObject.set(x, "UserID", value.asInstanceOf[js.Any])
    
    inline def setVaultGUID(value: String): Self = StObject.set(x, "VaultGUID", value.asInstanceOf[js.Any])
  }
}
