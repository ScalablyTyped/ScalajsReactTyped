package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnPress extends js.Object {
  def onPress(): Unit
}

object AnonOnPress {
  @scala.inline
  def apply(onPress: Callback): AnonOnPress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onPress")(onPress.toJsFn)
    __obj.asInstanceOf[AnonOnPress]
  }
}

