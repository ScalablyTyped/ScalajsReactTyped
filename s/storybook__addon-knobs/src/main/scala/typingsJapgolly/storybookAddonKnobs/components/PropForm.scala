package typingsJapgolly.storybookAddonKnobs.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import typingsJapgolly.storybookAddonKnobs.propFormMod.PropFormProps
import typingsJapgolly.storybookAddonKnobs.propFormMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PropForm {
  def apply(
    knobs: js.Array[KnobStoreKnob],
    onFieldChange: KnobStoreKnob => Callback,
    onFieldClick: KnobStoreKnob => Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PropFormProps, default, Unit, PropFormProps] = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onFieldChange")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.knobStoreMod.KnobStoreKnob) => onFieldChange(t0).runNow()))
    __obj.updateDynamic("onFieldClick")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.knobStoreMod.KnobStoreKnob) => onFieldClick(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookAddonKnobs.propFormMod.PropFormProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookAddonKnobs.propFormMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonKnobs.propFormMod.PropFormProps])(children: _*)
  }
  @JSImport("@storybook/addon-knobs/dist/components/PropForm", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

