package typingsJapgolly.storybookUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookUi.sidebarHeadingMod.SidebarHeadingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SidebarHeading {
  def apply(
    menu: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/tooltip/TooltipLinkList.TooltipLinkListProps>>['links'] */ js.Any,
    className: String = null,
    menuHighlighted: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    SidebarHeadingProps, 
    MountedWithRawType[SidebarHeadingProps, js.Object, RawMounted[SidebarHeadingProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(menuHighlighted)) __obj.updateDynamic("menuHighlighted")(menuHighlighted.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookUi.sidebarHeadingMod.SidebarHeadingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookUi.sidebarHeadingMod.SidebarHeadingProps])(children: _*)
  }
  @JSImport("@storybook/ui/dist/components/sidebar/SidebarHeading", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

