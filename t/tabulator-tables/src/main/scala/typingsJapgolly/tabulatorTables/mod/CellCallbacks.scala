package typingsJapgolly.tabulatorTables.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellCallbacks extends StObject {
  
  // Cell Events
  /** callback for when user clicks on a cell in this column. */
  var cellClick: js.UndefOr[CellEventCallback] = js.undefined
  
  /** callback for when user right clicks on a cell in this column. */
  var cellContext: js.UndefOr[CellEventCallback] = js.undefined
  
  /** callback for when user double clicks on a cell in this column. */
  var cellDblClick: js.UndefOr[CellEventCallback] = js.undefined
  
  /** callback for when user double taps on a cell in this column, triggered in touch displays when a user taps the same cell twice in under 300ms. */
  var cellDblTap: js.UndefOr[CellEventCallback] = js.undefined
  
  /** callback for when an edit on a cell in this column is aborted by the user. */
  var cellEditCancelled: js.UndefOr[CellEditEventCallback] = js.undefined
  
  /** callback for when a cell in this column has been edited by the user. */
  var cellEdited: js.UndefOr[CellEditEventCallback] = js.undefined
  
  // Cell editing
  /** callback for when a cell in this column is being edited by the user. */
  var cellEditing: js.UndefOr[CellEditEventCallback] = js.undefined
  
  var cellMouseDown: js.UndefOr[CellEventCallback] = js.undefined
  
  /** callback for when the mouse pointer enters a cell */
  var cellMouseEnter: js.UndefOr[CellEventCallback] = js.undefined
  
  /** callback for when the mouse pointer leaves a cell */
  var cellMouseLeave: js.UndefOr[CellEventCallback] = js.undefined
  
  /** callback for when the mouse pointer moves over a cell. */
  var cellMouseMove: js.UndefOr[CellEventCallback] = js.undefined
  
  /** callback for when the mouse pointer enters a cell or one of its child elements */
  var cellMouseOut: js.UndefOr[CellEventCallback] = js.undefined
  
  /** callback for when the mouse pointer enters a cell or one of its child elements */
  var cellMouseOver: js.UndefOr[CellEventCallback] = js.undefined
  
  var cellMouseUp: js.UndefOr[CellEventCallback] = js.undefined
  
  /** callback for when user taps on a cell in this column, triggered in touch displays. */
  var cellTap: js.UndefOr[CellEventCallback] = js.undefined
  
  /** callback for when user taps and holds on a cell in this column, triggered in touch displays when a user taps and holds the same cell for 1 second. */
  var cellTapHold: js.UndefOr[CellEventCallback] = js.undefined
}
object CellCallbacks {
  
