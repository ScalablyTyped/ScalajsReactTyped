package typingsJapgolly.rmcInputNumber.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rmcInputNumber.mod.PropsType
import typingsJapgolly.rmcInputNumber.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RmcInputNumber {
  
  @JSImport("rmc-input-number", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def className(value: Any): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def downHandler(value: VdomNode): this.type = set("downHandler", value.rawNode.asInstanceOf[js.Any])
    
    inline def downHandlerNull: this.type = set("downHandler", null)
    
    inline def downHandlerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("downHandler", js.Array(value*))
    
    inline def downHandlerVdomElement(value: VdomElement): this.type = set("downHandler", value.rawElement.asInstanceOf[js.Any])
    
    inline def focusOnUpDown(value: Boolean): this.type = set("focusOnUpDown", value.asInstanceOf[js.Any])
    
    inline def formatter(value: /* v */ Any => Callback): this.type = set("formatter", js.Any.fromFunction1((t0: /* v */ Any) => value(t0).runNow()))
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* e */ Any => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
    
    inline def onChange(value: /* e */ Any => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
    
    inline def onFocus(value: /* e */ js.UndefOr[Any] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def parser(value: /* v */ Any => Callback): this.type = set("parser", js.Any.fromFunction1((t0: /* v */ Any) => value(t0).runNow()))
    
    inline def precision(value: Double): this.type = set("precision", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def step(value: String | Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def upHandler(value: VdomNode): this.type = set("upHandler", value.rawNode.asInstanceOf[js.Any])
    
    inline def upHandlerNull: this.type = set("upHandler", null)
    
    inline def upHandlerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("upHandler", js.Array(value*))
    
    inline def upHandlerVdomElement(value: VdomElement): this.type = set("upHandler", value.rawElement.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RmcInputNumber.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsType): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
