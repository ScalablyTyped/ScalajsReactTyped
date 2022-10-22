package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFMetadataStructureItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVault extends StObject {
  
  val Async: IVaultAsync
  
  def ChangePassword(OldPassword: String, NewPassword: String): Unit
  
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
  
  def GetAllTranslations(): String
  
  def GetGUID(): String
  
  def GetMFilesURLForVaultRoot(): String
  
  def GetMetadataStructureItemIDByAlias(MetadataStructureItemType: MFMetadataStructureItem, Alias: String, Unused: Boolean): Double
  
  def GetMetadataStructureVersionID(): Double
  
  def GetServerLicenseStatus(): ILicenseStatus
  
  def GetServerVersionOfVault(): IMFilesVersion
  
  def LogOutSilent(): Unit
  
  def LogOutWithDialogs(ParentWindow: Double): Boolean
  
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
  
  def TestConnectionToServer(): Unit
  
  def TestConnectionToVault(): Unit
  
  def TestConnectionToVaultWithTimeout(TimeoutInMilliseconds: Double): Unit
  
  val TraditionalFolderOperations: IVaultTraditionalFolderOperations
  
  val UserGroupOperations: IVaultUserGroupOperations
  
  val UserOperations: IVaultUserOperations
  
  val UserSettingOperations: IVaultUserSettingOperations
  
  val ValueListItemOperations: IVaultValueListItemOperations
  
  val ValueListOperations: IVaultValueListOperations
  
  val VaultLanguages: ILanguages
  
  val ViewOperations: IVaultViewOperations
  
  val WorkflowOperations: IVaultWorkflowOperations
}
object IVault {
  
  inline def apply(
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
    GetMetadataStructureItemIDByAlias: (MFMetadataStructureItem, String, Boolean) => Double,
    GetMetadataStructureVersionID: CallbackTo[Double],
    GetServerLicenseStatus: CallbackTo[ILicenseStatus],
    GetServerVersionOfVault: CallbackTo[IMFilesVersion],
    LogOutSilent: Callback,
    LogOutWithDialogs: Double => Boolean,
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
    val __obj = js.Dynamic.literal(Async = Async.asInstanceOf[js.Any], ChangePassword = js.Any.fromFunction2((t0: String, t1: String) => (ChangePassword(t0, t1)).runNow()), ClassGroupOperations = ClassGroupOperations.asInstanceOf[js.Any], ClassOperations = ClassOperations.asInstanceOf[js.Any], ClientOperations = ClientOperations.asInstanceOf[js.Any], CurrentLoggedInUserID = CurrentLoggedInUserID.asInstanceOf[js.Any], CustomApplicationManagementOperations = CustomApplicationManagementOperations.asInstanceOf[js.Any], DataSetOperations = DataSetOperations.asInstanceOf[js.Any], ElectronicSignatureOperations = ElectronicSignatureOperations.asInstanceOf[js.Any], EventLogOperations = EventLogOperations.asInstanceOf[js.Any], ExtensionMethodOperations = ExtensionMethodOperations.asInstanceOf[js.Any], ExternalObjectOperations = ExternalObjectOperations.asInstanceOf[js.Any], GetAllTranslations = GetAllTranslations.toJsFn, GetGUID = GetGUID.toJsFn, GetMFilesURLForVaultRoot = GetMFilesURLForVaultRoot.toJsFn, GetMetadataStructureItemIDByAlias = js.Any.fromFunction3(GetMetadataStructureItemIDByAlias), GetMetadataStructureVersionID = GetMetadataStructureVersionID.toJsFn, GetServerLicenseStatus = GetServerLicenseStatus.toJsFn, GetServerVersionOfVault = GetServerVersionOfVault.toJsFn, LogOutSilent = LogOutSilent.toJsFn, LogOutWithDialogs = js.Any.fromFunction1(LogOutWithDialogs), LoggedIn = LoggedIn.asInstanceOf[js.Any], LoginAccountOperations = LoginAccountOperations.asInstanceOf[js.Any], LoginSessionID = LoginSessionID.asInstanceOf[js.Any], ManagementOperations = ManagementOperations.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NamedACLOperations = NamedACLOperations.asInstanceOf[js.Any], NamedValueStorageOperations = NamedValueStorageOperations.asInstanceOf[js.Any], NotificationOperations = NotificationOperations.asInstanceOf[js.Any], ObjectFileOperations = ObjectFileOperations.asInstanceOf[js.Any], ObjectOperations = ObjectOperations.asInstanceOf[js.Any], ObjectPropertyOperations = ObjectPropertyOperations.asInstanceOf[js.Any], ObjectSearchOperations = ObjectSearchOperations.asInstanceOf[js.Any], ObjectTypeOperations = ObjectTypeOperations.asInstanceOf[js.Any], PropertyDefOperations = PropertyDefOperations.asInstanceOf[js.Any], ReadOnlyAccess = ReadOnlyAccess.asInstanceOf[js.Any], ScheduledJobManagementOperations = ScheduledJobManagementOperations.asInstanceOf[js.Any], ServerDataPushOperations = ServerDataPushOperations.asInstanceOf[js.Any], SessionInfo = SessionInfo.asInstanceOf[js.Any], SharedLinkOperations = SharedLinkOperations.asInstanceOf[js.Any], TestConnectionToServer = TestConnectionToServer.toJsFn, TestConnectionToVault = TestConnectionToVault.toJsFn, TestConnectionToVaultWithTimeout = js.Any.fromFunction1((t0: Double) => TestConnectionToVaultWithTimeout(t0).runNow()), TraditionalFolderOperations = TraditionalFolderOperations.asInstanceOf[js.Any], UserGroupOperations = UserGroupOperations.asInstanceOf[js.Any], UserOperations = UserOperations.asInstanceOf[js.Any], UserSettingOperations = UserSettingOperations.asInstanceOf[js.Any], ValueListItemOperations = ValueListItemOperations.asInstanceOf[js.Any], ValueListOperations = ValueListOperations.asInstanceOf[js.Any], VaultLanguages = VaultLanguages.asInstanceOf[js.Any], ViewOperations = ViewOperations.asInstanceOf[js.Any], WorkflowOperations = WorkflowOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVault]
  }
  
