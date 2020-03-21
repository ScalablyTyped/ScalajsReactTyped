package typingsJapgolly.storybookAddonKnobs.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonKnobs.dateMod.DateTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.dateMod.default
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Date {
  def apply(
    knob: KnobControlConfig[DateTypeKnobValue],
    onChange: DateTypeKnobValue => CallbackTo[DateTypeKnobValue],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    KnobControlProps[DateTypeKnobValue], 
    default, 
    Unit, 
    KnobControlProps[DateTypeKnobValue]
  ] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.dateMod.DateTypeKnobValue) => onChange(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps[typingsJapgolly.storybookAddonKnobs.dateMod.DateTypeKnobValue], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookAddonKnobs.dateMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps[typingsJapgolly.storybookAddonKnobs.dateMod.DateTypeKnobValue]])(children: _*)
  }
  @JSImport("@storybook/addon-knobs/dist/components/types/Date", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

