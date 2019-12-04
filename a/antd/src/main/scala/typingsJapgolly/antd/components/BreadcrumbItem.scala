package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLSpanElement
import typingsJapgolly.antd.libBreadcrumbBreadcrumbItemMod.BreadcrumbItemProps
import typingsJapgolly.antd.libBreadcrumbBreadcrumbItemMod.default
import typingsJapgolly.antd.libDropdownDropdownMod.OverlayFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BreadcrumbItem {
  def apply(
    href: String = null,
    onClick: ReactMouseEventFrom[(HTMLAnchorElement | HTMLSpanElement) with Element] => Callback = null,
    overlay: Node | OverlayFunc = null,
    prefixCls: String = null,
    separator: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[BreadcrumbItemProps, default, Unit, BreadcrumbItemProps] = {
    val __obj = js.Dynamic.literal()
  
      if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[
  (org.scalajs.dom.raw.HTMLAnchorElement | org.scalajs.dom.raw.HTMLSpanElement) with org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libBreadcrumbBreadcrumbItemMod.BreadcrumbItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libBreadcrumbBreadcrumbItemMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libBreadcrumbBreadcrumbItemMod.BreadcrumbItemProps])(children: _*)
  }
  @JSImport("antd/lib/breadcrumb/BreadcrumbItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

