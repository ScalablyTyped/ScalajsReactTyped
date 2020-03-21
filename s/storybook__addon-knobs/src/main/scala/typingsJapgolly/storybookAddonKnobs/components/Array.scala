package typingsJapgolly.storybookAddonKnobs.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonKnobs.arrayMod.ArrayTypeKnob
import typingsJapgolly.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.arrayMod.ArrayTypeProps
import typingsJapgolly.storybookAddonKnobs.arrayMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Array {
  def apply(
    knob: ArrayTypeKnob,
    onChange: ArrayTypeKnobValue => CallbackTo[ArrayTypeKnobValue],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ArrayTypeProps, default, Unit, ArrayTypeProps] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue) => onChange(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookAddonKnobs.arrayMod.ArrayTypeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookAddonKnobs.arrayMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonKnobs.arrayMod.ArrayTypeProps])(children: _*)
  }
  @JSImport("@storybook/addon-knobs/dist/components/types/Array", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

