package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distSwitchSrcSwitchMod.InnerSwitchProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerSwitch {
  
  @JSImport("@orbit-ui/react-components", "InnerSwitch")
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
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def checkedNull: this.type = set("checked", null)
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def focus(value: Boolean): this.type = set("focus", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def hover(value: Boolean): this.type = set("hover", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* event */ ReactEventFrom[HTMLInputElement], /* isChecked */ Boolean) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[HTMLInputElement], t1: /* isChecked */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    inline def size(value: sm | md): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def validationState(value: valid | invalid): this.type = set("validationState", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InnerSwitch.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InnerSwitchProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
