package typingsJapgolly.storybookReactNative.absolutePositionedKeyboardAwareViewMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {onLayout (dimens : @storybook/react-native.@storybook/react-native/dist/preview/components/OnDeviceUI/absolute-positioned-keyboard-aware-view.PreviewDimens): void} & @storybook/react-native.@storybook/react-native/dist/preview/components/OnDeviceUI/absolute-positioned-keyboard-aware-view.PreviewDimens */
trait Props extends js.Object {
  var previewHeight: Double
  var previewWidth: Double
  def onLayout(dimens: PreviewDimens): Unit
}

object Props {
  @scala.inline
  def apply(onLayout: PreviewDimens => Callback, previewHeight: Double, previewWidth: Double): Props = {
    val __obj = js.Dynamic.literal(previewHeight = previewHeight.asInstanceOf[js.Any], previewWidth = previewWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("onLayout")(js.Any.fromFunction1((t0: typingsJapgolly.storybookReactNative.absolutePositionedKeyboardAwareViewMod.PreviewDimens) => onLayout(t0).runNow()))
    __obj.asInstanceOf[Props]
  }
}

