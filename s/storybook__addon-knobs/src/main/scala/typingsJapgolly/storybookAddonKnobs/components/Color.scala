package typingsJapgolly.storybookAddonKnobs.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonKnobs.colorMod.ColorTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.colorMod.default
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Color {
  def apply(
    knob: KnobControlConfig[ColorTypeKnobValue],
    onChange: ColorTypeKnobValue => CallbackTo[ColorTypeKnobValue],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    KnobControlProps[ColorTypeKnobValue], 
    default, 
    Unit, 
    KnobControlProps[ColorTypeKnobValue]
  ] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.colorMod.ColorTypeKnobValue) => onChange(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps[typingsJapgolly.storybookAddonKnobs.colorMod.ColorTypeKnobValue], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookAddonKnobs.colorMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps[typingsJapgolly.storybookAddonKnobs.colorMod.ColorTypeKnobValue]])(children: _*)
  }
  @JSImport("@storybook/addon-knobs/dist/components/types/Color", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

