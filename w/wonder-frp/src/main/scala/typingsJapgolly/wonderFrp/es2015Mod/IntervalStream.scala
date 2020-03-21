package typingsJapgolly.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "IntervalStream")
@js.native
class IntervalStream protected ()
  extends typingsJapgolly.wonderFrp.streamIntervalStreamMod.IntervalStream {
  def this(interval: Double, scheduler: typingsJapgolly.wonderFrp.coreSchedulerMod.Scheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "IntervalStream")
@js.native
object IntervalStream extends js.Object {
  def create(interval: Double, scheduler: typingsJapgolly.wonderFrp.coreSchedulerMod.Scheduler): typingsJapgolly.wonderFrp.streamIntervalStreamMod.IntervalStream = js.native
}

