package typingsJapgolly.mobxTask.taskMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskMethods[A /* <: js.Array[_] */, R] extends js.Object {
  /**
    * Pattern-matches on the task status.
    * @param props
    */
  def `match`[PT, ET, RT](props: TaskMatchProps[PT, ET, RT, A, R]): PT | ET | RT
  /**
    * Resets the state.
    */
  def reset(): Unit
  /**
    * Sets the state.
    */
  def setState(props: TaskOptions[A, R]): Unit
  /**
    * Wraps the task by invoking `func` with the inner task function, which returns the wrapped function
    * and converts that to a task.
    *
    * @param func
    */
  def wrap[NA /* <: js.Array[_] */, NR](func: js.Function1[/* inner */ js.Function1[/* args */ A, R], js.Function1[/* args */ NA, NR]]): Task_[NA, NR]
}

object TaskMethods {
  @scala.inline
  def apply[A /* <: js.Array[_] */, R](
    `match`: TaskMatchProps[js.Any, js.Any, js.Any, A, R] => CallbackTo[js.Any | js.Any | js.Any],
    reset: Callback,
    setState: TaskOptions[A, R] => Callback,
    wrap: js.Function1[/* inner */ js.Function1[/* args */ A, R], js.Function1[js.Any, js.Any]] => CallbackTo[Task_[js.Any, js.Any]]
  ): TaskMethods[A, R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction1((t0: typingsJapgolly.mobxTask.taskMod.TaskMatchProps[js.Any, js.Any, js.Any, A, R]) => `match`(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("setState")(js.Any.fromFunction1((t0: typingsJapgolly.mobxTask.taskMod.TaskOptions[A, R]) => setState(t0).runNow()))
    __obj.updateDynamic("wrap")(js.Any.fromFunction1((t0: js.Function1[/* inner */ js.Function1[/* args */ A, R], js.Function1[js.Any, js.Any]]) => wrap(t0).runNow()))
    __obj.asInstanceOf[TaskMethods[A, R]]
  }
}

