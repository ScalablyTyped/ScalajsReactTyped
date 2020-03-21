package typingsJapgolly.promiseQueue.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueOptions extends js.Object {
  /**
    * Callback that is called when the queue is empty and all pending promises have resolved
    */
  def onEmpty(): Unit
}

object QueueOptions {
  @scala.inline
  def apply(onEmpty: Callback): QueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onEmpty")(onEmpty.toJsFn)
    __obj.asInstanceOf[QueueOptions]
  }
}

