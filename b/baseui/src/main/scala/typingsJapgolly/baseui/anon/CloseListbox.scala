package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseListbox extends StObject {
  
  def closeListbox(): Unit
  
  var value: String
}
object CloseListbox {
  
  inline def apply(closeListbox: Callback, value: String): CloseListbox = {
    val __obj = js.Dynamic.literal(closeListbox = closeListbox.toJsFn, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseListbox]
  }
  
  extension [Self <: CloseListbox](x: Self) {
    
    inline def setCloseListbox(value: Callback): Self = StObject.set(x, "closeListbox", value.toJsFn)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
