package typingsJapgolly.rcTable.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnScroll extends StObject {
  
  def onScroll(info: CurrentTargetScrollLeft): Unit
  
  var ref: Ref[ScrollLeft]
  
  var scrollbarSize: Double
}
object OnScroll {
  
  inline def apply(onScroll: CurrentTargetScrollLeft => Callback, scrollbarSize: Double): OnScroll = {
    val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction1((t0: CurrentTargetScrollLeft) => onScroll(t0).runNow()), scrollbarSize = scrollbarSize.asInstanceOf[js.Any], ref = null)
    __obj.asInstanceOf[OnScroll]
  }
  
  extension [Self <: OnScroll](x: Self) {
    
    inline def setOnScroll(value: CurrentTargetScrollLeft => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: CurrentTargetScrollLeft) => value(t0).runNow()))
    
    inline def setRef(value: Ref[ScrollLeft]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: ScrollLeft | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: ScrollLeft | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setScrollbarSize(value: Double): Self = StObject.set(x, "scrollbarSize", value.asInstanceOf[js.Any])
  }
}
