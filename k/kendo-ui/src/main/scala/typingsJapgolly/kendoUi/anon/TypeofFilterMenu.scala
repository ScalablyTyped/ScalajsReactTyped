package typingsJapgolly.kendoUi.anon

import typingsJapgolly.kendoUi.kendo.ui.FilterMenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFilterMenu extends StObject {
  
  /* static member */
  def extend(proto: js.Object): FilterMenu
  
  /* static member */
  var fn: FilterMenu
}
object TypeofFilterMenu {
  
  inline def apply(extend: js.Object => FilterMenu, fn: FilterMenu): TypeofFilterMenu = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFilterMenu]
  }
  
  extension [Self <: TypeofFilterMenu](x: Self) {
    
    inline def setExtend(value: js.Object => FilterMenu): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: FilterMenu): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
