package typingsJapgolly.rxjs.mod

import typingsJapgolly.rxjs.rxjsNumbers.`-1`
import typingsJapgolly.rxjs.rxjsNumbers.`0`
import typingsJapgolly.rxjs.rxjsNumbers.`1`
import typingsJapgolly.rxjs.typesMod.SchedulerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "VirtualAction")
@js.native
class VirtualAction[T] protected ()
  extends typingsJapgolly.rxjs.virtualTimeSchedulerMod.VirtualAction[T] {
  def this(
    scheduler: typingsJapgolly.rxjs.virtualTimeSchedulerMod.VirtualTimeScheduler,
    work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
  ) = this()
  def this(
    scheduler: typingsJapgolly.rxjs.virtualTimeSchedulerMod.VirtualTimeScheduler,
    work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
    index: Double
  ) = this()
}

/* static members */
@JSImport("rxjs", "VirtualAction")
@js.native
object VirtualAction extends js.Object {
  def sortActions[T](
    a: typingsJapgolly.rxjs.virtualTimeSchedulerMod.VirtualAction[T],
    b: typingsJapgolly.rxjs.virtualTimeSchedulerMod.VirtualAction[T]
  ): `1` | `0` | `-1` = js.native
}

