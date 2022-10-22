package typingsJapgolly.reactBootstrapTable.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactBootstrapTable.anon.Filter
import typingsJapgolly.reactBootstrapTable.mod.BootstrapTableProps
import typingsJapgolly.reactBootstrapTable.mod.BootstrapVersion
import typingsJapgolly.reactBootstrapTable.mod.CellEdit
import typingsJapgolly.reactBootstrapTable.mod.ExpandColumnOptions
import typingsJapgolly.reactBootstrapTable.mod.FetchInfo
import typingsJapgolly.reactBootstrapTable.mod.FooterData
import typingsJapgolly.reactBootstrapTable.mod.KeyboardNavigation
import typingsJapgolly.reactBootstrapTable.mod.Options
import typingsJapgolly.reactBootstrapTable.mod.RemoteObjSpec
import typingsJapgolly.reactBootstrapTable.mod.ScrollPosition
import typingsJapgolly.reactBootstrapTable.mod.SelectRow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BootstrapTable {
  
  inline def apply(data: js.Array[js.Object]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BootstrapTableProps]))
  }
  
  @JSImport("react-bootstrap-table", "BootstrapTable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrapTable.mod.BootstrapTable] {
    
    inline def autoCollapse(value: Filter): this.type = set("autoCollapse", value.asInstanceOf[js.Any])
    
    inline def bodyContainerClass(value: String): this.type = set("bodyContainerClass", value.asInstanceOf[js.Any])
    
    inline def bodyStyle(value: CSSProperties): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    
    inline def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    inline def cellEdit(value: CellEdit[Any]): this.type = set("cellEdit", value.asInstanceOf[js.Any])
    
    inline def columnFilter(value: Boolean): this.type = set("columnFilter", value.asInstanceOf[js.Any])
    
    inline def condensed(value: Boolean): this.type = set("condensed", value.asInstanceOf[js.Any])
    
    inline def containerClass(value: String): this.type = set("containerClass", value.asInstanceOf[js.Any])
    
    inline def containerStyle(value: CSSProperties): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def csvFileName(value: String | js.Function0[String]): this.type = set("csvFileName", value.asInstanceOf[js.Any])
    
    inline def csvFileNameCallbackTo(value: CallbackTo[String]): this.type = set("csvFileName", value.toJsFn)
    
    inline def deleteRow(value: Boolean): this.type = set("deleteRow", value.asInstanceOf[js.Any])
    
    inline def excludeCSVHeader(value: Boolean): this.type = set("excludeCSVHeader", value.asInstanceOf[js.Any])
    
    inline def expandColumnOptions(value: ExpandColumnOptions): this.type = set("expandColumnOptions", value.asInstanceOf[js.Any])
    
    inline def expandComponent(value: /* row */ Any => String | Element): this.type = set("expandComponent", js.Any.fromFunction1(value))
    
    inline def expandableRow(value: /* row */ Any => Boolean): this.type = set("expandableRow", js.Any.fromFunction1(value))
    
    inline def exportCSV(value: Boolean): this.type = set("exportCSV", value.asInstanceOf[js.Any])
    
    inline def fetchInfo(value: FetchInfo): this.type = set("fetchInfo", value.asInstanceOf[js.Any])
    
    inline def footer(value: Boolean): this.type = set("footer", value.asInstanceOf[js.Any])
    
    inline def footerData(value: js.Array[js.Array[FooterData]]): this.type = set("footerData", value.asInstanceOf[js.Any])
    
    inline def footerDataVarargs(value: js.Array[FooterData]*): this.type = set("footerData", js.Array(value*))
    
    inline def headerContainerClass(value: String): this.type = set("headerContainerClass", value.asInstanceOf[js.Any])
    
    inline def headerStyle(value: CSSProperties): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    
    inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hover(value: Boolean): this.type = set("hover", value.asInstanceOf[js.Any])
    
    inline def ignoreSinglePage(value: Boolean): this.type = set("ignoreSinglePage", value.asInstanceOf[js.Any])
    
    inline def insertRow(value: Boolean): this.type = set("insertRow", value.asInstanceOf[js.Any])
    
    inline def keyBoardNav(value: Boolean | KeyboardNavigation): this.type = set("keyBoardNav", value.asInstanceOf[js.Any])
    
    inline def keyField(value: String): this.type = set("keyField", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def multiColumnSearch(value: Boolean): this.type = set("multiColumnSearch", value.asInstanceOf[js.Any])
    
    inline def multiColumnSort(value: Double): this.type = set("multiColumnSort", value.asInstanceOf[js.Any])
    
    inline def options(value: Options[Any]): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def pagination(value: Boolean): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    inline def remote(value: Boolean | (js.Function1[/* remobeObj */ RemoteObjSpec, RemoteObjSpec])): this.type = set("remote", value.asInstanceOf[js.Any])
    
    inline def remoteFunction1(value: /* remobeObj */ RemoteObjSpec => RemoteObjSpec): this.type = set("remote", js.Any.fromFunction1(value))
    
    inline def renderAlert(value: Boolean): this.type = set("renderAlert", value.asInstanceOf[js.Any])
    
    inline def scrollTop(value: Double | ScrollPosition): this.type = set("scrollTop", value.asInstanceOf[js.Any])
    
    inline def search(value: Boolean): this.type = set("search", value.asInstanceOf[js.Any])
    
    inline def searchPlaceholder(value: String): this.type = set("searchPlaceholder", value.asInstanceOf[js.Any])
    
    inline def selectRow(value: SelectRow[Any]): this.type = set("selectRow", value.asInstanceOf[js.Any])
    
    inline def strictSearch(value: Boolean): this.type = set("strictSearch", value.asInstanceOf[js.Any])
    
    inline def striped(value: Boolean): this.type = set("striped", value.asInstanceOf[js.Any])
    
    inline def tableBodyClass(value: String): this.type = set("tableBodyClass", value.asInstanceOf[js.Any])
    
    inline def tableContainerClass(value: String): this.type = set("tableContainerClass", value.asInstanceOf[js.Any])
    
    inline def tableFooterClass(value: String): this.type = set("tableFooterClass", value.asInstanceOf[js.Any])
    
    inline def tableHeaderClass(value: String): this.type = set("tableHeaderClass", value.asInstanceOf[js.Any])
    
    inline def tableStyle(value: CSSProperties): this.type = set("tableStyle", value.asInstanceOf[js.Any])
    
    inline def trClassName(value: String | (js.Function2[/* rowData */ Any, /* rowIndex */ Double, String])): this.type = set("trClassName", value.asInstanceOf[js.Any])
    
    inline def trClassNameFunction2(value: (/* rowData */ Any, /* rowIndex */ Double) => String): this.type = set("trClassName", js.Any.fromFunction2(value))
    
    inline def trStyle(value: CSSProperties | (js.Function2[/* rowData */ Any, /* rowIndex */ Double, CSSProperties])): this.type = set("trStyle", value.asInstanceOf[js.Any])
    
    inline def trStyleFunction2(value: (/* rowData */ Any, /* rowIndex */ Double) => CSSProperties): this.type = set("trStyle", js.Any.fromFunction2(value))
    
    inline def version(value: BootstrapVersion): this.type = set("version", value.asInstanceOf[js.Any])
    
    inline def withoutTabIndex(value: Boolean): this.type = set("withoutTabIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BootstrapTableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
