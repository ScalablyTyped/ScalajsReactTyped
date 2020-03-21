package typingsJapgolly.storybookReactNative.onDeviceUIMod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.storybookReactNative.absolutePositionedKeyboardAwareViewMod.PreviewDimens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDeviceUI
  extends Component[OnDeviceUIProps, OnDeviceUIState, js.Any] {
  var animatedValue: Value = js.native
  var channel: typingsJapgolly.storybookChannels.mod.default = js.native
  def handleOpenPreview(): Unit = js.native
  def handleToggleTab(newTabOpen: Double): Unit = js.native
  def onLayout(hasPreviewWidthPreviewHeight: PreviewDimens): Unit = js.native
}

