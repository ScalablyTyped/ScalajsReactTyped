package typingsJapgolly.codemirror.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var anchor: Position
  var head: Position
  def from(): Position
  def to(): Position
}

object Range {
  @scala.inline
  def apply(anchor: Position, from: CallbackTo[Position], head: Position, to: CallbackTo[Position]): Range = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
    __obj.updateDynamic("from")(from.toJsFn)
    __obj.updateDynamic("to")(to.toJsFn)
    __obj.asInstanceOf[Range]
  }
}

