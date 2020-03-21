package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.toastContainerMod.ToastProps
import typingsJapgolly.antDesignReactNative.toastContainerMod.default
import typingsJapgolly.antDesignReactNative.toastStyleMod.ToastStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToastContainer {
  def apply(
    content: String,
    duration: Int | Double = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    onAnimationEnd: js.UndefOr[Callback] = js.undefined,
    onClose: js.UndefOr[Callback] = js.undefined,
    styles: Partial[ToastStyle] = null,
    `type`: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ToastProps, default, Unit, ToastProps] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
  
      if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    onAnimationEnd.foreach(p => __obj.updateDynamic("onAnimationEnd")(p.toJsFn))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.toastContainerMod.ToastProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.toastContainerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.toastContainerMod.ToastProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/toast/ToastContainer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

