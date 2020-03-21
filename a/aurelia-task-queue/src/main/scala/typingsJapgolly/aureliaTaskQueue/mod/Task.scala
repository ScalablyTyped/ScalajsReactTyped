package typingsJapgolly.aureliaTaskQueue.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  /**
    * Call it.
    */
  def call(): Unit
}

object Task {
  @scala.inline
  def apply(call: Callback): Task = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("call")(call.toJsFn)
    __obj.asInstanceOf[Task]
  }
}

