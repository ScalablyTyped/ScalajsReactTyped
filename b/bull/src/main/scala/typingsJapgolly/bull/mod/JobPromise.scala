package typingsJapgolly.bull.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobPromise extends js.Object {
  /**
    * Abort this job
    */
  def cancel(): Unit
}

object JobPromise {
  @scala.inline
  def apply(cancel: Callback): JobPromise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.asInstanceOf[JobPromise]
  }
}

