package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conversation extends StObject {
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  def ClearAlwaysAssignCategories(Store: Store): Unit
  
  val ConversationID: String
  
  def GetAlwaysAssignCategories(Store: Store): String
  
  def GetAlwaysDelete(Store: Store): OlAlwaysDeleteConversation
  
  def GetAlwaysMoveToFolder(Store: Store): Folder
  
  def GetChildren(Item: Any): SimpleItems
  
  def GetParent(Item: Any): Any
  
  def GetRootItems(): SimpleItems
  
  def GetTable(): Table
  
  def MarkAsRead(): Unit
  
  def MarkAsUnread(): Unit
  
  /* private */ @JSName("Outlook.Conversation_typekey")
  var OutlookDotConversation_typekey: Conversation
  
  val Parent: Any
  
  val Session: NameSpace
  
  def SetAlwaysAssignCategories(Categories: String, Store: Store): Unit
  
  def SetAlwaysDelete(AlwaysDelete: OlAlwaysDeleteConversation, Store: Store): Unit
  
  def SetAlwaysMoveToFolder(MoveToFolder: Folder, Store: Store): Unit
  
  def StopAlwaysDelete(Store: Store): Unit
  
  def StopAlwaysMoveToFolder(Store: Store): Unit
}
object Conversation {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    ClearAlwaysAssignCategories: Store => Callback,
    ConversationID: String,
    GetAlwaysAssignCategories: Store => String,
    GetAlwaysDelete: Store => OlAlwaysDeleteConversation,
    GetAlwaysMoveToFolder: Store => Folder,
    GetChildren: Any => SimpleItems,
    GetParent: Any => Any,
    GetRootItems: CallbackTo[SimpleItems],
    GetTable: CallbackTo[Table],
    MarkAsRead: Callback,
    MarkAsUnread: Callback,
    OutlookDotConversation_typekey: Conversation,
    Parent: Any,
    Session: NameSpace,
    SetAlwaysAssignCategories: (String, Store) => Callback,
    SetAlwaysDelete: (OlAlwaysDeleteConversation, Store) => Callback,
    SetAlwaysMoveToFolder: (Folder, Store) => Callback,
    StopAlwaysDelete: Store => Callback,
    StopAlwaysMoveToFolder: Store => Callback
  ): Conversation = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ClearAlwaysAssignCategories = js.Any.fromFunction1((t0: Store) => ClearAlwaysAssignCategories(t0).runNow()), ConversationID = ConversationID.asInstanceOf[js.Any], GetAlwaysAssignCategories = js.Any.fromFunction1(GetAlwaysAssignCategories), GetAlwaysDelete = js.Any.fromFunction1(GetAlwaysDelete), GetAlwaysMoveToFolder = js.Any.fromFunction1(GetAlwaysMoveToFolder), GetChildren = js.Any.fromFunction1(GetChildren), GetParent = js.Any.fromFunction1(GetParent), GetRootItems = GetRootItems.toJsFn, GetTable = GetTable.toJsFn, MarkAsRead = MarkAsRead.toJsFn, MarkAsUnread = MarkAsUnread.toJsFn, Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SetAlwaysAssignCategories = js.Any.fromFunction2((t0: String, t1: Store) => (SetAlwaysAssignCategories(t0, t1)).runNow()), SetAlwaysDelete = js.Any.fromFunction2((t0: OlAlwaysDeleteConversation, t1: Store) => (SetAlwaysDelete(t0, t1)).runNow()), SetAlwaysMoveToFolder = js.Any.fromFunction2((t0: Folder, t1: Store) => (SetAlwaysMoveToFolder(t0, t1)).runNow()), StopAlwaysDelete = js.Any.fromFunction1((t0: Store) => StopAlwaysDelete(t0).runNow()), StopAlwaysMoveToFolder = js.Any.fromFunction1((t0: Store) => StopAlwaysMoveToFolder(t0).runNow()))
    __obj.updateDynamic("Outlook.Conversation_typekey")(OutlookDotConversation_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversation]
  }
  
  extension [Self <: Conversation](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setClearAlwaysAssignCategories(value: Store => Callback): Self = StObject.set(x, "ClearAlwaysAssignCategories", js.Any.fromFunction1((t0: Store) => value(t0).runNow()))
    
    inline def setConversationID(value: String): Self = StObject.set(x, "ConversationID", value.asInstanceOf[js.Any])
    
    inline def setGetAlwaysAssignCategories(value: Store => String): Self = StObject.set(x, "GetAlwaysAssignCategories", js.Any.fromFunction1(value))
    
    inline def setGetAlwaysDelete(value: Store => OlAlwaysDeleteConversation): Self = StObject.set(x, "GetAlwaysDelete", js.Any.fromFunction1(value))
    
    inline def setGetAlwaysMoveToFolder(value: Store => Folder): Self = StObject.set(x, "GetAlwaysMoveToFolder", js.Any.fromFunction1(value))
    
    inline def setGetChildren(value: Any => SimpleItems): Self = StObject.set(x, "GetChildren", js.Any.fromFunction1(value))
    
    inline def setGetParent(value: Any => Any): Self = StObject.set(x, "GetParent", js.Any.fromFunction1(value))
    
    inline def setGetRootItems(value: CallbackTo[SimpleItems]): Self = StObject.set(x, "GetRootItems", value.toJsFn)
    
    inline def setGetTable(value: CallbackTo[Table]): Self = StObject.set(x, "GetTable", value.toJsFn)
    
    inline def setMarkAsRead(value: Callback): Self = StObject.set(x, "MarkAsRead", value.toJsFn)
    
    inline def setMarkAsUnread(value: Callback): Self = StObject.set(x, "MarkAsUnread", value.toJsFn)
    
    inline def setOutlookDotConversation_typekey(value: Conversation): Self = StObject.set(x, "Outlook.Conversation_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSetAlwaysAssignCategories(value: (String, Store) => Callback): Self = StObject.set(x, "SetAlwaysAssignCategories", js.Any.fromFunction2((t0: String, t1: Store) => (value(t0, t1)).runNow()))
    
    inline def setSetAlwaysDelete(value: (OlAlwaysDeleteConversation, Store) => Callback): Self = StObject.set(x, "SetAlwaysDelete", js.Any.fromFunction2((t0: OlAlwaysDeleteConversation, t1: Store) => (value(t0, t1)).runNow()))
    
    inline def setSetAlwaysMoveToFolder(value: (Folder, Store) => Callback): Self = StObject.set(x, "SetAlwaysMoveToFolder", js.Any.fromFunction2((t0: Folder, t1: Store) => (value(t0, t1)).runNow()))
    
    inline def setStopAlwaysDelete(value: Store => Callback): Self = StObject.set(x, "StopAlwaysDelete", js.Any.fromFunction1((t0: Store) => value(t0).runNow()))
    
    inline def setStopAlwaysMoveToFolder(value: Store => Callback): Self = StObject.set(x, "StopAlwaysMoveToFolder", js.Any.fromFunction1((t0: Store) => value(t0).runNow()))
  }
}
