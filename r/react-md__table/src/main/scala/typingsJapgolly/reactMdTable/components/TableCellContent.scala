package typingsJapgolly.reactMdTable.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdTable.typesConfigMod.TableCellHorizontalAlignment
import typingsJapgolly.reactMdTable.typesTableCellContentMod.SortOrder
import typingsJapgolly.reactMdTable.typesTableCellContentMod.TableCellContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableCellContent {
  
  @JSImport("@react-md/table", "TableCellContent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLButtonElement] {
    
    inline def aboveClassName(value: String): this.type = set("aboveClassName", value.asInstanceOf[js.Any])
    
    inline def afterClassName(value: String): this.type = set("afterClassName", value.asInstanceOf[js.Any])
    
    inline def beforeClassName(value: String): this.type = set("beforeClassName", value.asInstanceOf[js.Any])
    
    inline def belowClassName(value: String): this.type = set("belowClassName", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def flexReverse(value: Boolean): this.type = set("flexReverse", value.asInstanceOf[js.Any])
    
    inline def forceIconWrap(value: Boolean): this.type = set("forceIconWrap", value.asInstanceOf[js.Any])
    
    inline def hAlign(value: TableCellHorizontalAlignment): this.type = set("hAlign", value.asInstanceOf[js.Any])
    
    inline def icon(value: Element | Node): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconAfter(value: Boolean): this.type = set("iconAfter", value.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def rotated(value: Boolean): this.type = set("rotated", value.asInstanceOf[js.Any])
    
    inline def sortOrder(value: SortOrder): this.type = set("sortOrder", value.asInstanceOf[js.Any])
    
    inline def stacked(value: Boolean): this.type = set("stacked", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableCellContent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableCellContentProps & RefAttributes[HTMLButtonElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
