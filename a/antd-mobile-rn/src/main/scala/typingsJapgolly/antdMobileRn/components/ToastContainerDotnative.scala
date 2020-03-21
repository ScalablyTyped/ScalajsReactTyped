package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.toastContainerNativeMod.ToastProps
import typingsJapgolly.antdMobileRn.toastContainerNativeMod.default
import typingsJapgolly.antdMobileRn.toastStyleIndexNativeMod.IToastStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToastContainerDotnative {
  def apply(
    content: String,
    duration: Int | Double = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    onAnimationEnd: js.UndefOr[Callback] = js.undefined,
    onClose: js.UndefOr[Callback] = js.undefined,
    styles: IToastStyle = null,
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
  typingsJapgolly.antdMobileRn.toastContainerNativeMod.ToastProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.toastContainerNativeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.toastContainerNativeMod.ToastProps])(children: _*)
  }
  @JSImport("antd-mobile-rn/lib/toast/ToastContainer.native", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

