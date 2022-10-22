package typingsJapgolly.rxjs

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.rxjs.distTypesInternalSchedulerActionMod.Action
import typingsJapgolly.rxjs.distTypesInternalSchedulerAsyncSchedulerMod.AsyncScheduler
import typingsJapgolly.rxjs.distTypesInternalSchedulerMod.Scheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalSchedulerAnimationFrameSchedulerMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/AnimationFrameScheduler", "AnimationFrameScheduler")
  @js.native
  open class AnimationFrameScheduler protected () extends AsyncScheduler {
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
    
    def flush(): Unit = js.native
  }
}
