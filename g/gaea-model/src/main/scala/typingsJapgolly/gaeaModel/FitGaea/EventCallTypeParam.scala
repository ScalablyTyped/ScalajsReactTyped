package typingsJapgolly.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventCallTypeParam extends StObject {
  
  var editor: String
  
  var field: String
  
  var label: String
}
object EventCallTypeParam {
  
  inline def apply(editor: String, field: String, label: String): EventCallTypeParam = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCallTypeParam]
  }
  
  extension [Self <: EventCallTypeParam](x: Self) {
    
    inline def setEditor(value: String): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
