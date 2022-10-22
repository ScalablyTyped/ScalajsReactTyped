package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalSchedulerQueueSchedulerMod.QueueScheduler
import typingsJapgolly.rxjs.distTypesInternalTypesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalSchedulerQueueActionMod {
  
  @JSImport("rxjs/internal/scheduler/QueueAction", "QueueAction")
  @js.native
  open class QueueAction[T] protected ()
    extends typingsJapgolly.rxjs.distTypesInternalSchedulerQueueActionMod.QueueAction[T] {
    def this(
      scheduler: QueueScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
  }
}
