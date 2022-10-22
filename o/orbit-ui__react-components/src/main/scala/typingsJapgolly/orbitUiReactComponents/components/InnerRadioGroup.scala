package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distRadioSrcRadioGroupMod.InnerRadioGroupProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`0`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`10`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`11`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`12`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`13`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`1`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`2`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`3`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`4`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`5`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`6`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`7`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`8`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsInts.`9`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerRadioGroup {
  
  @JSImport("@orbit-ui/react-components", "InnerRadioGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean | Double): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def gap(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
    ): this.type = set("gap", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* event */ ReactEventFrom[Element], /* value */ String) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* value */ String) => (value(t0, t1)).runNow()))
    
    inline def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    inline def validationState(value: valid | invalid): this.type = set("validationState", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
    
    inline def wrap(value: Boolean): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InnerRadioGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InnerRadioGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
