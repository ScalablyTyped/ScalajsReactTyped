package typingsJapgolly.reactMdTable.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLTableCellElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdTable.reactMdTableStrings.`100Percentsign`
import typingsJapgolly.reactMdTable.reactMdTableStrings.`header-cell`
import typingsJapgolly.reactMdTable.reactMdTableStrings.cell
import typingsJapgolly.reactMdTable.reactMdTableStrings.col
import typingsJapgolly.reactMdTable.reactMdTableStrings.colgroup
import typingsJapgolly.reactMdTable.reactMdTableStrings.header
import typingsJapgolly.reactMdTable.reactMdTableStrings.padded
import typingsJapgolly.reactMdTable.reactMdTableStrings.row
import typingsJapgolly.reactMdTable.reactMdTableStrings.rowgroup
import typingsJapgolly.reactMdTable.typesConfigMod.TableCellHorizontalAlignment
import typingsJapgolly.reactMdTable.typesConfigMod.TableCellVerticalAlignment
import typingsJapgolly.reactMdTable.typesTableCellContentMod.SortOrder
import typingsJapgolly.reactMdTable.typesTableCellMod.TableCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableCell {
  
  @JSImport("@react-md/table", "TableCell")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLTableCellElement] {
    
    inline def `aria-sort`(value: SortOrder): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    inline def colSpan(value: Double | `100Percentsign`): this.type = set("colSpan", value.asInstanceOf[js.Any])
    
    inline def disablePadding(value: Boolean): this.type = set("disablePadding", value.asInstanceOf[js.Any])
    
    inline def grow(value: Boolean): this.type = set("grow", value.asInstanceOf[js.Any])
    
    inline def hAlign(value: TableCellHorizontalAlignment): this.type = set("hAlign", value.asInstanceOf[js.Any])
    
    inline def header(value: Boolean): this.type = set("header", value.asInstanceOf[js.Any])
    
    inline def lineWrap(value: Boolean | padded): this.type = set("lineWrap", value.asInstanceOf[js.Any])
    
    inline def scope(value: row | col | rowgroup | colgroup): this.type = set("scope", value.asInstanceOf[js.Any])
    
    inline def sortIcon(value: VdomNode): this.type = set("sortIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def sortIconAfter(value: Boolean): this.type = set("sortIconAfter", value.asInstanceOf[js.Any])
    
    inline def sortIconNull: this.type = set("sortIcon", null)
    
    inline def sortIconRotated(value: Boolean): this.type = set("sortIconRotated", value.asInstanceOf[js.Any])
    
    inline def sortIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sortIcon", js.Array(value*))
    
    inline def sortIconVdomElement(value: VdomElement): this.type = set("sortIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def sticky(value: Boolean | header | cell | `header-cell`): this.type = set("sticky", value.asInstanceOf[js.Any])
    
    inline def vAlign(value: TableCellVerticalAlignment): this.type = set("vAlign", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableCell.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableCellProps & RefAttributes[HTMLTableCellElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
