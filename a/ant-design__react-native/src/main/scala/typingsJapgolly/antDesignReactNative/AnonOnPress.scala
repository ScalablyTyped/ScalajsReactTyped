package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnPress extends js.Object {
  var mode: String
  def onPress(): Unit
}

object AnonOnPress {
  @scala.inline
  def apply(mode: String, onPress: Callback): AnonOnPress = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("onPress")(onPress.toJsFn)
    __obj.asInstanceOf[AnonOnPress]
  }
}

