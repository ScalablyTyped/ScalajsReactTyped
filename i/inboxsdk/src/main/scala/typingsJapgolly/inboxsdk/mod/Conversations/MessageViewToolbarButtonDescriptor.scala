package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.Callback
import typingsJapgolly.inboxsdk.inboxsdkStrings.MORE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageViewToolbarButtonDescriptor extends StObject {
  
  var iconClass: js.UndefOr[String] = js.undefined
  
  var iconUrl: String
  
  def onClick(): Unit
  
  var orderHint: Double
  
  var section: MORE
  
  var title: String
}
object MessageViewToolbarButtonDescriptor {
  
  inline def apply(iconUrl: String, onClick: Callback, orderHint: Double, title: String): MessageViewToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = onClick.toJsFn, orderHint = orderHint.asInstanceOf[js.Any], section = "MORE", title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageViewToolbarButtonDescriptor]
  }
  
  extension [Self <: MessageViewToolbarButtonDescriptor](x: Self) {
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
    
    inline def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
    
    inline def setSection(value: MORE): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
