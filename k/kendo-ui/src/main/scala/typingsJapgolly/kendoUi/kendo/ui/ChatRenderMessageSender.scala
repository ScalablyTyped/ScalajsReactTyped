package typingsJapgolly.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatRenderMessageSender extends StObject {
  
  var iconUrl: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object ChatRenderMessageSender {
  
  inline def apply(): ChatRenderMessageSender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatRenderMessageSender]
  }
  
  extension [Self <: ChatRenderMessageSender](x: Self) {
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
