package typingsJapgolly.mathjax.MathJax

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends js.Object {
  def Add(hook: js.Any, priority: Double): CallbackObject
  def Execute(): CallbackObject
  def Remove(hook: CallbackObject): Unit
}

object Hooks {
  @scala.inline
  def apply(
    Add: (js.Any, Double) => CallbackTo[CallbackObject],
    Execute: CallbackTo[CallbackObject],
    Remove: CallbackObject => japgolly.scalajs.react.Callback
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: js.Any, t1: scala.Double) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Execute")(Execute.toJsFn)
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: typingsJapgolly.mathjax.MathJax.CallbackObject) => Remove(t0).runNow()))
    __obj.asInstanceOf[Hooks]
  }
}

