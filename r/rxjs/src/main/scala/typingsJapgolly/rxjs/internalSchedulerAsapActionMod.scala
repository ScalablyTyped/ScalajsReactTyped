package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalSchedulerAsapSchedulerMod.AsapScheduler
import typingsJapgolly.rxjs.distTypesInternalTypesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalSchedulerAsapActionMod {
  
  @JSImport("rxjs/internal/scheduler/AsapAction", "AsapAction")
  @js.native
  open class AsapAction[T] protected ()
    extends typingsJapgolly.rxjs.distTypesInternalSchedulerAsapActionMod.AsapAction[T] {
    def this(
      scheduler: AsapScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
  }
}
