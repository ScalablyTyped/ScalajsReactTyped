package typingsJapgolly.antd.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.antdStrings.circle
import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.large
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.antd.antdStrings.square
import typingsJapgolly.antd.avatarMod.AvatarProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Avatar {
  def apply(
    alt: String = null,
    className: String = null,
    icon: VdomNode = null,
    onError: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    prefixCls: String = null,
    shape: circle | square = null,
    size: large | small | default | Double = null,
    src: String = null,
    srcSet: String = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AvatarProps, typingsJapgolly.antd.avatarMod.default, Unit, AvatarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    onError.foreach(p => __obj.updateDynamic("onError")(p.toJsFn))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.avatarMod.AvatarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.avatarMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.avatarMod.AvatarProps])(children: _*)
  }
  @JSImport("antd/lib/avatar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

