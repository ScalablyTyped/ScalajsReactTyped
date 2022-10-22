package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalSchedulerAsyncSchedulerMod.AsyncScheduler
import typingsJapgolly.rxjs.distTypesInternalTypesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalSchedulerAsyncActionMod {
  
  @JSImport("rxjs/internal/scheduler/AsyncAction", "AsyncAction")
  @js.native
  open class AsyncAction[T] protected ()
    extends typingsJapgolly.rxjs.distTypesInternalSchedulerAsyncActionMod.AsyncAction[T] {
    def this(
      scheduler: AsyncScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
  }
}
