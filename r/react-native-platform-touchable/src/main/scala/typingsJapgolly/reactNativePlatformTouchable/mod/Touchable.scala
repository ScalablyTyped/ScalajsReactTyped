package typingsJapgolly.reactNativePlatformTouchable.mod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.RippleBackgroundPropType
import typingsJapgolly.reactNative.mod.ThemeAttributeBackgroundPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-platform-touchable", "Touchable")
@js.native
class Touchable ()
  extends Component[PlatformTouchableProps, js.Object, js.Any] {
  // TouchableOpacity (default iOS)
  def setOpacityTo(value: Double): Unit = js.native
}

/* static members */
@JSImport("react-native-platform-touchable", "Touchable")
@js.native
object Touchable extends js.Object {
  def Ripple(color: String): RippleBackgroundPropType = js.native
  def Ripple(color: String, borderless: Boolean): RippleBackgroundPropType = js.native
  // TouchableNativeFeedback (default Android)
  def SelectableBackground(): ThemeAttributeBackgroundPropType = js.native
  def SelectableBackgroundBorderless(): ThemeAttributeBackgroundPropType = js.native
  def canUseNativeForeground(): Boolean = js.native
}

