package typingsJapgolly.storybookReactNative.barMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var index: Double
  def onPress(id: Double): Unit
}

object Props {
  @scala.inline
  def apply(index: Double, onPress: Double => Callback): Props = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: scala.Double) => onPress(t0).runNow()))
    __obj.asInstanceOf[Props]
  }
}

