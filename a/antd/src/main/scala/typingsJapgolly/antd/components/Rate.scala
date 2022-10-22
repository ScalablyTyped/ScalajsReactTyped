package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libRateMod.RateProps
import typingsJapgolly.rcRate.esStarMod.StarProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rate {
  
  @JSImport("antd", "Rate")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
    
    inline def allowHalf(value: Boolean): this.type = set("allowHalf", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def character(
      value: japgolly.scalajs.react.facade.React.Node | (js.Function1[/* props */ StarProps, japgolly.scalajs.react.facade.React.Node])
    ): this.type = set("character", value.asInstanceOf[js.Any])
    
    inline def characterFunction1(value: /* props */ StarProps => japgolly.scalajs.react.facade.React.Node): this.type = set("character", js.Any.fromFunction1(value))
    
    inline def characterNull: this.type = set("character", null)
    
    inline def characterRender(
      value: (/* origin */ japgolly.scalajs.react.facade.React.Element, /* props */ StarProps) => japgolly.scalajs.react.facade.React.Node
    ): this.type = set("characterRender", js.Any.fromFunction2(value))
    
    inline def characterVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("character", js.Array(value*))
    
    inline def characterVdomElement(value: VdomElement): this.type = set("character", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def direction(value: String): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: Callback): this.type = set("onBlur", value.toJsFn)
    
    inline def onChange(value: /* value */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def onFocus(value: Callback): this.type = set("onFocus", value.toJsFn)
    
    inline def onHoverChange(value: /* value */ Double => Callback): this.type = set("onHoverChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def tooltips(value: js.Array[String]): this.type = set("tooltips", value.asInstanceOf[js.Any])
    
    inline def tooltipsVarargs(value: String*): this.type = set("tooltips", js.Array(value*))
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Rate.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RateProps & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
