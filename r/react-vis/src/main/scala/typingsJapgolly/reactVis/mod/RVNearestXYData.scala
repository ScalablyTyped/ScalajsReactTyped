package typingsJapgolly.reactVis.mod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RVNearestXYData[T /* <: AbstractSeriesPoint */] extends StObject {
  
  var event: ReactMouseEventFrom[HTMLElement]
  
  var index: Double
  
  var innerX: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
  
  var innerY: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
}
object RVNearestXYData {
  
  inline def apply[T /* <: AbstractSeriesPoint */](
    event: ReactMouseEventFrom[HTMLElement],
    index: Double,
    innerX: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any,
    innerY: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
  ): RVNearestXYData[T] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], innerX = innerX.asInstanceOf[js.Any], innerY = innerY.asInstanceOf[js.Any])
    __obj.asInstanceOf[RVNearestXYData[T]]
  }
  
  extension [Self <: RVNearestXYData[?], T /* <: AbstractSeriesPoint */](x: Self & RVNearestXYData[T]) {
    
    inline def setEvent(value: ReactMouseEventFrom[HTMLElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInnerX(value: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any): Self = StObject.set(x, "innerX", value.asInstanceOf[js.Any])
    
    inline def setInnerY(value: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any): Self = StObject.set(x, "innerY", value.asInstanceOf[js.Any])
  }
}
