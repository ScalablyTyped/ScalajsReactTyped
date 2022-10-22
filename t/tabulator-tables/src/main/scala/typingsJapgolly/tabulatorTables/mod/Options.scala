package typingsJapgolly.tabulatorTables.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.tabulatorTables.mod.CellCallbacks because var conflicts: cellClick, cellContext, cellDblClick, cellDblTap, cellEditCancelled, cellEdited, cellEditing, cellMouseEnter, cellMouseLeave, cellMouseMove, cellMouseOut, cellMouseOver, cellTap, cellTapHold. Inlined cellMouseDown, cellMouseUp
- typingsJapgolly.tabulatorTables.mod.OptionsCells because var conflicts: cellClick, cellContext, cellDblClick, cellDblTap, cellEditCancelled, cellEdited, cellEditing, cellMouseEnter, cellMouseLeave, cellMouseMove, cellMouseOut, cellMouseOver, cellTap, cellTapHold. Inlined validationFailed */ trait Options
  extends StObject
     with OptionsGeneral
     with OptionsMenu
     with OptionsHistory
     with OptionsLocale
     with OptionsDownload
     with OptionsColumns
     with OptionsRows
     with OptionsData
     with OptionsSorting
     with OptionsFiltering
     with OptionsRowGrouping
     with OptionsPagination
     with OptionsPersistentConfiguration
     with OptionsClipboard
     with OptionsDataTree
     with OptionsCell
     with OptionsDebug
     with OptionsHTML {
  
  var cellMouseDown: js.UndefOr[CellEventCallback] = js.undefined
  
  var cellMouseUp: js.UndefOr[CellEventCallback] = js.undefined
  
  /** The validationFailed event is triggered when the value entered into a cell during an edit fails to pass validation. */
  var validationFailed: js.UndefOr[
    js.Function3[
      /* cell */ CellComponent, 
      /* value */ Any, 
      /* validators */ js.Array[StandardValidatorType | Validator], 
      Unit
    ]
  ] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setCellMouseDown(value: (/* e */ UIEvent, /* cell */ CellComponent) => Callback): Self = StObject.set(x, "cellMouseDown", js.Any.fromFunction2((t0: /* e */ UIEvent, t1: /* cell */ CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellMouseDownUndefined: Self = StObject.set(x, "cellMouseDown", js.undefined)
    
    inline def setCellMouseUp(value: (/* e */ UIEvent, /* cell */ CellComponent) => Callback): Self = StObject.set(x, "cellMouseUp", js.Any.fromFunction2((t0: /* e */ UIEvent, t1: /* cell */ CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellMouseUpUndefined: Self = StObject.set(x, "cellMouseUp", js.undefined)
    
    inline def setValidationFailed(
      value: (/* cell */ CellComponent, /* value */ Any, /* validators */ js.Array[StandardValidatorType | Validator]) => Callback
    ): Self = StObject.set(x, "validationFailed", js.Any.fromFunction3((t0: /* cell */ CellComponent, t1: /* value */ Any, t2: /* validators */ js.Array[StandardValidatorType | Validator]) => (value(t0, t1, t2)).runNow()))
    
    inline def setValidationFailedUndefined: Self = StObject.set(x, "validationFailed", js.undefined)
  }
}
