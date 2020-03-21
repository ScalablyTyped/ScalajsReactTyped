package typingsJapgolly.promptSync.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait History extends js.Object {
  def atEnd(): Boolean
  def atPenultimate(): Boolean
  def atStart(): Boolean
  def next(): String
  def pastEnd(): Boolean
  def prev(): String
  def push(str: String): Unit
  def reset(): Unit
  def save(): Unit
}

object History {
  @scala.inline
  def apply(
    atEnd: CallbackTo[Boolean],
    atPenultimate: CallbackTo[Boolean],
    atStart: CallbackTo[Boolean],
    next: CallbackTo[String],
    pastEnd: CallbackTo[Boolean],
    prev: CallbackTo[String],
    push: String => Callback,
    reset: Callback,
    save: Callback
  ): History = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("atEnd")(atEnd.toJsFn)
    __obj.updateDynamic("atPenultimate")(atPenultimate.toJsFn)
    __obj.updateDynamic("atStart")(atStart.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("pastEnd")(pastEnd.toJsFn)
    __obj.updateDynamic("prev")(prev.toJsFn)
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: java.lang.String) => push(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("save")(save.toJsFn)
    __obj.asInstanceOf[History]
  }
}

