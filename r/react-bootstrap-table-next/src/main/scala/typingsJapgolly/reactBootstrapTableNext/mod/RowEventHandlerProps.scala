package typingsJapgolly.reactBootstrapTableNext.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  onClick :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onDoubleClick :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onMouseEnter :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onMouseLeave :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onContextMenu :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>}> */
trait RowEventHandlerProps[T] extends StObject {
  
  var onClick: js.UndefOr[RowEventHandler[T]] = js.undefined
  
  var onContextMenu: js.UndefOr[RowEventHandler[T]] = js.undefined
  
  var onDoubleClick: js.UndefOr[RowEventHandler[T]] = js.undefined
  
  var onMouseEnter: js.UndefOr[RowEventHandler[T]] = js.undefined
  
  var onMouseLeave: js.UndefOr[RowEventHandler[T]] = js.undefined
}
object RowEventHandlerProps {
  
  inline def apply[T](): RowEventHandlerProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowEventHandlerProps[T]]
  }
  
  extension [Self <: RowEventHandlerProps[?], T](x: Self & RowEventHandlerProps[T]) {
    
    inline def setOnClick(value: (/* e */ ReactEventFrom[Element], T, /* rowIndex */ Double) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction3((t0: /* e */ ReactEventFrom[Element], t1: T, t2: /* rowIndex */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnContextMenu(value: (/* e */ ReactEventFrom[Element], T, /* rowIndex */ Double) => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction3((t0: /* e */ ReactEventFrom[Element], t1: T, t2: /* rowIndex */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnDoubleClick(value: (/* e */ ReactEventFrom[Element], T, /* rowIndex */ Double) => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction3((t0: /* e */ ReactEventFrom[Element], t1: T, t2: /* rowIndex */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnMouseEnter(value: (/* e */ ReactEventFrom[Element], T, /* rowIndex */ Double) => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction3((t0: /* e */ ReactEventFrom[Element], t1: T, t2: /* rowIndex */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: (/* e */ ReactEventFrom[Element], T, /* rowIndex */ Double) => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction3((t0: /* e */ ReactEventFrom[Element], t1: T, t2: /* rowIndex */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
  }
}
