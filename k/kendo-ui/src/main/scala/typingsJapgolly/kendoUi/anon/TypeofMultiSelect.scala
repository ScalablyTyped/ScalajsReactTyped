package typingsJapgolly.kendoUi.anon

import typingsJapgolly.kendoUi.kendo.ui.MultiSelect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMultiSelect extends StObject {
  
  /* static member */
  def extend(proto: js.Object): MultiSelect
  
  /* static member */
  var fn: MultiSelect
}
object TypeofMultiSelect {
  
  inline def apply(extend: js.Object => MultiSelect, fn: MultiSelect): TypeofMultiSelect = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMultiSelect]
  }
  
  extension [Self <: TypeofMultiSelect](x: Self) {
    
    inline def setExtend(value: js.Object => MultiSelect): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: MultiSelect): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
