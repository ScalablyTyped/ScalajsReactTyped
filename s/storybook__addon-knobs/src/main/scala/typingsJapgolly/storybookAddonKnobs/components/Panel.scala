package typingsJapgolly.storybookAddonKnobs.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonKnobs.PickAPIonoffemitgetQueryP
import typingsJapgolly.storybookAddonKnobs.panelMod.KnobPanelProps
import typingsJapgolly.storybookAddonKnobs.panelMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Panel {
  def apply(
    active: Boolean,
    api: PickAPIonoffemitgetQueryP,
    onReset: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[KnobPanelProps, default, Unit, KnobPanelProps] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
  
      if (onReset != null) __obj.updateDynamic("onReset")(onReset.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookAddonKnobs.panelMod.KnobPanelProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookAddonKnobs.panelMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonKnobs.panelMod.KnobPanelProps])(children: _*)
  }
  @JSImport("@storybook/addon-knobs/dist/components/Panel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

