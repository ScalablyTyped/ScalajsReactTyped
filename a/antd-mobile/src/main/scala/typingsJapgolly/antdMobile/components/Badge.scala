package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.antdMobileStrings.large
import typingsJapgolly.antdMobile.antdMobileStrings.small
import typingsJapgolly.antdMobile.badgeMod.BadgeProps
import typingsJapgolly.antdMobile.badgeMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Badge {
  def apply(
    className: String = null,
    corner: js.UndefOr[Boolean] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
    hot: js.UndefOr[Boolean] = js.undefined,
    overflowCount: Int | Double = null,
    prefixCls: String = null,
    size: large | small = null,
    style: CSSProperties = null,
    text: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[BadgeProps, default, Unit, BadgeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(corner)) __obj.updateDynamic("corner")(corner.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (!js.isUndefined(hot)) __obj.updateDynamic("hot")(hot.asInstanceOf[js.Any])
    if (overflowCount != null) __obj.updateDynamic("overflowCount")(overflowCount.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.badgeMod.BadgeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.badgeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.badgeMod.BadgeProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/badge", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

