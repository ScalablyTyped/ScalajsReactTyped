package typingsJapgolly.reactVis.mod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RVNearestXData[T /* <: AbstractSeriesPoint */] extends StObject {
  
  var event: ReactMouseEventFrom[HTMLElement]
  
  var index: Double
  
  var innerX: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
}
object RVNearestXData {
  
  inline def apply[T /* <: AbstractSeriesPoint */](
    event: ReactMouseEventFrom[HTMLElement],
    index: Double,
    innerX: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
  ): RVNearestXData[T] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], innerX = innerX.asInstanceOf[js.Any])
    __obj.asInstanceOf[RVNearestXData[T]]
  }
  
  extension [Self <: RVNearestXData[?], T /* <: AbstractSeriesPoint */](x: Self & RVNearestXData[T]) {
    
    inline def setEvent(value: ReactMouseEventFrom[HTMLElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInnerX(value: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any): Self = StObject.set(x, "innerX", value.asInstanceOf[js.Any])
  }
}
