package typingsJapgolly.rxjs.mod

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.rxjs.asyncActionMod.AsyncAction
import typingsJapgolly.rxjs.asyncSchedulerMod.AsyncScheduler
import typingsJapgolly.rxjs.typesMod.SchedulerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "VirtualTimeScheduler")
@js.native
class VirtualTimeScheduler ()
  extends typingsJapgolly.rxjs.virtualTimeSchedulerMod.VirtualTimeScheduler {
  def this(SchedulerAction: Instantiable2[
        /* scheduler */ AsyncScheduler, 
        /* work */ js.ThisFunction1[
          /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          Unit
        ], 
        AsyncAction[js.Object]
      ]) = this()
  def this(
    SchedulerAction: Instantiable2[
        /* scheduler */ AsyncScheduler, 
        /* work */ js.ThisFunction1[
          /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          Unit
        ], 
        AsyncAction[js.Object]
      ],
    maxFrames: Double
  ) = this()
}

/* static members */
@JSImport("rxjs", "VirtualTimeScheduler")
@js.native
object VirtualTimeScheduler extends js.Object {
  var frameTimeFactor: Double = js.native
}

