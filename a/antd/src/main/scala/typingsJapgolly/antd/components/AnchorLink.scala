package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libAnchorAnchorLinkMod.AnchorLinkProps
import typingsJapgolly.antd.libAnchorAnchorLinkMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AnchorLink {
  def apply(
    href: String,
    className: String = null,
    prefixCls: String = null,
    target: String = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnchorLinkProps, default, Unit, AnchorLinkProps] = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libAnchorAnchorLinkMod.AnchorLinkProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libAnchorAnchorLinkMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libAnchorAnchorLinkMod.AnchorLinkProps])(children: _*)
  }
  @JSImport("antd/lib/anchor/AnchorLink", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

