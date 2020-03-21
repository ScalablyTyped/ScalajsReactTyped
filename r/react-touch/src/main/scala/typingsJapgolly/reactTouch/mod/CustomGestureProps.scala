package typingsJapgolly.reactTouch.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomGestureProps extends js.Object {
  var config: js.Array[moves]
  def onGesture(): Unit
}

object CustomGestureProps {
  @scala.inline
  def apply(config: js.Array[moves], onGesture: Callback): CustomGestureProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.updateDynamic("onGesture")(onGesture.toJsFn)
    __obj.asInstanceOf[CustomGestureProps]
  }
}

