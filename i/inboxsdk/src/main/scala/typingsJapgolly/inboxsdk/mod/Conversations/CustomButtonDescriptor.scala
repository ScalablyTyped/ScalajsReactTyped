package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomButtonDescriptor extends StObject {
  
  var iconUrl: String
  
  def onClick(event: AttachmentCardClickEvent): Unit
  
  var tooltip: String
}
object CustomButtonDescriptor {
  
  inline def apply(iconUrl: String, onClick: AttachmentCardClickEvent => Callback, tooltip: String): CustomButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: AttachmentCardClickEvent) => onClick(t0).runNow()), tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomButtonDescriptor]
  }
  
  extension [Self <: CustomButtonDescriptor](x: Self) {
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: AttachmentCardClickEvent => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: AttachmentCardClickEvent) => value(t0).runNow()))
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
