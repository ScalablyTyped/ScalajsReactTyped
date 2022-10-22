package typingsJapgolly.openrct2.mod.global

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tool extends StObject {
  
  def cancel(): Unit
  
  var cursor: CursorType
  
  var id: String
}
object Tool {
  
  inline def apply(cancel: Callback, cursor: CursorType, id: String): Tool = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, cursor = cursor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tool]
  }
  
  extension [Self <: Tool](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setCursor(value: CursorType): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
