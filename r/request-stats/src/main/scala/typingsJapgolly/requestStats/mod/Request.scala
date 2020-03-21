package typingsJapgolly.requestStats.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /**
    * Returns a progress object if called while a HTTP request is in progress.
    * If called multiple times, the returned progress object will contain the delta of the previous
    * call to `.progress()`.
    */
  def progress(): Progress
}

object Request {
  @scala.inline
  def apply(progress: CallbackTo[Progress]): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("progress")(progress.toJsFn)
    __obj.asInstanceOf[Request]
  }
}

