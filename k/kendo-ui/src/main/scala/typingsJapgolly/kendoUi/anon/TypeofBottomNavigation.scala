package typingsJapgolly.kendoUi.anon

import typingsJapgolly.kendoUi.kendo.ui.BottomNavigation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBottomNavigation extends StObject {
  
  /* static member */
  def extend(proto: js.Object): BottomNavigation
  
  /* static member */
  var fn: BottomNavigation
}
object TypeofBottomNavigation {
  
  inline def apply(extend: js.Object => BottomNavigation, fn: BottomNavigation): TypeofBottomNavigation = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBottomNavigation]
  }
  
  extension [Self <: TypeofBottomNavigation](x: Self) {
    
    inline def setExtend(value: js.Object => BottomNavigation): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: BottomNavigation): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
