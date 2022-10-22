package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlDefaultFolders
import typingsJapgolly.activexOutlook.Outlook.OlExchangeStoreType
import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import typingsJapgolly.activexOutlook.Outlook.OlSpecialFolders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Store")
@js.native
/* private */ open class Store ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.Store {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Categories: typingsJapgolly.activexOutlook.Outlook.Categories = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val DisplayName: String = js.native
  
  /* CompleteClass */
  override val ExchangeStoreType: OlExchangeStoreType = js.native
  
  /* CompleteClass */
  override val FilePath: String = js.native
  
  /* CompleteClass */
  override def GetDefaultFolder(FolderType: OlDefaultFolders): typingsJapgolly.activexOutlook.Outlook.Folder = js.native
  
  /* CompleteClass */
  override def GetRootFolder(): typingsJapgolly.activexOutlook.Outlook.Folder = js.native
  
  /* CompleteClass */
  override def GetRules(): typingsJapgolly.activexOutlook.Outlook.Rules = js.native
  
  /* CompleteClass */
  override def GetSearchFolders(): typingsJapgolly.activexOutlook.Outlook.Folders = js.native
  
  /* CompleteClass */
  override def GetSpecialFolder(FolderType: OlSpecialFolders): typingsJapgolly.activexOutlook.Outlook.Folder = js.native
  
  /* CompleteClass */
  override val IsCachedExchange: Boolean = js.native
  
  /* CompleteClass */
  override val IsConversationEnabled: Boolean = js.native
  
  /* CompleteClass */
  override val IsDataFileStore: Boolean = js.native
  
  /* CompleteClass */
  override val IsInstantSearchEnabled: Boolean = js.native
  
  /* CompleteClass */
  override val IsOpen: Boolean = js.native
  
  /* CompleteClass */
  override val MAPIOBJECT: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Store_typekey")
  var OutlookDotStore_typekey: typingsJapgolly.activexOutlook.Outlook.Store = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val PropertyAccessor: typingsJapgolly.activexOutlook.Outlook.PropertyAccessor = js.native
  
  /* CompleteClass */
  override def RefreshQuotaDisplay(): Unit = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override val StoreID: String = js.native
}
