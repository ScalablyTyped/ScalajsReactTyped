package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`slide-down`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`slide-up`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.fade
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.none
import typingsJapgolly.antDesignReactNative.modalViewMod.IModalPropTypes
import typingsJapgolly.antDesignReactNative.modalViewMod.default
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ModalView {
  def apply(
    animationType: none | fade | `slide-up` | `slide-down`,
    visible: Boolean,
    animateAppear: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskStyle: StyleProp[ViewStyle] = null,
    onAnimationEnd: /* visible */ Boolean => Callback = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    style: js.Object = null,
    wrapStyle: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IModalPropTypes, default, Unit, IModalPropTypes] = {
    val __obj = js.Dynamic.literal(animationType = animationType.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
      if (!js.isUndefined(animateAppear)) __obj.updateDynamic("animateAppear")(animateAppear.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onAnimationEnd(t0).runNow()))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrapStyle != null) __obj.updateDynamic("wrapStyle")(wrapStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.modalViewMod.IModalPropTypes, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.modalViewMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.modalViewMod.IModalPropTypes])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/modal/ModalView", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

