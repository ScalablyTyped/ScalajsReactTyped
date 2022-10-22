package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libSwitchMod.SwitchProps
import typingsJapgolly.antd.libSwitchMod.SwitchSize
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Switch {
  
  @JSImport("antd", "Switch")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLElement] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def checkedChildren(value: VdomNode): this.type = set("checkedChildren", value.rawNode.asInstanceOf[js.Any])
    
    inline def checkedChildrenNull: this.type = set("checkedChildren", null)
    
    inline def checkedChildrenVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("checkedChildren", js.Array(value*))
    
    inline def checkedChildrenVdomElement(value: VdomElement): this.type = set("checkedChildren", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* checked */ Boolean, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* checked */ Boolean, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
    
    inline def onClick(value: (/* checked */ Boolean, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* checked */ Boolean, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def size(value: SwitchSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def unCheckedChildren(value: VdomNode): this.type = set("unCheckedChildren", value.rawNode.asInstanceOf[js.Any])
    
    inline def unCheckedChildrenNull: this.type = set("unCheckedChildren", null)
    
    inline def unCheckedChildrenVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("unCheckedChildren", js.Array(value*))
    
    inline def unCheckedChildrenVdomElement(value: VdomElement): this.type = set("unCheckedChildren", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Switch.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwitchProps & RefAttributes[HTMLElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
