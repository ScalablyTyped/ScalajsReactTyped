package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.menuTypesMod.OptionListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OptionList {
  
  inline def apply(
    getItemLabel: /* item */ typingsJapgolly.baseui.menuTypesMod.Item => Node,
    item: typingsJapgolly.baseui.menuTypesMod.Item
  ): Builder = {
    val __props = js.Dynamic.literal(getItemLabel = js.Any.fromFunction1(getItemLabel), item = item.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OptionListProps]))
  }
  
  @JSImport("baseui/menu", "OptionList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $disabled(value: Boolean): this.type = set("$disabled", value.asInstanceOf[js.Any])
    
    inline def $isFocused(value: Boolean): this.type = set("$isFocused", value.asInstanceOf[js.Any])
    
    inline def $isHighlighted(value: Boolean): this.type = set("$isHighlighted", value.asInstanceOf[js.Any])
    
    inline def `aria-disabled`(value: Boolean): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `aria-selected`(value: Boolean): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    inline def getChildMenu(value: /* item */ typingsJapgolly.baseui.menuTypesMod.Item => Node): this.type = set("getChildMenu", js.Any.fromFunction1(value))
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* event */ ReactMouseEventFrom[Element] => Any): this.type = set("onClick", js.Any.fromFunction1(value))
    
    inline def onMouseDown(value: /* event */ ReactMouseEventFrom[Element] => Any): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    inline def onMouseEnter(value: /* event */ ReactMouseEventFrom[Element] => Any): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    inline def overrides(value: typingsJapgolly.baseui.anon.ListItem): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
    
    inline def renderHrefAsAnchor(value: Boolean): this.type = set("renderHrefAsAnchor", value.asInstanceOf[js.Any])
    
    inline def resetMenu(value: Callback): this.type = set("resetMenu", value.toJsFn)
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def size(value: default_ | compact): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OptionListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
