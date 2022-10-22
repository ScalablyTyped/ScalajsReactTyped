package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerContextMenu extends StObject {
  
  var activate: js.UndefOr[js.Function1[/* e */ ContextMenuActivateEvent, Unit]] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ ContextMenuCloseEvent, Unit]] = js.undefined
  
  var deactivate: js.UndefOr[js.Function1[/* e */ ContextMenuDeactivateEvent, Unit]] = js.undefined
  
  var items: js.UndefOr[js.Array[FileManagerContextMenuItem]] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ ContextMenuOpenEvent, Unit]] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ ContextMenuSelectEvent, Unit]] = js.undefined
}
object FileManagerContextMenu {
  
  inline def apply(): FileManagerContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerContextMenu]
  }
  
  extension [Self <: FileManagerContextMenu](x: Self) {
    
    inline def setActivate(value: /* e */ ContextMenuActivateEvent => Callback): Self = StObject.set(x, "activate", js.Any.fromFunction1((t0: /* e */ ContextMenuActivateEvent) => value(t0).runNow()))
    
    inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    inline def setClose(value: /* e */ ContextMenuCloseEvent => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: /* e */ ContextMenuCloseEvent) => value(t0).runNow()))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setDeactivate(value: /* e */ ContextMenuDeactivateEvent => Callback): Self = StObject.set(x, "deactivate", js.Any.fromFunction1((t0: /* e */ ContextMenuDeactivateEvent) => value(t0).runNow()))
    
    inline def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
    
    inline def setItems(value: js.Array[FileManagerContextMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: FileManagerContextMenuItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setOpen(value: /* e */ ContextMenuOpenEvent => Callback): Self = StObject.set(x, "open", js.Any.fromFunction1((t0: /* e */ ContextMenuOpenEvent) => value(t0).runNow()))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setSelect(value: /* e */ ContextMenuSelectEvent => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: /* e */ ContextMenuSelectEvent) => value(t0).runNow()))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
