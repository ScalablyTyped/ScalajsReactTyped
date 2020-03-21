package typingsJapgolly.twix.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwixIter extends js.Object {
  def hasNext(): Boolean
  def next(): Twix
}

object TwixIter {
  @scala.inline
  def apply(hasNext: CallbackTo[Boolean], next: CallbackTo[Twix]): TwixIter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasNext")(hasNext.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[TwixIter]
  }
}