  inline def apply(): CellCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellCallbacks]
  }
  
  extension [Self <: CellCallbacks](x: Self) {
    
    inline def setCellClick(value: (/* e */ UIEvent, /* cell */ CellComponent) => Callback): Self = StObject.set(x, "cellClick", js.Any.fromFunction2((t0: /* e */ UIEvent, t1: /* cell */ CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellClickUndefined: Self = StObject.set(x, "cellClick", js.undefined)
    
    inline def setCellContext(value: (/* e */ UIEvent, /* cell */ CellComponent) => Callback): Self = StObject.set(x, "cellContext", js.Any.fromFunction2((t0: /* e */ UIEvent, t1: /* cell */ CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellContextUndefined: Self = StObject.set(x, "cellContext", js.undefined)
    
    inline def setCellDblClick(value: (/* e */ UIEvent, /* cell */ CellComponent) => Callback): Self = StObject.set(x, "cellDblClick", js.Any.fromFunction2((t0: /* e */ UIEvent, t1: /* cell */ CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellDblClickUndefined: Self = StObject.set(x, "cellDblClick", js.undefined)
    
    inline def setCellDblTap(value: (/* e */ UIEvent, /* cell */ CellComponent) => Callback): Self = StObject.set(x, "cellDblTap", js.Any.fromFunction2((t0: /* e */ UIEvent, t1: /* cell */ CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellDblTapUndefined: Self = StObject.set(x, "cellDblTap", js.undefined)
    
    inline def setCellEditCancelled(value: /* cell */ CellComponent => Callback): Self = StObject.set(x, "cellEditCancelled", js.Any.fromFunction1((t0: /* cell */ CellComponent) => value(t0).runNow()))
    
    inline def setCellEditCancelledUndefined: Self = StObject.set(x, "cellEditCancelled", js.undefined)
    
    inline def setCellEdited(value: /* cell */ CellComponent => Callback): Self = StObject.set(x, "cellEdited", js.Any.fromFunction1((t0: /* cell */ CellComponent) => value(t0).runNow()))
    
    inline def setCellEditedUndefined: Self = StObject.set(x, "cellEdited", js.undefined)
    
    inline def setCellEditing(value: /* cell */ CellComponent => Callback): Self = StObject.set(x, "cellEditing", js.Any.fromFunction1((t0: /* cell */ CellComponent) => value(t0).runNow()))
    
    inline def setCellEditingUndefined: Self = StObject.set(x, "cellEditing", js.undefined)
    
    inline def setCellMouseDown(value: (/* e */ UIEvent, /* cell */ CellComponent) => Callback): Self = StObject.set(x, "cellMouseDown", js.Any.fromFunction2((t0: /* e */ UIEvent, t1: /* cell */ CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellMouseDownUndefined: Self = StObject.set(x, "cellMouseDown", js.undefined)
    
    inline def setCellMouseEnter(value: (/* e */ UIEvent, /* cell */ CellComponent) => Callback): Self = StObject.set(x, "cellMouseEnter", js.Any.fromFunction2((t0: /* e */ UIEvent, t1: /* cell */ CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellMouseEnterUndefined: Self = StObject.set(x, "cellMouseEnter", js.undefined)
    
    inline def setCellMouseLeave(value: (/* e */ UIEvent, /* cell */ CellComponent) => Callback): Self = StObject.set(x, "cellMouseLeave", js.Any.fromFunction2((t0: /* e */ UIEvent, t1: /* cell */ CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellMouseLeaveUndefined: Self = StObject.set(x, "cellMouseLeave", js.undefined)
    
    inline def setCellMouseMove(value: (/* e */ UIEvent, /* cell */ CellComponent) => Callback): Self = StObject.set(x, "cellMouseMove", js.Any.fromFunction2((t0: /* e */ UIEvent, t1: /* cell */ CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellMouseMoveUndefined: Self = StObject.set(x, "cellMouseMove", js.undefined)
    
    inline def setCellMouseOut(value: (/* e */ UIEvent, /* cell */ CellComponent) => Callback): Self = StObject.set(x, "cellMouseOut", js.Any.fromFunction2((t0: /* e */ UIEvent, t1: /* cell */ CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellMouseOutUndefined: Self = StObject.set(x, "cellMouseOut", js.undefined)
    
    inline def setCellMouseOver(value: (/* e */ UIEvent, /* cell */ CellComponent) => Callback): Self = StObject.set(x, "cellMouseOver", js.Any.fromFunction2((t0: /* e */ UIEvent, t1: /* cell */ CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellMouseOverUndefined: Self = StObject.set(x, "cellMouseOver", js.undefined)
    
    inline def setCellMouseUp(value: (/* e */ UIEvent, /* cell */ CellComponent) => Callback): Self = StObject.set(x, "cellMouseUp", js.Any.fromFunction2((t0: /* e */ UIEvent, t1: /* cell */ CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellMouseUpUndefined: Self = StObject.set(x, "cellMouseUp", js.undefined)
    
    inline def setCellTap(value: (/* e */ UIEvent, /* cell */ CellComponent) => Callback): Self = StObject.set(x, "cellTap", js.Any.fromFunction2((t0: /* e */ UIEvent, t1: /* cell */ CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellTapHold(value: (/* e */ UIEvent, /* cell */ CellComponent) => Callback): Self = StObject.set(x, "cellTapHold", js.Any.fromFunction2((t0: /* e */ UIEvent, t1: /* cell */ CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellTapHoldUndefined: Self = StObject.set(x, "cellTapHold", js.undefined)
    
    inline def setCellTapUndefined: Self = StObject.set(x, "cellTap", js.undefined)
  }
}
