package typingsJapgolly.kendoUi.anon

import typingsJapgolly.kendoUi.kendo.ui.AppBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAppBar extends StObject {
  
  /* static member */
  def extend(proto: js.Object): AppBar
  
  /* static member */
  var fn: AppBar
}
object TypeofAppBar {
  
  inline def apply(extend: js.Object => AppBar, fn: AppBar): TypeofAppBar = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAppBar]
  }
  
  extension [Self <: TypeofAppBar](x: Self) {
    
    inline def setExtend(value: js.Object => AppBar): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: AppBar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
