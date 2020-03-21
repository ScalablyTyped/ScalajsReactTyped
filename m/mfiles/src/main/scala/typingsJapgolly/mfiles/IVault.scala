package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFMetadataStructureItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVault extends js.Object {
  val Async: IVaultAsync
  val ClassGroupOperations: IVaultClassGroupOperations
  val ClassOperations: IVaultClassOperations
  val ClientOperations: IVaultClientOperations
  val CurrentLoggedInUserID: Double
  val CustomApplicationManagementOperations: IVaultCustomApplicationManagementOperations
  val DataSetOperations: IVaultDataSetOperations
  val ElectronicSignatureOperations: IVaultElectronicSignatureOperations
  val EventLogOperations: IVaultEventLogOperations
  val ExtensionMethodOperations: IVaultExtensionMethodOperations
  val ExternalObjectOperations: IVaultExternalObjectOperations
  val LoggedIn: Boolean
  val LoginAccountOperations: IVaultLoginAccountOperations
  val LoginSessionID: String
  val ManagementOperations: IVaultManagementOperations
  val Name: String
  val NamedACLOperations: IVaultNamedACLOperations
  val NamedValueStorageOperations: IVaultNamedValueStorageOperations
  val NotificationOperations: IVaultNotificationOperations
  val ObjectFileOperations: IVaultObjectFileOperations
  val ObjectOperations: IVaultObjectOperations
  val ObjectPropertyOperations: IVaultObjectPropertyOperations
  val ObjectSearchOperations: IVaultObjectSearchOperations
  val ObjectTypeOperations: IVaultObjectTypeOperations
  val PropertyDefOperations: IVaultPropertyDefOperations
  val ReadOnlyAccess: Boolean
  val ScheduledJobManagementOperations: IVaultScheduledJobManagementOperations
  val ServerDataPushOperations: IVaultServerDataPushOperations
  val SessionInfo: ISessionInfo
  val SharedLinkOperations: IVaultSharedLinkOperations
  val TraditionalFolderOperations: IVaultTraditionalFolderOperations
  val UserGroupOperations: IVaultUserGroupOperations
  val UserOperations: IVaultUserOperations
  val UserSettingOperations: IVaultUserSettingOperations
  val ValueListItemOperations: IVaultValueListItemOperations
  val ValueListOperations: IVaultValueListOperations
  val VaultLanguages: ILanguages
  val ViewOperations: IVaultViewOperations
  val WorkflowOperations: IVaultWorkflowOperations
  def ChangePassword(OldPassword: String, NewPassword: String): Unit
  def GetAllTranslations(): String
  def GetGUID(): String
  def GetMFilesURLForVaultRoot(): String
  def GetMetadataStructureItemIDByAlias(MetadataStructureItemType: MFMetadataStructureItem, Alias: String, Unused: Boolean): Double
  def GetMetadataStructureVersionID(): Double
  def GetServerLicenseStatus(): ILicenseStatus
  def GetServerVersionOfVault(): IMFilesVersion
  def LogOutSilent(): Unit
  def LogOutWithDialogs(ParentWindow: Double): Boolean
  def TestConnectionToServer(): Unit
  def TestConnectionToVault(): Unit
  def TestConnectionToVaultWithTimeout(TimeoutInMilliseconds: Double): Unit
}

