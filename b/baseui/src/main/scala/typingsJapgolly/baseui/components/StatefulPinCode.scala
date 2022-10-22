package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.mini
import typingsJapgolly.baseui.pinCodeTypesMod.ChangeEvent
import typingsJapgolly.baseui.pinCodeTypesMod.PinCodeOverrides
import typingsJapgolly.baseui.pinCodeTypesMod.StateChange
import typingsJapgolly.baseui.pinCodeTypesMod.StatefulPinCodeContainerState
import typingsJapgolly.baseui.pinCodeTypesMod.StatefulPinCodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulPinCode {
  
  inline def apply(
    autoFocus: Boolean,
    disabled: Boolean,
    error: Boolean,
    manageFocus: Boolean,
    mask: Boolean | String,
    overrides: PinCodeOverrides,
    placeholder: String,
    positive: Boolean,
    required: Boolean,
    size: /* keyof baseui.anon.Compact */ mini | default_ | compact | large_,
    values: js.Array[String]
  ): Builder = {
    val __props = js.Dynamic.literal(autoFocus = autoFocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], manageFocus = manageFocus.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StatefulPinCodeProps]))
  }
  
  @JSImport("baseui/pin-code", "StatefulPinCode")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-describedbyNull`: this.type = set("aria-describedby", null)
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelNull`: this.type = set("aria-label", null)
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledbyNull`: this.type = set("aria-labelledby", null)
    
    inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    inline def autoCompleteNull: this.type = set("autoComplete", null)
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def idNull: this.type = set("id", null)
    
    inline def initialState(value: StatefulPinCodeContainerState): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def nameNull: this.type = set("name", null)
    
    inline def onChange(value: /* event */ ChangeEvent => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def stateReducer(
      value: (/* type */ StateChange, /* nextState */ StatefulPinCodeContainerState, /* currentState */ StatefulPinCodeContainerState) => StatefulPinCodeContainerState
    ): this.type = set("stateReducer", js.Any.fromFunction3(value))
  }
  
  def withProps(p: StatefulPinCodeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
