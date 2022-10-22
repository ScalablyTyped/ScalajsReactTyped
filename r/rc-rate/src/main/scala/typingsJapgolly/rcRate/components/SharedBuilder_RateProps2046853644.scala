package typingsJapgolly.rcRate.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcRate.esStarMod.StarProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_RateProps2046853644[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
  
  inline def allowHalf(value: Boolean): this.type = set("allowHalf", value.asInstanceOf[js.Any])
  
  inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  inline def character(value: Node | (js.Function1[/* props */ StarProps, Node])): this.type = set("character", value.asInstanceOf[js.Any])
  
  inline def characterFunction1(value: /* props */ StarProps => Node): this.type = set("character", js.Any.fromFunction1(value))
  
  inline def characterNull: this.type = set("character", null)
  
  inline def characterRender(value: (/* origin */ Element, /* props */ StarProps) => Node): this.type = set("characterRender", js.Any.fromFunction2(value))
  
  inline def characterVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("character", js.Array(value*))
  
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
  
  inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
}
