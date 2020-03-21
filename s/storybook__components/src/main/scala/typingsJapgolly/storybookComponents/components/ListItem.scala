package typingsJapgolly.storybookComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookComponents.listItemMod.LinkWrapperType
import typingsJapgolly.storybookComponents.listItemMod.ListItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItem {
  def apply(
    LinkWrapper: LinkWrapperType = null,
    active: js.UndefOr[Boolean] = js.undefined,
    center: VdomNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    href: String | js.Object = null,
    left: VdomNode = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    onClick: js.UndefOr[Callback] = js.undefined,
    right: VdomNode = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ListItemProps, 
    MountedWithRawType[ListItemProps, js.Object, RawMounted[ListItemProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (LinkWrapper != null) __obj.updateDynamic("LinkWrapper")(LinkWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    if (right != null) __obj.updateDynamic("right")(right.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookComponents.listItemMod.ListItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.listItemMod.ListItemProps])(children: _*)
  }
  @JSImport("@storybook/components/dist/tooltip/ListItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

