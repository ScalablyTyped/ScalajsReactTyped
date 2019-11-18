package typingsJapgolly.rxjs.rxjsMod

import typingsJapgolly.rxjs.internalTypesMod.SchedulerAction
import typingsJapgolly.rxjs.rxjsNumbers.`-1`
import typingsJapgolly.rxjs.rxjsNumbers.`0`
import typingsJapgolly.rxjs.rxjsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "VirtualAction")
@js.native
class VirtualAction[T] protected ()
  extends typingsJapgolly.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualAction[T] {
  def this(
    scheduler: typingsJapgolly.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualTimeScheduler,
    work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
  ) = this()
  def this(
    scheduler: typingsJapgolly.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualTimeScheduler,
    work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
    index: Double
  ) = this()
}

/* static members */
@JSImport("rxjs", "VirtualAction")
@js.native
object VirtualAction extends js.Object {
  def sortActions[T](
    a: typingsJapgolly.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualAction[T],
    b: typingsJapgolly.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualAction[T]
  ): `1` | `0` | `-1` = js.native
}

