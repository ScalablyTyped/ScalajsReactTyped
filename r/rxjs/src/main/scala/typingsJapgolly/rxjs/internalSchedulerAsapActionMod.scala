package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalSchedulerAsapSchedulerMod.AsapScheduler
import typingsJapgolly.rxjs.internalSchedulerAsyncActionMod.AsyncAction
import typingsJapgolly.rxjs.internalTypesMod.SchedulerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/AsapAction", JSImport.Namespace)
@js.native
object internalSchedulerAsapActionMod extends js.Object {
  @js.native
  class AsapAction[T] protected () extends AsyncAction[T] {
    def this(
      scheduler: AsapScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    @JSName("scheduler")
    var scheduler_AsapAction: AsapScheduler = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler, id: js.Any): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler, id: js.Any, delay: Double): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler, id: js.Any): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler, id: js.Any, delay: Double): js.Any = js.native
  }
  
}

