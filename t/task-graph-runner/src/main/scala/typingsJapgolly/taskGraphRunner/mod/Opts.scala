package typingsJapgolly.taskGraphRunner.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts[Item, Result] extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var graph: Map[Item, js.Array[Item]]
  def task(item: Item): Result
}

object Opts {
  @scala.inline
  def apply[Item, Result](
    graph: Map[Item, js.Array[Item]],
    task: Item => CallbackTo[Result],
    force: js.UndefOr[Boolean] = js.undefined
  ): Opts[Item, Result] = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any])
    __obj.updateDynamic("task")(js.Any.fromFunction1((t0: Item) => task(t0).runNow()))
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts[Item, Result]]
  }
}

