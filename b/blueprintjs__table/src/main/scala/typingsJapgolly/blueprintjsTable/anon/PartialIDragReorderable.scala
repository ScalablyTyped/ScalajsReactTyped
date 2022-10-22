package typingsJapgolly.blueprintjsTable.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.MouseEvent
import typingsJapgolly.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.libEsmInteractionsDragTypesMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/interactions/reorderable.IDragReorderable> */
trait PartialIDragReorderable extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var disabled: js.UndefOr[Boolean | (js.Function1[/* event */ MouseEvent, Boolean])] = js.undefined
  
  var locateClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Region]] = js.undefined
  
  var locateDrag: js.UndefOr[
    js.Function2[/* event */ MouseEvent, /* coords */ ICoordinateData, js.UndefOr[Double]]
  ] = js.undefined
  
  var onFocusedCell: js.UndefOr[js.Function1[/* focusedCell */ FocusedCellCoordinates, Unit]] = js.undefined
  
  var onReordered: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.undefined
  
  var onReordering: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.undefined
  
  var onSelection: js.UndefOr[js.Function1[/* regions */ js.Array[Region], Unit]] = js.undefined
  
  var selectedRegions: js.UndefOr[js.Array[Region]] = js.undefined
  
  var toRegion: js.UndefOr[js.Function2[/* index1 */ Double, /* index2 */ js.UndefOr[Double], Region]] = js.undefined
}
object PartialIDragReorderable {
  
  inline def apply(): PartialIDragReorderable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIDragReorderable]
  }
  
  extension [Self <: PartialIDragReorderable](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean | (js.Function1[/* event */ MouseEvent, Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledFunction1(value: /* event */ MouseEvent => Boolean): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLocateClick(value: /* event */ MouseEvent => Region): Self = StObject.set(x, "locateClick", js.Any.fromFunction1(value))
    
    inline def setLocateClickUndefined: Self = StObject.set(x, "locateClick", js.undefined)
    
    inline def setLocateDrag(value: (/* event */ MouseEvent, /* coords */ ICoordinateData) => js.UndefOr[Double]): Self = StObject.set(x, "locateDrag", js.Any.fromFunction2(value))
    
    inline def setLocateDragUndefined: Self = StObject.set(x, "locateDrag", js.undefined)
    
    inline def setOnFocusedCell(value: /* focusedCell */ FocusedCellCoordinates => Callback): Self = StObject.set(x, "onFocusedCell", js.Any.fromFunction1((t0: /* focusedCell */ FocusedCellCoordinates) => value(t0).runNow()))
    
    inline def setOnFocusedCellUndefined: Self = StObject.set(x, "onFocusedCell", js.undefined)
    
    inline def setOnReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Callback): Self = StObject.set(x, "onReordered", js.Any.fromFunction3((t0: /* oldIndex */ Double, t1: /* newIndex */ Double, t2: /* length */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnReorderedUndefined: Self = StObject.set(x, "onReordered", js.undefined)
    
    inline def setOnReordering(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Callback): Self = StObject.set(x, "onReordering", js.Any.fromFunction3((t0: /* oldIndex */ Double, t1: /* newIndex */ Double, t2: /* length */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnReorderingUndefined: Self = StObject.set(x, "onReordering", js.undefined)
    
    inline def setOnSelection(value: /* regions */ js.Array[Region] => Callback): Self = StObject.set(x, "onSelection", js.Any.fromFunction1((t0: /* regions */ js.Array[Region]) => value(t0).runNow()))
    
    inline def setOnSelectionUndefined: Self = StObject.set(x, "onSelection", js.undefined)
    
    inline def setSelectedRegions(value: js.Array[Region]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
    
    inline def setSelectedRegionsUndefined: Self = StObject.set(x, "selectedRegions", js.undefined)
    
    inline def setSelectedRegionsVarargs(value: Region*): Self = StObject.set(x, "selectedRegions", js.Array(value*))
    
    inline def setToRegion(value: (/* index1 */ Double, /* index2 */ js.UndefOr[Double]) => Region): Self = StObject.set(x, "toRegion", js.Any.fromFunction2(value))
    
    inline def setToRegionUndefined: Self = StObject.set(x, "toRegion", js.undefined)
  }
}
