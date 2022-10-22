package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.ILanguages
import typingsJapgolly.mfiles.ILicenseStatus
import typingsJapgolly.mfiles.IMFilesVersion
import typingsJapgolly.mfiles.ISessionInfo
import typingsJapgolly.mfiles.IVault
import typingsJapgolly.mfiles.IVaultAsync
import typingsJapgolly.mfiles.IVaultClassGroupOperations
import typingsJapgolly.mfiles.IVaultClassOperations
import typingsJapgolly.mfiles.IVaultClientOperations
import typingsJapgolly.mfiles.IVaultCustomApplicationManagementOperations
import typingsJapgolly.mfiles.IVaultDataSetOperations
import typingsJapgolly.mfiles.IVaultElectronicSignatureOperations
import typingsJapgolly.mfiles.IVaultEventLogOperations
import typingsJapgolly.mfiles.IVaultExtensionMethodOperations
import typingsJapgolly.mfiles.IVaultExternalObjectOperations
import typingsJapgolly.mfiles.IVaultLoginAccountOperations
import typingsJapgolly.mfiles.IVaultManagementOperations
import typingsJapgolly.mfiles.IVaultNamedACLOperations
import typingsJapgolly.mfiles.IVaultNamedValueStorageOperations
import typingsJapgolly.mfiles.IVaultNotificationOperations
import typingsJapgolly.mfiles.IVaultObjectFileOperations
import typingsJapgolly.mfiles.IVaultObjectOperations
import typingsJapgolly.mfiles.IVaultObjectPropertyOperations
import typingsJapgolly.mfiles.IVaultObjectSearchOperations
import typingsJapgolly.mfiles.IVaultObjectTypeOperations
import typingsJapgolly.mfiles.IVaultPropertyDefOperations
import typingsJapgolly.mfiles.IVaultScheduledJobManagementOperations
import typingsJapgolly.mfiles.IVaultServerDataPushOperations
import typingsJapgolly.mfiles.IVaultSharedLinkOperations
import typingsJapgolly.mfiles.IVaultTraditionalFolderOperations
import typingsJapgolly.mfiles.IVaultUserGroupOperations
import typingsJapgolly.mfiles.IVaultUserOperations
import typingsJapgolly.mfiles.IVaultUserSettingOperations
import typingsJapgolly.mfiles.IVaultValueListItemOperations
import typingsJapgolly.mfiles.IVaultValueListOperations
import typingsJapgolly.mfiles.IVaultViewOperations
import typingsJapgolly.mfiles.IVaultWorkflowOperations
import typingsJapgolly.mfiles.MFiles.MFMetadataStructureItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.Vault")
@js.native
open class Vault ()
  extends StObject
     with IVault {
  
  /* CompleteClass */
  override val Async: IVaultAsync = js.native
  
  /* CompleteClass */
  override def ChangePassword(OldPassword: String, NewPassword: String): Unit = js.native
  
  /* CompleteClass */
  override val ClassGroupOperations: IVaultClassGroupOperations = js.native
  
  /* CompleteClass */
  override val ClassOperations: IVaultClassOperations = js.native
  
  /* CompleteClass */
  override val ClientOperations: IVaultClientOperations = js.native
  
  /* CompleteClass */
  override val CurrentLoggedInUserID: Double = js.native
  
  /* CompleteClass */
  override val CustomApplicationManagementOperations: IVaultCustomApplicationManagementOperations = js.native
  
  /* CompleteClass */
  override val DataSetOperations: IVaultDataSetOperations = js.native
  
  /* CompleteClass */
  override val ElectronicSignatureOperations: IVaultElectronicSignatureOperations = js.native
  
  /* CompleteClass */
  override val EventLogOperations: IVaultEventLogOperations = js.native
  
  /* CompleteClass */
  override val ExtensionMethodOperations: IVaultExtensionMethodOperations = js.native
  
  /* CompleteClass */
  override val ExternalObjectOperations: IVaultExternalObjectOperations = js.native
  
  /* CompleteClass */
  override def GetAllTranslations(): String = js.native
  
  /* CompleteClass */
  override def GetGUID(): String = js.native
  
  /* CompleteClass */
  override def GetMFilesURLForVaultRoot(): String = js.native
  
  /* CompleteClass */
  override def GetMetadataStructureItemIDByAlias(MetadataStructureItemType: MFMetadataStructureItem, Alias: String, Unused: Boolean): Double = js.native
  
  /* CompleteClass */
  override def GetMetadataStructureVersionID(): Double = js.native
  
  /* CompleteClass */
  override def GetServerLicenseStatus(): ILicenseStatus = js.native
  
  /* CompleteClass */
  override def GetServerVersionOfVault(): IMFilesVersion = js.native
  
  /* CompleteClass */
  override def LogOutSilent(): Unit = js.native
  
  /* CompleteClass */
  override def LogOutWithDialogs(ParentWindow: Double): Boolean = js.native
  
  /* CompleteClass */
  override val LoggedIn: Boolean = js.native
  
  /* CompleteClass */
  override val LoginAccountOperations: IVaultLoginAccountOperations = js.native
  
  /* CompleteClass */
  override val LoginSessionID: String = js.native
  
  /* CompleteClass */
  override val ManagementOperations: IVaultManagementOperations = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val NamedACLOperations: IVaultNamedACLOperations = js.native
  
  /* CompleteClass */
  override val NamedValueStorageOperations: IVaultNamedValueStorageOperations = js.native
  
  /* CompleteClass */
  override val NotificationOperations: IVaultNotificationOperations = js.native
  
  /* CompleteClass */
  override val ObjectFileOperations: IVaultObjectFileOperations = js.native
  
  /* CompleteClass */
  override val ObjectOperations: IVaultObjectOperations = js.native
  
  /* CompleteClass */
  override val ObjectPropertyOperations: IVaultObjectPropertyOperations = js.native
  
  /* CompleteClass */
  override val ObjectSearchOperations: IVaultObjectSearchOperations = js.native
  
  /* CompleteClass */
  override val ObjectTypeOperations: IVaultObjectTypeOperations = js.native
  
  /* CompleteClass */
  override val PropertyDefOperations: IVaultPropertyDefOperations = js.native
  
  /* CompleteClass */
  override val ReadOnlyAccess: Boolean = js.native
  
  /* CompleteClass */
  override val ScheduledJobManagementOperations: IVaultScheduledJobManagementOperations = js.native
  
  /* CompleteClass */
  override val ServerDataPushOperations: IVaultServerDataPushOperations = js.native
  
  /* CompleteClass */
  override val SessionInfo: ISessionInfo = js.native
  
  /* CompleteClass */
  override val SharedLinkOperations: IVaultSharedLinkOperations = js.native
  
  /* CompleteClass */
  override def TestConnectionToServer(): Unit = js.native
  
  /* CompleteClass */
  override def TestConnectionToVault(): Unit = js.native
  
  /* CompleteClass */
  override def TestConnectionToVaultWithTimeout(TimeoutInMilliseconds: Double): Unit = js.native
  
  /* CompleteClass */
  override val TraditionalFolderOperations: IVaultTraditionalFolderOperations = js.native
  
  /* CompleteClass */
  override val UserGroupOperations: IVaultUserGroupOperations = js.native
  
  /* CompleteClass */
  override val UserOperations: IVaultUserOperations = js.native
  
  /* CompleteClass */
  override val UserSettingOperations: IVaultUserSettingOperations = js.native
  
  /* CompleteClass */
  override val ValueListItemOperations: IVaultValueListItemOperations = js.native
  
  /* CompleteClass */
  override val ValueListOperations: IVaultValueListOperations = js.native
  
  /* CompleteClass */
  override val VaultLanguages: ILanguages = js.native
  
  /* CompleteClass */
  override val ViewOperations: IVaultViewOperations = js.native
  
  /* CompleteClass */
  override val WorkflowOperations: IVaultWorkflowOperations = js.native
}
