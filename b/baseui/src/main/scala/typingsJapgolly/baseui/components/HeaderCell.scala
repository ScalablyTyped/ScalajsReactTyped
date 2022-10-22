package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.dataTableHeaderCellMod.HeaderCellProps
import typingsJapgolly.baseui.dataTableTypesMod.SortDirections
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeaderCell {
  
  inline def apply(
    index: Double,
    isHovered: Boolean,
    isSelectable: Boolean,
    isSelectedAll: Boolean,
    isSelectedIndeterminate: Boolean,
    onMouseEnter: Any => Callback,
    onMouseLeave: Any => Callback,
    onSelectAll: Callback,
    onSelectNone: Callback,
    onSort: Double => Callback,
    sortDirection: SortDirections,
    sortable: Boolean,
    title: String
  ): Builder = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], isSelectable = isSelectable.asInstanceOf[js.Any], isSelectedAll = isSelectedAll.asInstanceOf[js.Any], isSelectedIndeterminate = isSelectedIndeterminate.asInstanceOf[js.Any], onMouseEnter = js.Any.fromFunction1((t0: Any) => onMouseEnter(t0).runNow()), onMouseLeave = js.Any.fromFunction1((t0: Any) => onMouseLeave(t0).runNow()), onSelectAll = onSelectAll.toJsFn, onSelectNone = onSelectNone.toJsFn, onSort = js.Any.fromFunction1((t0: Double) => onSort(t0).runNow()), sortDirection = sortDirection.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HeaderCellProps & RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("baseui/data-table/header-cell", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLDivElement] {
    
    inline def isMeasured(value: Boolean): this.type = set("isMeasured", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HeaderCellProps & RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
