package typingsJapgolly.rcTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcTable.anon.X
import typingsJapgolly.rcTable.libInterfaceMod.ColumnGroupType
import typingsJapgolly.rcTable.libInterfaceMod.ColumnType
import typingsJapgolly.rcTable.libInterfaceMod.ColumnsType
import typingsJapgolly.rcTable.libInterfaceMod.DefaultRecordType
import typingsJapgolly.rcTable.libInterfaceMod.ExpandableConfig
import typingsJapgolly.rcTable.libInterfaceMod.GetRowKey
import typingsJapgolly.rcTable.libInterfaceMod.Key
import typingsJapgolly.rcTable.libInterfaceMod.RenderExpandIconProps
import typingsJapgolly.rcTable.libInterfaceMod.RowClassName
import typingsJapgolly.rcTable.libInterfaceMod.TableComponents
import typingsJapgolly.rcTable.libInterfaceMod.TableLayout
import typingsJapgolly.rcTable.libInterfaceMod.TableSticky
import typingsJapgolly.rcTable.rcTableStrings.ltr
import typingsJapgolly.rcTable.rcTableStrings.rtl
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.TdHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TableProps_2076786734[RecordType /* <: DefaultRecordType */] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def caption(value: String | Node): this.type = set("caption", value.asInstanceOf[js.Any])
  
  inline def captionNull: this.type = set("caption", null)
  
  inline def captionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("caption", js.Array(value*))
  
  inline def captionVdomElement(value: VdomElement): this.type = set("caption", value.rawElement.asInstanceOf[js.Any])
  
  inline def childrenColumnName(value: String): this.type = set("childrenColumnName", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def columns(value: ColumnsType[RecordType]): this.type = set("columns", value.asInstanceOf[js.Any])
  
  inline def columnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): this.type = set("columns", js.Array(value*))
  
  inline def components(value: TableComponents[RecordType]): this.type = set("components", value.asInstanceOf[js.Any])
  
  inline def data(value: js.Array[RecordType]): this.type = set("data", value.asInstanceOf[js.Any])
  
  inline def dataVarargs(value: RecordType*): this.type = set("data", js.Array(value*))
  
  inline def defaultExpandAllRows(value: Boolean): this.type = set("defaultExpandAllRows", value.asInstanceOf[js.Any])
  
  inline def defaultExpandedRowKeys(value: js.Array[Key]): this.type = set("defaultExpandedRowKeys", value.asInstanceOf[js.Any])
  
  inline def defaultExpandedRowKeysVarargs(value: Key*): this.type = set("defaultExpandedRowKeys", js.Array(value*))
  
  inline def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
  
  inline def emptyText(value: Node | js.Function0[Node]): this.type = set("emptyText", value.asInstanceOf[js.Any])
  
  inline def emptyTextCallbackTo(value: CallbackTo[Node]): this.type = set("emptyText", value.toJsFn)
  
  inline def emptyTextNull: this.type = set("emptyText", null)
  
  inline def emptyTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("emptyText", js.Array(value*))
  
  inline def emptyTextVdomElement(value: VdomElement): this.type = set("emptyText", value.rawElement.asInstanceOf[js.Any])
  
  inline def expandIcon(value: /* props */ RenderExpandIconProps[RecordType] => Node): this.type = set("expandIcon", js.Any.fromFunction1(value))
  
  inline def expandIconColumnIndex(value: Double): this.type = set("expandIconColumnIndex", value.asInstanceOf[js.Any])
  
  inline def expandRowByClick(value: Boolean): this.type = set("expandRowByClick", value.asInstanceOf[js.Any])
  
  inline def expandable(value: ExpandableConfig[RecordType]): this.type = set("expandable", value.asInstanceOf[js.Any])
  
  inline def expandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): this.type = set("expandedRowClassName", js.Any.fromFunction3(value))
  
  inline def expandedRowKeys(value: js.Array[Key]): this.type = set("expandedRowKeys", value.asInstanceOf[js.Any])
  
  inline def expandedRowKeysVarargs(value: Key*): this.type = set("expandedRowKeys", js.Array(value*))
  
  inline def expandedRowRender(value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => Node): this.type = set("expandedRowRender", js.Any.fromFunction4(value))
  
  inline def footer(value: /* data */ js.Array[RecordType] => Node): this.type = set("footer", js.Any.fromFunction1(value))
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def indentSize(value: Double): this.type = set("indentSize", value.asInstanceOf[js.Any])
  
  inline def internalHooks(value: String): this.type = set("internalHooks", value.asInstanceOf[js.Any])
  
  inline def internalRefs(value: typingsJapgolly.rcTable.anon.Body): this.type = set("internalRefs", value.asInstanceOf[js.Any])
  
  inline def onExpand(value: (/* expanded */ Boolean, RecordType) => Callback): this.type = set("onExpand", js.Any.fromFunction2((t0: /* expanded */ Boolean, t1: RecordType) => (value(t0, t1)).runNow()))
  
  inline def onExpandedRowsChange(value: /* expandedKeys */ js.Array[Key] => Callback): this.type = set("onExpandedRowsChange", js.Any.fromFunction1((t0: /* expandedKeys */ js.Array[Key]) => value(t0).runNow()))
  
  inline def onHeaderRow(
    value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]
  ): this.type = set("onHeaderRow", js.Any.fromFunction2(value))
  
  inline def onRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]): this.type = set("onRow", js.Any.fromFunction2(value))
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def rowClassName(value: String | RowClassName[RecordType]): this.type = set("rowClassName", value.asInstanceOf[js.Any])
  
  inline def rowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): this.type = set("rowClassName", js.Any.fromFunction3(value))
  
  inline def rowKey(value: String | GetRowKey[RecordType]): this.type = set("rowKey", value.asInstanceOf[js.Any])
  
  inline def rowKeyFunction2(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): this.type = set("rowKey", js.Any.fromFunction2(value))
  
  inline def scroll(value: X): this.type = set("scroll", value.asInstanceOf[js.Any])
  
  inline def showHeader(value: Boolean): this.type = set("showHeader", value.asInstanceOf[js.Any])
  
  inline def sticky(value: Boolean | TableSticky): this.type = set("sticky", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def summary(value: /* data */ js.Array[RecordType] => Node): this.type = set("summary", js.Any.fromFunction1(value))
  
  inline def tableLayout(value: TableLayout): this.type = set("tableLayout", value.asInstanceOf[js.Any])
  
  inline def title(value: /* data */ js.Array[RecordType] => Node): this.type = set("title", js.Any.fromFunction1(value))
  
  inline def transformColumns(value: /* columns */ ColumnsType[RecordType] => ColumnsType[RecordType]): this.type = set("transformColumns", js.Any.fromFunction1(value))
}
