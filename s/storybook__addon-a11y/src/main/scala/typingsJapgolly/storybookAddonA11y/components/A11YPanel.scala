package typingsJapgolly.storybookAddonA11y.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonA11y.a11YPanelMod.A11YPanelProps
import typingsJapgolly.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object A11YPanel {
  def apply(
    active: Boolean,
    api: API,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    A11YPanelProps, 
    typingsJapgolly.storybookAddonA11y.a11YPanelMod.A11YPanel, 
    Unit, 
    A11YPanelProps
  ] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookAddonA11y.a11YPanelMod.A11YPanelProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookAddonA11y.a11YPanelMod.A11YPanel](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonA11y.a11YPanelMod.A11YPanelProps])(children: _*)
  }
  @JSImport("@storybook/addon-a11y/dist/components/A11YPanel", "A11YPanel")
  @js.native
  object componentImport extends js.Object
  
}

