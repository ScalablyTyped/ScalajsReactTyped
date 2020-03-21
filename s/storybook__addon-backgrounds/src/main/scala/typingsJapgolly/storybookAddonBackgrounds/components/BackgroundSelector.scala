package typingsJapgolly.storybookAddonBackgrounds.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonBackgrounds.backgroundSelectorMod.Props
import typingsJapgolly.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BackgroundSelector {
  def apply(
    api: API,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    Props, 
    typingsJapgolly.storybookAddonBackgrounds.backgroundSelectorMod.BackgroundSelector, 
    Unit, 
    Props
  ] = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookAddonBackgrounds.backgroundSelectorMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookAddonBackgrounds.backgroundSelectorMod.BackgroundSelector](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonBackgrounds.backgroundSelectorMod.Props])(children: _*)
  }
  @JSImport("@storybook/addon-backgrounds/dist/containers/BackgroundSelector", "BackgroundSelector")
  @js.native
  object componentImport extends js.Object
  
}

