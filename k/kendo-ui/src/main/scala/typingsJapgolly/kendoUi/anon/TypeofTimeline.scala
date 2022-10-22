package typingsJapgolly.kendoUi.anon

import typingsJapgolly.kendoUi.kendo.ui.Timeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTimeline extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Timeline
  
  /* static member */
  var fn: Timeline
}
object TypeofTimeline {
  
  inline def apply(extend: js.Object => Timeline, fn: Timeline): TypeofTimeline = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTimeline]
  }
  
  extension [Self <: TypeofTimeline](x: Self) {
    
    inline def setExtend(value: js.Object => Timeline): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Timeline): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
