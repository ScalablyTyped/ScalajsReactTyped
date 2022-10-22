package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Store extends StObject {
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  val Categories: typingsJapgolly.activexOutlook.Outlook.Categories
  
  val Class: OlObjectClass
  
  val DisplayName: String
  
  val ExchangeStoreType: OlExchangeStoreType
  
  val FilePath: String
  
  def GetDefaultFolder(FolderType: OlDefaultFolders): Folder
  
  def GetRootFolder(): Folder
  
  def GetRules(): Rules
  
  def GetSearchFolders(): Folders
  
  def GetSpecialFolder(FolderType: OlSpecialFolders): Folder
  
  val IsCachedExchange: Boolean
  
  val IsConversationEnabled: Boolean
  
  val IsDataFileStore: Boolean
  
  val IsInstantSearchEnabled: Boolean
  
  val IsOpen: Boolean
  
  val MAPIOBJECT: Any
  
  /* private */ @JSName("Outlook.Store_typekey")
  var OutlookDotStore_typekey: Store
  
  val Parent: Any
  
  val PropertyAccessor: typingsJapgolly.activexOutlook.Outlook.PropertyAccessor
  
  def RefreshQuotaDisplay(): Unit
  
  val Session: NameSpace
  
  val StoreID: String
}
object Store {
  
  inline def apply(
    Application: Application,
    Categories: Categories,
    Class: OlObjectClass,
    DisplayName: String,
    ExchangeStoreType: OlExchangeStoreType,
    FilePath: String,
    GetDefaultFolder: OlDefaultFolders => Folder,
    GetRootFolder: CallbackTo[Folder],
    GetRules: CallbackTo[Rules],
    GetSearchFolders: CallbackTo[Folders],
    GetSpecialFolder: OlSpecialFolders => Folder,
    IsCachedExchange: Boolean,
    IsConversationEnabled: Boolean,
    IsDataFileStore: Boolean,
    IsInstantSearchEnabled: Boolean,
    IsOpen: Boolean,
    MAPIOBJECT: Any,
    OutlookDotStore_typekey: Store,
    Parent: Any,
    PropertyAccessor: PropertyAccessor,
    RefreshQuotaDisplay: Callback,
    Session: NameSpace,
    StoreID: String
  ): Store = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Categories = Categories.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], ExchangeStoreType = ExchangeStoreType.asInstanceOf[js.Any], FilePath = FilePath.asInstanceOf[js.Any], GetDefaultFolder = js.Any.fromFunction1(GetDefaultFolder), GetRootFolder = GetRootFolder.toJsFn, GetRules = GetRules.toJsFn, GetSearchFolders = GetSearchFolders.toJsFn, GetSpecialFolder = js.Any.fromFunction1(GetSpecialFolder), IsCachedExchange = IsCachedExchange.asInstanceOf[js.Any], IsConversationEnabled = IsConversationEnabled.asInstanceOf[js.Any], IsDataFileStore = IsDataFileStore.asInstanceOf[js.Any], IsInstantSearchEnabled = IsInstantSearchEnabled.asInstanceOf[js.Any], IsOpen = IsOpen.asInstanceOf[js.Any], MAPIOBJECT = MAPIOBJECT.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertyAccessor = PropertyAccessor.asInstanceOf[js.Any], RefreshQuotaDisplay = RefreshQuotaDisplay.toJsFn, Session = Session.asInstanceOf[js.Any], StoreID = StoreID.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Store_typekey")(OutlookDotStore_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
  
  extension [Self <: Store](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCategories(value: Categories): Self = StObject.set(x, "Categories", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setExchangeStoreType(value: OlExchangeStoreType): Self = StObject.set(x, "ExchangeStoreType", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "FilePath", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultFolder(value: OlDefaultFolders => Folder): Self = StObject.set(x, "GetDefaultFolder", js.Any.fromFunction1(value))
    
    inline def setGetRootFolder(value: CallbackTo[Folder]): Self = StObject.set(x, "GetRootFolder", value.toJsFn)
    
    inline def setGetRules(value: CallbackTo[Rules]): Self = StObject.set(x, "GetRules", value.toJsFn)
    
    inline def setGetSearchFolders(value: CallbackTo[Folders]): Self = StObject.set(x, "GetSearchFolders", value.toJsFn)
    
    inline def setGetSpecialFolder(value: OlSpecialFolders => Folder): Self = StObject.set(x, "GetSpecialFolder", js.Any.fromFunction1(value))
    
    inline def setIsCachedExchange(value: Boolean): Self = StObject.set(x, "IsCachedExchange", value.asInstanceOf[js.Any])
    
    inline def setIsConversationEnabled(value: Boolean): Self = StObject.set(x, "IsConversationEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsDataFileStore(value: Boolean): Self = StObject.set(x, "IsDataFileStore", value.asInstanceOf[js.Any])
    
    inline def setIsInstantSearchEnabled(value: Boolean): Self = StObject.set(x, "IsInstantSearchEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "IsOpen", value.asInstanceOf[js.Any])
    
    inline def setMAPIOBJECT(value: Any): Self = StObject.set(x, "MAPIOBJECT", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotStore_typekey(value: Store): Self = StObject.set(x, "Outlook.Store_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPropertyAccessor(value: PropertyAccessor): Self = StObject.set(x, "PropertyAccessor", value.asInstanceOf[js.Any])
    
    inline def setRefreshQuotaDisplay(value: Callback): Self = StObject.set(x, "RefreshQuotaDisplay", value.toJsFn)
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setStoreID(value: String): Self = StObject.set(x, "StoreID", value.asInstanceOf[js.Any])
  }
}
