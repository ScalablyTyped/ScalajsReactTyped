package typingsJapgolly.jui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checked extends StObject {
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var event: js.UndefOr[Any] = js.undefined
  
  var toggleEvent: js.UndefOr[String] = js.undefined
  
  var tpl: js.UndefOr[Any] = js.undefined
}
object Checked {
  
  inline def apply(): Checked = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checked]
  }
  
  extension [Self <: Checked](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setToggleEvent(value: String): Self = StObject.set(x, "toggleEvent", value.asInstanceOf[js.Any])
    
    inline def setToggleEventUndefined: Self = StObject.set(x, "toggleEvent", js.undefined)
    
    inline def setTpl(value: Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    inline def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
  }
}
