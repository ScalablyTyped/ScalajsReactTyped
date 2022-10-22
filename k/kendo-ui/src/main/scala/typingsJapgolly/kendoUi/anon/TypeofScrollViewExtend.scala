package typingsJapgolly.kendoUi.anon

import typingsJapgolly.kendoUi.kendo.mobile.ui.ScrollView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofScrollViewExtend extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ScrollView
  
  /* static member */
  var fn: ScrollView
}
object TypeofScrollViewExtend {
  
  inline def apply(extend: js.Object => ScrollView, fn: ScrollView): TypeofScrollViewExtend = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofScrollViewExtend]
  }
  
  extension [Self <: TypeofScrollViewExtend](x: Self) {
    
    inline def setExtend(value: js.Object => ScrollView): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ScrollView): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
