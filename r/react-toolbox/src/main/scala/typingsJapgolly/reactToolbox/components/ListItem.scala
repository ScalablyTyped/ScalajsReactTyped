package typingsJapgolly.reactToolbox.components

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.reactToolbox.componentsListListItemActionsMod.ListItemActionsTheme
import typingsJapgolly.reactToolbox.componentsListListItemContentMod.ListItemContentTheme
import typingsJapgolly.reactToolbox.componentsListListItemLayoutMod.ListItemLayoutProps
import typingsJapgolly.reactToolbox.componentsListListItemLayoutMod.ListItemLayoutTheme
import typingsJapgolly.reactToolbox.componentsListListItemMod.ListItemProps
import typingsJapgolly.reactToolbox.componentsListListItemMod.ListItemTheme
import typingsJapgolly.reactToolbox.componentsListListItemTextMod.ListItemTextTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItem {
  
  @JSImport("react-toolbox/components/list", "ListItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactToolbox.componentsListMod.ListItem] {
    
    inline def avatar(value: String | Element): this.type = set("avatar", value.asInstanceOf[js.Any])
    
    inline def avatarVdomElement(value: VdomElement): this.type = set("avatar", value.rawElement.asInstanceOf[js.Any])
    
    inline def caption(value: String): this.type = set("caption", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def itemContent(value: ReactChild): this.type = set("itemContent", value.asInstanceOf[js.Any])
    
    inline def itemContentVdomElement(value: VdomElement): this.type = set("itemContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def leftActions(value: js.Array[Node]): this.type = set("leftActions", value.asInstanceOf[js.Any])
    
    inline def leftActionsVarargs(value: Node*): this.type = set("leftActions", js.Array(value*))
    
    inline def leftIcon(value: String | Element): this.type = set("leftIcon", value.asInstanceOf[js.Any])
    
    inline def leftIconVdomElement(value: VdomElement): this.type = set("leftIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def legend(value: String): this.type = set("legend", value.asInstanceOf[js.Any])
    
    inline def onClick(value: js.Function): this.type = set("onClick", value.asInstanceOf[js.Any])
    
    inline def onContextMenu(value: js.Function): this.type = set("onContextMenu", value.asInstanceOf[js.Any])
    
    inline def onDoubleClick(value: js.Function): this.type = set("onDoubleClick", value.asInstanceOf[js.Any])
    
    inline def onDrag(value: js.Function): this.type = set("onDrag", value.asInstanceOf[js.Any])
    
    inline def onDragEnd(value: js.Function): this.type = set("onDragEnd", value.asInstanceOf[js.Any])
    
    inline def onDragEnter(value: js.Function): this.type = set("onDragEnter", value.asInstanceOf[js.Any])
    
    inline def onDragExit(value: js.Function): this.type = set("onDragExit", value.asInstanceOf[js.Any])
    
    inline def onDragLeave(value: js.Function): this.type = set("onDragLeave", value.asInstanceOf[js.Any])
    
    inline def onDragOver(value: js.Function): this.type = set("onDragOver", value.asInstanceOf[js.Any])
    
    inline def onDragStart(value: js.Function): this.type = set("onDragStart", value.asInstanceOf[js.Any])
    
    inline def onDrop(value: js.Function): this.type = set("onDrop", value.asInstanceOf[js.Any])
    
    inline def onMouseDown(value: js.Function): this.type = set("onMouseDown", value.asInstanceOf[js.Any])
    
    inline def onMouseEnter(value: js.Function): this.type = set("onMouseEnter", value.asInstanceOf[js.Any])
    
    inline def onMouseLeave(value: js.Function): this.type = set("onMouseLeave", value.asInstanceOf[js.Any])
    
    inline def onMouseMove(value: js.Function): this.type = set("onMouseMove", value.asInstanceOf[js.Any])
    
    inline def onMouseOut(value: js.Function): this.type = set("onMouseOut", value.asInstanceOf[js.Any])
    
    inline def onMouseOver(value: js.Function): this.type = set("onMouseOver", value.asInstanceOf[js.Any])
    
    inline def onMouseUp(value: js.Function): this.type = set("onMouseUp", value.asInstanceOf[js.Any])
    
    inline def onTouchCancel(value: js.Function): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def onTouchEnd(value: js.Function): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def onTouchMove(value: js.Function): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
    
    inline def onTouchStart(value: js.Function): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    
    inline def rightActions(value: js.Array[Node]): this.type = set("rightActions", value.asInstanceOf[js.Any])
    
    inline def rightActionsVarargs(value: Node*): this.type = set("rightActions", js.Array(value*))
    
    inline def rightIcon(value: String | Element): this.type = set("rightIcon", value.asInstanceOf[js.Any])
    
    inline def rightIconVdomElement(value: VdomElement): this.type = set("rightIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def ripple(value: Boolean): this.type = set("ripple", value.asInstanceOf[js.Any])
    
    inline def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def theme(
      value: ListItemTheme & ListItemActionsTheme & ListItemContentTheme & ListItemLayoutTheme & ListItemTextTheme
    ): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def to(value: String): this.type = set("to", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ListItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListItemProps & ListItemLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
