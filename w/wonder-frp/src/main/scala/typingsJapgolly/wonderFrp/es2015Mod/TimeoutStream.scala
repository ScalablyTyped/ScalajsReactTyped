package typingsJapgolly.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "TimeoutStream")
@js.native
class TimeoutStream protected ()
  extends typingsJapgolly.wonderFrp.streamTimeoutStreamMod.TimeoutStream {
  def this(time: Double, scheduler: typingsJapgolly.wonderFrp.coreSchedulerMod.Scheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "TimeoutStream")
@js.native
object TimeoutStream extends js.Object {
  def create(time: Double, scheduler: typingsJapgolly.wonderFrp.coreSchedulerMod.Scheduler): typingsJapgolly.wonderFrp.streamTimeoutStreamMod.TimeoutStream = js.native
}

