package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLNodeIterator extends js.Object {
  def hasNext(): Boolean
  def next(): XMLNode
}

object XMLNodeIterator {
  @scala.inline
  def apply(hasNext: CallbackTo[Boolean], next: CallbackTo[XMLNode]): XMLNodeIterator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasNext")(hasNext.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[XMLNodeIterator]
  }
}

