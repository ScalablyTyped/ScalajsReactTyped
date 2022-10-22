package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distNumberInputSrcNumberInputMod.BoxProps
import typingsJapgolly.orbitUiReactComponents.distNumberInputSrcNumberInputMod.InnerNumberInputProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.MergeWithAs
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NumberInput {
  
  @JSImport("@orbit-ui/react-components", "NumberInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean | Double): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def `data-testid`(value: String): this.type = set("data-testid", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def focus(value: Boolean): this.type = set("focus", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def hover(value: Boolean): this.type = set("hover", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[Element & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def onChange(value: ReactEventFrom[Element & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[Element & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def onValueChange(value: (/* event */ ReactEventFrom[Element], /* value */ Double) => Callback): this.type = set("onValueChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* value */ Double) => (value(t0, t1)).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def validationState(value: valid | invalid): this.type = set("validationState", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
    
    inline def wrapperProps(value: Partial[BoxProps]): this.type = set("wrapperProps", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NumberInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MergeWithAs[HTMLElement, InnerNumberInputProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
