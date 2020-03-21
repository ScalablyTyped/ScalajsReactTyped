package typingsJapgolly.storybookAddonKnobs.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonKnobs.radioMod.RadiosTypeKnob
import typingsJapgolly.storybookAddonKnobs.radioMod.RadiosTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.radioMod.RadiosTypeProps
import typingsJapgolly.storybookAddonKnobs.radioMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Radio {
  def apply(
    isInline: Boolean,
    knob: RadiosTypeKnob,
    onChange: RadiosTypeKnobValue => CallbackTo[RadiosTypeKnobValue],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RadiosTypeProps, default, Unit, RadiosTypeProps] = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.radioMod.RadiosTypeKnobValue) => onChange(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookAddonKnobs.radioMod.RadiosTypeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookAddonKnobs.radioMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonKnobs.radioMod.RadiosTypeProps])(children: _*)
  }
  @JSImport("@storybook/addon-knobs/dist/components/types/Radio", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

