package typingsJapgolly.kendoUi.anon

import typingsJapgolly.kendoUi.kendo.ui.PivotConfigurator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPivotConfigurator extends StObject {
  
  /* static member */
  def extend(proto: js.Object): PivotConfigurator
  
  /* static member */
  var fn: PivotConfigurator
}
object TypeofPivotConfigurator {
  
  inline def apply(extend: js.Object => PivotConfigurator, fn: PivotConfigurator): TypeofPivotConfigurator = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotConfigurator]
  }
  
  extension [Self <: TypeofPivotConfigurator](x: Self) {
    
    inline def setExtend(value: js.Object => PivotConfigurator): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: PivotConfigurator): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
