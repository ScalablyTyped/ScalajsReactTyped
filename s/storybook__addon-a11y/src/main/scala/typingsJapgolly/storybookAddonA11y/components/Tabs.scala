package typingsJapgolly.storybookAddonA11y.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonA11y.AnonItems
import typingsJapgolly.storybookAddonA11y.tabsMod.TabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabs {
  def apply(
    tabs: js.Array[AnonItems],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TabsProps, typingsJapgolly.storybookAddonA11y.tabsMod.Tabs, Unit, TabsProps] = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookAddonA11y.tabsMod.TabsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookAddonA11y.tabsMod.Tabs](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonA11y.tabsMod.TabsProps])(children: _*)
  }
  @JSImport("@storybook/addon-a11y/dist/components/Tabs", "Tabs")
  @js.native
  object componentImport extends js.Object
  
}

