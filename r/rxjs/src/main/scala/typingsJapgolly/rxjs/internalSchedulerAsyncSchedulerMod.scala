package typingsJapgolly.rxjs

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.rxjs.distTypesInternalSchedulerActionMod.Action
import typingsJapgolly.rxjs.distTypesInternalSchedulerMod.Scheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalSchedulerAsyncSchedulerMod {
  
  @JSImport("rxjs/internal/scheduler/AsyncScheduler", "AsyncScheduler")
  @js.native
  open class AsyncScheduler protected ()
    extends typingsJapgolly.rxjs.distTypesInternalSchedulerAsyncSchedulerMod.AsyncScheduler {
    def this(SchedulerAction: Instantiable2[
            /* scheduler */ Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ typingsJapgolly.rxjs.distTypesInternalTypesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              Unit
            ], 
            Action[js.Object]
          ]) = this()
    def this(
      SchedulerAction: Instantiable2[
            /* scheduler */ Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ typingsJapgolly.rxjs.distTypesInternalTypesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              Unit
            ], 
            Action[js.Object]
          ],
      now: js.Function0[Double]
    ) = this()
  }
}
