package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Tabs.TabProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tab {
  
  @JSImport("material-ui", "Tab")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.Tab] {
    
    inline def buttonStyle(value: CSSProperties): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
    
    inline def centerRipple(value: Boolean): this.type = set("centerRipple", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def containerElement(value: Node | String): this.type = set("containerElement", value.asInstanceOf[js.Any])
    
    inline def containerElementNull: this.type = set("containerElement", null)
    
    inline def containerElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("containerElement", js.Array(value*))
    
    inline def containerElementVdomElement(value: VdomElement): this.type = set("containerElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def disableFocusRipple(value: Boolean): this.type = set("disableFocusRipple", value.asInstanceOf[js.Any])
    
    inline def disableKeyboardFocus(value: Boolean): this.type = set("disableKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def disableTouchRipple(value: Boolean): this.type = set("disableTouchRipple", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def focusRippleColor(value: String): this.type = set("focusRippleColor", value.asInstanceOf[js.Any])
    
    inline def focusRippleOpacity(value: Double): this.type = set("focusRippleOpacity", value.asInstanceOf[js.Any])
    
    inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomNode): this.type = set("icon", value.rawNode.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def keyboardFocused(value: Boolean): this.type = set("keyboardFocused", value.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def onActive(value: Component[TabProps & js.Object, js.Object] => Callback): this.type = set("onActive", js.Any.fromFunction1((t0: Component[TabProps & js.Object, js.Object]) => value(t0).runNow()))
    
    inline def onBlur(value: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onClick(value: ReactMouseEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyUp(value: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyboardFocus(
      value: (/* e */ ReactFocusEventFrom[js.Object & org.scalajs.dom.Element], /* isKeyboardFocused */ Boolean) => Callback
    ): this.type = set("onKeyboardFocus", js.Any.fromFunction2((t0: /* e */ ReactFocusEventFrom[js.Object & org.scalajs.dom.Element], t1: /* isKeyboardFocused */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def touchRippleColor(value: String): this.type = set("touchRippleColor", value.asInstanceOf[js.Any])
    
    inline def touchRippleOpacity(value: Double): this.type = set("touchRippleOpacity", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tab.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
