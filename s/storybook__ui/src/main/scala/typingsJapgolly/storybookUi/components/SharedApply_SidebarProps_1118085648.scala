package typingsJapgolly.storybookUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookUi.sidebarMod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_SidebarProps_1118085648 () {
  val componentImport: js.Any
  def apply(
    menu: js.Array[_],
    stories: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['StoriesHash'] */ js.Any,
    loading: js.UndefOr[Boolean] = js.undefined,
    menuHighlighted: js.UndefOr[Boolean] = js.undefined,
    storyId: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    SidebarProps, 
    MountedWithRawType[SidebarProps, js.Object, RawMounted[SidebarProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
  
      if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(menuHighlighted)) __obj.updateDynamic("menuHighlighted")(menuHighlighted.asInstanceOf[js.Any])
    if (storyId != null) __obj.updateDynamic("storyId")(storyId.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookUi.sidebarMod.SidebarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookUi.sidebarMod.SidebarProps])(children: _*)
  }
}

