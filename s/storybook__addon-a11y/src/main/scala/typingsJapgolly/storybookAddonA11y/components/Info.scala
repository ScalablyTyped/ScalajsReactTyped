package typingsJapgolly.storybookAddonA11y.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.axeCore.mod.Result
import typingsJapgolly.storybookAddonA11y.infoMod.InfoProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Info {
  def apply(
    item: Result,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    InfoProps, 
    MountedWithRawType[InfoProps, js.Object, RawMounted[InfoProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookAddonA11y.infoMod.InfoProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonA11y.infoMod.InfoProps])(children: _*)
  }
  @JSImport("@storybook/addon-a11y/dist/components/Report/Info", "Info")
  @js.native
  object componentImport extends js.Object
  
}

