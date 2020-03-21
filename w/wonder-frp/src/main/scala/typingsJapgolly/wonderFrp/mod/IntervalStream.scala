package typingsJapgolly.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "IntervalStream")
@js.native
class IntervalStream protected ()
  extends typingsJapgolly.wonderFrp.intervalStreamMod.IntervalStream {
  def this(interval: Double, scheduler: typingsJapgolly.wonderFrp.schedulerMod.Scheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "IntervalStream")
@js.native
object IntervalStream extends js.Object {
  def create(interval: Double, scheduler: typingsJapgolly.wonderFrp.schedulerMod.Scheduler): typingsJapgolly.wonderFrp.intervalStreamMod.IntervalStream = js.native
}

