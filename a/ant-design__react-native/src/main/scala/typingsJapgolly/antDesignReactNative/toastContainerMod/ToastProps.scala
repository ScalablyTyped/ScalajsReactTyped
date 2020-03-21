package typingsJapgolly.antDesignReactNative.toastContainerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.antDesignReactNative.toastStyleMod.ToastStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastProps extends WithThemeStyles[ToastStyle] {
  var content: String
  var duration: js.UndefOr[Double] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var onAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ToastProps {
  @scala.inline
  def apply(
    content: String,
    duration: Int | Double = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    onAnimationEnd: js.UndefOr[Callback] = js.undefined,
    onClose: js.UndefOr[Callback] = js.undefined,
    styles: Partial[ToastStyle] = null,
    `type`: String = null
  ): ToastProps = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    onAnimationEnd.foreach(p => __obj.updateDynamic("onAnimationEnd")(p.toJsFn))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastProps]
  }
}

