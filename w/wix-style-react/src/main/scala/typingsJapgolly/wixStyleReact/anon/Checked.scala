package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checked extends StObject {
  
  var checked: Boolean
  
  def onChange(): Null
  
  var tabIndex: Double
}
object Checked {
  
  inline def apply(checked: Boolean, onChange: CallbackTo[Null], tabIndex: Double): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], onChange = onChange.toJsFn, tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
  
  extension [Self <: Checked](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: CallbackTo[Null]): Self = StObject.set(x, "onChange", value.toJsFn)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
