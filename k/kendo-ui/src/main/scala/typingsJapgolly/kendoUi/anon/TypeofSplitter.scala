package typingsJapgolly.kendoUi.anon

import typingsJapgolly.kendoUi.kendo.ui.Splitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSplitter extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Splitter
  
  /* static member */
  var fn: Splitter
}
object TypeofSplitter {
  
  inline def apply(extend: js.Object => Splitter, fn: Splitter): TypeofSplitter = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSplitter]
  }
  
  extension [Self <: TypeofSplitter](x: Self) {
    
    inline def setExtend(value: js.Object => Splitter): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Splitter): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
