package typingsJapgolly.materialUiDatatables.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiDatatables.anon.PartialDataTableProps
import typingsJapgolly.materialUiDatatables.materialUiDatatablesStrings.filter
import typingsJapgolly.materialUiDatatables.mod.Column
import typingsJapgolly.materialUiDatatables.mod.default
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MaterialUiDatatables {
  
  @JSImport("material-ui-datatables", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def columns(value: js.Array[Column]): this.type = set("columns", value.asInstanceOf[js.Any])
    
    inline def columnsVarargs(value: Column*): this.type = set("columns", js.Array(value*))
    
    inline def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Array[Any]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: Any*): this.type = set("data", js.Array(value*))
    
    inline def deselectOnClickaway(value: Boolean): this.type = set("deselectOnClickaway", value.asInstanceOf[js.Any])
    
    inline def enableSelectAll(value: Boolean): this.type = set("enableSelectAll", value.asInstanceOf[js.Any])
    
    inline def filterHintText(value: String): this.type = set("filterHintText", value.asInstanceOf[js.Any])
    
    inline def filterValue(value: String): this.type = set("filterValue", value.asInstanceOf[js.Any])
    
    inline def fixedFooter(value: Boolean): this.type = set("fixedFooter", value.asInstanceOf[js.Any])
    
    inline def fixedHeader(value: Boolean): this.type = set("fixedHeader", value.asInstanceOf[js.Any])
    
    inline def footerToolbarStyle(value: CSSProperties): this.type = set("footerToolbarStyle", value.asInstanceOf[js.Any])
    
    inline def headerToolbarMode(value: typingsJapgolly.materialUiDatatables.materialUiDatatablesStrings.default | filter | String): this.type = set("headerToolbarMode", value.asInstanceOf[js.Any])
    
    inline def height(value: Any): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def multiSelectable(value: Boolean): this.type = set("multiSelectable", value.asInstanceOf[js.Any])
    
    inline def onCellClick(
      value: (/* rowIndex */ Double, /* columnIndex */ Double, /* row */ Any, /* columnValue */ Any, /* event */ Any) => Callback
    ): this.type = set("onCellClick", js.Any.fromFunction5((t0: /* rowIndex */ Double, t1: /* columnIndex */ Double, t2: /* row */ Any, t3: /* columnValue */ Any, t4: /* event */ Any) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def onCellDoubleClick(
      value: (/* rowIndex */ Double, /* columnIndex */ Double, /* row */ Any, /* columnValue */ Any, /* event */ Any) => Callback
    ): this.type = set("onCellDoubleClick", js.Any.fromFunction5((t0: /* rowIndex */ Double, t1: /* columnIndex */ Double, t2: /* row */ Any, t3: /* columnValue */ Any, t4: /* event */ Any) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def onFilterValueChange(value: /* value */ String => Callback): this.type = set("onFilterValueChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onNextPageClick(value: /* event */ Any => Callback): this.type = set("onNextPageClick", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
    
    inline def onPreviousPageClick(value: /* event */ Any => Callback): this.type = set("onPreviousPageClick", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
    
    inline def onRowSelection(value: /* selectedRows */ Any => Callback): this.type = set("onRowSelection", js.Any.fromFunction1((t0: /* selectedRows */ Any) => value(t0).runNow()))
    
    inline def onRowSizeChange(value: (/* index */ Double, /* value */ Any) => Callback): this.type = set("onRowSizeChange", js.Any.fromFunction2((t0: /* index */ Double, t1: /* value */ Any) => (value(t0, t1)).runNow()))
    
    inline def onSortOrderChange(value: (/* key */ String, /* order */ String) => Callback): this.type = set("onSortOrderChange", js.Any.fromFunction2((t0: /* key */ String, t1: /* order */ String) => (value(t0, t1)).runNow()))
    
    inline def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    
    inline def rowSize(value: Double): this.type = set("rowSize", value.asInstanceOf[js.Any])
    
    inline def rowSizeLabel(value: String): this.type = set("rowSizeLabel", value.asInstanceOf[js.Any])
    
    inline def rowSizeList(value: js.Array[Double]): this.type = set("rowSizeList", value.asInstanceOf[js.Any])
    
    inline def rowSizeListVarargs(value: Double*): this.type = set("rowSizeList", js.Array(value*))
    
    inline def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    inline def showCheckboxes(value: Boolean): this.type = set("showCheckboxes", value.asInstanceOf[js.Any])
    
    inline def showFooterToolbar(value: Boolean): this.type = set("showFooterToolbar", value.asInstanceOf[js.Any])
    
    inline def showHeaderToolbar(value: Boolean): this.type = set("showHeaderToolbar", value.asInstanceOf[js.Any])
    
    inline def showHeaderToolbarFilterIcon(value: Boolean): this.type = set("showHeaderToolbarFilterIcon", value.asInstanceOf[js.Any])
    
    inline def showRowHover(value: Boolean): this.type = set("showRowHover", value.asInstanceOf[js.Any])
    
    inline def showRowSizeControls(value: Boolean): this.type = set("showRowSizeControls", value.asInstanceOf[js.Any])
    
    inline def stripedRows(value: Boolean): this.type = set("stripedRows", value.asInstanceOf[js.Any])
    
    inline def summaryLabelTemplate(value: (/* start */ Double, /* end */ Double, /* count */ Double) => Any): this.type = set("summaryLabelTemplate", js.Any.fromFunction3(value))
    
    inline def tableBodyStyle(value: CSSProperties): this.type = set("tableBodyStyle", value.asInstanceOf[js.Any])
    
    inline def tableHeaderColumnStyle(value: CSSProperties): this.type = set("tableHeaderColumnStyle", value.asInstanceOf[js.Any])
    
    inline def tableHeaderStyle(value: CSSProperties): this.type = set("tableHeaderStyle", value.asInstanceOf[js.Any])
    
    inline def tableRowColumnStyle(value: CSSProperties): this.type = set("tableRowColumnStyle", value.asInstanceOf[js.Any])
    
    inline def tableRowStyle(value: CSSProperties): this.type = set("tableRowStyle", value.asInstanceOf[js.Any])
    
    inline def tableStyle(value: CSSProperties): this.type = set("tableStyle", value.asInstanceOf[js.Any])
    
    inline def tableWrapperStyle(value: CSSProperties): this.type = set("tableWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleStyle(value: CSSProperties): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    
    inline def toolbarIconRight(value: Any): this.type = set("toolbarIconRight", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MaterialUiDatatables.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialDataTableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
