package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.libEsmInteractionsDragTypesMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.libEsmInteractionsSelectableMod.IDragSelectableProps
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DragSelectable {
  
  inline def apply(
    locateClick: MouseEvent => Region,
    locateDrag: (MouseEvent, ICoordinateData, js.UndefOr[Boolean]) => js.UndefOr[Region],
    onFocusedCell: FocusedCellCoordinates => Callback,
    onSelection: js.Array[Region] => Callback
  ): Builder = {
    val __props = js.Dynamic.literal(locateClick = js.Any.fromFunction1(locateClick), locateDrag = js.Any.fromFunction3(locateDrag), onFocusedCell = js.Any.fromFunction1((t0: FocusedCellCoordinates) => onFocusedCell(t0).runNow()), onSelection = js.Any.fromFunction1((t0: js.Array[Region]) => onSelection(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[IDragSelectableProps]))
  }
  
  @JSImport("@blueprintjs/table", "DragSelectable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.mod.DragSelectable] {
    
    inline def disabled(value: Boolean | (js.Function1[/* event */ MouseEvent, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def disabledFunction1(value: /* event */ MouseEvent => Boolean): this.type = set("disabled", js.Any.fromFunction1(value))
    
    inline def enableMultipleSelection(value: Boolean): this.type = set("enableMultipleSelection", value.asInstanceOf[js.Any])
    
    inline def focusedCell(value: FocusedCellCoordinates): this.type = set("focusedCell", value.asInstanceOf[js.Any])
    
    inline def ignoredSelectors(value: js.Array[String]): this.type = set("ignoredSelectors", value.asInstanceOf[js.Any])
    
    inline def ignoredSelectorsVarargs(value: String*): this.type = set("ignoredSelectors", js.Array(value*))
    
    inline def onSelectionEnd(value: /* regions */ js.Array[Region] => Callback): this.type = set("onSelectionEnd", js.Any.fromFunction1((t0: /* regions */ js.Array[Region]) => value(t0).runNow()))
    
    inline def selectedRegionTransform(
      value: (/* region */ Region, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => Region
    ): this.type = set("selectedRegionTransform", js.Any.fromFunction3(value))
    
    inline def selectedRegions(value: js.Array[Region]): this.type = set("selectedRegions", value.asInstanceOf[js.Any])
    
    inline def selectedRegionsVarargs(value: Region*): this.type = set("selectedRegions", js.Array(value*))
  }
  
  def withProps(p: IDragSelectableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
