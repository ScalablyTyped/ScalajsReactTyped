package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.ChildMenuPopover
import typingsJapgolly.baseui.menuMaybeChildMenuMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MaybeChildMenu {
  
  inline def apply(isOpen: Boolean, item: typingsJapgolly.baseui.menuTypesMod.Item, resetParentMenu: Callback): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], resetParentMenu = resetParentMenu.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("baseui/menu/maybe-child-menu", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def getChildMenu(value: /* item */ typingsJapgolly.baseui.menuTypesMod.Item => Node): this.type = set("getChildMenu", js.Any.fromFunction1(value))
    
    inline def getChildMenuNull: this.type = set("getChildMenu", null)
    
    inline def onClick(value: /* event */ ReactMouseEventFrom[Element] => Any): this.type = set("onClick", js.Any.fromFunction1(value))
    
    inline def overrides(value: ChildMenuPopover): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