object IVault {
  @scala.inline
  def apply(
    Async: IVaultAsync,
    ChangePassword: (String, String) => Callback,
    ClassGroupOperations: IVaultClassGroupOperations,
    ClassOperations: IVaultClassOperations,
    ClientOperations: IVaultClientOperations,
    CurrentLoggedInUserID: Double,
    CustomApplicationManagementOperations: IVaultCustomApplicationManagementOperations,
    DataSetOperations: IVaultDataSetOperations,
    ElectronicSignatureOperations: IVaultElectronicSignatureOperations,
    EventLogOperations: IVaultEventLogOperations,
    ExtensionMethodOperations: IVaultExtensionMethodOperations,
    ExternalObjectOperations: IVaultExternalObjectOperations,
    GetAllTranslations: CallbackTo[String],
    GetGUID: CallbackTo[String],
    GetMFilesURLForVaultRoot: CallbackTo[String],
    GetMetadataStructureItemIDByAlias: (MFMetadataStructureItem, String, Boolean) => CallbackTo[Double],
    GetMetadataStructureVersionID: CallbackTo[Double],
    GetServerLicenseStatus: CallbackTo[ILicenseStatus],
    GetServerVersionOfVault: CallbackTo[IMFilesVersion],
    LogOutSilent: Callback,
    LogOutWithDialogs: Double => CallbackTo[Boolean],
    LoggedIn: Boolean,
    LoginAccountOperations: IVaultLoginAccountOperations,
    LoginSessionID: String,
    ManagementOperations: IVaultManagementOperations,
    Name: String,
    NamedACLOperations: IVaultNamedACLOperations,
    NamedValueStorageOperations: IVaultNamedValueStorageOperations,
    NotificationOperations: IVaultNotificationOperations,
    ObjectFileOperations: IVaultObjectFileOperations,
    ObjectOperations: IVaultObjectOperations,
    ObjectPropertyOperations: IVaultObjectPropertyOperations,
    ObjectSearchOperations: IVaultObjectSearchOperations,
    ObjectTypeOperations: IVaultObjectTypeOperations,
    PropertyDefOperations: IVaultPropertyDefOperations,
    ReadOnlyAccess: Boolean,
    ScheduledJobManagementOperations: IVaultScheduledJobManagementOperations,
    ServerDataPushOperations: IVaultServerDataPushOperations,
    SessionInfo: ISessionInfo,
    SharedLinkOperations: IVaultSharedLinkOperations,
    TestConnectionToServer: Callback,
    TestConnectionToVault: Callback,
    TestConnectionToVaultWithTimeout: Double => Callback,
    TraditionalFolderOperations: IVaultTraditionalFolderOperations,
    UserGroupOperations: IVaultUserGroupOperations,
    UserOperations: IVaultUserOperations,
    UserSettingOperations: IVaultUserSettingOperations,
    ValueListItemOperations: IVaultValueListItemOperations,
    ValueListOperations: IVaultValueListOperations,
    VaultLanguages: ILanguages,
    ViewOperations: IVaultViewOperations,
    WorkflowOperations: IVaultWorkflowOperations
  ): IVault = {
    val __obj = js.Dynamic.literal(Async = Async.asInstanceOf[js.Any], ClassGroupOperations = ClassGroupOperations.asInstanceOf[js.Any], ClassOperations = ClassOperations.asInstanceOf[js.Any], ClientOperations = ClientOperations.asInstanceOf[js.Any], CurrentLoggedInUserID = CurrentLoggedInUserID.asInstanceOf[js.Any], CustomApplicationManagementOperations = CustomApplicationManagementOperations.asInstanceOf[js.Any], DataSetOperations = DataSetOperations.asInstanceOf[js.Any], ElectronicSignatureOperations = ElectronicSignatureOperations.asInstanceOf[js.Any], EventLogOperations = EventLogOperations.asInstanceOf[js.Any], ExtensionMethodOperations = ExtensionMethodOperations.asInstanceOf[js.Any], ExternalObjectOperations = ExternalObjectOperations.asInstanceOf[js.Any], LoggedIn = LoggedIn.asInstanceOf[js.Any], LoginAccountOperations = LoginAccountOperations.asInstanceOf[js.Any], LoginSessionID = LoginSessionID.asInstanceOf[js.Any], ManagementOperations = ManagementOperations.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NamedACLOperations = NamedACLOperations.asInstanceOf[js.Any], NamedValueStorageOperations = NamedValueStorageOperations.asInstanceOf[js.Any], NotificationOperations = NotificationOperations.asInstanceOf[js.Any], ObjectFileOperations = ObjectFileOperations.asInstanceOf[js.Any], ObjectOperations = ObjectOperations.asInstanceOf[js.Any], ObjectPropertyOperations = ObjectPropertyOperations.asInstanceOf[js.Any], ObjectSearchOperations = ObjectSearchOperations.asInstanceOf[js.Any], ObjectTypeOperations = ObjectTypeOperations.asInstanceOf[js.Any], PropertyDefOperations = PropertyDefOperations.asInstanceOf[js.Any], ReadOnlyAccess = ReadOnlyAccess.asInstanceOf[js.Any], ScheduledJobManagementOperations = ScheduledJobManagementOperations.asInstanceOf[js.Any], ServerDataPushOperations = ServerDataPushOperations.asInstanceOf[js.Any], SessionInfo = SessionInfo.asInstanceOf[js.Any], SharedLinkOperations = SharedLinkOperations.asInstanceOf[js.Any], TraditionalFolderOperations = TraditionalFolderOperations.asInstanceOf[js.Any], UserGroupOperations = UserGroupOperations.asInstanceOf[js.Any], UserOperations = UserOperations.asInstanceOf[js.Any], UserSettingOperations = UserSettingOperations.asInstanceOf[js.Any], ValueListItemOperations = ValueListItemOperations.asInstanceOf[js.Any], ValueListOperations = ValueListOperations.asInstanceOf[js.Any], VaultLanguages = VaultLanguages.asInstanceOf[js.Any], ViewOperations = ViewOperations.asInstanceOf[js.Any], WorkflowOperations = WorkflowOperations.asInstanceOf[js.Any])
    __obj.updateDynamic("ChangePassword")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => ChangePassword(t0, t1).runNow()))
    __obj.updateDynamic("GetAllTranslations")(GetAllTranslations.toJsFn)
    __obj.updateDynamic("GetGUID")(GetGUID.toJsFn)
    __obj.updateDynamic("GetMFilesURLForVaultRoot")(GetMFilesURLForVaultRoot.toJsFn)
    __obj.updateDynamic("GetMetadataStructureItemIDByAlias")(js.Any.fromFunction3((t0: typingsJapgolly.mfiles.MFiles.MFMetadataStructureItem, t1: java.lang.String, t2: scala.Boolean) => GetMetadataStructureItemIDByAlias(t0, t1, t2).runNow()))
    __obj.updateDynamic("GetMetadataStructureVersionID")(GetMetadataStructureVersionID.toJsFn)
    __obj.updateDynamic("GetServerLicenseStatus")(GetServerLicenseStatus.toJsFn)
    __obj.updateDynamic("GetServerVersionOfVault")(GetServerVersionOfVault.toJsFn)
    __obj.updateDynamic("LogOutSilent")(LogOutSilent.toJsFn)
    __obj.updateDynamic("LogOutWithDialogs")(js.Any.fromFunction1((t0: scala.Double) => LogOutWithDialogs(t0).runNow()))
    __obj.updateDynamic("TestConnectionToServer")(TestConnectionToServer.toJsFn)
    __obj.updateDynamic("TestConnectionToVault")(TestConnectionToVault.toJsFn)
    __obj.updateDynamic("TestConnectionToVaultWithTimeout")(js.Any.fromFunction1((t0: scala.Double) => TestConnectionToVaultWithTimeout(t0).runNow()))
    __obj.asInstanceOf[IVault]
  }
}

