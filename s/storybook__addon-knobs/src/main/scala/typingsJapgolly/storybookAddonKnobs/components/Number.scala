package typingsJapgolly.storybookAddonKnobs.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonKnobs.numberMod.NumberTypeKnob
import typingsJapgolly.storybookAddonKnobs.numberMod.NumberTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.numberMod.NumberTypeProps
import typingsJapgolly.storybookAddonKnobs.numberMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Number {
  def apply(
    knob: NumberTypeKnob,
    onChange: NumberTypeKnobValue | Null => CallbackTo[NumberTypeKnobValue | Null],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NumberTypeProps, default, Unit, NumberTypeProps] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.numberMod.NumberTypeKnobValue | scala.Null) => onChange(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookAddonKnobs.numberMod.NumberTypeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookAddonKnobs.numberMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonKnobs.numberMod.NumberTypeProps])(children: _*)
  }
  @JSImport("@storybook/addon-knobs/dist/components/types/Number", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

