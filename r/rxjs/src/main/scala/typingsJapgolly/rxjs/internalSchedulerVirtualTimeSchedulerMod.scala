package typingsJapgolly.rxjs

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.rxjs.internalSchedulerAsyncActionMod.AsyncAction
import typingsJapgolly.rxjs.internalSchedulerAsyncSchedulerMod.AsyncScheduler
import typingsJapgolly.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualAction
import typingsJapgolly.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualTimeScheduler
import typingsJapgolly.rxjs.internalTypesMod.SchedulerAction
import typingsJapgolly.rxjs.rxjsNumbers.`-1`
import typingsJapgolly.rxjs.rxjsNumbers.`0`
import typingsJapgolly.rxjs.rxjsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", JSImport.Namespace)
@js.native
object internalSchedulerVirtualTimeSchedulerMod extends js.Object {
  @js.native
  class VirtualAction[T] protected () extends AsyncAction[T] {
    def this(
      scheduler: VirtualTimeScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    def this(
      scheduler: VirtualTimeScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
      index: Double
    ) = this()
    var active: Boolean = js.native
    var index: Double = js.native
    @JSName("scheduler")
    var scheduler_VirtualAction: VirtualTimeScheduler = js.native
    /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler, id: js.Any): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler, id: js.Any, delay: Double): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler, id: js.Any): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler, id: js.Any, delay: Double): js.Any = js.native
  }
  
  @js.native
  class VirtualTimeScheduler () extends AsyncScheduler {
    def this(SchedulerAction: Instantiable2[
            /* scheduler */ AsyncScheduler, 
            /* work */ js.ThisFunction1[
              /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
              Unit
            ], 
            AsyncAction[js.Object]
          ]) = this()
    def this(
      SchedulerAction: Instantiable2[
            /* scheduler */ AsyncScheduler, 
            /* work */ js.ThisFunction1[
              /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
              Unit
            ], 
            AsyncAction[js.Object]
          ],
      maxFrames: Double
    ) = this()
    var frame: Double = js.native
    var index: Double = js.native
    var maxFrames: Double = js.native
    /**
      * Prompt the Scheduler to execute all of its queued actions, therefore
      * clearing its queue.
      * @return {void}
      */
    def flush(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object VirtualAction extends js.Object {
    def sortActions[T](a: VirtualAction[T], b: VirtualAction[T]): `1` | `0` | `-1` = js.native
  }
  
  /* static members */
  @js.native
  object VirtualTimeScheduler extends js.Object {
    var frameTimeFactor: Double = js.native
  }
  
}

