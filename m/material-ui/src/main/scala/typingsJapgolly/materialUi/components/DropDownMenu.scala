package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Menus.DropDownMenuProps
import typingsJapgolly.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsJapgolly.materialUi.MaterialUI.propTypes.origin
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropDownMenu {
  
  @JSImport("material-ui", "DropDownMenu")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.DropDownMenu] {
    
    inline def anchorOrigin(value: origin): this.type = set("anchorOrigin", value.asInstanceOf[js.Any])
    
    inline def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    inline def animation(value: ComponentClassP[PopoverAnimationProps & js.Object]): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def iconButton(value: VdomNode): this.type = set("iconButton", value.rawNode.asInstanceOf[js.Any])
    
    inline def iconButtonNull: this.type = set("iconButton", null)
    
    inline def iconButtonVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("iconButton", js.Array(value*))
    
    inline def iconButtonVdomElement(value: VdomElement): this.type = set("iconButton", value.rawElement.asInstanceOf[js.Any])
    
    inline def iconStyle(value: CSSProperties): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    
    inline def labelStyle(value: CSSProperties): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    inline def listStyle(value: CSSProperties): this.type = set("listStyle", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def menuItemStyle(value: CSSProperties): this.type = set("menuItemStyle", value.asInstanceOf[js.Any])
    
    inline def menuStyle(value: CSSProperties): this.type = set("menuStyle", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], /* index */ Double, /* menuItemValue */ Any) => Callback
    ): this.type = set("onChange", js.Any.fromFunction3((t0: /* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element], t1: /* index */ Double, t2: /* menuItemValue */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def onClose(value: /* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def openImmediately(value: Boolean): this.type = set("openImmediately", value.asInstanceOf[js.Any])
    
    inline def selectedMenuItemStyle(value: CSSProperties): this.type = set("selectedMenuItemStyle", value.asInstanceOf[js.Any])
    
    inline def selectionRenderer(value: (/* value */ Any, /* menuItem */ Any) => Callback): this.type = set("selectionRenderer", js.Any.fromFunction2((t0: /* value */ Any, t1: /* menuItem */ Any) => (value(t0, t1)).runNow()))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def targetOrigin(value: origin): this.type = set("targetOrigin", value.asInstanceOf[js.Any])
    
    inline def underlineStyle(value: CSSProperties): this.type = set("underlineStyle", value.asInstanceOf[js.Any])
    
    inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DropDownMenu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropDownMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
