package typingsJapgolly.jpm

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCombo extends js.Object {
  var combo: String
  def onPress(): Unit
}

object AnonCombo {
  @scala.inline
  def apply(combo: String, onPress: Callback): AnonCombo = {
    val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any])
    __obj.updateDynamic("onPress")(onPress.toJsFn)
    __obj.asInstanceOf[AnonCombo]
  }
}

