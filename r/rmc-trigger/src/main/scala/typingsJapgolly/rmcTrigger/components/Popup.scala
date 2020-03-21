package typingsJapgolly.rmcTrigger.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rmcTrigger.popupMod.IPopupProps
import typingsJapgolly.rmcTrigger.popupMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popup {
  def apply(
    align: js.Any = null,
    animation: String = null,
    className: String = null,
    destroyPopupOnHide: js.UndefOr[Boolean] = js.undefined,
    getClassNameFromAlign: js.Function = null,
    getRootDomNode: js.Function = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskAnimation: String = null,
    maskTransitionName: String | js.Object = null,
    onAlign: js.Function = null,
    onAnimateLeave: js.Function = null,
    prefixCls: String = null,
    style: js.Any = null,
    transitionName: String | js.Object = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IPopupProps, default, Unit, IPopupProps] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyPopupOnHide)) __obj.updateDynamic("destroyPopupOnHide")(destroyPopupOnHide.asInstanceOf[js.Any])
    if (getClassNameFromAlign != null) __obj.updateDynamic("getClassNameFromAlign")(getClassNameFromAlign.asInstanceOf[js.Any])
    if (getRootDomNode != null) __obj.updateDynamic("getRootDomNode")(getRootDomNode.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskAnimation != null) __obj.updateDynamic("maskAnimation")(maskAnimation.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (onAlign != null) __obj.updateDynamic("onAlign")(onAlign.asInstanceOf[js.Any])
    if (onAnimateLeave != null) __obj.updateDynamic("onAnimateLeave")(onAnimateLeave.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcTrigger.popupMod.IPopupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rmcTrigger.popupMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcTrigger.popupMod.IPopupProps])(children: _*)
  }
  @JSImport("rmc-trigger/lib/Popup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

