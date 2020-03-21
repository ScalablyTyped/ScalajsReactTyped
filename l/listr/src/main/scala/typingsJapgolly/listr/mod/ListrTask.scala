package typingsJapgolly.listr.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListrTask[Ctx] extends js.Object {
  var enabled: js.UndefOr[
    js.Function1[/* ctx */ Ctx, Boolean | js.Promise[Boolean] | Observable_[Boolean]]
  ] = js.undefined
  var skip: js.UndefOr[js.Function1[/* ctx */ Ctx, Unit | Boolean | String | js.Promise[Boolean]]] = js.undefined
  var title: String
  def task(ctx: Ctx, task: ListrTaskWrapper[Ctx]): Unit | ListrTaskResult[Ctx]
}

object ListrTask {
  @scala.inline
  def apply[Ctx](
    task: (Ctx, ListrTaskWrapper[Ctx]) => CallbackTo[Unit | ListrTaskResult[Ctx]],
    title: String,
    enabled: /* ctx */ Ctx => CallbackTo[Boolean | js.Promise[Boolean] | Observable_[Boolean]] = null,
    skip: /* ctx */ Ctx => CallbackTo[Unit | Boolean | String | js.Promise[Boolean]] = null
  ): ListrTask[Ctx] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("task")(js.Any.fromFunction2((t0: Ctx, t1: typingsJapgolly.listr.mod.ListrTaskWrapper[Ctx]) => task(t0, t1).runNow()))
    if (enabled != null) __obj.updateDynamic("enabled")(js.Any.fromFunction1((t0: /* ctx */ Ctx) => enabled(t0).runNow()))
    if (skip != null) __obj.updateDynamic("skip")(js.Any.fromFunction1((t0: /* ctx */ Ctx) => skip(t0).runNow()))
    __obj.asInstanceOf[ListrTask[Ctx]]
  }
}

