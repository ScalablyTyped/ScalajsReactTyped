package typingsJapgolly.reactNativeAnimatable.mod

import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-animatable", "registerAnimation")
@js.native
object registerAnimation extends js.Object {
  def apply(name: String, animation: CustomAnimation[TextStyle with ViewStyle with ImageStyle]): Unit = js.native
}

