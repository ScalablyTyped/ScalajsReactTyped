package typingsJapgolly.rcTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcTable.libInterfaceMod.AlignType
import typingsJapgolly.rcTable.libInterfaceMod.CellEllipsisType
import typingsJapgolly.rcTable.libInterfaceMod.DataIndex
import typingsJapgolly.rcTable.libInterfaceMod.FixedType
import typingsJapgolly.rcTable.libInterfaceMod.RenderedCell
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.TdHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ColumnGroupProps_1147588062[RecordType] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
  
  inline def dataIndex(value: DataIndex): this.type = set("dataIndex", value.asInstanceOf[js.Any])
  
  inline def dataIndexVarargs(value: (String | Double)*): this.type = set("dataIndex", js.Array(value*))
  
  inline def ellipsis(value: CellEllipsisType): this.type = set("ellipsis", value.asInstanceOf[js.Any])
  
  inline def fixed(value: FixedType): this.type = set("fixed", value.asInstanceOf[js.Any])
  
  inline def onCell(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]): this.type = set("onCell", js.Any.fromFunction2(value))
  
  inline def onCellClick(value: (RecordType, /* e */ ReactMouseEventFrom[HTMLElement]) => Callback): this.type = set("onCellClick", js.Any.fromFunction2((t0: RecordType, t1: /* e */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
  
  inline def onHeaderCell(
    value: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]
  ): this.type = set("onHeaderCell", js.Any.fromFunction2(value))
  
  inline def render(value: (/* value */ Any, RecordType, /* index */ Double) => Node | RenderedCell[RecordType]): this.type = set("render", js.Any.fromFunction3(value))
  
  inline def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
  
  inline def shouldCellUpdate(value: (RecordType, RecordType) => Boolean): this.type = set("shouldCellUpdate", js.Any.fromFunction2(value))
  
  inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
  
  inline def titleNull: this.type = set("title", null)
  
  inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
  
  inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  
  inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
}
