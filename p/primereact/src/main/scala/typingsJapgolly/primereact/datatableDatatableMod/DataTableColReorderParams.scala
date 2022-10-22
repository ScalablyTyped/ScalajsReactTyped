package typingsJapgolly.primereact.datatableDatatableMod

import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableColReorderParams extends StObject {
  
  var columns: Element
  
  var dragIndex: Double
  
  var dropIndex: Double
  
  var originalEvent: ReactDragEventFrom[HTMLElement]
}
object DataTableColReorderParams {
  
  inline def apply(
    columns: VdomElement,
    dragIndex: Double,
    dropIndex: Double,
    originalEvent: ReactDragEventFrom[HTMLElement]
  ): DataTableColReorderParams = {
    val __obj = js.Dynamic.literal(columns = columns.rawElement.asInstanceOf[js.Any], dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableColReorderParams]
  }
  
  extension [Self <: DataTableColReorderParams](x: Self) {
    
    inline def setColumns(value: VdomElement): Self = StObject.set(x, "columns", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDragIndex(value: Double): Self = StObject.set(x, "dragIndex", value.asInstanceOf[js.Any])
    
    inline def setDropIndex(value: Double): Self = StObject.set(x, "dropIndex", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: ReactDragEventFrom[HTMLElement]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
