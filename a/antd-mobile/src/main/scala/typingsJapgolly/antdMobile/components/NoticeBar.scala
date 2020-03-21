package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.antdMobileStrings.closable
import typingsJapgolly.antdMobile.antdMobileStrings.link
import typingsJapgolly.antdMobile.marqueeMod.MarqueeProps
import typingsJapgolly.antdMobile.noticeBarMod.NoticeWebProps
import typingsJapgolly.antdMobile.noticeBarMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NoticeBar {
  def apply(
    action: VdomElement = null,
    className: String = null,
    icon: VdomElement = null,
    marqueeProps: MarqueeProps = null,
    mode: closable | link = null,
    onClick: js.UndefOr[Callback] = js.undefined,
    prefixCls: String = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NoticeWebProps, default, Unit, NoticeWebProps] = {
    val __obj = js.Dynamic.literal()
  
      if (action != null) __obj.updateDynamic("action")(action.rawElement.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawElement.asInstanceOf[js.Any])
    if (marqueeProps != null) __obj.updateDynamic("marqueeProps")(marqueeProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.noticeBarMod.NoticeWebProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.noticeBarMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.noticeBarMod.NoticeWebProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/notice-bar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

