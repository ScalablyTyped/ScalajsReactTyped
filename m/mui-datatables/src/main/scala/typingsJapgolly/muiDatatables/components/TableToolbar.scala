package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.anon.Data
import typingsJapgolly.muiDatatables.mod.DisplayData
import typingsJapgolly.muiDatatables.mod.MUIDataTableColumnDef
import typingsJapgolly.muiDatatables.mod.MUIDataTableData
import typingsJapgolly.muiDatatables.mod.MUIDataTableOptions
import typingsJapgolly.muiDatatables.mod.MUIDataTableToolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableToolbar {
  
  inline def apply(columns: js.Array[MUIDataTableColumnDef]): Builder = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableToolbar]))
  }
  
  @JSImport("mui-datatables", "TableToolbar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def columnOrder(value: js.Array[Double]): this.type = set("columnOrder", value.asInstanceOf[js.Any])
    
    inline def columnOrderVarargs(value: Double*): this.type = set("columnOrder", js.Array(value*))
    
    inline def data(value: js.Array[MUIDataTableData]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: MUIDataTableData*): this.type = set("data", js.Array(value*))
    
    inline def displayData(value: DisplayData): this.type = set("displayData", value.asInstanceOf[js.Any])
    
    inline def displayDataVarargs(value: Data*): this.type = set("displayData", js.Array(value*))
    
    inline def filterData(value: js.Array[js.Array[Any]]): this.type = set("filterData", value.asInstanceOf[js.Any])
    
    inline def filterDataVarargs(value: js.Array[Any]*): this.type = set("filterData", js.Array(value*))
    
    inline def filterList(value: js.Array[js.Array[String]]): this.type = set("filterList", value.asInstanceOf[js.Any])
    
    inline def filterListVarargs(value: js.Array[String]*): this.type = set("filterList", js.Array(value*))
    
    inline def filterUpdate(value: /* args */ Any => Any): this.type = set("filterUpdate", js.Any.fromFunction1(value))
    
    inline def options(value: MUIDataTableOptions): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def resetFilters(value: CallbackTo[Any]): this.type = set("resetFilters", value.toJsFn)
    
    inline def searchClose(value: CallbackTo[Any]): this.type = set("searchClose", value.toJsFn)
    
    inline def searchText(value: VdomNode): this.type = set("searchText", value.rawNode.asInstanceOf[js.Any])
    
    inline def searchTextNull: this.type = set("searchText", null)
    
    inline def searchTextUpdate(value: /* args */ Any => Any): this.type = set("searchTextUpdate", js.Any.fromFunction1(value))
    
    inline def searchTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("searchText", js.Array(value*))
    
    inline def searchTextVdomElement(value: VdomElement): this.type = set("searchText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTableActions(value: /* args */ Any => Any): this.type = set("setTableActions", js.Any.fromFunction1(value))
    
    inline def tableRef(value: /* args */ Any => Any): this.type = set("tableRef", js.Any.fromFunction1(value))
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def toggleViewColumn(value: /* a */ Any => Any): this.type = set("toggleViewColumn", js.Any.fromFunction1(value))
    
    inline def updateFilterByType(value: /* args */ Any => Any): this.type = set("updateFilterByType", js.Any.fromFunction1(value))
  }
  
  def withProps(p: MUIDataTableToolbar): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
