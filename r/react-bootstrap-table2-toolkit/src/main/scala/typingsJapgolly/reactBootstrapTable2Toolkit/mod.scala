package typingsJapgolly.reactBootstrapTable2Toolkit

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactBootstrapTable2Toolkit.anon.Bootstrap4
import typingsJapgolly.reactBootstrapTable2Toolkit.anon.Columns
import typingsJapgolly.reactBootstrapTable2Toolkit.anon.OnExport
import typingsJapgolly.reactBootstrapTableNext.mod.ColumnDescription
import typingsJapgolly.reactBootstrapTableNext.mod.SearchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-bootstrap-table2-toolkit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TableToolkitProps[Any]): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  object CSVExport {
    
    @JSImport("react-bootstrap-table2-toolkit", "CSVExport")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ExportCSVButton(props: ExportCSVButtonProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ExportCSVButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  }
  
  object ColumnToggle {
    
    @JSImport("react-bootstrap-table2-toolkit", "ColumnToggle")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ToggleList(props: ToggleListProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleList")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  }
  
  object Search {
    
    @JSImport("react-bootstrap-table2-toolkit", "Search")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ClearSearchButton(props: ClearSearchButtonProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearSearchButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    inline def SearchBar(props: SearchBarProps[Any]): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("SearchBar")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  }
  
  @JSImport("react-bootstrap-table2-toolkit", "ToolkitContext")
  @js.native
  val ToolkitContext: Context[ToolkitContextType] = js.native
  
  trait CSVProps extends StObject {
    
    /**
      * default is text/plain;charset=utf-8
      */
    var blobType: js.UndefOr[String] = js.undefined
    
    var exportAll: js.UndefOr[Boolean] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var ignoreHeader: js.UndefOr[Boolean] = js.undefined
    
    var noAutoBOM: js.UndefOr[Boolean] = js.undefined
    
    var onlyExportFiltered: js.UndefOr[Boolean] = js.undefined
    
    var onlyExportSelection: js.UndefOr[Boolean] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
  }
  object CSVProps {
    
    inline def apply(): CSVProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSVProps]
    }
    
    extension [Self <: CSVProps](x: Self) {
      
      inline def setBlobType(value: String): Self = StObject.set(x, "blobType", value.asInstanceOf[js.Any])
      
      inline def setBlobTypeUndefined: Self = StObject.set(x, "blobType", js.undefined)
      
      inline def setExportAll(value: Boolean): Self = StObject.set(x, "exportAll", value.asInstanceOf[js.Any])
      
      inline def setExportAllUndefined: Self = StObject.set(x, "exportAll", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setIgnoreHeader(value: Boolean): Self = StObject.set(x, "ignoreHeader", value.asInstanceOf[js.Any])
      
      inline def setIgnoreHeaderUndefined: Self = StObject.set(x, "ignoreHeader", js.undefined)
      
      inline def setNoAutoBOM(value: Boolean): Self = StObject.set(x, "noAutoBOM", value.asInstanceOf[js.Any])
      
      inline def setNoAutoBOMUndefined: Self = StObject.set(x, "noAutoBOM", js.undefined)
      
      inline def setOnlyExportFiltered(value: Boolean): Self = StObject.set(x, "onlyExportFiltered", value.asInstanceOf[js.Any])
      
      inline def setOnlyExportFilteredUndefined: Self = StObject.set(x, "onlyExportFiltered", js.undefined)
      
      inline def setOnlyExportSelection(value: Boolean): Self = StObject.set(x, "onlyExportSelection", value.asInstanceOf[js.Any])
      
      inline def setOnlyExportSelectionUndefined: Self = StObject.set(x, "onlyExportSelection", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  trait ClearSearchButtonProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object ClearSearchButtonProps {
    
    inline def apply(): ClearSearchButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearSearchButtonProps]
    }
    
    extension [Self <: ClearSearchButtonProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnClear(value: Callback): Self = StObject.set(x, "onClear", value.toJsFn)
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait ExportCSVButtonProps extends StObject {
    
    var children: Node
    
    var className: js.UndefOr[String] = js.undefined
    
    def onExport(): Unit
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ExportCSVButtonProps {
    
    inline def apply(onExport: Callback): ExportCSVButtonProps = {
      val __obj = js.Dynamic.literal(onExport = onExport.toJsFn, children = null)
      __obj.asInstanceOf[ExportCSVButtonProps]
    }
    
    extension [Self <: ExportCSVButtonProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnExport(value: Callback): Self = StObject.set(x, "onExport", value.toJsFn)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait InjectedSearchProps extends StObject {
    
    def onClear(): Unit
    
    def onSearch(`val`: String): Unit
    
    var searchText: String
  }
  object InjectedSearchProps {
    
    inline def apply(onClear: Callback, onSearch: String => Callback, searchText: String): InjectedSearchProps = {
      val __obj = js.Dynamic.literal(onClear = onClear.toJsFn, onSearch = js.Any.fromFunction1((t0: String) => onSearch(t0).runNow()), searchText = searchText.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedSearchProps]
    }
    
    extension [Self <: InjectedSearchProps](x: Self) {
      
      inline def setOnClear(value: Callback): Self = StObject.set(x, "onClear", value.toJsFn)
      
      inline def setOnSearch(value: String => Callback): Self = StObject.set(x, "onSearch", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchBarProps[T]
    extends StObject
       with SearchProps[T] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var ref: js.UndefOr[RefHandle[Component[SearchProps[T] & js.Object, js.Object]]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tableId: js.UndefOr[String] = js.undefined
  }
  object SearchBarProps {
    
    inline def apply[T](): SearchBarProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchBarProps[T]]
    }
    
    extension [Self <: SearchBarProps[?], T](x: Self & SearchBarProps[T]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setRef(value: RefHandle[Component[SearchProps[T] & js.Object, js.Object]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
      
      inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    }
  }
  
  trait SearchMatchProps[T /* <: js.Object */] extends StObject {
    
    var column: ColumnDescription[T, Any]
    
    var row: T
    
    var searchText: String
    
    var value: String
  }
  object SearchMatchProps {
    
    inline def apply[T /* <: js.Object */](column: ColumnDescription[T, Any], row: T, searchText: String, value: String): SearchMatchProps[T] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], searchText = searchText.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchMatchProps[T]]
    }
    
    extension [Self <: SearchMatchProps[?], T /* <: js.Object */](x: Self & SearchMatchProps[T]) {
      
      inline def setColumn(value: ColumnDescription[T, Any]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableSearchProps[T /* <: js.Object */] extends StObject {
    
    var afterSearch: js.UndefOr[js.Function1[/* newResult */ js.Array[T], js.UndefOr[Unit]]] = js.undefined
    
    var customMatchFunc: js.UndefOr[js.Function1[/* props */ SearchMatchProps[T], Boolean]] = js.undefined
    
    var defaultSearch: js.UndefOr[String] = js.undefined
    
    var onColumnMatch: js.UndefOr[js.Function1[/* props */ SearchMatchProps[T], Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var searchFormatted: js.UndefOr[Boolean] = js.undefined
  }
  object TableSearchProps {
    
    inline def apply[T /* <: js.Object */](): TableSearchProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableSearchProps[T]]
    }
    
    extension [Self <: TableSearchProps[?], T /* <: js.Object */](x: Self & TableSearchProps[T]) {
      
      inline def setAfterSearch(value: /* newResult */ js.Array[T] => js.UndefOr[Unit]): Self = StObject.set(x, "afterSearch", js.Any.fromFunction1(value))
      
      inline def setAfterSearchUndefined: Self = StObject.set(x, "afterSearch", js.undefined)
      
      inline def setCustomMatchFunc(value: /* props */ SearchMatchProps[T] => Boolean): Self = StObject.set(x, "customMatchFunc", js.Any.fromFunction1(value))
      
      inline def setCustomMatchFuncUndefined: Self = StObject.set(x, "customMatchFunc", js.undefined)
      
      inline def setDefaultSearch(value: String): Self = StObject.set(x, "defaultSearch", value.asInstanceOf[js.Any])
      
      inline def setDefaultSearchUndefined: Self = StObject.set(x, "defaultSearch", js.undefined)
      
      inline def setOnColumnMatch(value: /* props */ SearchMatchProps[T] => Callback): Self = StObject.set(x, "onColumnMatch", js.Any.fromFunction1((t0: /* props */ SearchMatchProps[T]) => value(t0).runNow()))
      
      inline def setOnColumnMatchUndefined: Self = StObject.set(x, "onColumnMatch", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setSearchFormatted(value: Boolean): Self = StObject.set(x, "searchFormatted", value.asInstanceOf[js.Any])
      
      inline def setSearchFormattedUndefined: Self = StObject.set(x, "searchFormatted", js.undefined)
    }
  }
  
  trait TableToolkitProps[T /* <: js.Object */] extends StObject {
    
    var bootstrap4: js.UndefOr[Boolean] = js.undefined
    
    def children(props: ToolkitContextType): typingsJapgolly.react.mod.global.JSX.Element
    
    var columnToggle: js.UndefOr[Boolean] = js.undefined
    
    var columns: js.Array[ColumnDescription[T, Any]]
    
    var data: js.Array[T]
    
    var exportCSV: js.UndefOr[Boolean | CSVProps] = js.undefined
    
    var keyField: /* keyof T */ String
    
    var ref: js.UndefOr[Any] = js.undefined
    
    var search: js.UndefOr[TableSearchProps[T] | Boolean] = js.undefined
  }
  object TableToolkitProps {
    
    inline def apply[T /* <: js.Object */](
      children: ToolkitContextType => typingsJapgolly.react.mod.global.JSX.Element,
      columns: js.Array[ColumnDescription[T, Any]],
      data: js.Array[T],
      keyField: /* keyof T */ String
    ): TableToolkitProps[T] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableToolkitProps[T]]
    }
    
    extension [Self <: TableToolkitProps[?], T /* <: js.Object */](x: Self & TableToolkitProps[T]) {
      
      inline def setBootstrap4(value: Boolean): Self = StObject.set(x, "bootstrap4", value.asInstanceOf[js.Any])
      
      inline def setBootstrap4Undefined: Self = StObject.set(x, "bootstrap4", js.undefined)
      
      inline def setChildren(value: ToolkitContextType => typingsJapgolly.react.mod.global.JSX.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setColumnToggle(value: Boolean): Self = StObject.set(x, "columnToggle", value.asInstanceOf[js.Any])
      
      inline def setColumnToggleUndefined: Self = StObject.set(x, "columnToggle", js.undefined)
      
      inline def setColumns(value: js.Array[ColumnDescription[T, Any]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (ColumnDescription[T, Any])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setExportCSV(value: Boolean | CSVProps): Self = StObject.set(x, "exportCSV", value.asInstanceOf[js.Any])
      
      inline def setExportCSVUndefined: Self = StObject.set(x, "exportCSV", js.undefined)
      
      inline def setKeyField(value: /* keyof T */ String): Self = StObject.set(x, "keyField", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSearch(value: TableSearchProps[T] | Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    }
  }
  
  trait ToggleListProps extends StObject {
    
    var btnClassName: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var columns: js.Array[ColumnDescription[Any, Any]]
    
    var contextual: js.UndefOr[String] = js.undefined
    
    def onColumnToggle(dataField: String): Unit
    
    /**
      * array of toggled columns
      */
    var toggles: js.Array[Boolean]
  }
  object ToggleListProps {
    
    inline def apply(
      columns: js.Array[ColumnDescription[Any, Any]],
      onColumnToggle: String => Callback,
      toggles: js.Array[Boolean]
    ): ToggleListProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onColumnToggle = js.Any.fromFunction1((t0: String) => onColumnToggle(t0).runNow()), toggles = toggles.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleListProps]
    }
    
    extension [Self <: ToggleListProps](x: Self) {
      
      inline def setBtnClassName(value: String): Self = StObject.set(x, "btnClassName", value.asInstanceOf[js.Any])
      
      inline def setBtnClassNameUndefined: Self = StObject.set(x, "btnClassName", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColumns(value: js.Array[ColumnDescription[Any, Any]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (ColumnDescription[Any, Any])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setContextual(value: String): Self = StObject.set(x, "contextual", value.asInstanceOf[js.Any])
      
      inline def setContextualUndefined: Self = StObject.set(x, "contextual", js.undefined)
      
      inline def setOnColumnToggle(value: String => Callback): Self = StObject.set(x, "onColumnToggle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setToggles(value: js.Array[Boolean]): Self = StObject.set(x, "toggles", value.asInstanceOf[js.Any])
      
      inline def setTogglesVarargs(value: Boolean*): Self = StObject.set(x, "toggles", js.Array(value*))
    }
  }
  
  trait ToolkitContextType extends StObject {
    
    var baseProps: Bootstrap4
    
    var columnToggleProps: Columns
    
    var csvProps: OnExport
    
    var searchProps: InjectedSearchProps
  }
  object ToolkitContextType {
    
    inline def apply(
      baseProps: Bootstrap4,
      columnToggleProps: Columns,
      csvProps: OnExport,
      searchProps: InjectedSearchProps
    ): ToolkitContextType = {
      val __obj = js.Dynamic.literal(baseProps = baseProps.asInstanceOf[js.Any], columnToggleProps = columnToggleProps.asInstanceOf[js.Any], csvProps = csvProps.asInstanceOf[js.Any], searchProps = searchProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolkitContextType]
    }
    
    extension [Self <: ToolkitContextType](x: Self) {
      
      inline def setBaseProps(value: Bootstrap4): Self = StObject.set(x, "baseProps", value.asInstanceOf[js.Any])
      
      inline def setColumnToggleProps(value: Columns): Self = StObject.set(x, "columnToggleProps", value.asInstanceOf[js.Any])
      
      inline def setCsvProps(value: OnExport): Self = StObject.set(x, "csvProps", value.asInstanceOf[js.Any])
      
      inline def setSearchProps(value: InjectedSearchProps): Self = StObject.set(x, "searchProps", value.asInstanceOf[js.Any])
    }
  }
}
