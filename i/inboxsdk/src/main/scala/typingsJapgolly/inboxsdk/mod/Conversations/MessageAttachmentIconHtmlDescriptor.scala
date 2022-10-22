package typingsJapgolly.inboxsdk.mod.Conversations

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageAttachmentIconHtmlDescriptor
  extends StObject
     with MessageAttachmentIconDescriptorBase
     with MessageAttachmentIconDescriptor {
  
  var iconHtml: String
}
object MessageAttachmentIconHtmlDescriptor {
  
  inline def apply(iconHtml: String, tooltip: String | HTMLElement): MessageAttachmentIconHtmlDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAttachmentIconHtmlDescriptor]
  }
  
  extension [Self <: MessageAttachmentIconHtmlDescriptor](x: Self) {
    
    inline def setIconHtml(value: String): Self = StObject.set(x, "iconHtml", value.asInstanceOf[js.Any])
  }
}
