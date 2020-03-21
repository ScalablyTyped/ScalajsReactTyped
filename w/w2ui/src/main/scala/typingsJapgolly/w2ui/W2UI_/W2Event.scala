package typingsJapgolly.w2ui.W2UI_

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait W2Event extends js.Object {
  var target: String
  def onComplete(): Unit
}

object W2Event {
  @scala.inline
  def apply(onComplete: Callback, target: String): W2Event = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("onComplete")(onComplete.toJsFn)
    __obj.asInstanceOf[W2Event]
  }
}

