package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.anon.ScrollToFirstRowOnChange
import typingsJapgolly.antd.anon.`3`
import typingsJapgolly.antd.antdBooleans.`false`
import typingsJapgolly.antd.antdStrings.ltr
import typingsJapgolly.antd.antdStrings.rtl
import typingsJapgolly.antd.libConfigProviderSizeContextMod.SizeType
import typingsJapgolly.antd.libSpinMod.SpinProps
import typingsJapgolly.antd.libTableInterfaceMod.ColumnGroupType
import typingsJapgolly.antd.libTableInterfaceMod.ColumnType
import typingsJapgolly.antd.libTableInterfaceMod.ColumnsType
import typingsJapgolly.antd.libTableInterfaceMod.FilterValue
import typingsJapgolly.antd.libTableInterfaceMod.SortOrder
import typingsJapgolly.antd.libTableInterfaceMod.SorterResult
import typingsJapgolly.antd.libTableInterfaceMod.TableCurrentDataSource
import typingsJapgolly.antd.libTableInterfaceMod.TableLocale
import typingsJapgolly.antd.libTableInterfaceMod.TablePaginationConfig
import typingsJapgolly.antd.libTableInterfaceMod.TableRowSelection
import typingsJapgolly.antd.libTableTableMod.TableProps
import typingsJapgolly.antd.libTooltipMod.TooltipProps
import typingsJapgolly.rcTable.anon.X
import typingsJapgolly.rcTable.libFooterSummaryMod.SummaryProps
import typingsJapgolly.rcTable.libInterfaceMod.ExpandableConfig
import typingsJapgolly.rcTable.libInterfaceMod.GetRowKey
import typingsJapgolly.rcTable.libInterfaceMod.Key
import typingsJapgolly.rcTable.libInterfaceMod.RenderExpandIconProps
import typingsJapgolly.rcTable.libInterfaceMod.RowClassName
import typingsJapgolly.rcTable.libInterfaceMod.TableComponents
import typingsJapgolly.rcTable.libInterfaceMod.TableLayout
import typingsJapgolly.rcTable.libInterfaceMod.TableSticky
import typingsJapgolly.rcTable.rcTableStrings.bottom
import typingsJapgolly.rcTable.rcTableStrings.top
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.TdHTMLAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  inline def apply[RecordType /* <: js.Object */](): Builder[RecordType] = {
    val __props = js.Dynamic.literal()
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[`3` & TableProps[RecordType]]))
  }
  
  object Table {
    
    @JSImport("antd", "Table.Summary")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def fixed(value: Boolean | top | bottom): this.type = set("fixed", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Table.type): typingsJapgolly.antd.components.Table.Table.Builder = new typingsJapgolly.antd.components.Table.Table.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SummaryProps): typingsJapgolly.antd.components.Table.Table.Builder = new typingsJapgolly.antd.components.Table.Table.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  @JSImport("antd", "Table")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RecordType /* <: js.Object */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLDivElement] {
    
    inline def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    inline def caption(value: String | japgolly.scalajs.react.facade.React.Node): this.type = set("caption", value.asInstanceOf[js.Any])
    
    inline def captionNull: this.type = set("caption", null)
    
    inline def captionVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("caption", js.Array(value*))
    
    inline def captionVdomElement(value: VdomElement): this.type = set("caption", value.rawElement.asInstanceOf[js.Any])
    
    inline def childrenColumnName(value: String): this.type = set("childrenColumnName", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def columns(value: ColumnsType[RecordType]): this.type = set("columns", value.asInstanceOf[js.Any])
    
    inline def columnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): this.type = set("columns", js.Array(value*))
    
    inline def components(value: TableComponents[RecordType]): this.type = set("components", value.asInstanceOf[js.Any])
    
    inline def dataSource(value: js.Array[RecordType]): this.type = set("dataSource", value.asInstanceOf[js.Any])
    
    inline def dataSourceVarargs(value: RecordType*): this.type = set("dataSource", js.Array(value*))
    
    inline def defaultExpandAllRows(value: Boolean): this.type = set("defaultExpandAllRows", value.asInstanceOf[js.Any])
    
    inline def defaultExpandedRowKeys(value: js.Array[Key]): this.type = set("defaultExpandedRowKeys", value.asInstanceOf[js.Any])
    
    inline def defaultExpandedRowKeysVarargs(value: Key*): this.type = set("defaultExpandedRowKeys", js.Array(value*))
    
    inline def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def dropdownPrefixCls(value: String): this.type = set("dropdownPrefixCls", value.asInstanceOf[js.Any])
    
    inline def expandIcon(value: /* props */ RenderExpandIconProps[RecordType] => japgolly.scalajs.react.facade.React.Node): this.type = set("expandIcon", js.Any.fromFunction1(value))
    
    inline def expandIconColumnIndex(value: Double): this.type = set("expandIconColumnIndex", value.asInstanceOf[js.Any])
    
    inline def expandRowByClick(value: Boolean): this.type = set("expandRowByClick", value.asInstanceOf[js.Any])
    
    inline def expandable(value: ExpandableConfig[RecordType]): this.type = set("expandable", value.asInstanceOf[js.Any])
    
    inline def expandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): this.type = set("expandedRowClassName", js.Any.fromFunction3(value))
    
    inline def expandedRowKeys(value: js.Array[Key]): this.type = set("expandedRowKeys", value.asInstanceOf[js.Any])
    
    inline def expandedRowKeysVarargs(value: Key*): this.type = set("expandedRowKeys", js.Array(value*))
    
    inline def expandedRowRender(
      value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => japgolly.scalajs.react.facade.React.Node
    ): this.type = set("expandedRowRender", js.Any.fromFunction4(value))
    
    inline def footer(value: /* data */ js.Array[RecordType] => japgolly.scalajs.react.facade.React.Node): this.type = set("footer", js.Any.fromFunction1(value))
    
    inline def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def indentSize(value: Double): this.type = set("indentSize", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean | SpinProps): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def locale(value: TableLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* pagination */ TablePaginationConfig, /* filters */ Record[String, FilterValue | Null], /* sorter */ SorterResult[RecordType] | js.Array[SorterResult[RecordType]], /* extra */ TableCurrentDataSource[RecordType]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction4((t0: /* pagination */ TablePaginationConfig, t1: /* filters */ Record[String, FilterValue | Null], t2: /* sorter */ SorterResult[RecordType] | js.Array[SorterResult[RecordType]], t3: /* extra */ TableCurrentDataSource[RecordType]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def onExpand(value: (/* expanded */ Boolean, RecordType) => Callback): this.type = set("onExpand", js.Any.fromFunction2((t0: /* expanded */ Boolean, t1: RecordType) => (value(t0, t1)).runNow()))
    
    inline def onExpandedRowsChange(value: /* expandedKeys */ js.Array[Key] => Callback): this.type = set("onExpandedRowsChange", js.Any.fromFunction1((t0: /* expandedKeys */ js.Array[Key]) => value(t0).runNow()))
    
    inline def onHeaderRow(
      value: (js.Array[typingsJapgolly.rcTable.libInterfaceMod.ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]
    ): this.type = set("onHeaderRow", js.Any.fromFunction2(value))
    
    inline def onRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]): this.type = set("onRow", js.Any.fromFunction2(value))
    
    inline def pagination(value: `false` | TablePaginationConfig): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def rowClassName(value: String | RowClassName[RecordType]): this.type = set("rowClassName", value.asInstanceOf[js.Any])
    
    inline def rowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): this.type = set("rowClassName", js.Any.fromFunction3(value))
    
    inline def rowKey(value: String | GetRowKey[RecordType]): this.type = set("rowKey", value.asInstanceOf[js.Any])
    
    inline def rowKeyFunction2(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): this.type = set("rowKey", js.Any.fromFunction2(value))
    
    inline def rowSelection(value: TableRowSelection[RecordType]): this.type = set("rowSelection", value.asInstanceOf[js.Any])
    
    inline def scroll(value: js.UndefOr[X] & ScrollToFirstRowOnChange): this.type = set("scroll", value.asInstanceOf[js.Any])
    
    inline def showHeader(value: Boolean): this.type = set("showHeader", value.asInstanceOf[js.Any])
    
    inline def showSorterTooltip(value: Boolean | TooltipProps): this.type = set("showSorterTooltip", value.asInstanceOf[js.Any])
    
    inline def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def sortDirections(value: js.Array[SortOrder]): this.type = set("sortDirections", value.asInstanceOf[js.Any])
    
    inline def sortDirectionsVarargs(value: SortOrder*): this.type = set("sortDirections", js.Array(value*))
    
    inline def sticky(value: Boolean | TableSticky): this.type = set("sticky", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def summary(value: /* data */ js.Array[RecordType] => japgolly.scalajs.react.facade.React.Node): this.type = set("summary", js.Any.fromFunction1(value))
    
    inline def tableLayout(value: TableLayout): this.type = set("tableLayout", value.asInstanceOf[js.Any])
    
    inline def title(value: /* data */ js.Array[RecordType] => japgolly.scalajs.react.facade.React.Node): this.type = set("title", js.Any.fromFunction1(value))
  }
  
  implicit def make[RecordType /* <: js.Object */](companion: Table.type): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[RecordType /* <: js.Object */](p: `3` & TableProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
