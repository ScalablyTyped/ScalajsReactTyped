package typingsJapgolly.storybookComponents.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookComponents.listItemMod.LinkWrapperType
import typingsJapgolly.storybookComponents.tooltipLinkListMod.TooltipLinkListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TooltipLinkList {
  def apply(
    links: js.Array[typingsJapgolly.storybookComponents.tooltipLinkListMod.Link],
    LinkWrapper: LinkWrapperType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    TooltipLinkListProps, 
    MountedWithRawType[TooltipLinkListProps, js.Object, RawMounted[TooltipLinkListProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
  
      if (LinkWrapper != null) __obj.updateDynamic("LinkWrapper")(LinkWrapper.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookComponents.tooltipLinkListMod.TooltipLinkListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.tooltipLinkListMod.TooltipLinkListProps])(children: _*)
  }
  @JSImport("@storybook/components", "TooltipLinkList")
  @js.native
  object componentImport extends js.Object
  
}

