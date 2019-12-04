package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libSkeletonAvatarMod.SkeletonAvatarProps
import typingsJapgolly.antd.libSkeletonMod.SkeletonProps
import typingsJapgolly.antd.libSkeletonMod.default
import typingsJapgolly.antd.libSkeletonParagraphMod.SkeletonParagraphProps
import typingsJapgolly.antd.libSkeletonTitleMod.SkeletonTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Skeleton {
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    avatar: SkeletonAvatarProps | Boolean = null,
    className: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    paragraph: SkeletonParagraphProps | Boolean = null,
    prefixCls: String = null,
    title: SkeletonTitleProps | Boolean = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SkeletonProps, default, Unit, SkeletonProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libSkeletonMod.SkeletonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libSkeletonMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libSkeletonMod.SkeletonProps])(children: _*)
  }
  @JSImport("antd/lib/skeleton", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

