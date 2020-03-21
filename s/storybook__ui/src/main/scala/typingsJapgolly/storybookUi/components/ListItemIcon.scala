package typingsJapgolly.storybookUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookUi.mod.ListItemIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemIcon {
  def apply(
    icon: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/icon/icon.IconsProps>>['icon'] */ js.Any = null,
    imgSrc: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ListItemIconProps, 
    MountedWithRawType[ListItemIconProps, js.Object, RawMounted[ListItemIconProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (imgSrc != null) __obj.updateDynamic("imgSrc")(imgSrc.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookUi.mod.ListItemIconProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookUi.mod.ListItemIconProps])(children: _*)
  }
  @JSImport("@storybook/ui/dist/components/sidebar/ListItemIcon", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

