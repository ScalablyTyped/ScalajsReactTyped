package typingsJapgolly.antDesignReactNative

import typingsJapgolly.reactNative.mod.RegisteredStyle
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveTextStyle extends js.Object {
  var activeTextStyle: RegisteredStyle[TextStyle]
  var container: RegisteredStyle[ViewStyle]
  var indicatorStyle: RegisteredStyle[ViewStyle]
  var numberStyle: RegisteredStyle[ViewStyle]
  var pointActiveStyle: RegisteredStyle[ViewStyle]
  var pointStyle: RegisteredStyle[ViewStyle]
  var spaceStyle: RegisteredStyle[ViewStyle]
  var totalStyle: RegisteredStyle[TextStyle]
}

object AnonActiveTextStyle {
  @scala.inline
  def apply(
    activeTextStyle: RegisteredStyle[TextStyle],
    container: RegisteredStyle[ViewStyle],
    indicatorStyle: RegisteredStyle[ViewStyle],
    numberStyle: RegisteredStyle[ViewStyle],
    pointActiveStyle: RegisteredStyle[ViewStyle],
    pointStyle: RegisteredStyle[ViewStyle],
    spaceStyle: RegisteredStyle[ViewStyle],
    totalStyle: RegisteredStyle[TextStyle]
  ): AnonActiveTextStyle = {
    val __obj = js.Dynamic.literal(activeTextStyle = activeTextStyle.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], indicatorStyle = indicatorStyle.asInstanceOf[js.Any], numberStyle = numberStyle.asInstanceOf[js.Any], pointActiveStyle = pointActiveStyle.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], spaceStyle = spaceStyle.asInstanceOf[js.Any], totalStyle = totalStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActiveTextStyle]
  }
}

