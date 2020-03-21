package typingsJapgolly.nReadlines.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nReadlines.nReadlinesBooleans.`false`
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineByLine extends js.Object {
  def close(): Unit
  def next(): Buffer | `false`
  def reset(): Unit
}

object LineByLine {
  @scala.inline
  def apply(close: Callback, next: CallbackTo[Buffer | `false`], reset: Callback): LineByLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[LineByLine]
  }
}

