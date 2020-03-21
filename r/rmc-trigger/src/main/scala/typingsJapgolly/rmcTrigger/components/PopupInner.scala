package typingsJapgolly.rmcTrigger.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rmcTrigger.popupInnerMod.IPopupInnerProps
import typingsJapgolly.rmcTrigger.popupInnerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PopupInner {
  def apply(
    className: String = null,
    hiddenClassName: String = null,
    prefixCls: String = null,
    style: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IPopupInnerProps, default, Unit, IPopupInnerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (hiddenClassName != null) __obj.updateDynamic("hiddenClassName")(hiddenClassName.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcTrigger.popupInnerMod.IPopupInnerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rmcTrigger.popupInnerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcTrigger.popupInnerMod.IPopupInnerProps])(children: _*)
  }
  @JSImport("rmc-trigger/lib/PopupInner", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

