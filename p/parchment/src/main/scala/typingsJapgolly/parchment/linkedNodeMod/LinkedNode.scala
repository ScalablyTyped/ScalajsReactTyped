package typingsJapgolly.parchment.linkedNodeMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedNode extends js.Object {
  var next: LinkedNode | Null
  var prev: LinkedNode | Null
  def length(): Double
}

object LinkedNode {
  @scala.inline
  def apply(length: CallbackTo[Double], next: LinkedNode = null, prev: LinkedNode = null): LinkedNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length.toJsFn)
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedNode]
  }
}

