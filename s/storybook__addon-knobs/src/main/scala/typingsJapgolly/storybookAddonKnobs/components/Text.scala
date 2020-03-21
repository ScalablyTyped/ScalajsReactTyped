package typingsJapgolly.storybookAddonKnobs.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonKnobs.textMod.TextTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.textMod.default
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Text {
  def apply(
    knob: KnobControlConfig[TextTypeKnobValue],
    onChange: TextTypeKnobValue => CallbackTo[TextTypeKnobValue],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    KnobControlProps[TextTypeKnobValue], 
    default, 
    Unit, 
    KnobControlProps[TextTypeKnobValue]
  ] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.textMod.TextTypeKnobValue) => onChange(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps[typingsJapgolly.storybookAddonKnobs.textMod.TextTypeKnobValue], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookAddonKnobs.textMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps[typingsJapgolly.storybookAddonKnobs.textMod.TextTypeKnobValue]])(children: _*)
  }
  @JSImport("@storybook/addon-knobs/dist/components/types/Text", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

