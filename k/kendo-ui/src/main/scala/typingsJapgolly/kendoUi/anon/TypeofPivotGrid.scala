package typingsJapgolly.kendoUi.anon

import typingsJapgolly.kendoUi.kendo.ui.PivotGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPivotGrid extends StObject {
  
  /* static member */
  def extend(proto: js.Object): PivotGrid
  
  /* static member */
  var fn: PivotGrid
}
object TypeofPivotGrid {
  
  inline def apply(extend: js.Object => PivotGrid, fn: PivotGrid): TypeofPivotGrid = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotGrid]
  }
  
  extension [Self <: TypeofPivotGrid](x: Self) {
    
    inline def setExtend(value: js.Object => PivotGrid): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: PivotGrid): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
