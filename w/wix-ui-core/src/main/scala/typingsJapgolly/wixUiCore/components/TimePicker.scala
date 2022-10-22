package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.AmPmOptions
import typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerTimePickerMod.TimePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimePicker {
  
  @JSImport("wix-ui-core/dist/es/src", "TimePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.TimePicker] {
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLElement & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onChange(value: /* value */ String => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[HTMLElement & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tickerDownIcon(value: VdomNode): this.type = set("tickerDownIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def tickerDownIconNull: this.type = set("tickerDownIcon", null)
    
    inline def tickerDownIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("tickerDownIcon", js.Array(value*))
    
    inline def tickerDownIconVdomElement(value: VdomElement): this.type = set("tickerDownIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def tickerUpIcon(value: VdomNode): this.type = set("tickerUpIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def tickerUpIconNull: this.type = set("tickerUpIcon", null)
    
    inline def tickerUpIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("tickerUpIcon", js.Array(value*))
    
    inline def tickerUpIconVdomElement(value: VdomElement): this.type = set("tickerUpIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def useAmPm(value: AmPmOptions): this.type = set("useAmPm", value.asInstanceOf[js.Any])
    
    inline def useNativeInteraction(value: Boolean): this.type = set("useNativeInteraction", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TimePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
