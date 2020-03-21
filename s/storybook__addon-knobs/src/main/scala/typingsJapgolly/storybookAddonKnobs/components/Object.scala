package typingsJapgolly.storybookAddonKnobs.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonKnobs.objectMod.default
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Object {
  def apply[T](
    knob: KnobControlConfig[T],
    onChange: T => CallbackTo[T],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[KnobControlProps[T], default[T], Unit, KnobControlProps[T]] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: T) => onChange(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookAddonKnobs.objectMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps[T]])(children: _*)
  }
  @JSImport("@storybook/addon-knobs/dist/components/types/Object", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