  extension [Self <: IVault](x: Self) {
    
    inline def setAsync(value: IVaultAsync): Self = StObject.set(x, "Async", value.asInstanceOf[js.Any])
    
    inline def setChangePassword(value: (String, String) => Callback): Self = StObject.set(x, "ChangePassword", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setClassGroupOperations(value: IVaultClassGroupOperations): Self = StObject.set(x, "ClassGroupOperations", value.asInstanceOf[js.Any])
    
    inline def setClassOperations(value: IVaultClassOperations): Self = StObject.set(x, "ClassOperations", value.asInstanceOf[js.Any])
    
    inline def setClientOperations(value: IVaultClientOperations): Self = StObject.set(x, "ClientOperations", value.asInstanceOf[js.Any])
    
    inline def setCurrentLoggedInUserID(value: Double): Self = StObject.set(x, "CurrentLoggedInUserID", value.asInstanceOf[js.Any])
    
    inline def setCustomApplicationManagementOperations(value: IVaultCustomApplicationManagementOperations): Self = StObject.set(x, "CustomApplicationManagementOperations", value.asInstanceOf[js.Any])
    
    inline def setDataSetOperations(value: IVaultDataSetOperations): Self = StObject.set(x, "DataSetOperations", value.asInstanceOf[js.Any])
    
    inline def setElectronicSignatureOperations(value: IVaultElectronicSignatureOperations): Self = StObject.set(x, "ElectronicSignatureOperations", value.asInstanceOf[js.Any])
    
    inline def setEventLogOperations(value: IVaultEventLogOperations): Self = StObject.set(x, "EventLogOperations", value.asInstanceOf[js.Any])
    
    inline def setExtensionMethodOperations(value: IVaultExtensionMethodOperations): Self = StObject.set(x, "ExtensionMethodOperations", value.asInstanceOf[js.Any])
    
    inline def setExternalObjectOperations(value: IVaultExternalObjectOperations): Self = StObject.set(x, "ExternalObjectOperations", value.asInstanceOf[js.Any])
    
    inline def setGetAllTranslations(value: CallbackTo[String]): Self = StObject.set(x, "GetAllTranslations", value.toJsFn)
    
    inline def setGetGUID(value: CallbackTo[String]): Self = StObject.set(x, "GetGUID", value.toJsFn)
    
    inline def setGetMFilesURLForVaultRoot(value: CallbackTo[String]): Self = StObject.set(x, "GetMFilesURLForVaultRoot", value.toJsFn)
    
    inline def setGetMetadataStructureItemIDByAlias(value: (MFMetadataStructureItem, String, Boolean) => Double): Self = StObject.set(x, "GetMetadataStructureItemIDByAlias", js.Any.fromFunction3(value))
    
    inline def setGetMetadataStructureVersionID(value: CallbackTo[Double]): Self = StObject.set(x, "GetMetadataStructureVersionID", value.toJsFn)
    
    inline def setGetServerLicenseStatus(value: CallbackTo[ILicenseStatus]): Self = StObject.set(x, "GetServerLicenseStatus", value.toJsFn)
    
    inline def setGetServerVersionOfVault(value: CallbackTo[IMFilesVersion]): Self = StObject.set(x, "GetServerVersionOfVault", value.toJsFn)
    
    inline def setLogOutSilent(value: Callback): Self = StObject.set(x, "LogOutSilent", value.toJsFn)
    
    inline def setLogOutWithDialogs(value: Double => Boolean): Self = StObject.set(x, "LogOutWithDialogs", js.Any.fromFunction1(value))
    
    inline def setLoggedIn(value: Boolean): Self = StObject.set(x, "LoggedIn", value.asInstanceOf[js.Any])
    
    inline def setLoginAccountOperations(value: IVaultLoginAccountOperations): Self = StObject.set(x, "LoginAccountOperations", value.asInstanceOf[js.Any])
    
    inline def setLoginSessionID(value: String): Self = StObject.set(x, "LoginSessionID", value.asInstanceOf[js.Any])
    
    inline def setManagementOperations(value: IVaultManagementOperations): Self = StObject.set(x, "ManagementOperations", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNamedACLOperations(value: IVaultNamedACLOperations): Self = StObject.set(x, "NamedACLOperations", value.asInstanceOf[js.Any])
    
    inline def setNamedValueStorageOperations(value: IVaultNamedValueStorageOperations): Self = StObject.set(x, "NamedValueStorageOperations", value.asInstanceOf[js.Any])
    
    inline def setNotificationOperations(value: IVaultNotificationOperations): Self = StObject.set(x, "NotificationOperations", value.asInstanceOf[js.Any])
    
    inline def setObjectFileOperations(value: IVaultObjectFileOperations): Self = StObject.set(x, "ObjectFileOperations", value.asInstanceOf[js.Any])
    
    inline def setObjectOperations(value: IVaultObjectOperations): Self = StObject.set(x, "ObjectOperations", value.asInstanceOf[js.Any])
    
    inline def setObjectPropertyOperations(value: IVaultObjectPropertyOperations): Self = StObject.set(x, "ObjectPropertyOperations", value.asInstanceOf[js.Any])
    
    inline def setObjectSearchOperations(value: IVaultObjectSearchOperations): Self = StObject.set(x, "ObjectSearchOperations", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeOperations(value: IVaultObjectTypeOperations): Self = StObject.set(x, "ObjectTypeOperations", value.asInstanceOf[js.Any])
    
    inline def setPropertyDefOperations(value: IVaultPropertyDefOperations): Self = StObject.set(x, "PropertyDefOperations", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyAccess(value: Boolean): Self = StObject.set(x, "ReadOnlyAccess", value.asInstanceOf[js.Any])
    
    inline def setScheduledJobManagementOperations(value: IVaultScheduledJobManagementOperations): Self = StObject.set(x, "ScheduledJobManagementOperations", value.asInstanceOf[js.Any])
    
    inline def setServerDataPushOperations(value: IVaultServerDataPushOperations): Self = StObject.set(x, "ServerDataPushOperations", value.asInstanceOf[js.Any])
    
    inline def setSessionInfo(value: ISessionInfo): Self = StObject.set(x, "SessionInfo", value.asInstanceOf[js.Any])
    
    inline def setSharedLinkOperations(value: IVaultSharedLinkOperations): Self = StObject.set(x, "SharedLinkOperations", value.asInstanceOf[js.Any])
    
    inline def setTestConnectionToServer(value: Callback): Self = StObject.set(x, "TestConnectionToServer", value.toJsFn)
    
    inline def setTestConnectionToVault(value: Callback): Self = StObject.set(x, "TestConnectionToVault", value.toJsFn)
    
    inline def setTestConnectionToVaultWithTimeout(value: Double => Callback): Self = StObject.set(x, "TestConnectionToVaultWithTimeout", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setTraditionalFolderOperations(value: IVaultTraditionalFolderOperations): Self = StObject.set(x, "TraditionalFolderOperations", value.asInstanceOf[js.Any])
    
    inline def setUserGroupOperations(value: IVaultUserGroupOperations): Self = StObject.set(x, "UserGroupOperations", value.asInstanceOf[js.Any])
    
    inline def setUserOperations(value: IVaultUserOperations): Self = StObject.set(x, "UserOperations", value.asInstanceOf[js.Any])
    
    inline def setUserSettingOperations(value: IVaultUserSettingOperations): Self = StObject.set(x, "UserSettingOperations", value.asInstanceOf[js.Any])
    
    inline def setValueListItemOperations(value: IVaultValueListItemOperations): Self = StObject.set(x, "ValueListItemOperations", value.asInstanceOf[js.Any])
    
    inline def setValueListOperations(value: IVaultValueListOperations): Self = StObject.set(x, "ValueListOperations", value.asInstanceOf[js.Any])
    
    inline def setVaultLanguages(value: ILanguages): Self = StObject.set(x, "VaultLanguages", value.asInstanceOf[js.Any])
    
    inline def setViewOperations(value: IVaultViewOperations): Self = StObject.set(x, "ViewOperations", value.asInstanceOf[js.Any])
    
    inline def setWorkflowOperations(value: IVaultWorkflowOperations): Self = StObject.set(x, "WorkflowOperations", value.asInstanceOf[js.Any])
  }
}
