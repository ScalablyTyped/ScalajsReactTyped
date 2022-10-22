package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewClickEvent extends StObject {
  
  var attachmentCardView: AttachmentCardView
  
  def preventDefault(): Unit
}
object PreviewClickEvent {
  
  inline def apply(attachmentCardView: AttachmentCardView, preventDefault: Callback): PreviewClickEvent = {
    val __obj = js.Dynamic.literal(attachmentCardView = attachmentCardView.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn)
    __obj.asInstanceOf[PreviewClickEvent]
  }
  
  extension [Self <: PreviewClickEvent](x: Self) {
    
    inline def setAttachmentCardView(value: AttachmentCardView): Self = StObject.set(x, "attachmentCardView", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
  }
}
