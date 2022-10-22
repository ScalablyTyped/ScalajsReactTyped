package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.baseuiStrings.any
import typingsJapgolly.baseui.inputTypesMod.Adjoined
import typingsJapgolly.baseui.inputTypesMod.BaseInputOverrides
import typingsJapgolly.baseui.inputTypesMod.BaseInputProps
import typingsJapgolly.baseui.inputTypesMod.Size
import typingsJapgolly.csstype.mod.Property.Resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseInput {
  
  inline def apply[T /* <: HTMLInputElement | HTMLTextAreaElement */](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[BaseInputProps[T]]))
  }
  
  @JSImport("baseui/input", "BaseInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: HTMLInputElement | HTMLTextAreaElement */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.inputMod.BaseInput[T]] {
    
    inline def adjoined(value: Adjoined): this.type = set("adjoined", value.asInstanceOf[js.Any])
    
    inline def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `aria-autocomplete`(value: String): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `aria-haspopup`(value: String): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def clearOnEscape(value: Boolean): this.type = set("clearOnEscape", value.asInstanceOf[js.Any])
    
    inline def clearable(value: Boolean): this.type = set("clearable", value.asInstanceOf[js.Any])
    
    inline def `data-baseweb`(value: String): this.type = set("data-baseweb", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inputMode(value: String): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    inline def inputRef(value: RefHandle[T]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* e */ ReactFocusEventFrom[T & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* e */ ReactFocusEventFrom[T & Element]) => value(t0).runNow()))
    
    inline def onChange(value: /* e */ ReactEventFrom[T & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    inline def onClear(value: /* e */ ReactEventFrom[T & Element] => Callback): this.type = set("onClear", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    inline def onFocus(value: /* e */ ReactFocusEventFrom[T & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* e */ ReactFocusEventFrom[T & Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: /* e */ ReactKeyboardEventFrom[T & Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: /* e */ ReactKeyboardEventFrom[T & Element]) => value(t0).runNow()))
    
    inline def onKeyPress(value: /* e */ ReactKeyboardEventFrom[T & Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: /* e */ ReactKeyboardEventFrom[T & Element]) => value(t0).runNow()))
    
    inline def onKeyUp(value: /* e */ ReactKeyboardEventFrom[T & Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: /* e */ ReactKeyboardEventFrom[T & Element]) => value(t0).runNow()))
    
    inline def overrides(value: BaseInputOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def resize(value: Resize): this.type = set("resize", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    inline def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def step(value: Double | any): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make[T /* <: HTMLInputElement | HTMLTextAreaElement */](companion: BaseInput.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T /* <: HTMLInputElement | HTMLTextAreaElement */](p: BaseInputProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
