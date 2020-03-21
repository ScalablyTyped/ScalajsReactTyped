package typingsJapgolly.findPackageJson.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinderIterator extends js.Object {
  def next(): FindResult
}

object FinderIterator {
  @scala.inline
  def apply(next: CallbackTo[FindResult]): FinderIterator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[FinderIterator]
  }
}

