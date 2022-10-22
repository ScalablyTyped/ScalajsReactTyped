package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.React.Component
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Menus.MenuItemProps
import typingsJapgolly.materialUi.MaterialUI.Menus.MenuProps
import typingsJapgolly.materialUi.MaterialUI.ReactLink
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Menu {
  
  @JSImport("material-ui", "Menu")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.Menu] {
    
    inline def autoWidth(value: Boolean): this.type = set("autoWidth", value.asInstanceOf[js.Any])
    
    inline def desktop(value: Boolean): this.type = set("desktop", value.asInstanceOf[js.Any])
    
    inline def disableAutoFocus(value: Boolean): this.type = set("disableAutoFocus", value.asInstanceOf[js.Any])
    
    inline def initiallyKeyboardFocused(value: Boolean): this.type = set("initiallyKeyboardFocused", value.asInstanceOf[js.Any])
    
    inline def listStyle(value: CSSProperties): this.type = set("listStyle", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* e */ ReactEventFrom[js.Object & Element], /* itemValue */ Any | js.Array[Any]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction2((t0: /* e */ ReactEventFrom[js.Object & Element], t1: /* itemValue */ Any | js.Array[Any]) => (value(t0, t1)).runNow()))
    
    inline def onEscKeyDown(value: ReactKeyboardEventFrom[js.Object & Element] => Callback): this.type = set("onEscKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[js.Object & Element]) => value(t0).runNow()))
    
    inline def onItemClick(
      value: (/* e */ ReactEventFrom[js.Object & Element], Component[MenuItemProps & js.Object, js.Object]) => Callback
    ): this.type = set("onItemClick", js.Any.fromFunction2((t0: /* e */ ReactEventFrom[js.Object & Element], t1: Component[MenuItemProps & js.Object, js.Object]) => (value(t0, t1)).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[js.Object & Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[js.Object & Element]) => value(t0).runNow()))
    
    inline def selectedMenuItemStyle(value: CSSProperties): this.type = set("selectedMenuItemStyle", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def value(value: Any | js.Array[Any]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueLink(value: ReactLink[Any | js.Array[Any]]): this.type = set("valueLink", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: Any*): this.type = set("value", js.Array(value*))
    
    inline def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Menu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
