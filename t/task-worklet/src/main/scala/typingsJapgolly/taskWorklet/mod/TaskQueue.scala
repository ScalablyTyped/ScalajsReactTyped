package typingsJapgolly.taskWorklet.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskQueue extends js.Object {
  def addModule(moduleURL: String): js.Promise[Unit]
  def postTask(taskName: String, args: js.Any*): Task[_]
}

object TaskQueue {
  @scala.inline
  def apply(
    addModule: String => CallbackTo[js.Promise[Unit]],
    postTask: (String, /* repeated */ js.Any) => CallbackTo[Task[js.Any]]
  ): TaskQueue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addModule")(js.Any.fromFunction1((t0: java.lang.String) => addModule(t0).runNow()))
    __obj.updateDynamic("postTask")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => postTask(t0, t1).runNow()))
    __obj.asInstanceOf[TaskQueue]
  }
}

