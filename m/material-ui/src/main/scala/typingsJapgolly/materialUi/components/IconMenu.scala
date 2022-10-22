package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Menus.IconMenuProps
import typingsJapgolly.materialUi.MaterialUI.Menus.MenuItemProps
import typingsJapgolly.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsJapgolly.materialUi.MaterialUI.propTypes.origin
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconMenu {
  
  inline def apply(iconButtonElement: VdomElement): Builder = {
    val __props = js.Dynamic.literal(iconButtonElement = iconButtonElement.rawElement.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IconMenuProps]))
  }
  
  @JSImport("material-ui", "IconMenu")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.IconMenu] {
    
    inline def anchorOrigin(value: origin): this.type = set("anchorOrigin", value.asInstanceOf[js.Any])
    
    inline def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    inline def animation(value: ComponentClassP[PopoverAnimationProps & js.Object]): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def autoWidth(value: Boolean): this.type = set("autoWidth", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clickCloseDelay(value: Double): this.type = set("clickCloseDelay", value.asInstanceOf[js.Any])
    
    inline def desktop(value: Boolean): this.type = set("desktop", value.asInstanceOf[js.Any])
    
    inline def disableAutoFocus(value: Boolean): this.type = set("disableAutoFocus", value.asInstanceOf[js.Any])
    
    inline def iconStyle(value: CSSProperties): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    
    inline def initiallyKeyboardFocused(value: Boolean): this.type = set("initiallyKeyboardFocused", value.asInstanceOf[js.Any])
    
    inline def listStyle(value: CSSProperties): this.type = set("listStyle", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def menuStyle(value: CSSProperties): this.type = set("menuStyle", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* e */ ReactEventFrom[js.Object & Element], /* itemValue */ Any | js.Array[Any]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction2((t0: /* e */ ReactEventFrom[js.Object & Element], t1: /* itemValue */ Any | js.Array[Any]) => (value(t0, t1)).runNow()))
    
    inline def onClick(value: /* e */ ReactEventFrom[js.Object & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[js.Object & Element]) => value(t0).runNow()))
    
    inline def onItemClick(
      value: (/* e */ ReactEventFrom[js.Object & Element], Component[MenuItemProps & js.Object, js.Object]) => Callback
    ): this.type = set("onItemClick", js.Any.fromFunction2((t0: /* e */ ReactEventFrom[js.Object & Element], t1: Component[MenuItemProps & js.Object, js.Object]) => (value(t0, t1)).runNow()))
    
    inline def onKeyboardFocus(
      value: (/* e */ ReactFocusEventFrom[js.Object & Element], /* isKeyboardFocused */ Boolean) => Callback
    ): this.type = set("onKeyboardFocus", js.Any.fromFunction2((t0: /* e */ ReactFocusEventFrom[js.Object & Element], t1: /* isKeyboardFocused */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def onMouseDown(value: ReactMouseEventFrom[js.Object & Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & Element]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: ReactMouseEventFrom[js.Object & Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[js.Object & Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & Element]) => value(t0).runNow()))
    
    inline def onMouseUp(value: ReactMouseEventFrom[js.Object & Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & Element]) => value(t0).runNow()))
    
    inline def onRequestChange(value: (/* opening */ Boolean, /* reason */ String) => Callback): this.type = set("onRequestChange", js.Any.fromFunction2((t0: /* opening */ Boolean, t1: /* reason */ String) => (value(t0, t1)).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def targetOrigin(value: origin): this.type = set("targetOrigin", value.asInstanceOf[js.Any])
    
    inline def useLayerForClickAway(value: Boolean): this.type = set("useLayerForClickAway", value.asInstanceOf[js.Any])
    
    inline def value(value: Any | js.Array[Any]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: Any*): this.type = set("value", js.Array(value*))
  }
  
  def withProps(p: IconMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
