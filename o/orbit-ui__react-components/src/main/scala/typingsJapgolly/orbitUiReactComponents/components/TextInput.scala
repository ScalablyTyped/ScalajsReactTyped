package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.MergeWithAs
import typingsJapgolly.orbitUiReactComponents.distTextInputSrcTextInputMod.BoxProps
import typingsJapgolly.orbitUiReactComponents.distTextInputSrcTextInputMod.InnerTextInputProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.email
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.input
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.password
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.search
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.tel
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.text
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.url
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextInput {
  
  @JSImport("@orbit-ui/react-components", "TextInput")
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
    
    inline def button(value: VdomElement): this.type = set("button", value.rawElement.asInstanceOf[js.Any])
    
    inline def `data-testid`(value: String): this.type = set("data-testid", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def focus(value: Boolean): this.type = set("focus", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def hover(value: Boolean): this.type = set("hover", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def onChange(value: ReactEventFrom[Element & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def onValueChange(value: (/* event */ ReactEventFrom[HTMLInputElement], /* value */ String) => Callback): this.type = set("onValueChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[HTMLInputElement], t1: /* value */ String) => (value(t0, t1)).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def `type`(value: text | password | search | url | tel | email): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def validationState(value: valid | invalid): this.type = set("validationState", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
    
    inline def wrapperProps(value: Partial[BoxProps]): this.type = set("wrapperProps", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TextInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MergeWithAs[input, InnerTextInputProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
