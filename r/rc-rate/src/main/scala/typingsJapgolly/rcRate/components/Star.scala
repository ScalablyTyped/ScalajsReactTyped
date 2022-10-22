package typingsJapgolly.rcRate.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcRate.esStarMod.StarProps
import typingsJapgolly.rcRate.esStarMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Star {
  
  @JSImport("rc-rate/es/Star", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def allowHalf(value: Boolean): this.type = set("allowHalf", value.asInstanceOf[js.Any])
    
    inline def character(value: Node | (js.Function1[StarProps, Node])): this.type = set("character", value.asInstanceOf[js.Any])
    
    inline def characterFunction1(value: StarProps => Node): this.type = set("character", js.Any.fromFunction1(value))
    
    inline def characterNull: this.type = set("character", null)
    
    inline def characterRender(value: (/* origin */ Element, StarProps) => Node): this.type = set("characterRender", js.Any.fromFunction2(value))
    
    inline def characterVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("character", js.Array(value*))
    
    inline def characterVdomElement(value: VdomElement): this.type = set("character", value.rawElement.asInstanceOf[js.Any])
    
    inline def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
    
    inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    inline def onClick(
      value: (/* e */ ReactMouseEventFrom[HTMLDivElement] | ReactKeyboardEventFrom[HTMLDivElement], /* index */ Double) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLDivElement] | ReactKeyboardEventFrom[HTMLDivElement], t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def onHover(value: (/* e */ ReactMouseEventFrom[HTMLDivElement], /* index */ Double) => Callback): this.type = set("onHover", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLDivElement], t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Star.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
