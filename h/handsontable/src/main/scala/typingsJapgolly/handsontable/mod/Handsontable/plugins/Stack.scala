package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stack extends js.Object {
  var items: js.Array[_]
  def isEmpty(): Boolean
  def peek(): js.Any
  def pop(): js.Any
  def push(items: js.Any): Unit
  def size(): Double
}

object Stack {
  @scala.inline
  def apply(
    isEmpty: CallbackTo[Boolean],
    items: js.Array[_],
    peek: CallbackTo[js.Any],
    pop: CallbackTo[js.Any],
    push: js.Any => Callback,
    size: CallbackTo[Double]
  ): Stack = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("peek")(peek.toJsFn)
    __obj.updateDynamic("pop")(pop.toJsFn)
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: js.Any) => push(t0).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.asInstanceOf[Stack]
  }
}

