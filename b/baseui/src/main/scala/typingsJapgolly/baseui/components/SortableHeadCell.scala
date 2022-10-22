package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.tableTypesMod.HeadCellOverrides
import typingsJapgolly.baseui.tableTypesMod.HeadCellProps
import typingsJapgolly.baseui.tableTypesMod.SortDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SortableHeadCell {
  
  @JSImport("baseui/table", "SortableHeadCell")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def direction(value: SortDirection): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def directionNull: this.type = set("direction", null)
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def fillClickTarget(value: Boolean): this.type = set("fillClickTarget", value.asInstanceOf[js.Any])
    
    inline def onSort(value: CallbackTo[Any]): this.type = set("onSort", value.toJsFn)
    
    inline def overrides(value: HeadCellOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SortableHeadCell.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HeadCellProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
