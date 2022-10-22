package typingsJapgolly.kendoUi.anon

import typingsJapgolly.kendoUi.kendo.ui.Avatar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAvatar extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Avatar
  
  /* static member */
  var fn: Avatar
}
object TypeofAvatar {
  
  inline def apply(extend: js.Object => Avatar, fn: Avatar): TypeofAvatar = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAvatar]
  }
  
  extension [Self <: TypeofAvatar](x: Self) {
    
    inline def setExtend(value: js.Object => Avatar): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Avatar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
