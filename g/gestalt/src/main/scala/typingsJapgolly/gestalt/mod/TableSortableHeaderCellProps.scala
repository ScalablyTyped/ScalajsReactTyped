package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLTableCellElement
import typingsJapgolly.gestalt.anon.Event
import typingsJapgolly.gestalt.gestaltStrings.active
import typingsJapgolly.gestalt.gestaltStrings.asc
import typingsJapgolly.gestalt.gestaltStrings.desc
import typingsJapgolly.gestalt.gestaltStrings.inactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableSortableHeaderCellProps
  extends StObject
     with TableHeaderCellProps {
  
  var onSortChange: AbstractEventHandler[
    ReactMouseEventFrom[HTMLTableCellElement] | ReactKeyboardEventFrom[HTMLTableCellElement], 
    js.Object
  ]
  
  var sortOrder: asc | desc
  
  var status: active | inactive
}
object TableSortableHeaderCellProps {
  
  inline def apply(
    onSortChange: /* arg */ js.Object & (Event[
      ReactMouseEventFrom[HTMLTableCellElement] | ReactKeyboardEventFrom[HTMLTableCellElement]
    ]) => Callback,
    sortOrder: asc | desc,
    status: active | inactive
  ): TableSortableHeaderCellProps = {
    val __obj = js.Dynamic.literal(onSortChange = js.Any.fromFunction1((t0: /* arg */ js.Object & (Event[
      ReactMouseEventFrom[HTMLTableCellElement] | ReactKeyboardEventFrom[HTMLTableCellElement]
    ])) => onSortChange(t0).runNow()), sortOrder = sortOrder.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSortableHeaderCellProps]
  }
  
  extension [Self <: TableSortableHeaderCellProps](x: Self) {
    
    inline def setOnSortChange(
      value: /* arg */ js.Object & (Event[
          ReactMouseEventFrom[HTMLTableCellElement] | ReactKeyboardEventFrom[HTMLTableCellElement]
        ]) => Callback
    ): Self = StObject.set(x, "onSortChange", js.Any.fromFunction1((t0: /* arg */ js.Object & (Event[
          ReactMouseEventFrom[HTMLTableCellElement] | ReactKeyboardEventFrom[HTMLTableCellElement]
        ])) => value(t0).runNow()))
    
    inline def setSortOrder(value: asc | desc): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | inactive): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
