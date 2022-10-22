package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.ConversationHeader")
@js.native
/* private */ open class ConversationHeader ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.ConversationHeader {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val ConversationID: String = js.native
  
  /* CompleteClass */
  override val ConversationTopic: String = js.native
  
  /* CompleteClass */
  override def GetConversation(): typingsJapgolly.activexOutlook.Outlook.Conversation = js.native
  
  /* CompleteClass */
  override def GetItems(): typingsJapgolly.activexOutlook.Outlook.SimpleItems = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.ConversationHeader_typekey")
  var OutlookDotConversationHeader_typekey: typingsJapgolly.activexOutlook.Outlook.ConversationHeader = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
}
