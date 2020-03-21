package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.IAccessControlList
import typingsJapgolly.mfiles.ISessionInfo
import typingsJapgolly.mfiles.ITimeZoneInformation
import typingsJapgolly.mfiles.IUserOrUserGroupIDs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SessionInfo")
@js.native
class SessionInfo () extends ISessionInfo {
  /* CompleteClass */
  override val ACLMode: MFACLMode = js.native
  /* CompleteClass */
  override val AccountName: String = js.native
  /* CompleteClass */
  override val AuthenticationType: MFAuthType = js.native
  /* CompleteClass */
  override val CanCreateObjects: Boolean = js.native
  /* CompleteClass */
  override val CanForceUndoCheckout: Boolean = js.native
  /* CompleteClass */
  override val CanManageCommonUISettings: Boolean = js.native
  /* CompleteClass */
  override val CanManageCommonViews: Boolean = js.native
  /* CompleteClass */
  override val CanManageTraditionalFolders: Boolean = js.native
  /* CompleteClass */
  override val CanMaterializeViews: Boolean = js.native
  /* CompleteClass */
  override val CanSeeAllObjects: Boolean = js.native
  /* CompleteClass */
  override val CanSeeDeletedObjects: Boolean = js.native
  /* CompleteClass */
  override val ClientCulture: String = js.native
  /* CompleteClass */
  override val InternalUser: Boolean = js.native
  /* CompleteClass */
  override val IsSharingPublicLinksAllowed: Boolean = js.native
  /* CompleteClass */
  override val IsSharingPublicLinksToLatestVersionAllowed: Boolean = js.native
  /* CompleteClass */
  override val KeepAliveIntervalInSeconds: Double = js.native
  /* CompleteClass */
  override val Language: Double = js.native
  /* CompleteClass */
  override val LicenseAllowsModifications: Boolean = js.native
  /* CompleteClass */
  override val LocalComputerName: String = js.native
  /* CompleteClass */
  override val ProductMode: MFProductMode = js.native
  /* CompleteClass */
  override val ServerVersion: Double = js.native
  /* CompleteClass */
  override val TimeZoneInfo: ITimeZoneInformation = js.native
  /* CompleteClass */
  override val UserAndGroupMemberships: IUserOrUserGroupIDs = js.native
  /* CompleteClass */
  override val UserAndSubstitutedByMe: IUserOrUserGroupIDs = js.native
  /* CompleteClass */
  override val UserID: Double = js.native
  /* CompleteClass */
  override val VaultGUID: String = js.native
  /* CompleteClass */
  override def CheckObjectAccess(ObjectAccessControlList: IAccessControlList, DesiredObjectAccess: MFObjectAccess): Boolean = js.native
  /* CompleteClass */
  override def CheckObjectTypeAccess(ObjectTypeAccessControlList: IAccessControlList, DesiredObjectTypeAccess: MFObjectTypeAccess): Boolean = js.native
  /* CompleteClass */
  override def CheckPropertyDefAccess(PropertyDefAccessControlList: IAccessControlList, DesiredPropertyDefAccess: MFPropertyDefAccess): Boolean = js.native
  /* CompleteClass */
  override def CheckVaultAccess(DesiredVaultAccess: MFVaultAccess): Boolean = js.native
  /* CompleteClass */
  override def CloneFrom(SessionInfo: ISessionInfo): Unit = js.native
  /* CompleteClass */
  override def IsLoggedOnUserSubstituteOfUser(UserID: Double): Boolean = js.native
}

@JSGlobal("MFiles.SessionInfo")
@js.native
object SessionInfo extends Instantiable0[ISessionInfo]

