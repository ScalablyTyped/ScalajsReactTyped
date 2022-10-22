package typingsJapgolly.rcTable.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLTableCellElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcTable.libCellMod.CellProps
import typingsJapgolly.rcTable.libInterfaceMod.AlignType
import typingsJapgolly.rcTable.libInterfaceMod.CellEllipsisType
import typingsJapgolly.rcTable.libInterfaceMod.CustomizeComponent
import typingsJapgolly.rcTable.libInterfaceMod.DataIndex
import typingsJapgolly.rcTable.libInterfaceMod.RenderedCell
import typingsJapgolly.rcTable.rcTableBooleans.`false`
import typingsJapgolly.rcTable.rcTableStrings.body
import typingsJapgolly.rcTable.rcTableStrings.footer
import typingsJapgolly.rcTable.rcTableStrings.header
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.TdHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cell {
  
  @JSImport("rc-table/lib/Cell", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def additionalProps(value: TdHTMLAttributes[HTMLTableCellElement]): this.type = set("additionalProps", value.asInstanceOf[js.Any])
    
    inline def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def allColsFixedLeft(value: Boolean): this.type = set("allColsFixedLeft", value.asInstanceOf[js.Any])
    
    inline def appendNode(value: VdomNode): this.type = set("appendNode", value.rawNode.asInstanceOf[js.Any])
    
    inline def appendNodeNull: this.type = set("appendNode", null)
    
    inline def appendNodeVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("appendNode", js.Array(value*))
    
    inline def appendNodeVdomElement(value: VdomElement): this.type = set("appendNode", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
    
    inline def component(value: CustomizeComponent): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def dataIndex(value: DataIndex): this.type = set("dataIndex", value.asInstanceOf[js.Any])
    
    inline def dataIndexVarargs(value: (String | Double)*): this.type = set("dataIndex", js.Array(value*))
    
    inline def ellipsis(value: CellEllipsisType): this.type = set("ellipsis", value.asInstanceOf[js.Any])
    
    inline def expanded(value: Boolean): this.type = set("expanded", value.asInstanceOf[js.Any])
    
    inline def firstFixLeft(value: Boolean): this.type = set("firstFixLeft", value.asInstanceOf[js.Any])
    
    inline def firstFixRight(value: Boolean): this.type = set("firstFixRight", value.asInstanceOf[js.Any])
    
    inline def fixLeft(value: Double | `false`): this.type = set("fixLeft", value.asInstanceOf[js.Any])
    
    inline def fixRight(value: Double | `false`): this.type = set("fixRight", value.asInstanceOf[js.Any])
    
    inline def hovering(value: Boolean): this.type = set("hovering", value.asInstanceOf[js.Any])
    
    inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    inline def isSticky(value: Boolean): this.type = set("isSticky", value.asInstanceOf[js.Any])
    
    inline def lastFixLeft(value: Boolean): this.type = set("lastFixLeft", value.asInstanceOf[js.Any])
    
    inline def lastFixRight(value: Boolean): this.type = set("lastFixRight", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def record(value: Any): this.type = set("record", value.asInstanceOf[js.Any])
    
    inline def render(value: (/* value */ Any, Any, /* index */ Double) => Node | RenderedCell[Any]): this.type = set("render", js.Any.fromFunction3(value))
    
    inline def renderIndex(value: Double): this.type = set("renderIndex", value.asInstanceOf[js.Any])
    
    inline def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
    
    inline def rowType(value: header | body | footer): this.type = set("rowType", value.asInstanceOf[js.Any])
    
    inline def shouldCellUpdate(value: (Any, Any) => Boolean): this.type = set("shouldCellUpdate", js.Any.fromFunction2(value))
  }
  
  implicit def make(companion: Cell.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CellProps[Any] & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
