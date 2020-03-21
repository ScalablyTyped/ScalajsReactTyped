package typingsJapgolly.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Store")
@js.native
class Store protected () extends js.Object {
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  val Categories: typingsJapgolly.activexOutlook.Outlook.Categories = js.native
  val Class: OlObjectClass = js.native
  val DisplayName: String = js.native
  val ExchangeStoreType: OlExchangeStoreType = js.native
  val FilePath: String = js.native
  val IsCachedExchange: Boolean = js.native
  val IsConversationEnabled: Boolean = js.native
  val IsDataFileStore: Boolean = js.native
  val IsInstantSearchEnabled: Boolean = js.native
  val IsOpen: Boolean = js.native
  val MAPIOBJECT: js.Any = js.native
  @JSName("Outlook.Store_typekey")
  var OutlookDotStore_typekey: Store = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: typingsJapgolly.activexOutlook.Outlook.PropertyAccessor = js.native
  val Session: NameSpace = js.native
  val StoreID: String = js.native
  def GetDefaultFolder(FolderType: OlDefaultFolders): Folder = js.native
  def GetRootFolder(): Folder = js.native
  def GetRules(): Rules = js.native
  def GetSearchFolders(): Folders = js.native
  def GetSpecialFolder(FolderType: OlSpecialFolders): Folder = js.native
  def RefreshQuotaDisplay(): Unit = js.native
}

