package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlAlwaysDeleteConversation
import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Conversation")
@js.native
/* private */ open class Conversation ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.Conversation {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def ClearAlwaysAssignCategories(Store: typingsJapgolly.activexOutlook.Outlook.Store): Unit = js.native
  
  /* CompleteClass */
  override val ConversationID: String = js.native
  
  /* CompleteClass */
  override def GetAlwaysAssignCategories(Store: typingsJapgolly.activexOutlook.Outlook.Store): String = js.native
  
  /* CompleteClass */
  override def GetAlwaysDelete(Store: typingsJapgolly.activexOutlook.Outlook.Store): OlAlwaysDeleteConversation = js.native
  
  /* CompleteClass */
  override def GetAlwaysMoveToFolder(Store: typingsJapgolly.activexOutlook.Outlook.Store): typingsJapgolly.activexOutlook.Outlook.Folder = js.native
  
  /* CompleteClass */
  override def GetChildren(Item: Any): typingsJapgolly.activexOutlook.Outlook.SimpleItems = js.native
  
  /* CompleteClass */
  override def GetParent(Item: Any): Any = js.native
  
  /* CompleteClass */
  override def GetRootItems(): typingsJapgolly.activexOutlook.Outlook.SimpleItems = js.native
  
  /* CompleteClass */
  override def GetTable(): typingsJapgolly.activexOutlook.Outlook.Table = js.native
  
  /* CompleteClass */
  override def MarkAsRead(): Unit = js.native
  
  /* CompleteClass */
  override def MarkAsUnread(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Conversation_typekey")
  var OutlookDotConversation_typekey: typingsJapgolly.activexOutlook.Outlook.Conversation = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override def SetAlwaysAssignCategories(Categories: String, Store: typingsJapgolly.activexOutlook.Outlook.Store): Unit = js.native
  
  /* CompleteClass */
  override def SetAlwaysDelete(AlwaysDelete: OlAlwaysDeleteConversation, Store: typingsJapgolly.activexOutlook.Outlook.Store): Unit = js.native
  
  /* CompleteClass */
  override def SetAlwaysMoveToFolder(
    MoveToFolder: typingsJapgolly.activexOutlook.Outlook.Folder,
    Store: typingsJapgolly.activexOutlook.Outlook.Store
  ): Unit = js.native
  
  /* CompleteClass */
  override def StopAlwaysDelete(Store: typingsJapgolly.activexOutlook.Outlook.Store): Unit = js.native
  
  /* CompleteClass */
  override def StopAlwaysMoveToFolder(Store: typingsJapgolly.activexOutlook.Outlook.Store): Unit = js.native
}
