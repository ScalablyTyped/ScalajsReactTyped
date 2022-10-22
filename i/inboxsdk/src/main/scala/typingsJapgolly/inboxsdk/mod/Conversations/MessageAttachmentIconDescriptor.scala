package typingsJapgolly.inboxsdk.mod.Conversations

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.inboxsdk.mod.Conversations.MessageAttachmentIconUrlDescriptor
  - typingsJapgolly.inboxsdk.mod.Conversations.MessageAttachmentIconHtmlDescriptor
*/
trait MessageAttachmentIconDescriptor extends StObject
object MessageAttachmentIconDescriptor {
  
  inline def MessageAttachmentIconHtmlDescriptor(iconHtml: String, tooltip: String | HTMLElement): typingsJapgolly.inboxsdk.mod.Conversations.MessageAttachmentIconHtmlDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.inboxsdk.mod.Conversations.MessageAttachmentIconHtmlDescriptor]
  }
  
  inline def MessageAttachmentIconUrlDescriptor(iconUrl: String, tooltip: String | HTMLElement): typingsJapgolly.inboxsdk.mod.Conversations.MessageAttachmentIconUrlDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.inboxsdk.mod.Conversations.MessageAttachmentIconUrlDescriptor]
  }
}
