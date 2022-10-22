package typingsJapgolly.reactBootstrapTableNext.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactBootstrapTableNext.anon.DataField
import typingsJapgolly.reactBootstrapTableNext.anon.DataSize
import typingsJapgolly.reactBootstrapTableNext.anon.Options
import typingsJapgolly.reactBootstrapTableNext.anon.Order
import typingsJapgolly.reactBootstrapTableNext.anon.Partialpaginationbooleanf
import typingsJapgolly.reactBootstrapTableNext.mod.BootstrapTableProps
import typingsJapgolly.reactBootstrapTableNext.mod.ColumnDescription
import typingsJapgolly.reactBootstrapTableNext.mod.ExpandRowProps
import typingsJapgolly.reactBootstrapTableNext.mod.FilterPosition
import typingsJapgolly.reactBootstrapTableNext.mod.RowEventHandlerProps
import typingsJapgolly.reactBootstrapTableNext.mod.SearchProps
import typingsJapgolly.reactBootstrapTableNext.mod.SelectRowProps
import typingsJapgolly.reactBootstrapTableNext.mod.SortOrder
import typingsJapgolly.reactBootstrapTableNext.mod.TableChangeState
import typingsJapgolly.reactBootstrapTableNext.mod.TableChangeType
import typingsJapgolly.reactBootstrapTableNext.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactBootstrapTableNext {
  
  inline def apply[T /* <: js.Object */, K](columns: js.Array[ColumnDescription[Any, Any]], data: js.Array[Any], keyField: String): Builder[T, K] = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
    new Builder[T, K](js.Array(this.component, __props.asInstanceOf[BootstrapTableProps[T, K]]))
  }
  
  @JSImport("react-bootstrap-table-next", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: js.Object */, K] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[T, K]] {
    
    inline def bodyClasses(value: String): this.type = set("bodyClasses", value.asInstanceOf[js.Any])
    
    inline def bootstrap4(value: Boolean): this.type = set("bootstrap4", value.asInstanceOf[js.Any])
    
    inline def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    inline def caption(value: Element | String): this.type = set("caption", value.asInstanceOf[js.Any])
    
    inline def captionVdomElement(value: VdomElement): this.type = set("caption", value.rawElement.asInstanceOf[js.Any])
    
    inline def cellEdit(value: Any): this.type = set("cellEdit", value.asInstanceOf[js.Any])
    
    inline def classes(value: String): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def condensed(value: Boolean): this.type = set("condensed", value.asInstanceOf[js.Any])
    
    inline def defaultSortDirection(value: SortOrder): this.type = set("defaultSortDirection", value.asInstanceOf[js.Any])
    
    inline def defaultSorted(value: js.Array[DataField]): this.type = set("defaultSorted", value.asInstanceOf[js.Any])
    
    inline def defaultSortedVarargs(value: DataField*): this.type = set("defaultSorted", js.Array(value*))
    
    inline def expandRow(value: ExpandRowProps[T, K]): this.type = set("expandRow", value.asInstanceOf[js.Any])
    
    inline def filter(value: Any): this.type = set("filter", value.asInstanceOf[js.Any])
    
    inline def filterPosition(value: FilterPosition): this.type = set("filterPosition", value.asInstanceOf[js.Any])
    
    inline def filtersClasses(value: String): this.type = set("filtersClasses", value.asInstanceOf[js.Any])
    
    inline def footerClasses(value: String): this.type = set("footerClasses", value.asInstanceOf[js.Any])
    
    inline def headerClasses(value: String): this.type = set("headerClasses", value.asInstanceOf[js.Any])
    
    inline def headerWrapperClasses(value: String): this.type = set("headerWrapperClasses", value.asInstanceOf[js.Any])
    
    inline def hover(value: Boolean): this.type = set("hover", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def noDataIndication(value: (js.Function0[Element | String]) | Element | String): this.type = set("noDataIndication", value.asInstanceOf[js.Any])
    
    inline def noDataIndicationCallbackTo(value: CallbackTo[Element | String]): this.type = set("noDataIndication", value.toJsFn)
    
    inline def noDataIndicationVdomElement(value: VdomElement): this.type = set("noDataIndication", value.rawElement.asInstanceOf[js.Any])
    
    inline def onDataSizeChange(value: /* props */ DataSize => Callback): this.type = set("onDataSizeChange", js.Any.fromFunction1((t0: /* props */ DataSize) => value(t0).runNow()))
    
    inline def onExternalFilter(value: Any): this.type = set("onExternalFilter", value.asInstanceOf[js.Any])
    
    inline def onFilter(value: Any): this.type = set("onFilter", value.asInstanceOf[js.Any])
    
    inline def onSort(value: Any): this.type = set("onSort", value.asInstanceOf[js.Any])
    
    inline def onTableChange(value: (/* type */ TableChangeType, /* newState */ TableChangeState[T]) => Callback): this.type = set("onTableChange", js.Any.fromFunction2((t0: /* type */ TableChangeType, t1: /* newState */ TableChangeState[T]) => (value(t0, t1)).runNow()))
    
    inline def overlay(value: Any): this.type = set("overlay", value.asInstanceOf[js.Any])
    
    inline def pagination(value: Options): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    inline def parentClassName(value: String | (js.Function3[/* isExpand */ Boolean, T, /* rowIndex */ Double, String])): this.type = set("parentClassName", value.asInstanceOf[js.Any])
    
    inline def parentClassNameFunction3(value: (/* isExpand */ Boolean, T, /* rowIndex */ Double) => String): this.type = set("parentClassName", js.Any.fromFunction3(value))
    
    inline def remote(value: Boolean | Partialpaginationbooleanf): this.type = set("remote", value.asInstanceOf[js.Any])
    
    inline def rowClasses(value: (js.Function2[T, /* rowIndex */ Double, String]) | String): this.type = set("rowClasses", value.asInstanceOf[js.Any])
    
    inline def rowClassesFunction2(value: (T, /* rowIndex */ Double) => String): this.type = set("rowClasses", js.Any.fromFunction2(value))
    
    inline def rowEvents(value: RowEventHandlerProps[Any]): this.type = set("rowEvents", value.asInstanceOf[js.Any])
    
    inline def rowStyle(value: (js.Function2[T, /* rowIndex */ Double, CSSProperties]) | CSSProperties): this.type = set("rowStyle", value.asInstanceOf[js.Any])
    
    inline def rowStyleFunction2(value: (T, /* rowIndex */ Double) => CSSProperties): this.type = set("rowStyle", js.Any.fromFunction2(value))
    
    inline def search(value: SearchProps[T] | Boolean): this.type = set("search", value.asInstanceOf[js.Any])
    
    inline def selectRow(value: SelectRowProps[T]): this.type = set("selectRow", value.asInstanceOf[js.Any])
    
    inline def sort(value: Order): this.type = set("sort", value.asInstanceOf[js.Any])
    
    inline def striped(value: Boolean): this.type = set("striped", value.asInstanceOf[js.Any])
    
    inline def tabIndexCell(value: Boolean): this.type = set("tabIndexCell", value.asInstanceOf[js.Any])
    
    inline def wrapperClasses(value: String): this.type = set("wrapperClasses", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: js.Object */, K](p: BootstrapTableProps[T, K]): Builder[T, K] = new Builder[T, K](js.Array(this.component, p.asInstanceOf[js.Any]))
}
