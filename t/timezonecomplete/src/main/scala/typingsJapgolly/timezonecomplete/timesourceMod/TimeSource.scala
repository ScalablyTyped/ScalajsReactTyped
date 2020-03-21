package typingsJapgolly.timezonecomplete.timesourceMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeSource extends js.Object {
  /**
    * Return the current date+time as a javascript Date object
    * @throws nothing
    */
  def now(): js.Date
}

object TimeSource {
  @scala.inline
  def apply(now: CallbackTo[js.Date]): TimeSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("now")(now.toJsFn)
    __obj.asInstanceOf[TimeSource]
  }
}

