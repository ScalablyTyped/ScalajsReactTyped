package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabIndex extends StObject {
  
  var checked: Boolean
  
  def onChange(): Any
  
  var tabIndex: Double
}
object TabIndex {
  
  inline def apply(checked: Boolean, onChange: CallbackTo[Any], tabIndex: Double): TabIndex = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], onChange = onChange.toJsFn, tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabIndex]
  }
  
  extension [Self <: TabIndex](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: CallbackTo[Any]): Self = StObject.set(x, "onChange", value.toJsFn)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
