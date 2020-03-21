package typingsJapgolly.requestidlecallback

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.DOMHighResTimeStamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdleDeadline extends js.Object {
  val didTimeout: Boolean
  def timeRemaining(): DOMHighResTimeStamp
}

object IdleDeadline {
  @scala.inline
  def apply(didTimeout: Boolean, timeRemaining: CallbackTo[DOMHighResTimeStamp]): IdleDeadline = {
    val __obj = js.Dynamic.literal(didTimeout = didTimeout.asInstanceOf[js.Any])
    __obj.updateDynamic("timeRemaining")(timeRemaining.toJsFn)
    __obj.asInstanceOf[IdleDeadline]
  }
}

