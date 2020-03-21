package typingsJapgolly.storybookAddonKnobs.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonKnobs.checkboxesMod.CheckboxesTypeKnob
import typingsJapgolly.storybookAddonKnobs.checkboxesMod.CheckboxesTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.checkboxesMod.CheckboxesTypeProps
import typingsJapgolly.storybookAddonKnobs.checkboxesMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Checkboxes {
  def apply(
    isInline: Boolean,
    knob: CheckboxesTypeKnob,
    onChange: CheckboxesTypeKnobValue => CallbackTo[CheckboxesTypeKnobValue],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CheckboxesTypeProps, default, Unit, CheckboxesTypeProps] = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.checkboxesMod.CheckboxesTypeKnobValue) => onChange(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookAddonKnobs.checkboxesMod.CheckboxesTypeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookAddonKnobs.checkboxesMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonKnobs.checkboxesMod.CheckboxesTypeProps])(children: _*)
  }
  @JSImport("@storybook/addon-knobs/dist/components/types/Checkboxes", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

