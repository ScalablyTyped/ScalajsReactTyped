package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.antd.esAvatarMod.AvatarProps
import typingsJapgolly.antd.esBreadcrumbBreadcrumbMod.BreadcrumbProps
import typingsJapgolly.antd.esPageDashHeaderMod.PageHeaderProps
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_PageHeaderProps1007206861 () {
  def __component: js.Any
  def apply(
    avatar: AvatarProps = null,
    backIcon: VdomNode = null,
    breadcrumb: BreadcrumbProps = null,
    className: String = null,
    extra: VdomNode = null,
    footer: VdomNode = null,
    ghost: js.UndefOr[Boolean] = js.undefined,
    onBack: /* e */ ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    subTitle: VdomNode = null,
    tags: Element | js.Array[Element] = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    PageHeaderProps, 
    MountedWithRawType[PageHeaderProps, js.Object, RawMounted[PageHeaderProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (backIcon != null) __obj.updateDynamic("backIcon")(backIcon.rawNode.asInstanceOf[js.Any])
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(ghost)) __obj.updateDynamic("ghost")(ghost.asInstanceOf[js.Any])
    if (onBack != null) __obj.updateDynamic("onBack")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onBack(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.rawNode.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antd.esPageDashHeaderMod.PageHeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](__component)
    f(__obj.asInstanceOf[typingsJapgolly.antd.esPageDashHeaderMod.PageHeaderProps])(children: _*)
  }
}

